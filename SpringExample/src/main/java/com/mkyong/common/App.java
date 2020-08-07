package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.common.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        System.out.println(obj.hashCode());
        
        obj.printHello();
        
        obj = (HelloWorld) context.getBean("helloBean");
        System.out.println(obj.hashCode());
        
        obj.printHello();
        
    }
}
