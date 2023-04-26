package sba3.exercise2;

// <<<<<======== Click here to expand the locked stub code
import java.util.*;

interface Sport{
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}
/*

This is here only for visibility. Please do not take the code below out of the comments.

import java.util.*;

interface Sport{
 void calculateAvgAge(int[] age);
 void retirePlayer(int id);
}

This is here only for visibility. Please do not take the code above out of the comments.
*/

// ================ PLEASE WRITE CODE HERE =============

/*
Write your implementation of the Cricket and Football classes below.
*/


class Cricket implements Sport{

    private int[] playerIDs;

    public Cricket() {
        for (int i = 0; i < 11; i++) {
            playerIDs[i] = i + 1;
        }
        String x = "A new cricket team has been formed";
        System.out.println(x);
    }

    @Override
    public void calculateAvgAge(int[] age) {

        double sum = 0.0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        double averageAge = sum / age.length;
        System.out.printf("The average age of the team is %.2f %n",
                averageAge);
    }

    @Override
    public void retirePlayer(int id) {
        int index = id - 1;
        if (playerIDs[index] == -1) {
            String x = "Player has already retired";
            System.out.println(x);
        }
        else {
            playerIDs[index] = -1;
            String x = "Player with id: "
                    + id
                    + " has retired";
            System.out.println();
        }
    }
}


class Football implements Sport{

    private int[] playerIDs;

    public Football() {
        for (int i = 0; i < 11; i++) {
            playerIDs[i] = i + 1;
        }
        String x = "A new football team has been formed";
        System.out.println(x);
    }

    @Override
    public void calculateAvgAge(int[] age) {
        double sum = 0.0;
        for (int i = 0; i < age.length; i++) {
            sum += age[i];
        }
        double averageAge = sum / age.length;
        System.out.printf("The average age of the team is %.2f %n",
                averageAge);
    }

    @Override
    public void retirePlayer(int id) {
        int index = id - 1;
        if (playerIDs[index] == -1) {
            String x = "Player has already retired";
            System.out.println(x);
        }
        else {
            playerIDs[index] = -1;
            String x = "Player with id: "
                    + id
                    + " has retired";
            System.out.println();
        }
    }

    public void playerTransfer(int fee, int id) {
        int index = id - 1;
        if (playerIDs[index] == -1) {
            System.out.println("Player has already retired");
        } else {
            String x = "Player with id: "
                    + id
                    + " has been transferred with a fee of "
                    + fee;
        }
    }
}

// <<<<<======== Click here to expand the locked stub. Please take a look at the locked stub code to better understand how your implementation of the required classes will be validated.
//PlEASE DO NOT ATTEMPT TO MODIFY THE CODE BELOW !!!!!!.
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Cricket c = new Cricket();
        Football f = new Football();

        int[] age1 = new int[11];
        int[] age2 = new int[11];

        for(int i = 0; i < 2; i++)
        {
            String[] age = sc.nextLine().split(" ");
            if(i == 0){
                int j = 0;
                for(String s : age)
                    age1[j++] = Integer.parseInt(s);
            }
            else{
                int j = 0;
                for(String s : age)
                    age2[j++] = Integer.parseInt(s);
            }
        }
        c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);

        for(int i = 0; i < 6; i++){

            if(i < 3){
                int x = Integer.parseInt(sc.nextLine());

                c.retirePlayer(x);
            }
            else if(i < 5){
                int x = Integer.parseInt(sc.nextLine());
                f.retirePlayer(x);
            }
            else {
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
        }
    }
}
