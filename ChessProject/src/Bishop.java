import java.util.ArrayList;

public class Bishop extends ChessPiece{

    Bishop(Position pos){
        super(pos);
    }

    public ArrayList<Position> validMoves() {
        ArrayList<Position> validMoves = new ArrayList<Position>();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (Math.abs(row - getPosition().getRow()) == Math.abs(col - getPosition().getCol())) {
                    validMoves.add(new Position(row, col));
                }
            }
        }
        return validMoves;
    }
}
}