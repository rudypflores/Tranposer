/*
* Minor and Major Transposer Application
* @author Rudy L. Pichola-Flores
* Date: October 4th, 2018
*/

import java.text.MessageFormat;

public class TransposeChords {

	private String chords;
	private String scale;
	private String type;

	//Default set to the C major scale being transpose to D major
	public TransposeChords() {
		this.chords = "CDEFGABC";
		this.scale = "D".toUpperCase();
		this.type = "Major".toUpperCase();
	}

	//Custom user transposing
	public TransposeChords(String chords, String scale, String type) {
		this.chords = chords.toUpperCase();
		this.scale = scale.toUpperCase();
		this.type = type.toUpperCase();
		transpose();
	}

	//This is where we can transpose our chords!
	public void transpose() {
		//get the length
		int len = this.chords.length();
		String transpose = "";
		
		//Access the scale object and its properties
		Scale scale = new Scale();
		String[] notes = scale.getNotes();
		int[] major = scale.getMajor();
		int[] minor = scale.getMinor();
		int index = scale.index(this.scale);

		//Check for major or minor before transposing
		if(this.type.equals("MAJOR")) {
			//transposing for major chords!
			for(int i = 0; i < len; i++) {
				if(i == len-1) {
					transpose += notes[index + major[i]];
				} else {
					transpose += notes[index + major[i]] + "-";
				}
			}
		} else if(this.type.equals("MINOR")) {
			//transposing for minor chords!
			for(int i = 0; i < len; i++) {
				if(i == len-1) {
					transpose += notes[index + minor[i]];
				} else {
					transpose += notes[index + minor[i]] + "-";
				}
			}
		}

		//Print results
		System.out.print(MessageFormat.format("\nTransposed notes to {0} {1}: {2}\n\n-----------------------------------------------------------------\n", this.scale, this.type.toLowerCase(), transpose));
	}
}