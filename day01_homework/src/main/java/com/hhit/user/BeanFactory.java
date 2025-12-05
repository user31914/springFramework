package com.hhit.user;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class BeanFactory {
    public static Object getBean(String className){
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read("D:\\project\\springFramework\\day01_homework\\src\\main\\resources\\bean.xml");
            Element root = doc.getRootElement();
            List<Element> beans = root.elements("bean");
            for (Element bean : beans) {
                if(bean.attributeValue("id").contentEquals(className)){
                    String string = bean.attributeValue("class");
                    Class<?> aClass = Class.forName(string);
                    Object obj = aClass.getConstructor().newInstance();
                    List<Element> properties = bean.elements("property");
                    for (Element property : properties) {
                        String fieldName = property.attributeValue("name");
                        Field field = aClass.getDeclaredField(fieldName);//获得字段名
                        Class<?> type = field.getType();
                        String method = "set"+fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                        String value = property.attributeValue("value");
                        Method setMethod = aClass.getDeclaredMethod(method,type);
                        setMethod.invoke(obj,value);
                    }
                    return obj;
                }
            }

        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
