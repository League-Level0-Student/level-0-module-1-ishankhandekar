package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import java.util.Random;

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
String j = null;
String one = null;
String two = null;
String three = null; 
String four = null;
String five = null;
		// 1. Save something remarkable about each person in a variable.
		Random randy = new Random(); 
		int randnum = randy.nextInt(5);
		if (randnum == 1) {
			j	=  one = "Good author";
		}else if (randnum == 2) {
			j	=  two = "They are very nice";
		} else if (randnum == 3) {
			j	=  three = "They try their best";
		}else if (randnum == 4) {
		j	=  four = "they are Good at math";
		}else if (randnum == 5) {
			j	=  five = "they Draw very well";
		}
		
		
		
				
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String h = JOptionPane.showInputDialog("Enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		JOptionPane.showMessageDialog(null, j);
	}
}

