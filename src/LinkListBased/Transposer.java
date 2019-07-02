import java.util.ArrayList;


public class Transposer extends ChordList {
	
	//Instance Variables
	private String m_notes;
	private String m_scale;
	private String m_scaleType;
	private final int OFFSET = 67;

	//Instantiate variables
	public Transposer(String notes, String scale, String scaleType) {
		
		m_notes = notes.toUpperCase();
		m_scale = scale.toUpperCase();
		m_scaleType = scaleType.toLowerCase();
	}

	//transpose chords to the set scale
	public String transposeChords() {

		//Tools from parent class
		ArrayList<Integer> transposedChords = new ArrayList<>();
		ChordList chords = new ChordList();
		String[] chordList = chords.getNotes();
		int[] scaleMajor = chords.getMajor();
		int[] scaleMinor = chords.getMinor();

		//custom ASCII table conversion
		int[] fixedNotes = new int[m_notes.length()];
		String[] userNotes = m_notes.split(" ");

		for(int i = 0; i < m_notes.length(); i++) {
			fixedNotes[i] = chords.noteIndex(userNotes[i]);
		}

		//Cycle each note in notes passed in by user
		int cycle = 0;

		for(int note = 0; note < fixedNotes.length; note++) {

			if(cycle >= scaleMajor.length)
				cycle = 0;

			//Check for type of scale
			//If the scaletype is major
			if(m_scaleType.equals("major")) {

				transposedChords.add(fixedNotes[note] + scaleMajor[cycle] - OFFSET);

			} else if(m_scaleType.equals("minor")) {

			}

			cycle++;
		}

		return "Transposed chords in " + m_scale + " " + m_scaleType + ": " + transposedChords;
	}
}