import javax.swing.JOptionPane;

public class MenuTemperatura {
	
	ConversorTemperatura temperatura = new ConversorTemperatura();
	
	public void convertirTemperatura(double entrada) {
		String menu = (JOptionPane.showInputDialog(null,"Elija la opcion de conversion para la temperatura ingresada",
				"Temperatura",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Celsius a Fahrenheit","De Fahrenheit a Celsius"},
				"Seleccion")).toString();
		switch(menu) {
		case "De Celsius a Fahrenheit" :
			temperatura.celsiusAFahrenheit(entrada);
			break;
		case "De Fahrenheit a Celsius":
			temperatura.fahrenheitACelsius(entrada);
			break;
		}
	}
}
