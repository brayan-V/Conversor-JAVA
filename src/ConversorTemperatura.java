import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void celsiusAFahrenheit(double temperatura) {
		double fahrenheit = (temperatura *1.8)+32;
		JOptionPane.showMessageDialog(null, "Tu temperatura en grados Fahrenheit es de: "
				+fahrenheit,null,0,null);
	}
	public void fahrenheitACelsius(double temperatura) {
		double celsius =(temperatura-32)/1.8;
		JOptionPane.showMessageDialog(null, "Tu temperatura en grados Celsius es de: "
				+celsius,null,0,null);
	}
}
