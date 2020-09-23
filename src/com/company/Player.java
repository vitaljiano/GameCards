package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    public Player(){

    }
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public static void createPlayer(ArrayList<Cards> creadCards){
    Player[] player;

    Scanner scannerForName = new Scanner(System.in);
    Scanner scannerForNumber = new Scanner(System.in);
    int  numberOfPlayers  = 1;
    int number;
    String name;
    boolean nextPlayer_YesOrNo = true;
        ArrayList<Player> arrayListForPlayer = new ArrayList<>();
        ArrayList<Cards> arrayListForSelectCard = new ArrayList<>();
    do {
        System.out.println("Enter name of  player");
         name = scannerForName.nextLine();
        player=new Player[numberOfPlayers+1];
        player[numberOfPlayers] = new Player(name);
        arrayListForPlayer.add(player[numberOfPlayers]);
        arrayListForSelectCard.add(new CreadCards().creadArrayForCards(creadCards));
        numberOfPlayers++;

if (arrayListForPlayer.size()<2) {
    System.out.println("Enter name of  player 2");
    name = scannerForName.nextLine();
    player = new Player[numberOfPlayers + 1];
    player[numberOfPlayers] = new Player(name);
    arrayListForPlayer.add(player[numberOfPlayers]);
    arrayListForSelectCard.add(new CreadCards().creadArrayForCards(creadCards));
    numberOfPlayers++;
    System.out.println("Enter next player? \n 0 - No \n 1 - Yes");
    number = scannerForNumber.nextInt();
    if (number == 1) {
        nextPlayer_YesOrNo = true;
    } else if (number == 0) {
        nextPlayer_YesOrNo = false;
    } else System.out.println("You enter wrong number!");
}else {
    System.out.println("Enter next player? \n 0 - No \n 1 - Yes");
    number = scannerForNumber.nextInt();
    if (number == 1) {
        nextPlayer_YesOrNo = true;
    } else if (number == 0) {
        nextPlayer_YesOrNo = false;
    } else System.out.println("You enter wrong number!");
}

    }while (nextPlayer_YesOrNo);

    GameProcess gameProcess = new GameProcess();
    gameProcess.startGame(arrayListForPlayer,arrayListForSelectCard, numberOfPlayers);


   return ;

}

}
