import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class StudentDatabase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bookLimit;
	private Student student;
	private List loanbkId = new LinkedList();
	private static List studentDatabase = new LinkedList();

	public StudentDatabase(int bookLimit, Student student) {
		this.bookLimit = bookLimit;
		this.student = student;
	}

	public List getLoanbkId() {
		return loanbkId;
	}

	@Override
	public String toString() {
		return "StudentDatabase [bookLimit=" + bookLimit + ", student="
				+ student + ", loanbkId=" + loanbkId + "]";
	}

	public static void addResource(StudentDatabase s) {
		studentDatabase.add(s);
	}

	public static void setStudentDatabase(List studentDatabase) {
		StudentDatabase.studentDatabase = studentDatabase;
		System.out.println("Student Database Loading...");
	}

	public int getBookLimit() {
		return bookLimit;
	}

	public Student getStudent() {
		return student;
	}

	public void setLoanbkId(List loanbkId) {
		this.loanbkId = loanbkId;
	}

	public static List getStudentDatabase() {
		return studentDatabase;
	}

	public void setBookLimit(int bookLimit) {
		this.bookLimit = bookLimit;
	}

	public static void searchByID() {

		for (Object b : studentDatabase) {
			StudentDatabase bb = (StudentDatabase) b;
			System.out.println("Student Name: " + bb.getStudent().getName()
					+ "\t ID : " + bb.getStudent().getSid() + "\t Contact: "
					+ bb.getStudent().getContact());
		}

	}

	public static boolean studentPreCondition(int sid, int bid) {
		for (Object obj : studentDatabase) {
			StudentDatabase sdb = (StudentDatabase) obj;
			if (sdb.getStudent().getSid() == sid) {
				if (sdb.getBookLimit() >= 1) {
					sdb.setBookLimit(sdb.getBookLimit() - 1);
					sdb.loanbkId.add(bid);
					return true;
				} else {
					System.out
							.println("Oops .... he has already 2 books !! \n Cannot assign any more...");
					return false;
				}
			}
		}
		System.out
				.println("but no such student is detected in our system :(  !!");
		return false;
	}

	public static void howMany(int sid) {
		for (Object obj : studentDatabase) {
			StudentDatabase sdb = (StudentDatabase) obj;
			if (sdb.getStudent().getSid() == sid) {
				List books = sdb.getLoanbkId();
				System.out.println(sdb.getStudent().getName()
						+ " has the following books.");
				for (Object lst : books) {
					Integer ids = (Integer) lst;
					System.out.print(ids + "\t");
					return;
				}
			}
		}
	}
}
