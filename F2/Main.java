package F2;

import javax.swing.*;
import java.awt.*;

class Main {
	public static void main(String[] args){
		JFrame frame = new JFrame("PC GAME");
		Spaceship spaceships = new Spaceship();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,620);
		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().add(spaceships);
		frame.setVisible(true);
	}
}