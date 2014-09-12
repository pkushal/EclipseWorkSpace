import java.io.Serializable;

public class Book implements Serializable {
	private int bid;
	private String title;
	private String author;

	public Book(int bid, String title, String author) {
		this.bid = bid;
		this.title = title;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", author=" + author
				+ "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
