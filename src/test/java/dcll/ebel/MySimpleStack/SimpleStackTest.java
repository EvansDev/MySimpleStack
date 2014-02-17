package dcll.ebel.MySimpleStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleStackTest {

	@Test
	public void test() {
		ArrayImplement monArray = new ArrayImplement();
		
		assert (monArray.isEmpty() == false);
		monArray.push(new Item());
		assert (monArray.isEmpty() == true);
	}

}
