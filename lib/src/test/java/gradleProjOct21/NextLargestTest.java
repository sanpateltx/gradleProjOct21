package gradleProjOct21;

import org.junit.Test;

import static org.junit.Assert.*;

//import com.home.NextLargest;


public class NextLargestTest {

	@Test
	public void test() {
		
		NextLargest nextLargest  = new NextLargest();
		
		char[] digits = { '5','3','4','9','7','6' };
		  			
		assertEquals("536479",nextLargest.findLargest(digits, digits.length));

		assertNotEquals("534976",nextLargest.findLargest(digits, digits.length));

		digits = null;

		assertNull(nextLargest.findLargest(digits, 0));

	}

}
