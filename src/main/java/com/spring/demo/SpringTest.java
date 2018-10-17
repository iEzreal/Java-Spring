package com.spring.demo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Car;
import com.spring.bean.User;

public class SpringTest {

	/**
	 * Spring提供了两种类型的IOC容器实现 -BeanFactory：Ioc容器的基本实现，是Spring框架的基础设施，面向Spring本身
	 * -ApplicationContext：提供了更多高级特性，是BeanFactory的子接口。面向使用Spring框架的开发者
	 */

	/**
	 * 依赖注入
	 * 
	 * 属性注入：即通过setter方法注入bean的属性值或依赖的对象 构造方法注入：
	 * 
	 */

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.getName());

		Car car = (Car) context.getBean("car");
		System.out.println(car);
	}

}
