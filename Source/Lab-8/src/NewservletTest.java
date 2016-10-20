import static org.junit.Assert.*; 
import org.junit.Test;

public class NewservletTest {

	@Test
	public void testGetsum() {
		int firstnumber=10;
		int secondnumber=12;
		Getsum newone = new Getsum();
		int result = newone.sum(firstnumber, secondnumber);
		int testresult=22;
		assertEquals(result, testresult);
	}

	@Test
	public void testTran() {
		String lowercase="wang";
		Tran newone = new Tran();
		String result=newone.doTran(lowercase);
		String testresult="WANG";	
		assertEquals(result, testresult);
	}

}
