package Chess;

public class Queen extends Piece {

	public Queen(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♕" : "♛";
	}

}
