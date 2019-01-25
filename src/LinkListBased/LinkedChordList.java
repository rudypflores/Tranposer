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

	//Creation of the progression
	public LinkedChordList() {
		this.first = this.last = null;
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
	}

	//The method looks for where in the possible chords the progression starts from
	public int scaleStart(String chord) {
		boolean chordNotFound = true;
		int count = 0;
		int scaleStart = -1;

		do {
			if(count < chordList.length) {
				if(chord == chordList[count]) {
					chordNotFound = false;
					scaleStart = count;
				}
			} else {
				count = 0;
				if(chord == chordList[count]) {
					chordNotFound = false;
					scaleStart = count;
				}
			}	
			count++;
		} while(chordNotFound);

		return scaleStart;
	}

	//The method transposes the progression after checking the preconditions
	public void transpose() {
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'}; Mathmatical expression = {2, 2, 1, 2, 2, 2, 1}
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'}; Mathmatical expression = {2, 1, 2, 2, 1, 2, 2}
		boolean notTransposed = true;
		String transposedChord = "";
		int count = 0;
		int index = 0;

		if(this.currentScale == "major") {
			LNode currentChord = this.first;
			while(currentChord != null) {
				do {

					if(count+this.major[count] < this.chordList.length) { //Prevent out of bounds during transposing
						if(this.major[index]+scaleStart(currentChord.getData()) == count) {
							transposedChord = this.chordList[count];
							notTransposed = false;
						} else {
							count++;
						}
					} else {
						count = 0;
						if(this.major[index]+scaleStart(currentChord.getData()) == count) {
							transposedChord = this.chordList[count];
							notTransposed = false;
						} else {
							count++;
						}
					}

				} while(notTransposed);
				index++;
				count = 0;
				currentChord = currentChord.getLink();
			}
			return transposedChord;

		} else if(this.currentScale == "minor") {
			LNode currentChord = this.first;
			while(currentChord != null) {
				do {

					if(count+this.minor[count] < this.chordList.length) { //Prevent out of bounds during transposing
						if(this.minor[index]+scaleStart(currentChord.getData()) == count) {
							transposedChord = this.chordList[count];
							notTransposed = false;
						} else {
							count++;
						}
					} else {
						count = 0;
						if(this.minor[index]+scaleStart(currentChord.getData()) == count) {
							transposedChord = this.chordList[count];
							notTransposed = false;
						} else {
							count++;
						}
					}

				} while(notTransposed);
				index++;
				count = 0;
				currentChord = currentChord.getLink();
			}
			return transposedChord;
		}
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