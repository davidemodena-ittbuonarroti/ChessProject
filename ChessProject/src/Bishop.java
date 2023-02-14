import java.util.ArrayList;

public class Bishop extends ChessPiece{

    Bishop(Position pos){
        super(pos);
    }

    private void addDiagonalPositions(int row, int diff, List<Position> positions) {
        Position rightTarget = getPosition().add(row, diff);   //Add towards right
        if(rightTarget != null) positions.add(rightTarget);

        Position leftTarget = getPosition().add(row, -diff);   //Subtract (go towards left)
        if(leftTarget != null) positions.add(leftTarget);
    }
}
}