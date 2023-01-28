package sikulitutorial;

import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	
	Screen s = new Screen();
	
  @Test
  public void desktop() {
	  s.click("C:\\Users\\MYPC\\Documents\\sikuli\\start.PNG");
  }
}
