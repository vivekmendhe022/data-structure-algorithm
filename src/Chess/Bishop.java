package Chess;

public class Bishop extends Piece {

	public Bishop(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return (getColor() == Color.WHITE) ? "♗" : "♝";
	}

}
