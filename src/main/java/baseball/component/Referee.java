package baseball.component;

public class Referee {

    private int[] computerNumber;
    private int[] playerNumber;

    private int strikes;
    private int balls;

    public Referee(){ }

    public void setComputerNumber(int[] computerNumber){
        this.computerNumber = computerNumber;
    }

    public void setPlayerNumber(int[] playerNumber){
        this.playerNumber = playerNumber;
    }


}
