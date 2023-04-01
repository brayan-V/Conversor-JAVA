import javax.swing.JOptionPane;

public class MenuConversion {

	ConversorPesos monedas = new ConversorPesos();

	public void convertirMoneda(double entrada) {
		String opcionesMenu = (JOptionPane.showInputDialog(null, "Elije la moneda a la que quieres convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Pesos A Dolar", "De Pesos A Euros" },
				"Seleccion")).toString();
		switch(opcionesMenu) {
		case "De Pesos A Dolar":
			monedas.pesoAMoneda(entrada, 4658.79, "Dolares");
			break;
		case "De Pesos A Euros":
			monedas.pesoAMoneda(entrada, 5025.49, "Euros");
		}
	}
}
