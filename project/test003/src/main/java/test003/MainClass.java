package test003;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Assembler assembler =
				ctx.getBean("Assembler", Assembler.class);
		Assembler.assemble();
		
		ctx.close();
	}
}

