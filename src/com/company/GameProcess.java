package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GameProcess {

private int index=0;
private int equalIndex;
ArrayList <Cards> equelStaminaPlayer = new ArrayList<>();

    public void startGame(ArrayList<Player>arrayListForPlayer, ArrayList<Cards>arrayListForSelectCard,int numberOfPlayers) {


        System.out.println(arrayListForPlayer.get(0).getName() + " please select number of you most important stamina : " +
                "\n 1 - strong," +
                "\n 2 - healths," +
                "\n 3 - intelect," +
                "\n 4 - speed");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player " + arrayListForPlayer.get(0).getName() + " select card is: " + arrayListForSelectCard.get(0).getNameCard()
                + " " + arrayListForSelectCard.get(0).getStrong() + " " + arrayListForSelectCard.get(0).getHealths() + " "
                + arrayListForSelectCard.get(0).getIntelect() + " " + arrayListForSelectCard.get(0).getSpeed());

        int num = scanner.nextInt();
        int sizeOfarrayNuberPlayers = numberOfPlayers - 1;

        int[] staminaPlayer = new int[numberOfPlayers];
        for (int i = 0; i < sizeOfarrayNuberPlayers; i++) {
            if (num == 1) {
                staminaPlayer[i] = arrayListForSelectCard.get(i).getStrong();
            } else if (num == 2) {
                staminaPlayer[i] = arrayListForSelectCard.get(i).getHealths();
            } else if (num == 3) {
                staminaPlayer[i] = arrayListForSelectCard.get(i).getIntelect();
            } else if (num == 4) {
                staminaPlayer[i] = arrayListForSelectCard.get(i).getSpeed();
            } else {
                System.out.println("Pleas enter valid number from hint");
            }
        }

        int maxStamina = 0;
        for (int i = 0; i < sizeOfarrayNuberPlayers; i++) {

            if (staminaPlayer[i] > maxStamina) {
                maxStamina = staminaPlayer[i];
                index = i;
            }
        }

        for (int i=0; i<sizeOfarrayNuberPlayers; i++ ) {
            if (maxStamina == staminaPlayer[i]) {
                equelStaminaPlayer.add(arrayListForSelectCard.get(i));
            }
        }
        int []equalNumber = new int[equelStaminaPlayer.size()];
        int equalMaxNumber=0;

        if (equelStaminaPlayer.size()>1){
            for (int i=0; i<equelStaminaPlayer.size();i++){
                equalNumber[i]=(equelStaminaPlayer.get(i).getStrong()+equelStaminaPlayer.get(i).getHealths()+
                        equelStaminaPlayer.get(i).getIntelect()+equelStaminaPlayer.get(i).getSpeed())/4;
                if (equalNumber[i]>equalMaxNumber){
                    equalMaxNumber = equalNumber[i];
                    equalIndex=i;
                }
            }
            System.out.println("Winner player is " + arrayListForPlayer.get(equalIndex).getName() + " with him Cards " + arrayListForSelectCard.get(equalIndex).getNameCard() +
                    " stamin = " +equalMaxNumber);

        }else {
            System.out.println("Winner player is " + arrayListForPlayer.get(index).getName() + " with him Cards " + arrayListForSelectCard.get(index).getNameCard() +
                    " stamin = " +maxStamina);
                    }


        System.out.println("Other Players has cards is:");
        for (int i=1; i<sizeOfarrayNuberPlayers;i++) {
            System.out.println(arrayListForPlayer.get(i).getName() + " : " + arrayListForSelectCard.get(i).getNameCard() + " - "
                    + arrayListForSelectCard.get(i).getStrong() +
                    ", " + arrayListForSelectCard.get(i).getHealths() +
                    ", " + arrayListForSelectCard.get(i).getIntelect() +
                    ", " + arrayListForSelectCard.get(i).getSpeed());
        }

    }
}
