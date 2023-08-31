package config;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.RedesController;

public class Menu {
	RedesController redes = new RedesController();
	public void menu(){
		String[] opcoes = {"Fazer configuração de IP - IPv4 ",
						   "Testar PING ",
						   "SAIR "};
		
		JLabel label = new JLabel("Escolha uma opção: ");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		int selectop = JOptionPane.showOptionDialog(
				null, label, "Menu Processo", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
		
		switch (selectop) {
			case 0:
				redes.ip();
				break;
			case 1:
				redes.ping();;
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Você escolheu sair, até logo");
				System.exit(0);
				break;
			default:
				if (selectop == -1) {
					System.exit(0);
				}
		}
		
	}

}
