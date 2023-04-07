import javax.swing.JOptionPane;

public class MenuConversion {

	ConversorPesos monedas = new ConversorPesos();
	
	public void convertirMoneda(double entrada) {
		String opcionesMenu = (JOptionPane.showInputDialog(null, "Elije la moneda a la que quieres convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] { "De Pesos A Dolar", "De Pesos A Euros","De Pesos a Yen",
						"De Pesos A Libras","De Pesos A Won","De Dolares A Pesos","De Euros A Pesos","De Yen A Pesos","De Libras A Pesos","De Won A Pesos" },
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
		case "De Dolares A Pesos":
			monedas.monedaAPeso(entrada, 4658.79);
			break;
		case "De Euros A Pesos":
			monedas.monedaAPeso(entrada, 5025.49);
			break;
		case "De Yen A Pesos":
			monedas.monedaAPeso(entrada, 34.99);
			break;
		case "De Libras A Pesos":
			monedas.monedaAPeso(entrada, 5710.65);
			break;
		case "De Won A Pesos":
			monedas.monedaAPeso(entrada, 3.50);
			break;
		}
	}
}
