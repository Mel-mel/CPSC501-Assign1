import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DriverTest {

	private Draw rect, leftTri, rightTri;

	@Before
	public void setup()
	{
		rect = new Draw();
		leftTri = new Draw();
		rightTri = new Draw();
	}

	@After
	public void teardown()
	{
		rect = null;
		leftTri = null;
		rightTri = null;	
	}
	
	@Test
	public void testCharacter()
	{
		//assertTrue("?", lineFromFile.substring(2, 3));
	}
}
