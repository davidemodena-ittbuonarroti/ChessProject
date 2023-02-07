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

    }

    public boolean setPosition(Position pos){
        //complete
    }

    public boolean isValid(){
        //complete
    }

    public boolean isValid(int row, char col){
        if(row>=1 && row<=8 && col >= 'a' && col <= 'h'){
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