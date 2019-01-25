//Creation of the Node class
//Rudy Flores

public class LNode {
	private String data;
	private LNode link;

	public LNode(String data) {
		this.data = data;
		this.link = null;
	}

	public void setLink(LNode link) {
		this.link = link;
	}

	public String getData() {
		return this.data;
	}

	public LNode getLink() {
		return this.link;
	}
}