import java.util.ArrayList;

public class Horse extends ChessPiece{
    Horse(Position pos){
        super(pos);
    }

    @Override
    public ArrayList<Position> validMoves() {
        ArrayList<Position> P= new ArrayList<Position>();
        return P;
    }

    @Override
    public boolean moveTo(Position pos) {
        return super.moveTo(pos);

    }

    @Override
    public Position getPosition() {
        return super.getPosition();
    }
}

