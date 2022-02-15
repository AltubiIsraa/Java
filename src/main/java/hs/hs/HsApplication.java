package hs.hs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;



@SpringBootApplication

public class HsApplication {

	public static void main(String[] args) {


		SpringApplication.run(HsApplication.class, args);
		 {
			var context = new ClassPathXmlApplicationContext("config.xml");

			Aclass  Acont = (Aclass) context.getBean("classA");
			Bclass Bcont = (Bclass) context.getBean("classB");
			Cclass Ccont = (Cclass) context.getBean("classC");

			System.out.println(Acont.getNotiA());
			System.out.println(Bcont.getAValue());
			System.out.println(Ccont.getCValue());
		}
	}
}