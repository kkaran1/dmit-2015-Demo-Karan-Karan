package Package;

import javax.swing.JOptionPane;

public class Ques1 {

	public static void main(String[] args) {
		String name;
		int age;
		double annualPay;
		String inputString;
		
		name=JOptionPane.showInputDialog("Enter Your Name:");
		
		inputString=JOptionPane.showInputDialog("Enter Your Age:");
		age =Integer.parseInt(inputString);
		
		inputString=JOptionPane.showInputDialog("Enter Your AnnualPay:");
        annualPay = Double.parseDouble(inputString);
        
        JOptionPane.showMessageDialog(null,"My name is "+name+ ", my age is "+age+ " and I hope to earn $"+annualPay+ " per year.");
		
		System.exit(0);
	}

}
