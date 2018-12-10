
public class Employee {

	private int id;
	private String name;
	private Address addressbean;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Address addressbean) {
		super();
		this.id = id;
		this.name = name;
		this.addressbean = addressbean;
	}

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

	public Address getAddressbean() {
		return addressbean;
	}

	public void setAddressbean(Address addressbean) {
		this.addressbean = addressbean;
	}

	public void print() {
		System.out.println("id: " + id + " name: " + name);
		System.out.println(addressbean);
	}

}
