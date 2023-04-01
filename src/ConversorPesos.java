import javax.swing.JOptionPane;

public class ConversorPesos {

	// Valor dolar en Colombia 1 USD = 4658.79 COP 30/03/23
	// Valor euro en Colombia 1 EUR = 5025.49 COP 30/03/23
	// Valor yen en Colombia 1 JPY = 34.99 COP 30/03/23
	// Valor libra esterlina en Colombia 1 GBP = 5710.65 COP 30/03/23

	public void pesoAMoneda(double valor,double tasaCambio,String nombreMoneda) {
		double moneda = valor / tasaCambio;
		moneda = (double) Math.round(moneda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + moneda +" "+ nombreMoneda, null, 0, null);
	}
	
	public void monedaAPeso(double valor,double tasaCambio) {
		double pesoCOP = valor * tasaCambio;
		pesoCOP = (double) Math.round(pesoCOP*100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + pesoCOP +" Pesos Colombianos", null, 0, null);
	}
}
