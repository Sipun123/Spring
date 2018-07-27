package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.A;
import com.beans.K;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-beans.xml");
        A a=context.getBean("aId",A.class);
        System.out.println(a.hashCode());
        a.m1();
        
        
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.scan("com.beans");
        ctx.refresh();
        K k=ctx.getBean(K.class);
        k.m2();
        
        
    }
}
