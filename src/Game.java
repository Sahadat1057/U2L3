public class Game {
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    /** Add the getScore() "getter" method here */
    /* to be completed in part (a) */
    public int getScore()
    {return score;
    }

    /** Add the addPlayer() method here */
    /* to be completed in part (b) */

    public int addPlayer()
    {return getPlayers() + 1;
                }

    /** Add the increaseScore(int increase) method here */
    /* to be completed in part (c) */
    public int increaseScore(int increase)
    {
        return getScore() + increase;
    }
    /** Add the averageScorePerPlayer() method here */

    /* to be completed in part (d) */
    public double averageScorePerPlayer()
    {
        return increaseScore(score) / getPlayers() ;
    }

    public void end()
    {
        gameOver = true;
    }





}