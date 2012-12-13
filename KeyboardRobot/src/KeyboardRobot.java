import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;


public class KeyboardRobot
{
	private static final int KEY_PRESS_DELAY = 0;
	private static final int ALPHABET_START = 0x41;
	private static final int ALPHABET_END = 0x5A;
	private static final char[] QWERTY_STRING = "QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
	
	private Robot robot;
	
	public KeyboardRobot () throws AWTException
	{
		robot = new Robot();
	}
	
	public void typeAlphabet ()
	{
		typeAlphabet( KEY_PRESS_DELAY );
	}
	
	public void typeAlphabet (int delay)
	{
		for (int keyCode = ALPHABET_START; keyCode < ALPHABET_END + 1; keyCode++)
		{
			robot.delay(delay);
			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);
		}
	}
	
	public void typeQwerty ()
	{
		typeQwerty(0);
	}
	
	public void typeQwerty (int delay)
	{
		for (char keyCode : QWERTY_STRING)
		{
			pressKey((int)keyCode);
		}
	}
	
	public void typeScript (String filePath)
	{
		typeScript (filePath, KEY_PRESS_DELAY);
	}
	
	public void typeScript (String filePath, int delay)
	{
		Scanner script = new Scanner(filePath);
		while (script.hasNextLine())
		{
			String scriptLine = script.nextLine();
			for (char character : scriptLine.toCharArray())
			{
				
			}
		}
	}
	
	public void delay (int ms)
	{
		robot.delay(ms);
	}
	
	public void pressKey (int keyCode)
	{
		pressKey(keyCode, KEY_PRESS_DELAY);
	}

	public void pressKey (int keyCode, int delay)
	{
		robot.delay(delay);
		robot.keyPress(keyCode);
		robot.keyRelease(keyCode);
	}
	
}
 