import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scelta = 0;
        int row;
        char col;
        do{
            System.out.println("0) Exit");
            System.out.println("1) Tower");
            System.out.println("2) Pawn");
            System.out.println("3) Bishop");
            System.out.println("4) Horse");
            System.out.print("Option: ");

            switch (scelta){
                case 0:
                    System.out.println("Bye bye!");
                    break;
                case 1:
                    System.out.print("Inserisci una riga: ");
                    row = input.nextInt();
                    System.out.println("Inserisci una colonna: ");
                    col = input.next().charAt(0);
                    tower t = new tower(new Position(row,col));
                    System.out.println("Le mosse disponibili sono: "+t.validMoves());
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Errore! Riprova.");
                    break;
            }
        }while(scelta!=0);
    }
}