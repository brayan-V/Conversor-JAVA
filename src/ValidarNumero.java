
public class ValidarNumero {
	
	public boolean validarNumero(String entrada) {
		try {
			double numero = Double.parseDouble(entrada);
			if (numero >= 0 || numero < 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
