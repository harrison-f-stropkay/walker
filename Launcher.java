import javax.swing.*;
import java.awt.*;

public class Launcher {
	public static void main(String[] args) {
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Baby Sphere");
		theGUI.setUndecorated(true);
		theGUI.setSize(1000, 1000);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Walker panel = new Walker(Color.black);

		Container pane = theGUI.getContentPane();
		pane.add(panel);
		theGUI.setVisible(true);
	}
}