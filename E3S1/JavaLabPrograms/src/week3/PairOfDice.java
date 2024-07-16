package week3;

import java.util.Random;

public class PairOfDice {

	public static void main(String[] args) {
//		int min = 1;
//		int max = 6;
		
		Random rand = new Random();
		
		int successful = 0;
		for(int i=0; i<10; i++) {
//			int dice1 = (int)(Math.random()*(max - min + 1) + min);
//			int dice2 = (int)(Math.random()*(max - min + 1) + min);
			
			int dice1 = rand.nextInt(6) + 1;
			int dice2 = rand.nextInt(6) + 1;
			
			System.out.println("Rool " + (i + 1) + ": Dice1 = " + dice1 + ", Dice2 = " + dice2);
			
			
			
			if(dice1 == dice2)
				successful++;
			
			try {
				Thread.sleep(100);
			}
			
			catch(Exception e) {}
		
		}
		
		System.out.println("Number of successful attempts: " + successful);
		
		
	}

}
