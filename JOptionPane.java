package com.tangalin.eljon;

import javax.swing.*;

public class JOptionaPaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1. Shows the dialog box with a message to the user.
//		JOptionPane.showMessageDialog(
//				null, 
//				"This is my message", 
//				"My Title", 
//				JOptionPane.ERROR_MESSAGE);
		
//	2. Asks user a confirming question, like yes/no/cancel.		
//		int yesno = JOptionPane.showConfirmDialog(
//				null, 
//				"Do you love coding?", 
//				"This is my title", 
//				JOptionPane.YES_NO_OPTION);
//		
//		//System.out.println(yesno);
//		
//		if (yesno == 0) {
//			JOptionPane.showMessageDialog(
//					null, 
//					"You're Right!",
//					"This is my title",
//					JOptionPane.INFORMATION_MESSAGE);
//		}
//		else if (yesno == 1) {
//			JOptionPane.showMessageDialog(
//					null, 
//					"You're Wrong!",
//					"This is my title",
//					JOptionPane.ERROR_MESSAGE);
//		}
//		
		String[] response = {"BongBong Marcos","Leni Robredo","Manny Pacqiao"};
		//import image, (name of image)
		ImageIcon icon = new ImageIcon("icon.png");
//		The combination of the above three.
		int vote = JOptionPane.showOptionDialog(
				null, 
				"Who's your President?", 
				"Secret Message",
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				response, 
				0);
		
		JOptionPane.showMessageDialog(
		null, 
		"You voted for: " + response[vote],
		"Result",
		JOptionPane.INFORMATION_MESSAGE);
}

		
		
		
		
		
		
		
		
	}


