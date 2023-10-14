package com.jsp.student.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentDriver1 {
	public static void main(String[] args) {

		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");

		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);

		Student student = (Student) beanFactory.getBean("myStudent");
		student.studentDetails();

	}

}
