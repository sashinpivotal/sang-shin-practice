package sba_exercise2.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = {23,12,33,47};
        int sum = 0;
        for (int number : myNumberArray) {
            sum += number;
        }
        double result = (double) sum / myNumberArray.length;
        System.out.printf("%.2f %n", result );

        MajorLeagueSoccer majorLeagueSoccer
                = new MajorLeagueSoccer();
        int[] playerNumberArray = majorLeagueSoccer.getPlayerNumberArray();
        String s = Arrays.toString(playerNumberArray);
        System.out.println(s);

        majorLeagueSoccer.sendPlayerToMinorLeague(4);
        majorLeagueSoccer.sendPlayerToMinorLeague(4);

    }
}

class MajorLeagueSoccer {

    private int[] playerNumberArray;

    public MajorLeagueSoccer() {
        playerNumberArray = new int[11];
        for (int i = 0; i < playerNumberArray.length; i++) {
            playerNumberArray[i] = i + 1;
        }
    }

    public void sendPlayerToMinorLeague(int playerID) {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];
        if (playerIDInTheArray != -1) {
            playerNumberArray[index] = -1;
            System.out.println("player is sent to the minor league");
        } else {
            System.out.println("player is already sent to minor league");
        }

    }

    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }
}
