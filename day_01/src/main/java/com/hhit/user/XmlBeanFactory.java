package com.hhit.user;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class XmlBeanFactory {
    public static Object getBean(String fileName, String key) {
        SAXReader reader = new SAXReader();
        try {
            //读取xml文件
            Document doc = reader.read(fileName);
            Element rootElement = doc.getRootElement();//获取根元素
            List<Element> beans = rootElement.elements("bean");
            for (Element bean : beans) {
                if (key.contentEquals(bean.attributeValue("id"))) {
                    String aClass = bean.attributeValue("class");
                    Class<?> aClass1 = Class.forName(aClass);
                    Object obj = aClass1.getConstructor().newInstance();
                    List<Element> property = bean.elements("property");
                    if (property.size()>0){
                        for (Element element : property) {
                            String filedName = element.attributeValue("name");
                            Field field = aClass1.getDeclaredField(filedName);
                            field.setAccessible(true);
                            String value = element.attributeValue("value");
                            field.set(obj,value);
                        }
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
