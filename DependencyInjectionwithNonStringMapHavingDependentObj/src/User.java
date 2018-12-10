
public class User {

	private int id;
	private String name;
	private String e_mail;

	public User() {
		super();
	}

	public User(int id, String name, String e_mail) {
		super();
		this.id = id;
		this.name = name;
		this.e_mail = e_mail;
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

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", e_mail=" + e_mail + "]";
	}

}
