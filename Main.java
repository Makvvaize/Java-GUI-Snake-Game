

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String args[]){
		int size = 30;
		int map[][] = new int[size][size];
		
		UserInterface ui = new UserInterface(map);
		
		JFrame frame = new JFrame("Snake Game");
		
		frame.addKeyListener(ui);
		frame.getContentPane().add(ui);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
