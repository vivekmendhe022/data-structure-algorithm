package Chess;

public class Knight extends Piece {

	public Knight(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♘" : "♞";
	}

}
