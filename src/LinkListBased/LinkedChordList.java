//the link based implementation for the ChordList ADT
//Rudy Flores

/*
* To do list:
* 	- Implement the FiniteStateMachine.java Algorithm
*   - Fix Transpose() because I didn't have the FiniteStateMachine yet!
*   - Handle any Exceptions!
*/

public class LinkedChordList implements ChordList, Transposer {

	private LNode first;
	private LNode last;
	private String currentScale; //Major or Minor
	private final String[] chordList = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"}; //List of possible chords
	private final int[] major = {2, 2, 1, 2, 2, 2, 1};
    private final int[] minor = {2, 1, 2, 2, 1, 2, 2};
    private int chordIndex;
    private String scaleChord;

	//Creation of the progression
	public LinkedChordList() {
		this.first = this.last = null;
	}

	public int chordLength() {
		int chordLength = 0;
		LNode current = this.first;
		while(current != null) {
			chordLength++;
			current = current.getLink();
		}
		return chordLength;
	}

	public void setScaleChord(String note) {
		this.scaleChord = note.toUpperCase();
	}

	//Insert new chords for the progression
	public void insert(String chord) {
		LNode newNode = new LNode(chord);
		if(this.first == null) {
			this.first = this.last = newNode;
		} else {
			this.last.setLink(newNode);
			this.last = newNode;
		}
	}

	//The method checks if the progression is made in Major or Minor
	public String scaleCheck(String scale) {
		scale.toLowerCase();

		if(scale == "major") {
			this.currentScale = scale;
			return scale;
		} else if(scale == "minor") {
			this.currentScale = scale;
			return scale;
		}

		return "n/a";
	}

	//The method looks for where in the possible chords the progression starts from
	public void scaleStart() { //chord is the first chord in the progression
		int scaleStart = -1;
		int count = 0;

		for(int cycle = chordList.length-1; cycle >= 0; cycle--) { //Cycle is your limiter, basically how many times you wish to cycle!
			if(count < chordList.length) {
				if(scaleChord.equals(chordList[count])) {
					scaleStart = count;
				}
			} else {
				count = 0;
			}	
			count++;
		}

		this.chordIndex = scaleStart;
	}

	//The method transposes the progression after checking the preconditions
	public String transpose() {
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'}; Mathmatical expression = {2, 2, 1, 2, 2, 2, 1}
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'}; Mathmatical expression = {2, 1, 2, 2, 1, 2, 2}
	
		scaleStart();
		String transposedChords = "";
		int count = chordIndex;

		if(currentScale == "major") {
			for(int cycle = 0; cycle < this.major.length; cycle++) {

				if(count < chordList.length) {
					if(cycle == chordLength()-1) {
						transposedChords += chordList[count];
					} else {
						transposedChords += chordList[count] + "-";
					}
				} else {
					count = 0;
					transposedChords += chordList[count] + "-";
				}

				count += this.major[cycle];

				if(cycle == chordLength()-1) {
					cycle = this.major.length;
				}
			
			}
		} else {

			for(int cycle = 0; cycle < this.minor.length; cycle++) {

				if(count < chordList.length) {
					if(cycle == chordLength()-1) {
						transposedChords += chordList[count];
					} else {
						transposedChords += chordList[count] + "-";
					}
				} else {
					count -= chordList.length+1;
					transposedChords += chordList[count] + "-";
				}

				count += this.minor[cycle];

				if(cycle == chordLength()-1) {
					cycle = this.minor.length;
				}
				
			}
		}

		return transposedChords;
	}

	@Override 
	public String toString() {
		String listContent = "Your transposed chords are: ";
		LNode current = this.first;
		while(current != null) {
			listContent += current.getData() + "-";
			current = current.getLink();
		}
		return listContent;
	}
}