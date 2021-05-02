package GUIdemo;

import javax.swing.*;

public class GUIDemo{
	GUIDemo(){

//		Create a new JFrame container.
		JFrame jframe = new JFrame("Simple swing application");

//		Give the frame an initial size.
		jframe.setSize(275,100);

//		Terminate the program when the user closes the application.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		Create a text - based label.
		JLabel jlabel = new JLabel("Hey there");

//		Add the lable to the content pane.
		jframe.add(jlabel);

//		Display the frame.
		jframe.setVisible(true);
	}

	public static void main(String[] args) {
//		Create the frame on the event dispatching thread.
		GUIDemo obj = new GUIDemo();
		System.out.println("maybe this will run");
	}
}
