package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Object ArrayList;

    public static void main(String[] args) {
        ArrayList<Cards> creadCards = new CreadCards().creadCards();
Player player = new Player();
player.createPlayer(creadCards);

    }
}
