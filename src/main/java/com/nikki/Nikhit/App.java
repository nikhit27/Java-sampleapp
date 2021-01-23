package com.nikki.Nikhit;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    @SuppressWarnings("resource")
	ApplicationContext context =new ClassPathXmlApplicationContext("./spring/spring.xml");
    	Vehicle obj = (Vehicle)context.getBean("vehicle");
    	obj.drive();
    
    }
}
