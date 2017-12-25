package spring10.spring10;

import org.springframework.stereotype.Repository;


//@ContextConfiguration(locations = { "classpath:/spring-defalts2.xml" })
@Repository("bean")
public class AnnotationBean {

	public String name = "郭台銘";
	public String add = "台北市";

	@Override
	public String toString() {
		return "AnnotationBean [name=" + name + ", add=" + add + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
