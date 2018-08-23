package nuevo;

public class Calculadora {

	public int sumar(int i, int j) {
		return i+j;
	}

	public String dividir(int i, int j) {
		// TODO Auto-generated method stub
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
