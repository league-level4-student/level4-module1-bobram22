package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		switch(choice) {
		case "Sunday":
			System.out.println("Go to church and get kicked out of Applebee's");
			break;
		case "Monday":
			System.out.println("Complain about your hangover and Minecraft");
			break;
		case "Tuesday":
			System.out.println("TAAAACCCCCCCOOOOOOO TUUUUUUUUESSDAAAAAYY");
			break;
		case "Wednesday":
			System.out.println("FROG and Spider-man");
			break;
		case "Thursday":
			System.out.println("Complain your team should've been at the playoffs");
			break;
		case "Friday":
			System.out.println("Finally you can stay home alone or waste your entire minimunm wage check on fancy drinks");
			break;
		case "Saturday":
			System.out.println("Friday but better");
			break;
		default:
			System.out.println("Pizza Time");
		}
		}
		//use a switch statement to do something cool for each option
		
	}
