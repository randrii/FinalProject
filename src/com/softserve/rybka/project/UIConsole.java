package com.softserve.rybka.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UIConsole {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static int userChoice;
    
    public UIConsole(int userChoice) {
        this.userChoice = userChoice;
    }
    
    public UIConsole() {
    }

    public int getUserChoice() {
        return userChoice;
    }

    public static void setUserChoice() {
        int choice = 0;
        System.out.println("Input number of operation: ");
        try {
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException ex) {
            System.out.println("Wrong operation!");
        }
        UIConsole.userChoice = choice;
    }
    
    public static void showMenu(){
        System.out.println("Chose option from the list below: ");
        switch(userChoice){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: break;
            default:
            {
                UIConsole.setUserChoice();
                break;
            }
                
        }
    }
    
    
}
