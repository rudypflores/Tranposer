import java.util.Scanner;

public class Transposer {
	public static void main(String[] args) {

		//Save chords that will be transposed
		Scanner input = new Scanner(System.in);
		System.out.println("Type the chords you wish to transpose? ");
		String chords = input.nextLine();
		System.out.println("To what chord do you want to transpose? ");
		String scale = input.nextLine();
		System.out.println("To what type of chord do you want to transpose? ");
		String type = input.nextLine();

		TransposeChords newChords = new TransposeChords(chords, scale, type); //Transpose!
	}
}