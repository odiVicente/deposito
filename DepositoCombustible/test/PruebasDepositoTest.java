import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoTestConsumirParametrizado.class, DepositoTestFillParametrizado.class,
		testDepositoCombustible.class })
public class PruebasDepositoTest {

}
