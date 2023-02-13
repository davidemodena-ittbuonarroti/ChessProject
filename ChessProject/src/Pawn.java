import java.util.ArrayList;

public class Pawn extends ChessPiece{
    private boolean firstMove;

    public Pawn(Position pos){
        super(pos);
        this.firstMove = true;
    }

    @Override
    public ArrayList<Position> validMoves() {
        ArrayList<Position> moves = new ArrayList<Position>();
        int currentRow = this.getPosition().getRow();
        char currentCol = this.getPosition().getCol();

        int forward = currentRow + 1;
        if(Position.isValid(forward, currentCol)){
            moves.add(new Position(forward, currentCol));
        }
        if(firstMove){
            forward = currentRow + 2;
            if(Position.isValid(forward, currentCol)){
                moves.add(new Position(forward, currentCol));
            }
        }
        return moves;
    }

    @Override
    public boolean moveTo(Position pos){
        boolean moved = super.moveTo(pos);
        if(moved){
            firstMove = false;
        }
        return moved;
    }

    @Override
    public Position getPosition() {
        return super.getPosition();
    }
}
