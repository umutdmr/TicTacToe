package src;
public class Player {
    private String name;
    String sign;
    Game game;

    //constructor
    public Player(String name, String sign, Game game)
    {
        this.name = name;
        this.sign = sign;
        this.game = game;
    }

    //getter methods
    public String getName() {
        return name;
    }
    public String getSign() {
        return sign;
    }

    //attack in the game
    public void attack(int index1, int index2, String sign)
    {
        if(game.getBoard()[index1][index2] == " ")
        {
            game.getBoard()[index1][index2] = sign;
            System.out.println("attacked1!");
        }
        else
        {
            System.out.println("invalid attack!");
        }
    }

    //check if the player wins or not
    public boolean isWinner()
    {
        
        for(int i = 0; i < 3; i++)
        {
            if((game.getBoard()[i][0] == getSign() && game.getBoard()[i][1] == getSign() && game.getBoard()[i][2] == getSign()) || (game.getBoard()[0][i] == getSign() && game.getBoard()[1][i] == getSign() && game.getBoard()[2][i] == getSign()))
            {
                System.out.println(getName() + " wins!");
                return true;
            }
        }
        if((game.getBoard()[0][0] == getSign() && game.getBoard()[1][1] == getSign() && game.getBoard()[2][2] == getSign()) || (game.getBoard()[0][2] == getSign() && game.getBoard()[1][1] == getSign() && game.getBoard()[2][0] == getSign()))
        {
            System.out.println(getName() + " wins!");
            return true;
        }
        return false;

    }

}
