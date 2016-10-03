package lyc.test;

import lyc.service.IUserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testspring {
	@Test
	public void test()
	{
		IUserService myserv;
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring.xml");
		myserv = (IUserService)ac.getBean("userService");
		myserv.myservice();
	}
}
