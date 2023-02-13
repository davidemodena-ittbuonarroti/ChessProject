public class Pawn extends ChessPiece{
    private boolean firstMove;

    public Pawn(Position pos){
        super(pos);
        this.firstMove = true;
    }

    public boolean moveTo(Position pos){
        boolean moved = super.moveTo(pos);
        if(moved){
            firstMove = false;
        }
        return moved;
    }
}
