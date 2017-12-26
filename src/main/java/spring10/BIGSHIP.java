package spring10;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


//@ContextConfiguration(locations = { "classpath:/spring-defalts2.xml" })
public class BIGSHIP {
	@Autowired
	@Qualifier("bean")
	private AnnotationBean annotationBean;

	@Test
	public void name() {
		System.out.println(annotationBean);
	}
}
