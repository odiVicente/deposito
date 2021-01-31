import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testDepositoCombustible {
	
	private DepositoCombustible tank;
	
	@Before
	public void inicioTest() {
		tank= new DepositoCombustible(40.0,5.0);
	}
	
	@After
	public void finTest() {
		tank=null;
	}

	@Test
	public void testgetDepositoNivel() {
		
		assertEquals(5.0,tank.getDepositoNivel(),0.05);
	}
	
}
