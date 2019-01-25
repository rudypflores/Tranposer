//Test driver for ChordList ADT
//Rudy Flores

import java.util.Scanner;

public class TestChordList {
	public static void main(String[] args) {
		LinkedChordList c1 = new LinkedChordList();
		Scanner input = new Scanner(System.in);
		char question;
		boolean done = true;
		int count = 0;

		System.out.println("Welcome to the transposer console app! place the chords you want to transpose one by one!");

		do {

			System.out.println("Enter the next chord: ");
			c1.insert(input.next());

			System.out.println("Are these all the chords? (Y/N)");
			question = input.next().charAt(0);

			if(question == 'Y' || question == 'y') {
					done = false;
			}

		} while(done == true);

		System.out.println("What type of scale is this progression using? ");
		c1.scaleCheck(input.next());

		System.out.println("To what chord are you transposing?");
		c1.setScaleChord(input.next());


		System.out.println("\n\n" + c1.transpose());
	}
}