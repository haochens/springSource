package ch.test;

import ch.app.Appconfig;
import ch.dao.IPeople;
import ch.dao.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {
	public static void main(String[] args) {
		//Java的配置类加载Spring的应用上下文
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		IPeople people = context.getBean(StudentDao.class);
		people.name();
	}
}
