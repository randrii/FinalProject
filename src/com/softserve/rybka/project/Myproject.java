package com.softserve.rybka.project;

public class Myproject {


    public static void main(String[] args) {
        //DBConnect connect = new DBConnect();
        //connect.getData();
        UIConsole console = new UIConsole();
        console.showMenu();
        System.out.println(console.getUserChoice());
    }
    
    
}
