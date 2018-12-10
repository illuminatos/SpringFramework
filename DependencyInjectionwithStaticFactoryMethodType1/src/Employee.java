
public class Employee {

	private int id;
	private String name;
	private String dutyType;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String dutyType) {
		super();
		this.id = id;
		this.name = name;
		this.dutyType = dutyType;
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

	public String getDutyType() {
		return dutyType;
	}

	public void setDutyType(String dutyType) {
		this.dutyType = dutyType;
	}

		public void print() {
		System.out.println("id: " + id + " name: " + name + " type: " + dutyType);
	}

}
