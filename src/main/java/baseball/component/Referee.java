package baseball.component;

public class Referee {

    private int[] computerNumbers;
    private int[] playerNumbers;

    private int strikes;
    private int balls;

    public Referee(){ }

    public void playerTurn(int[] playerNumbers){
        setPlayerNumber(playerNumbers);
        verifyStrikes();
        verifyBalls();
    }

    private void verifyStrikes(){
       int count = 0;
       for(int i=0; i<3; i++){
           if(computerNumbers[i] == playerNumbers[i]){
               count++;
           }
       }
       strikes = count;
    }

    private void verifyBalls(){
        int count = 0;
        for(int i=0; i<3; i++){
            if(playerNumbers[i] == computerNumbers[(1+i)%3] ||
                    playerNumbers[i] == computerNumbers[(2+i)%3]){
                count++;
            }
        }
        balls = count;
    }

    public void setComputerNumbers(int[] computerNumbers1s){
        this.computerNumbers = computerNumbers;
    }

    public void setPlayerNumber(int[] playerNumbers){
        this.playerNumbers = playerNumbers;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }
}
