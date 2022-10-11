package baseball.component;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    private Referee referee;

    public BaseballGame(){
        referee = new Referee();
    }

    public void startGame(){
        String userInput;
        do{
            playGame();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            userInput = Console.readLine();
        } while(userInput.equals("1"));

    }

    public void playGame(){
        referee.setComputerNumbers(generateComputerNumber());
        do{
            System.out.print("숫자를 입력해주세요 : ");
            String playerInput = Console.readLine();
            int[] playerNumber = convertPlayerInput(playerInput);

            referee.playerTurn(playerNumber);

            String result = generateResultString(referee.getBalls(), referee.getStrikes());
            System.out.println(result);

        } while(referee.getStrikes() != 3);
        System.out.println("3개의 숫자를 모두 맞히셨습니! 게임 종료");
    }

    private String generateResultString(int balls, int strikes){
        if(balls == 0 && strikes == 0){
            return "낫싱";
        }

        StringBuilder stringBuilder = new StringBuilder();
        if(balls != 0){
            stringBuilder.append(balls);
            stringBuilder.append("볼");
        }

        if(strikes != 0){
            if(stringBuilder.length() != 0){
                stringBuilder.append(" ");
            }
            stringBuilder.append(strikes);
            stringBuilder.append("스트라이크");
        }

        return stringBuilder.toString();
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

    private int[]  convertPlayerInput(String playerInput){
        int[] numbers = new int[3];
        for(int i=0; i<3; i++){
            numbers[i] = Character.getNumericValue(playerInput.charAt(i));
        }
        return numbers;
    }

}
