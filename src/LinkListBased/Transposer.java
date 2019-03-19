import java.util.ArrayList;


public class Transposer extends ChordList {
	
	//Instance Variables
	private String m_notes;
	private String m_scale;
	private String m_scaleType;

	//Instantiate variables
	public Transposer(String notes, String scale, String scaleType) {
		
		m_notes = notes.toUpperCase();
		m_scale = scale.toUpperCase();
		m_scaleType = scaleType.toLowerCase();
	}

	//transpose chords to the set scale
	public String transposeChords() {

		//Tools from parent class
		ArrayList<Character> transposedChords = new ArrayList<>();
		ChordList chords = new ChordList();
		String[] chordList = chords.getNotes();
		String[] scaleMajor = chords.getMajor();
		String[] scaleMinor = chords.getMinor();

		//Get the index of scale passed in
		int chord = chords.scaleIndex(m_scale);

		//Cycle each note in notes passed in by user
		for(int note = 0; note < notes.length(); note++) {
			//Check for type of scale
			//If the scaletype is major
			if(m_scaleType.equals("major")) {

				if(chord >= chordList.length)
					chord -= chordList.length;

				transposedChords.add(chordList[chord]);

				//Go to next chord
				chord += scaleMajor[note];

			} else if(m_scaleType.equals("minor")) {

			}

		}

		return "Transposed chords in " + m_scale + " " + m_scaleType + ": " + transposedChords;
	}
}