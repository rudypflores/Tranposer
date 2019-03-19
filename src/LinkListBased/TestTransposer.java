//Test driver for ChordList ADT
//Rudy Flores

import java.util.Scanner;

public class TestTransposer {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String notes = "";
		String scale = "";
		String scaleType = "";

		//Prompt user for notes to transpose
		System.out.println("What notes do you wish to transpose?\n");
		notes += in.next();

		//Prompt for note of the scale
		System.out.println("To what note is this progression being transposed to?\n");
		scale += in.next();

		//Prompt for type of scale
		System.out.println("To what type of scale is it being transposed?\n");
		scaleType += in.next();

		System.out.println("Transposing...\n\n");
		Transposer transpose = new Transposer(notes, scale, scaleType);
		transpose.transposeChords();
	}
}