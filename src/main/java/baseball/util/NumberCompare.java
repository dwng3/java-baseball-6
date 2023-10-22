package baseball.util;

public class NumberCompare {
    private int strike;
    private int ball;

    public int getStrike(){
        return strike;
    }

    public int[] getResultCount(String playerNumber, String computerNumber){
        resetCount();
        countBall(playerNumber,computerNumber);
        countStrike(playerNumber,computerNumber);
        countRealBall();

        return new int[]{strike, ball};
    }


    public void resetCount(){
        strike = 0;
        ball = 0;
    }

    public void countBall(String playerNumber, String computerNumber){
        for(int i=0;i < playerNumber.length();i++){
            if(computerNumber.contains(Character.toString(playerNumber.charAt(i)))){
                ball++;
            }
        }
    }
    public void countStrike(String playerNumber, String computerNumber){
        for(char playerNum : playerNumber.toCharArray()){
            if(playerNumber.indexOf(playerNum) == computerNumber.indexOf(playerNum)){
                strike++;
            }
        }
    }

    public void countRealBall(){
        ball = ball - strike;
    }

}