public class ChessPiece {
    private Position pos;

    public ChessPiece(Position pos){
        this.pos = pos;
    }

    public Position getPosition(){  //ritorna la posizione del pezzo
        return this.pos;
    }
}
