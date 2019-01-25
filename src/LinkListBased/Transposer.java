//The Transposer interface
//Rudy Flores

public interface Transposer {
	//Set variables where W = whole step & H = half step
	//MAJOR = {'W', 'W', 'H', 'W', 'W', 'W', 'H'};
	//MINOR = {'W', 'H', 'W', 'W', 'H', 'W', 'W'};
	String transpose();
	void scaleStart();
	String scaleCheck(String scale);
	void setScaleChord(String note);
}