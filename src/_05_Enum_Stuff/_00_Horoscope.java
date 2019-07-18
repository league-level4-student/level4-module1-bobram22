package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.
	public static void main(String[] args) {
		Zodiac zz;
		String za = JOptionPane.showInputDialog("what is your Zodiac sign?");
		if (za.equalsIgnoreCase("Leo")) {
			zz = Zodiac.LEO;
		} else if (za.equalsIgnoreCase("Virgo")) {
			zz = Zodiac.VIRGO;
		} else if (za.equalsIgnoreCase("Aquarius")) {
			zz = Zodiac.AQUARIUS;
		} else if (za.equalsIgnoreCase("Aries")) {
			zz = Zodiac.ARIES;
		} else if (za.equalsIgnoreCase("Cancer")) {
			zz = Zodiac.CANCER;
		} else if (za.equalsIgnoreCase("Capricorn")) {
			zz = Zodiac.CAPRICORN;
		} else if (za.equalsIgnoreCase("Gemini")) {
			zz = Zodiac.GEMINI;
		} else if (za.equalsIgnoreCase("Libra")) {
			zz = Zodiac.LIBRA;
		} else if (za.equalsIgnoreCase("Pisces")) {
			zz = Zodiac.PISCES;
		} else if (za.equalsIgnoreCase("Sagittarius")) {
			zz = Zodiac.SAGITTARIUS;
		} else if (za.equalsIgnoreCase("Scorpio")) {
			zz = Zodiac.SCORPIO;
		} else if (za.equalsIgnoreCase("Taurus")) {
			zz = Zodiac.TAURUS;
		}
	}
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.

	// 3. Make a main method to test your method

}
