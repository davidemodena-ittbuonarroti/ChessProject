public abstract class ChessPiece {
    private Position pos;

    public ChessPiece(Position pos){
        this.pos = pos;
    }

    public Position getPosition(){  //ritorna la posizione del pezzo
        return this.pos;
    }

    public boolean moveTo(Position pos){ //metodo per muovere la pedina
        boolean moved=false;
        if(this.validMoves().contains(pos)){
            this.pos = pos;
            moved = true;
        }
        return moved;
    }
}
