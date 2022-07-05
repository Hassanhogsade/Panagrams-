
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Sixty zippers were quickly picked from the woven jute bag";
//		String sentence = "A wizard’s job is to vex chumps quickly in fog.";
//		String sentence = "Brown jars prevented the mixture from freezing too quickly.";
//		String sentence = "I once went to a quiet place in the Bahamas to see a very dodgy taxman.";
//		String sentence = "We promptly judged antique ivory buckles for the next prize.";

//created all the boaleans to false of every letter of the alphabet
		Boolean a = false;
		Boolean b = false;
		Boolean c = false;
		Boolean d = false;
		Boolean e = false;
		Boolean f = false;
		Boolean g = false;
		Boolean h = false;
		Boolean i = false;
		Boolean j = false;
		Boolean k = false;
		Boolean l = false;
		Boolean m = false;
		Boolean n = false;
		Boolean o = false;
		Boolean p = false;
		Boolean q = false;
		Boolean r = false;
		Boolean s = false;
		Boolean t = false;
		Boolean u = false;
		Boolean v = false;
		Boolean w = false;
		Boolean x = false;
		Boolean y = false;
		Boolean z = false;
// created a new string called cabz to split the sentences
		String[] cabz = sentence.split("");
// i created a for loop to iterate through the sentence, then going through each letter and made it lowercase
		for (int I=0;I<cabz.length;I++) {
			String letter = cabz[I].toLowerCase();
//i created a switch case for each letter and changed the boolean value to true			
			switch (letter) {
				case "a":
					a = true;
					break;
				case "b":
					b = true;
					break;
				case "c":
					c = true;
					break;
				case "d":
					d = true;
					break;
				case "e":
					e = true;
					break;
				case "f":
					f = true;
					break;
				case "g":
					g = true;
					break;
				case "h":
					h = true;
					break;
				case "i":
					i = true;
					break;
				case "j":
					j = true;
					break;
				case "k":
					k = true;
					break;
				case "l":
					l = true;
					break;
				case "m":
					m = true;
					break;
				case "n":
					n = true;
					break;
				case "o":
					o = true;
					break;
				case "p":
					p = true;
					break;
				case "q":
					q = true;
					break;
				case "r":
					r = true;
					break;
				case "s":
					s = true;
					break;
				case "t":
					t = true;
					break;
				case "u":
					u = true;
					break;
				case "v":
					v = true;
					break;
				case "w":
					w = true;
					break;
				case "x":
					x = true;
					break;
				case "y":
					y = true;
					break;
				case "z":
					z = true;
					break;

			}
			
			
		}
//i used this if statement to check these words if it does print this if not print that
		if (a && b && c && d && e && f && g && h && i && j && k && l && m && n && o && p && q && r && s && t && u && v && w && x && y && z) {
			System.out.println("The sentence '" + sentence + "' is a pangram");
		} else {
			System.out.println("The sentence '" + sentence + "' is not a pangram");
		}
		
		
		
	}

}
