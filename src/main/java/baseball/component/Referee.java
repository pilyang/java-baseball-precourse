package baseball.component;

public class Referee {

    private int[] computerNumbers;
    private int[] playerNumbers;

    private int strikes;
    private int balls;

    public Referee(){ }

    public void playerTurn(int[] playerNumbers){
        setPlayerNumber(playerNumbers);
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

    public void setComputerNumbers(int[] computerNumbers1s){
        this.computerNumbers = computerNumbers;
    }

    public void setPlayerNumber(int[] playerNumbers){
        this.playerNumbers = playerNumbers;
    }


}
