import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiMain extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame mainFrame;
	private JFrame stdFrame;
	private JFrame bkFrame;
	private JFrame lFrame;

	public GuiMain() {
		makeGui();
	}

	private void makeGui() {
		
		try {
			ObjectInputStream readstd = new ObjectInputStream(
					new FileInputStream("StudentDatabase.txt"));
			StudentDatabase.setStudentDatabase((LinkedList) readstd
					.readObject());
			System.out.println("\tStudent Database Loaded...");
			readstd.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found re");
			e.printStackTrace();
		}
		StudentDatabase.searchByID();
System.out.println();
System.out.println();
		try {
			ObjectInputStream bookstd = new ObjectInputStream(
					new FileInputStream("BookDatabase.txt"));
			BookDatabase.setBookDatabase((LinkedList) bookstd.readObject());
			System.out.println("\tBook Database Loaded...");
			bookstd.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found re");
			e.printStackTrace();
		}

		BookDatabase.searchBooks();
		System.out.println();
		System.out.println("---------------------------------------------------------");

		mainFrame = new JFrame("Library Management System");
		mainFrame.setPreferredSize(new Dimension(350, 700));
		mainFrame.setLayout(new GridLayout(4, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				//last ma top ko cross button click garda database haru ma save gareko
				 try {
					 ObjectOutputStream studentseri = new ObjectOutputStream(
					 new FileOutputStream("StudentDatabase.txt"));
					 studentseri.writeObject(StudentDatabase.getStudentDatabase());
					 } catch (FileNotFoundException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 } catch (IOException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 }
					
					 try {
					 ObjectOutputStream bookseri = new ObjectOutputStream(
					 new FileOutputStream("BookDatabase.txt"));
					 bookseri.writeObject(BookDatabase.getBookDatabase());
					 } catch (FileNotFoundException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 } catch (IOException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 }
				
				System.exit(0);
			}
		});

		JPanel panel = new JPanel(new GridLayout(5, 1, 0, 20));
		panel.setSize(100, 100);
		JLabel header = new JLabel("Welcome to Library Mangement System !! ",
				JLabel.CENTER);
		panel.add(header);

		JButton sbutton = new JButton("Enter the Student Database (Profile) ");
		panel.add(sbutton);
		sbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setVisible(false);
				stdGui();

			}
		});
		JButton bbutton = new JButton("Enter the Book Database (Profile) ");
		panel.add(bbutton);
		bbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setVisible(false);
				bookGui();

			}
		});
		JButton lib = new JButton("Check out books !!");
		panel.add(lib);
		lib.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setVisible(false);
				libGui();

			}
		});
		JButton ebutton = new JButton("Exit ");
		panel.add(ebutton);
		ebutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {
				// last ma exit garda database haru ma save gareko
				 try {
					 ObjectOutputStream studentseri = new ObjectOutputStream(
					 new FileOutputStream("StudentDatabase.txt"));
					 studentseri.writeObject(StudentDatabase.getStudentDatabase());
					 } catch (FileNotFoundException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 } catch (IOException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 }
					
					 try {
					 ObjectOutputStream bookseri = new ObjectOutputStream(
					 new FileOutputStream("BookDatabase.txt"));
					 bookseri.writeObject(BookDatabase.getBookDatabase());
					 } catch (FileNotFoundException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 } catch (IOException e) {
					 // TODO Auto-generated catch block
					 e.printStackTrace();
					 }
				System.exit(0);

			}
		});
		mainFrame.add(panel);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}

	public void stdGui() {
		stdFrame = new JFrame();
		stdFrame.setPreferredSize(new Dimension(500, 500));
		stdFrame.setTitle("~~~Welcome to Student Entry window~~~");
		stdFrame.setLayout(new FlowLayout());

		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		JPanel spanel1 = new JPanel(new GridLayout(0, 2, 0, 0));
		JPanel spanel2 = new JPanel();
		spanel2.setLayout(new BoxLayout(spanel2, BoxLayout.Y_AXIS));

		main.add(spanel1);
		JPanel jpt = new JPanel();
		jpt.setPreferredSize(new Dimension(5, 50));
		main.add(jpt);
		main.add(spanel2);

		JLabel namelabel = new JLabel("Student Name: ");
		spanel1.add(namelabel);
		final JTextField name = new JTextField(10);
		spanel1.add(name);
		JLabel sidlabel = new JLabel("Student ID: ");
		spanel1.add(sidlabel);
		final JTextField sid = new JTextField(10);
		spanel1.add(sid);
		JLabel contactlabel = new JLabel("Student Contact: ");
		spanel1.add(contactlabel);
		final JTextField contact = new JTextField(10);
		spanel1.add(contact);
		JLabel blimitlabel = new JLabel("Books Allowed: ");
		spanel1.add(blimitlabel);
		final JTextField bookLimit = new JTextField(10);
		spanel1.add(bookLimit);

		JButton ok = new JButton("Yes, ENTRY the data !!");
		spanel2.add(ok);
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StudentDatabase s = new StudentDatabase(Integer
						.parseInt(bookLimit.getText()), new Student(Integer
						.parseInt(sid.getText()), name.getText(), contact
						.getText()));
				StudentDatabase.addResource(s);
				StudentDatabase.searchByID();

				final JFrame succ = new JFrame();

				succ.setTitle("Howdy !!");
				succ.setPreferredSize(new Dimension(200, 150));
				JPanel pan = new JPanel();
				pan.setPreferredSize(new Dimension(100, 250));
				JLabel success = new JLabel("Data successfully entered !!");
				pan.add(success);
				JButton okay = new JButton("Okay !!");
				pan.add(okay);

				succ.add(pan);
				okay.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Chill out !!");
						// TODO : make this Okay button to close the succ JFrame

					}
				});
				succ.pack();
				succ.setVisible(true);

			}
		});
		JButton reset = new JButton("Reset the entry");
		spanel2.add(reset);
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				sid.setText("");
				contact.setText("");
				bookLimit.setText("");

			}
		});
		JButton close = new JButton("Close");
		spanel2.add(close);
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setVisible(true);
			}
		});

		stdFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				mainFrame.setVisible(true);
			}
		});

		stdFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		stdFrame.add(main);
		stdFrame.pack();
		stdFrame.setVisible(true);

	}

	public void bookGui() {

		bkFrame = new JFrame();
		bkFrame.setPreferredSize(new Dimension(500, 500));
		bkFrame.setTitle("~~~Welcome to Book Database Entry window~~~");
		bkFrame.setLayout(new FlowLayout());

		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

		JPanel spanel1 = new JPanel(new GridLayout(0, 2, 0, 0));
		main.add(spanel1);

		JPanel buffer = new JPanel();
		buffer.setPreferredSize(new Dimension(5, 50));
		main.add(buffer);

		JPanel spanel2 = new JPanel();
		spanel2.setLayout(new BoxLayout(spanel2, BoxLayout.Y_AXIS));
		main.add(spanel2);

		JLabel titlelabel = new JLabel("Book Title: ");
		spanel1.add(titlelabel);
		final JTextField title = new JTextField(10);
		spanel1.add(title);

		JLabel bkidlabel = new JLabel("Book ID: ");
		spanel1.add(bkidlabel);
		final JTextField bid = new JTextField(10);
		spanel1.add(bid);

		JLabel authorlabel = new JLabel("Author: ");
		spanel1.add(authorlabel);
		final JTextField author = new JTextField(10);
		spanel1.add(author);

		JLabel availabilitylabel = new JLabel("Availability: ");
		spanel1.add(availabilitylabel);

		String[] avail = { "Select One", "True", "False" };
		final JComboBox<String> combo = new JComboBox<>(avail);
		spanel1.add(combo);

		JLabel bkduelabel = new JLabel("Book due days: ");
		spanel1.add(bkduelabel);
		final JTextField bookDue = new JTextField(10);
		spanel1.add(bookDue);

		JLabel loanlabel = new JLabel("Loan student ID(0 for default): ");
		spanel1.add(loanlabel);
		final JTextField loanStdId = new JTextField(10);
		spanel1.add(loanStdId);

		// spanel2 ko entry haru

		JButton ok = new JButton("Yes, ENTRY the data !!");
		spanel2.add(ok);
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BookDatabase s = new BookDatabase(Boolean.parseBoolean(combo
						.getItemAt(1).toLowerCase()), Integer.parseInt(bookDue // forcefully
																				// get
																				// selected
																				// item
																				// at
																				// 1
																				// gareko
																				// cha
																				// pachi
																				// milaunu
																				// parcha
						.getText()), Integer.parseInt(loanStdId.getText()),
						new Book(Integer.parseInt(bid.getText()), title
								.getText(), author.getText()));

				BookDatabase.addResource(s);
				BookDatabase.searchBooks();

				final JFrame succ = new JFrame();

				succ.setTitle("Howdy !!");
				succ.setPreferredSize(new Dimension(200, 150));
				JPanel pan = new JPanel();
				pan.setPreferredSize(new Dimension(100, 250));
				JLabel success = new JLabel("Data successfully entered !!");
				pan.add(success);
				JButton okay = new JButton("Okay !!");
				pan.add(okay);

				succ.add(pan);
				okay.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						System.out.println("Chill out !!");
						// TODO : make this Okay button to close the succ JFrame

					}
				});
				succ.pack();
				succ.setVisible(true);

			}
		});

		JButton reset = new JButton("Reset the entry");
		spanel2.add(reset);
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				title.setText("");
				bid.setText("");
				author.setText("");
				combo.setSelectedIndex(0);
				bookDue.setText("");
				loanStdId.setText("");
			}
		});
		JButton close = new JButton("Close");
		spanel2.add(close);
		close.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.setVisible(true);
			}
		});

		bkFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				mainFrame.setVisible(true);
			}
		});

		bkFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		bkFrame.add(main);
		bkFrame.pack();
		bkFrame.setVisible(true);

	}

	public void libGui() {
		lFrame = new JFrame();
		lFrame.setPreferredSize(new Dimension(500, 200));

		// lpanel
		JPanel lpanel = new JPanel();
		lpanel.setLayout(new GridLayout(0, 2, 2, 2));
		lpanel.setSize(new Dimension(50, 60));
		JLabel wel = new JLabel("Welcome   to   Library", JLabel.CENTER);
		lpanel.add(wel);

		JLabel buff = new JLabel("Checkout   System !!");
		lpanel.add(buff);

		final JLabel sid = new JLabel("Student ID: ");
		lpanel.add(sid);
		final JTextField sfield = new JTextField(10);
		lpanel.add(sfield);

		final JLabel bid = new JLabel("Book ID: ");
		lpanel.add(bid);
		final JTextField bfield = new JTextField(10);
		lpanel.add(bfield);

		// lpanel2
		final JPanel lpanel2 = new JPanel();
		lpanel2.setLayout(new BoxLayout(lpanel2, BoxLayout.Y_AXIS));
		lpanel2.add(Box.createRigidArea(new Dimension(10, 0)));
		final JButton check = new JButton("Issue the book");
		lpanel2.add(check);

		check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StudentDatabase.searchByID();
				JLabel stat;
				if (Library.checkOut(Integer.parseInt(sfield.getText()),
						Integer.parseInt(bfield.getText()))) {
					stat = new JLabel(" Success !!!");
					lpanel2.add(stat);

				} else {
					stat = new JLabel(
							"Either book unavailable or book limit reached");
					lpanel2.add(stat);
				}
			}
		});
		final JButton res = new JButton("Clear Entry !!");
		lpanel2.add(res);
		res.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sfield.setText("");
				bfield.setText("");

			}
		});
		lFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				mainFrame.setVisible(true);
			}
		});

		final JButton show = new JButton("Display database");
		lpanel2.add(show);
		show.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StudentDatabase.searchByID();
				BookDatabase.searchBooks();
			}
		});

		JPanel sup = new JPanel();
		sup.setLayout(new BoxLayout(sup, BoxLayout.Y_AXIS));
		sup.add(lpanel);
		sup.add(lpanel2);

		lFrame.add(sup);
		lFrame.pack();
		lFrame.setVisible(true);
	}
}
