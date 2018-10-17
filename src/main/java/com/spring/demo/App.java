package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.BWMCar;
import com.spring.aop.BenzCar;

/**
 * Spring IoC 容器
 * 
 * FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里你需要提供给构造器 XML 文件的完整路径。
 * 
 * ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，
 * 只需正确配置 CLASSPATH 环境变量即可，因为容器会从 CLASSPATH 中搜索 bean 配置文件。
 * 
 * WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
 * 
 */

/**
 * 
 * @author Ezreal
 *
 */

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml"); 
		
		BenzCar benzCar = (BenzCar) ctx.getBean("benzCar");
		BWMCar bwmCar = (BWMCar) ctx.getBean("bmwCar");
		
		
		bwmCar.printName();
		
		benzCar.printName();
	}
}
