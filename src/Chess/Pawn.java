package Chess;

public class Pawn extends Piece {

	public Pawn(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♙" : "♟";
	}

}
