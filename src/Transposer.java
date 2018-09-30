import java.util.Scanner;

public class Transposer {
	public static void main(String[] args) {

		//Save chords that will be transposed
		Scanner input = new Scanner(System.in);
		System.out.println("Type the chords you wish to transpose: ");
		String chords = input.nextLine();

		TransposeChords newChords = new TransposeChords(chords); //Transpose!
		newChords.transpose();

	}
}