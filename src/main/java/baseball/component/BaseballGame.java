package baseball.component;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    private int[] computerNumber;
    private int[] playerNumber;

    public BaseballGame(){
        computerNumber = new int[3];
    }

    public void startGame(){

    }

    private void generateComputerNumber(){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<3; i++){
            int number = 0;
            do{
                number = Randoms.pickNumberInRange(1, 9);
            } while(numbers.contains(number));
            numbers.add(number);
        }
        computerNumber = numbers.stream().mapToInt(Integer::intValue).toArray();
    }

}
