import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoTestFillParametrizado {
	private double capacidad;
	private double cantidad2;
	private double cantidad3;
	public DepositoTestFillParametrizado(double c1,double c2, double c3) {
		capacidad=c1;
		cantidad2=c2;
		cantidad3=c3;
	}
	@Parameters
	public static Collection<Object[]>cantidades(){
		return Arrays.asList(new Object[][] {
			{40.0,10.0,50.0},{40.0,0.0,50.0},{40.0,10.0,30.0}
		});
	}
	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(capacidad,cantidad2);
		tank.fill(cantidad3);
		assertEquals(capacidad,tank.getDepositoNivel(),0.05);
		assertTrue(tank.estaLleno());
		System.out.println(tank.getDepositoNivel());
	}

}
