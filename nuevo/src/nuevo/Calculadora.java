package nuevo;

public class Calculadora {

	public String sumar(int i, int j) {
		
		if(i == Integer.MAX_VALUE || j == Integer.MAX_VALUE)
		{
			return "Overflow";
		}
		return String.valueOf(i+j);
	}

	public String dividir(int i, int j) {
		
		if(i == 0 || j == 0)
		{
			return "error no se puede dividir por cero";
		}
		else
		{
			int res = (i/j); 
			return String.valueOf(res);
		}
		
	}

}
