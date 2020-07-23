package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String whenIsYourBirthday = JOptionPane.showInputDialog("when is your birthday. Reply in this format:"
				+ " month day, year");
		if (whenIsYourBirthday.equalsIgnoreCase("july 15, 2020") ) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!!!!!!!!!!!!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday");
		}
	}
	

}
