package com.hhit.factory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class XMLOperator {
    public static Document getDoc() {
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(XMLOperator.class.getClassLoader().getResourceAsStream("applicationContext_factory.xml"));
            return doc;
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    public static Bean getBean() {
        Bean bean = new Bean();
        Document doc = getDoc();
        Element root = doc.getRootElement();
        Element beanElement = root.element("bean");
        bean.setId(beanElement.attributeValue("id")).setClazz(beanElement.attributeValue("class"));
        return bean;
    }
}
