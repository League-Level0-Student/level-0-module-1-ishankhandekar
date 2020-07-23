package _04_int._1_riddler;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score 
		int score = 0;
		int questionNumber;
		ArrayList<Integer> random = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {

			String[] questions = { "What five-letter word becomes shorter when you add two letters to it?",
					"When things go wrong, what can you always count on?",
					"Mr. Blue lives in the Blue house. Mrs. Yellow lives in the Yellow House. Mr. Orange lives in the orange house. Who lives in the White House?",
					"What is full of holes but still holds water?", "What begins with an E but only has one letter?",
					"David’s parents have three sons: Snap, Crackle and…?",
					"If a brother, his sister, and their dog weren’t under an umbrella, why didn’t they get wet?",
					"What begins with T, finishes with T, and has T in it?"};
			String[] answers = { "Shorter", "Your fingers", "The president", "A sponge", "An envelope", "David",
					"It wasn't raining", "A teapot" };
			
			// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			while (true) {
				Random randy = new Random();
				questionNumber = randy.nextInt(8);
				if (random.contains(questionNumber)) {
					continue;
				}
				random.add(questionNumber);
				break;
			}

			String userAnswer = JOptionPane.showInputDialog(questions[questionNumber]);
			if( answers [questionNumber].indexOf(userAnswer ) > 0) {
				JOptionPane.showMessageDialog(null, "You got it correct!");
				score = score + 1;
			} else {
				JOptionPane.showMessageDialog(null, "YOU GOT IT WRONG!");
			}

		}
		JOptionPane.showMessageDialog(null, "You got " + score + "/4");

	}

	private static void nextInt() {
		// TODO Auto-generated method stub

	}

}
