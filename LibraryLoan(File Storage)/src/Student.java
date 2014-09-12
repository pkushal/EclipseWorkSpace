import java.io.Serializable;

public class Student implements Serializable {
	private int sid;
	private String name;
	private String contact;

	public Student(int sid, String name, String contact) {
		this.sid = sid;
		this.name = name;
		this.contact = contact;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", contact="
				+ contact + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}
