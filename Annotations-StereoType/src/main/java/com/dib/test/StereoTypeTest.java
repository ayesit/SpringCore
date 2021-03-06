package com.dib.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dib.beans.Vehcle;

public class StereoTypeTest {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=null;
		Vehcle v=null,v1=null;

		ctx= new ClassPathXmlApplicationContext("com/dib/configurations/applicationContext.xml");

		v=ctx.getBean("vehcle",Vehcle.class);
		v1=ctx.getBean("vehcle",Vehcle.class);
		
		System.out.println(v.hashCode());
		System.out.println(v1.hashCode());

		v.journey("PUNE", "BANGALORE");

		((AbstractApplicationContext) ctx).close();

	}
}
