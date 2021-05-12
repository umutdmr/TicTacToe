package src;
public class Game
{
    //initialize the board;
    private String[][] board = new String[3][3];
    
    //constructor
    public Game()
    {
        for(int i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = " ";
                
            }
        }
        
    }

    //getter of board
    public String[][] getBoard() {
        return board;
    }

    //printing board
    public void printBoard()
    {
        for(int i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j]);
                
            }
            System.out.print("\n");
        
        }
    }

    //check if the board has empty element or nor
    public boolean isNull()
    {
        for(int i = 0; i < 3; ++i)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j] == " ")
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}