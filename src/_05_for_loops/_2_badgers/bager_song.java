package _05_for_loops._2_badgers;

import java.util.Random;

public class bager_song {

	public static void main(String[] args) {
		Random randy = new Random(); 
		
		
		for (int i = 0; i < 60 ; i++) {
			int randomungus = randy.nextInt(3) + 1;
			if (randomungus == 1) {
				System.out.println("Snake ");
			}else if (randomungus == 2) {
				System.out.println("mushroom ");
			}else if (randomungus == 3) {
				System.out.println("badger");
			}
		}
	}
}
