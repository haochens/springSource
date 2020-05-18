package ch.test;

import ch.app.Appconfig;
import ch.dao.IPeople;
import ch.dao.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {
	public static void main(String[] args) {
		//把spring的所有前提环境准备
		//1、准备工厂：DefaultListableBeanFactory
		//实例化一个bdReader和一个scanner
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		//把一个class转化为bd,最后put到map
		//map位置DefaultListableBeanFactory的属性beanDefinitionMap
		IPeople people = context.getBean(StudentDao.class);
		people.name();
	}
}
