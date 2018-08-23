package nuevo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumarTest {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int resultado = calc.sumar(2,2);
		assertEquals(4, resultado);
	}

}
