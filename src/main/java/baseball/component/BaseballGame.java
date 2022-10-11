package baseball.component;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    private Referee referee;

    public BaseballGame(){
        referee = new Referee();
    }

    public void startGame(){

    }

    private int[] generateComputerNumber(){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<3; i++){
            int number = 0;
            do{
                number = Randoms.pickNumberInRange(1, 9);
            } while(numbers.contains(number));
            numbers.add(number);
        }
        return numbers.stream().mapToInt(Integer::intValue).toArray();
    }

}
