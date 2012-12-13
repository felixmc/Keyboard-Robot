import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;


@SuppressWarnings("serial")
public class KeyboardPanel extends JPanel
{

	private JTextField textBox;
	
	private KeyboardRobot typingRobot;
	private Timer robotTimer;
	private final int START_DELAY = 4000;
	private final int REPEAT_DELAY = 20;
	private final int PRESS_DELAY = 0;

	
	public KeyboardPanel () throws AWTException
	{
		setupPanel();
		setupTextBox();
		
		typingRobot = new KeyboardRobot();
		
		robotTimer = new Timer(REPEAT_DELAY, new ActionListener()
		{
			@Override
			public void actionPerformed (ActionEvent e)
			{
				//typingRobot.typeAlphabet(PRESS_DELAY);
				typingRobot.typeQwerty(PRESS_DELAY);
			}
		});

		Timer startDelayTimer = new Timer(START_DELAY, new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				robotTimer.start();
			}
		});
		
		startDelayTimer.setRepeats(false);
		startDelayTimer.start();
	}
	
	private void setupTextBox ()
	{
		JTextField textBox = new JTextField();
		
		textBox.setPreferredSize( new Dimension(300, 50) );
		textBox.setFont( new Font("sansserif", Font.PLAIN, 32) );
		
		add( textBox );		
	}
	
	private void setupPanel ()
	{
		setPreferredSize( new Dimension(300, 50) );
		setBackground (Color.red);
	}
	
}
