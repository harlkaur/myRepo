package Serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class User implements Externalizable {

	private String id;
	private String name;
	private String dept;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

	public User(){
		
	}
	
	public User(String id, String name, String dept) {
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
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(this.id);
		out.writeObject(this.name);
		out.writeObject(this.dept);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.id = in.readObject().toString();
		this.name = in.readObject().toString();
		this.dept = in.readObject().toString();
	}

}
