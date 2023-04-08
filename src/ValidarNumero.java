
public class ValidarNumero {
	
	public boolean validarNumero(String entrada) {
		try {
			return entrada.matches("^[0-9]+$");
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public boolean validarTemperatura(String entrada) {
		try {
			return entrada.matches("^-?[0-9]+$");
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
