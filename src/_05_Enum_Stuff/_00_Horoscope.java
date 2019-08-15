package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	static Zodiac zz;
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs.
	public static void main(String[] args) {
		zodiacSelector();
	}
	static // 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	void zodiacSelector(){
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
		switch(zz) {
		case LEO:{
			JOptionPane.showMessageDialog(null, "People born under the sign of Leo are natural born leaders. They are dramatic, creative, self-confident, dominant and extremely difficult to resist, able to achieve anything they want to in any area of life they commit to. There is a specific strength to a Leo and their \"king of the jungle\" status. Leo often has many friends for they are generous and loyal. Self-confident and attractive, this is a Sun sign capable of uniting different groups of people and leading them as one towards a shared cause, and their healthy sense of humor makes collaboration with other people even easier.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "Virgos are always paying attention to the smallest details and their deep sense of humanity makes them one of the most careful signs of the zodiac. Their methodical approach to life ensures that nothing is left to chance, and although they are often tender, their heart might be closed for the outer world. This is a sign often misunderstood, not because they lack the ability to express, but because they won’t accept their feelings as valid, true, or even relevant when opposed to reason. The symbolism behind the name speaks well of their nature, born with a feeling they are experiencing everything for the first time.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Aquarius-born are shy and quiet , but on the other hand they can be eccentric and energetic. However, in both cases, they are deep thinkers and highly intellectual people who love helping others. They are able to see without prejudice, on both sides, which makes them people who can easily solve problems.");
			break;
		}
		case ARIES:{
			JOptionPane.showMessageDialog(null, "As the first sign in the zodiac, the presence of Aries always marks the beginning of something energetic and turbulent. They are continuously looking for dynamic, speed and competition, always being the first in everything - from work to social gatherings. Thanks to its ruling planet Mars and the fact it belongs to the element of Fire (just like Leo and Sagittarius), Aries is one of the most active zodiac signs. It is in their nature to take action, sometimes before they think about it well.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. They are very emotional and sensitive, and care deeply about matters of the family and their home. Cancer is sympathetic and attached to people they keep close. Those born with their Sun in Cancer are very loyal and able to empathize with other people's pain and suffering.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "Capricorn is a sign that represents time and responsibility, and its representatives are traditional and often very serious by nature. These individuals possess an inner state of independence that enables significant progress both in their personal and professional lives. They are masters of self-control and have the ability to lead the way, make solid and realistic plans, and manage many people who work for them at any time. They will learn from their mistakes and get to the top based solely on their experience and expertise.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "Expressive and quick-witted, Gemini represents two different personalities in one and you will never be sure which one you will face. They are sociable, communicative and ready for fun, with a tendency to suddenly get serious, thoughtful and restless. They are fascinated with the world itself, extremely curious, with a constant feeling that there is not enough time to experience everything they want to see.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "People born under the sign of Libra are peaceful, fair, and they hate being alone. Partnership is very important for them, as their mirror and someone giving them the ability to be the mirror themselves. These individuals are fascinated by balance and symmetry, they are in a constant chase for justice and equality, realizing through life that the only thing that should be truly important to themselves in their own inner core of personality. This is someone ready to do nearly anything to avoid conflict, keeping the peace whenever possible");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "Pisces are very friendly, so they often find themselves in a company of very different people. Pisces are selfless, they are always willing to help others, without hoping to get anything back.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "Curious and energetic, Sagittarius is one of the biggest travelers among all zodiac signs. Their open mind and philosophical view motivates them to wander around the world in search of the meaning of life.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "Scorpio-born are passionate and assertive people. They are determined and decisive, and will research until they find out the truth. Scorpio is a great leader, always aware of the situation and also features prominently in resourcefulness.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "Practical and well-grounded, Taurus is the sign that harvests the fruits of labor. They feel the need to always be surrounded by love and beauty, turned to the material world, hedonism, and physical pleasures. People born with their Sun in Taurus are sensual and tactile, considering touch and taste the most important of all senses. Stable and conservative, this is one of the most reliable signs of the zodiac, ready to endure and stick to their choices until they reach the point of personal satisfaction.");
			break;
		}
		}
	}
	// 3. Make a main method to test your method

}
