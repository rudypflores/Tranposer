public class TransposeChords {

	private String chords;
	private String scale;
	private String type;

	public TransposeChords() {
		this.chords = "CDEFGABC"; //Default will always be the C Major scale.
		this.scale = "D".toUpperCase();
		this.type = "Major".toUpperCase();
	}

	public TransposeChords(String chords, String scale, String type) {
		this.chords = chords.toUpperCase(); //set the main chords to transpose & set them as upper case
		this.scale = scale.toUpperCase();
		this.type = type.toUpperCase();
		transpose();
	}

	public void transpose() {
		//Initialize array & string
		int len = this.chords.length();
		String transposedChords = "";
		
		//Access the major and minor chords
		Scale scale = new Scale();
		
		//Define transposedChords

		System.out.println(transposedChords);
	}
}