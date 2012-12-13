import java.awt.AWTException;

import javax.swing.JFrame;

public class Driver
{

	public static void main(String[] args) throws AWTException
	{
		JFrame mainFrame = new JFrame( "Keyboard Tester" );
		mainFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		KeyboardPanel panel = new KeyboardPanel();
		mainFrame.getContentPane().add(panel);

		mainFrame.pack();
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	}

}
