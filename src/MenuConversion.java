import javax.swing.JOptionPane;

public class MenuConversion {

	ConversorPesos monedas = new ConversorPesos();
	
	public void convertirMoneda(double entrada) {
		String opcionesMenu = (JOptionPane.showInputDialog(null, "Elije la moneda a la que quieres convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Pesos A Dolar", "De Pesos A Euros","De Pesos a Yen",
						"De Pesos A Libras","De Pesos A Won" },
				"Seleccion")).toString();
		switch(opcionesMenu) {
		case "De Pesos A Dolar":
			monedas.pesoAMoneda(entrada, 4658.79, "Dolares");
			break;
		case "De Pesos A Euros":
			monedas.pesoAMoneda(entrada, 5025.49, "Euros");
			break;
		case "De Pesos a Yen":
			monedas.pesoAMoneda(entrada, 34.99, "Yenes");
			break;
		case "De Pesos A Libras":
			monedas.pesoAMoneda(entrada, 5710.65, "Libras Esterlinas");
			break;
		case "De Pesos A Won":
			monedas.pesoAMoneda(entrada, 3.50, "Won");
			break;
		}
	}
}
