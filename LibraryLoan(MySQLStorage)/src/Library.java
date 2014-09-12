public class Library {
	public static void main(String[] args) {

		// initializeDatabase();
		// StudentDatabase.searchByID();
		// System.out
		// .println("-------------------------------------------------------");
		// BookDatabase.searchBooks();
		// System.out
		// .println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// System.out.println();
		//
		// checkOut(100, 200);
		// System.out.println();
		// checkOut(100, 205);
		// checkOut(100, 201);
		// checkOut(100, 202);
		//
		// System.out.println();
		// StudentDatabase.howMany(100);
		GuiMain g = new GuiMain();

	}

	// public static void initializeDatabase() {
	// StudentDatabase s = new StudentDatabase(2, new Student(100, "Kushal",
	// "Birmingham"));
	// StudentDatabase s1 = new StudentDatabase(3, new Student(101, "Suraj",
	// "Alabama"));
	// StudentDatabase s2 = new StudentDatabase(3, new Student(102, "Upendra",
	// "USA"));
	// StudentDatabase.addResource(s);
	// StudentDatabase.addResource(s1);
	// StudentDatabase.addResource(s2);
	//
	// BookDatabase b = new BookDatabase(true, 14, 0, new Book(200, "OOAD",
	// "I donn know"));
	// BookDatabase b1 = new BookDatabase(true, 14, 0, new Book(201, "Java",
	// "I donn know either"));
	// BookDatabase b2 = new BookDatabase(true, 14, 0, new Book(202,
	// "Algorithms", "khai"));
	// BookDatabase.addResource(b);
	// BookDatabase.addResource(b1);
	// BookDatabase.addResource(b2);
	//
//	 try {
//	 ObjectOutputStream studentseri = new ObjectOutputStream(
//	 new FileOutputStream("StudentDatabase.txt"));
//	 studentseri.writeObject(StudentDatabase.getStudentDatabase());
//	 } catch (FileNotFoundException e) {
//	 // TODO Auto-generated catch block
//	 e.printStackTrace();
//	 } catch (IOException e) {
//	 // TODO Auto-generated catch block
//	 e.printStackTrace();
//	 }
//	
//	 try {
//	 ObjectOutputStream bookseri = new ObjectOutputStream(
//	 new FileOutputStream("BookDatabase.txt"));
//	 bookseri.writeObject(BookDatabase.getBookDatabase());
//	 } catch (FileNotFoundException e) {
//	 // TODO Auto-generated catch block
//	 e.printStackTrace();
//	 } catch (IOException e) {
//	 // TODO Auto-generated catch block
//	 e.printStackTrace();
//	 }
	//
	// }

	public static boolean checkOut(int sid, int bid) {
		boolean value = false;
		if (BookDatabase.BookPreCondition(bid)) {
			if (StudentDatabase.studentPreCondition(sid, bid)) {
				BookDatabase.BookPostCondition(bid);
				System.out.println("Successful... the book id: " + bid
						+ " has been assigned to student id : " + sid);
				value = true;

			}
		} else {
			System.out
					.println("Either the student limit is full or book is checked out !!");
		}
		return value;
	}

}
