import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		MenuConversion monedas = new MenuConversion();
		ValidarNumero validar = new ValidarNumero();

		boolean flag = true;
		while (flag) {
			String opcionMenu = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion ", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Monedas", "Conversor de Temperatura" }, "Seleccion")).toString();
			switch(opcionMenu) {
			case "Conversor de Monedas":
				String entradaUsuario =JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
				if(validar.validarNumero(entradaUsuario)) {
					double entradaConversor = Double.parseDouble(entradaUsuario);
					monedas.convertirMoneda(entradaConversor);
					
					int respuestaUsuario=JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversion?");
					if(JOptionPane.OK_OPTION == respuestaUsuario) {
						System.out.println("Selecciona opcion afirmativa");
					}else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				}else {
					JOptionPane.showMessageDialog(null,"Valor invalido");
				}
				break;
			}
		}
	}
}