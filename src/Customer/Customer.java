package Customer;

public class Customer {
	private int customer_id;
	private String customer_name;
	private String issueType;

public Customer(int customer_id,String customer_name,String issueType) {
	this.customer_id=customer_id;
	this.customer_name=customer_name;
	this.issueType=issueType;
}

public int getCustomer_id() {
	return customer_id;
}

public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}

public String getCustomer_name() {
	return customer_name;
}

public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}

public String getIssueType() {
	return issueType;
}

public void setIssueType(String issueType) {
	this.issueType = issueType;
}

@Override
public String toString() {
	return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", issueType=" + issueType
			+ "]";
}

}

