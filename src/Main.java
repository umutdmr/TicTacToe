package src;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("player1", "x", game);
        Player player2 = new Player("player2", "o", game);
        Scanner scanner = new Scanner(System.in);
        int attackNum = 1;
        while(true)
        {
            
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();
            if(attackNum % 2 == 1)
            {
                player1.attack(index1, index2, player1.getSign());
            }
            else{
                player2.attack(index1, index2, player2.getSign());
            }
            game.printBoard();
            if(!game.isNull() || player1.isWinner() || player2.isWinner())
            {
                break;
            }
            attackNum++;
       }
       scanner.close();
    }
}
