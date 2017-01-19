package Package;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ques3 {

	public static void main(String[] args) {
		
		final int GAME_COUNT =10;
		final int MAX_DIE_VALUE =6;
		int computerWinsCount=0;
		int userWinsCount=0;
			       
		//Declare a Random object
	     Random randomNumbers = new Random(); 
	      
	       for(int count =1; count <=GAME_COUNT; count++){
	       
	        
	         int computerDieValue = randomNumbers.nextInt(MAX_DIE_VALUE)+1;
	         int userDieValue = randomNumbers.nextInt(MAX_DIE_VALUE)+1;
	         if( computerDieValue > userDieValue){
	        	 computerWinsCount++;
	         }
	         else if(userDieValue >computerDieValue){
	        	 
	        	 userWinsCount++;
	           
	        }
	}
	       String message =String.format("Computer wins %d times, User wins %d times, %d tie game",computerWinsCount, userWinsCount,(GAME_COUNT - computerWinsCount - userWinsCount));
	       System.out.println(message);
	         
	         if( computerWinsCount > userWinsCount){
	        	 JOptionPane.showMessageDialog(null,"The computer is the grand Winner.");
	         }
	         else if(userWinsCount >computerWinsCount){
	        	 JOptionPane.showMessageDialog(null,"The User is the grand Winner.");
	        	
	           
	        }
	}
}
	      
	      

	    
	

	