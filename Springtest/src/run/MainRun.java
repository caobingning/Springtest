package run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import com.impl.Config;
import com.impl.Dog;

//@ContextConfiguration(classes=Config.class)
public class MainRun {

	private Dog dog;
	public static void main(String[] args) {
		MainRun mr = new MainRun();
		mr.test();
	}
	
	private void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("config/spring.xml");
		dog = (Dog) context.getBean("dog");
		dog.eat();
	}
}
