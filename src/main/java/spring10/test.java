package spring10;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import StudentAction.StudentAction;


public class test {

	@Test
	public void gogo() {

		// springbean ssSpringbean = new springbean();
		// System.out.println(ssSpringbean);
		// classpath是掃每一個pakage裡面的資料夾
		// ApplicationContext ap = new
		// ClassPathXmlApplicationContext("classpath:/spring-defalts2.xml");

		// 沒有的話她會自動去maven目錄下掃resources層的資料
		// ApplicationContext ap = new ClassPathXmlApplicationContext("spring-defalts.xml");

		ApplicationContext ap = new ClassPathXmlApplicationContext("/spring-defalts.xml");

		springbean hh = (springbean) ap.getBean("helloBean");
		System.out.println(hh);

		StudentAction ss = (StudentAction) ap.getBean("studenActionId");
		ss.Execute();

		StudentAction200 ss200 = (StudentAction200) ap.getBean("studenActionId200");

		ss200.Execute();

	}
}
