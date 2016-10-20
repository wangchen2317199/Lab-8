import static org.junit.Assert.*; 
import org.junit.Test;

public class NewservletTest {

	@Test
	public void testGetsum() {
		int firstnumber=10;
		int secondnumber=12;
		Newservlet newone = new Newservlet();
		int result = newone.Getsum(firstnumber, secondnumber);
		int testresult=22;
		assertEquals(result, testresult);
	}

	@Test
	public void testTran() {
		String lowercase="wang";
		Newservlet newone = new Newservlet();
		String result=newone.Tran(lowercase);
		String testresult="WANG";	
		assertEquals(result, testresult);
	}

}
