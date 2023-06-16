package Chess;

public class King extends Piece {

	public King(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♔" : "♚";
	}

}
