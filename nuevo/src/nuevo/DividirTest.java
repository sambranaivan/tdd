package nuevo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DividirTest {

	@Test
	public void dividirPorCero() {
		Calculadora calc = new Calculadora();
		String resultado = calc.dividir(20,0);
		assertEquals("error no se puede dividir por cero",resultado);
		
	}
	
	@Test
	public void dividirEntero(){
		Calculadora calc = new Calculadora();
		String resultado = calc.dividir(10, 2);
		assertEquals("5", resultado);
	}
	@Test
	public void dividirNegativos(){
		Calculadora calc = new Calculadora();
		String resultado = calc.dividir(-10, -2);
		assertEquals("5", resultado);
	}

}
