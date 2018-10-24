/*
* Minor and Major Transposer Application
* @author Rudy L. Pichola-Flores
* Date: October 4th, 2018
*/

import java.util.Scanner;

public class Transposer {
	public static void main(String[] args) {
		//Purposely done infinte for loop so you can transpose until you close the program
		boolean engine = true;
		do {
			//Initialize our scanner
			Scanner input = new Scanner(System.in);

			//User inputs for chords, scale and type
			System.out.println("Type the chords you wish to transpose?");
			String chords = input.nextLine();
			System.out.println("\nTo what chord do you want to transpose? ");
			String scale = input.nextLine();
			System.out.println("\nTo what type of chord do you want to transpose? ");
			String type = input.nextLine();

			TransposeChords newChords = new TransposeChords(chords, scale, type); //Transpose!
		} while(engine == true);
	}
}  