package com.shc.string;

public class CheckforEqualsandHashcode {

}

class Person {
	private int id;
	private String name;
	private String dept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/*@Override
	public int hashCode() {
		int prime = 33;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		}
		if(getClass() != o.getClass()){
			return false;
		}
		Person p = new Person();
		if(dept == null){
		  if(p.dept != null){
			  return false;
		  }else if(!dept.equals(p.getDept()))
		       return false;
		}
		if(id == 0){
			  if(p.id != 0){
				  return false;
			  }
			}
		if(name == null){
			  if(p.name != null){
				  return false;
			  }
			}
		return true;
	}*/
}