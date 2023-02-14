public class Position{
    private int row;
    private char col;

    public Position(int row, char col){
        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return row;
    }

    public char getCol(){
        return col;
    }

    public boolean setPosition(int row,char col){
        if(isValid(row, col)){
            this.row = row;
            this.col = col;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean setPosition(Position pos){
        if(isValid(pos.getRow(),pos.getCol())){
            this.row=pos.getRow();
            this.col=pos.getCol();
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean isValid(int row, char col){
        if(row>=1 && row<=8 && col >= 'a' && col <= 'h'){//checks if the position is included in the chessboard
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Position pos){
        if(pos.getRow() == row && pos.getCol() == col){
            return true;
        }
        else{
            return false;
        }
    }
}