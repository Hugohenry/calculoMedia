package calculoMedia;

import javax.swing.JOptionPane;

public class mediaJava {
        
	 public static void main(String[] args) { 
		 
		 String nota1 = JOptionPane.showInputDialog("Imforme a nota 1 ");
		 String nota2 = JOptionPane.showInputDialog("Imforme a nota 2 ");
		 String nota3 = JOptionPane.showInputDialog("Imforme a nota 3 ");
		 String nota4 = JOptionPane.showInputDialog("Imforme a nota 4 ");
		 
		 double dnota1 = Double.parseDouble(nota1);
		 double dnota2 = Double.parseDouble(nota2);
		 double dnota3 = Double.parseDouble(nota3);
		 double dnota4 = Double.parseDouble(nota4);
		 
		 double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;
		 
		 /* Média para aprovação é 70 */
		 
		 if (media >= 50 ) {
			 
			 if (media >= 70) {
				 
				 JOptionPane.showMessageDialog(null, "Aluno esta aprovado com a média de ;" + media );
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com a média de ;" + media );
			}
			
		 }else {
			 JOptionPane.showMessageDialog(null, "Aluno esta reprovado com a média de ;" + media );
		 }
		 
	 }
}
