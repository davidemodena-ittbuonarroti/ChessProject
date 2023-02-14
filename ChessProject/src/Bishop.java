import java.util.ArrayList;

public class Bishop extends ChessPiece{

    Bishop(Position pos){
        super(pos);
    }

    public List<Position> validMoves() {
        List<Position> validMoves = new ArrayList<Position>();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (Math.abs(row - position.getRow()) == Math.abs(col - position.getCol())) {
                    validMoves.add(new Position(row, col));
                }
            }
        }
        return validMoves;
    }
}
}