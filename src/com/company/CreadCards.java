package com.company;

import java.util.ArrayList;
import java.util.Random;

public class CreadCards {
    public ArrayList<Cards> creadCards(){

        Cards card1 = new Cards("Aladin", 20, 50, 80, 20);
        Cards card2 = new Cards("Mag", 10, 20, 100, 90);
        Cards card3 = new Cards("Bot", 100, 80, 20, 20);
       Cards card4 = new Cards("Gnom", 60, 20, 80, 90);
        Cards card5 = new Cards("Heuman", 50, 50, 50, 40);
        Cards card6 = new Cards("Elf", 80, 30, 90, 60);
        Cards card7 = new Cards("Pandrian", 80, 100, 35, 60);
        Cards card8 = new Cards("Dark Elf", 30, 70, 70, 600);
        Cards card9 = new Cards("McQueen", 40, 60, 80, 100);
        Cards card10 = new Cards("Warior", 90, 80, 20, 50);
        Cards card11 = new Cards("Dworf", 80, 50, 70, 30);
        Cards card12 = new Cards("Skeleton", 10, 100, 90, 80);
        Cards card13 = new Cards("Tauron", 70, 100, 10, 80);
        Cards card14 = new Cards("Goblin", 90, 80, 80, 20);
        Cards card15 = new Cards("Mack", 20, 70, 90, 10);
        Cards card16 = new Cards("Few", 40, 55, 65, 80);
        Cards card17 = new Cards("Bigger", 85, 30, 90, 80);
        Cards card18 = new Cards("Org", 100, 100, 20, 20);
        Cards card19 = new Cards("Troll", 45, 10, 60, 45);
        Cards card20 = new Cards("Elf Blood", 90, 60, 35, 55);

        ArrayList<Cards> arrayList = new ArrayList<Cards>();


        arrayList.add(card1);
        arrayList.add(card2);
        arrayList.add(card3);
        arrayList.add(card4);
        arrayList.add(card5);
        arrayList.add(card6);
        arrayList.add(card7);
        arrayList.add(card8);
        arrayList.add(card9);
        arrayList.add(card10);
        arrayList.add(card11);
        arrayList.add(card12);
        arrayList.add(card13);
        arrayList.add(card14);
        arrayList.add(card15);
        arrayList.add(card16);
        arrayList.add(card17);
        arrayList.add(card18);
        arrayList.add(card19);
        arrayList.add(card20);

        return arrayList;
    }
    public Cards creadArrayForCards(ArrayList arrayList) {

       return (Cards) arrayList.get(new Random().nextInt(20));



    }

}
