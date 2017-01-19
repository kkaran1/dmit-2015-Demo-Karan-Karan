package Package;

import javax.swing.JOptionPane;

public class Ques2 {

	public static void main(String[] args) {
		
		double weight;
		double height;
		double bmi;
		String result;
		String inputString;

		
		JOptionPane.showMessageDialog(null,"Body Mass Index calculator");
		
		inputString=JOptionPane.showInputDialog("Enter Your Weight(LB):");
		 weight = Double.parseDouble(inputString);
		 
		 inputString=JOptionPane.showInputDialog("Enter Your Height(Inches):");
		 height = Double.parseDouble(inputString);
		 
		 bmi = (703*weight)/(height*height);
		 
		 if(bmi>18.5 && bmi<25)
		 {
			 result = "Yeee!! You have a Optimal weight";
		 }
		 else if (bmi<18.5)
		 {
			 result= "You are underweight";
		 }
		 else if(bmi>25)
		 {
			 result = "You are Overweight";
		 }
		 else 
		 {
			 result = "You have wrong Input";
		 }
		 
		 JOptionPane.showMessageDialog(null, result);
		 System.exit(0);
		 
	}

}
