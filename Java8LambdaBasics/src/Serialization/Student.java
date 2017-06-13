package Serialization;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 352298992207149619L;
	private String id;
	private String name;
	private String dept;
	
	Student(){
		
	}

	Student(String id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;//11
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
	
	/*@Override
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		Student other = new Student();
		if(dept == null){
			if(other.dept != null){
				return false;
			}else if(!dept.equals(other.dept)){
				return false;
			}
		}
		if(id == null){
			if(other.id != null){
				return false;
			}else if(!id.equals(other.id)){
				return false;
			}
		}
		if(name == null){
			if(other.name != null){
				return false;
			}else if(!name.equals(other.name)){
				return false;
			}
		}
		return true;
	}*/
	
}
