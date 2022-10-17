package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class App 
{
    public static void main( String[] args )
    {
      Resource resource= new ClassPathResource("AppCon.xml");
      BeanFactory bf=new XmlBeanFactory(resource);
      Office o=(Office) bf.getBean("office");
      
      System.out.println("Office Info:");
      System.out.println("name: "+o.getoName());
      System.out.println("floor: "+o.getFloor());
      System.out.println();
      System.out.println("Address info:");
      System.out.println("office number: "+o.getAddress().getOffNu());
      System.out.println("street: "+o.getAddress().getStreet());
      System.out.println("state: "+o.getAddress().getState());
      
    }
}
