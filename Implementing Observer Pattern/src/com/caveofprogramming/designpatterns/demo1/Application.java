package com.caveofprogramming.designpatterns.demo1;

import javax.swing.SwingUtilities;

import com.caveofprogramming.designpatterns.demo1.controller.Controller;
import com.caveofprogramming.designpatterns.demo1.model.Model;
import com.caveofprogramming.designpatterns.demo1.view.View;

public class Application {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { // anonymous class

					@Override
					public void run() { // run() is a method of the Runnable
										// interface
						runApp();
					}

				});
	}

	public static void runApp() {
		Model model = new Model(); // ahile samma yo model class ma kei ni
									// chaina
		View view = new View(model); // new garda JFrame ko window yaha bancha

		Controller controller = new Controller(view, model); // yo nai
																// loginListner
																// ko new jasto
																// ho because
																// Controller
																// class le
																// LoginListner
																// lai implement
																// gareko cha

		view.setLoginListener(controller);
	}

}
