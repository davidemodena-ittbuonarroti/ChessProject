import java.util.ArrayList;

public class Horse extends ChessPiece{
    Horse(Position pos){
        super(pos);
    }

    @Override
    public ArrayList<Position> validMoves() {
        ArrayList<Position> P= new ArrayList<Position>();
        int number =super.getPosition().getRow();
        char letter=super.getPosition().getCol();
        Position valid = new Position(0,'a');
        int i=0;
        while (i<=8){
            if (i!=number){// check the rows
                valid.setPosition(i, letter);
                P.add(valid);
            }
            i++;
        }
        char j='a';
        while (j <= 'h'){
            if (j!=letter){// check the rows
                valid.setPosition(number, j);
                P.add(valid);
            }
            j++;
        }
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

