package design.pattern;

public class Customer implements Observer {

	private String custName;
	private Subject subject;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public void update(String productName){
		System.out.println("Notifying the customer " + custName +"for product:"+productName);
	}

}
