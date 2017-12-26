
package spring10;

import org.springframework.stereotype.Component;


@Component("bean")
public class springbean {
	public String name = "john";
	public String add = "taipei";
	public String tel = "0926";

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

	@Override
	public String toString() {
		return "springbean [name=" + name + ", add=" + add + ", tel=" + tel + "]";
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
