package com.dib.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dib.beans.MobilePhone;

public class DependencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MobilePhone phone=null;
	//create IOC container
		System.out.println("1st IOC container");
		factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/dib/configurations/applicationContext.xml");
		 //get Target bean class object
		 phone=factory.getBean("phone",MobilePhone.class);
		 System.out.println(".........................................");
		 //invoke methods
		 phone.batteryCharging();
		 phone.entertainment();
		 phone.calls();
		 phone.gaming();
		 phone.shopping();
		
		
	}

}