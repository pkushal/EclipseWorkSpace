import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class BookDatabase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean availability;
	private int bookDue;
	private Book book;
	private int loanStdId;
	private static List bookDatabase = new LinkedList();

	public BookDatabase(boolean availability, int bookDue, int loanStdId,
			Book book) {
		this.availability = availability;
		this.bookDue = bookDue;
		this.loanStdId = loanStdId;
		this.book = book;
	}

	public static void setBookDatabase(List bookDatabase) {
		BookDatabase.bookDatabase = bookDatabase;
		System.out.println("Book Database Loading...");
	}

	public int getLoanStdId() {
		return loanStdId;
	}

	public static void addResource(BookDatabase b) {
		bookDatabase.add(b);
	}

	@Override
	public String toString() {
		return "BookDatabase [availability=" + availability + ", bookDue="
				+ bookDue + ", book=" + book + "]";
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setBookDue(int bookDue) {
		this.bookDue = bookDue;
	}

	public void setLoanStdId(int loanStdId) {
		this.loanStdId = loanStdId;
	}

	public int getBookDue() {
		return bookDue;
	}

	public Book getBook() {
		return book;
	}

	public static List getBookDatabase() {
		return bookDatabase;
	}

	public static void searchBooks() {
		for (Object b : bookDatabase) {
			BookDatabase bb = (BookDatabase) b;
			System.out.println("Book ID: " + bb.getBook().getBid()
					+ "\t Title : " + bb.getBook().getTitle() + "\t Author: "
					+ bb.getBook().getAuthor() + "\t Available: "
					+ bb.isAvailability());
		}
	}

	public static boolean BookPreCondition(int bid) {
		for (Object b : bookDatabase) {
			BookDatabase bb = (BookDatabase) b;
			if (bb.getBook().getBid() == bid) {
				if (bb.isAvailability()) {
					System.out.print("Book is available, ");
					return true;
				} else {
					System.out.println("Book is checked out :(");
					return false;
				}
			}
		}
		System.out.println("Such book is not found...");
		return false;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public static void BookPostCondition(int bid) {
		for (Object b : bookDatabase) {
			BookDatabase bb = (BookDatabase) b;
			if (bb.getBook().getBid() == bid) {
				bb.setAvailability(false);
			}
		}
	}
}
