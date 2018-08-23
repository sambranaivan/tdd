package nuevo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumarTest {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		String resultado = calc.sumar(2,2);
		assertEquals("4", resultado);
	}
	
	@Test
	public void sumarMaximo() {
		Calculadora calc = new Calculadora();
		String resultado = calc.sumar(Integer.MAX_VALUE,1);
		assertEquals("Overflow", resultado);
	}
	

}
