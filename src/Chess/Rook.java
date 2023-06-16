package Chess;

public class Rook extends Piece {

	public Rook(Color color) {
		super(color);
	}

	@Override
	public String getSymbol() {
		return (getColor() == Color.WHITE) ? "♖" : "♜";
	}

}
