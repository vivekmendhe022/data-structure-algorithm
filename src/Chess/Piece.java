package Chess;

public abstract class Piece {

	private Color color;

	public Piece(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public abstract String getSymbol();

}
