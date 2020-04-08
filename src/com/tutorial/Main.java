package com.tutorial;

import java.util.ArrayList;

class Player{

    private static int numberOfLayer;
    private static ArrayList<String> nameList = new ArrayList<String>();
    private String name;

    //Constructor
    Player(String name){
        this.name = name;
        Player.numberOfLayer++;
        Player.nameList.add(this.name);
    }

    void show(){
        System.out.println("Player name = " + this.name);
    }

    //ini adalah static method
    static void getNumberOfPlayer(){
        System.out.println("Number of Player : " + Player.numberOfLayer);
    }

    static ArrayList<String> getNames(){
        return Player.nameList;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("All Mighty");
        Player player3 = new Player("Mi Lady");
        Player player4 = new Player("Midnight");

        Player.getNumberOfPlayer();
        System.out.println("Names : " + Player.getNames());
    }
}