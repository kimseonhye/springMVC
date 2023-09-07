package test002;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Hello hello =
				ctx.getBean("he", Hello.class);
		hello.h();
		
		ctx.close();
	}

}

//스프링을 사용하는 이유는 유지보수가 쉽다!