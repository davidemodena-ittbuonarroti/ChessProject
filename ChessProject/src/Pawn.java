public class Pawn extends ChessPiece{
    private boolean firstMove;

    public Pawn(Position pos){
        super(pos);
        this.firstMove = true;
    }
}
