package com.stackroute;

import java.util.Scanner;

public class RemoveVowels {

    public static void vowelsDelete(int numOfPlaces, String arrOfPlaces[]){
        for (int i=0; i<=numOfPlaces; i++){
            arrOfPlaces[i] = arrOfPlaces[i].replace("a","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("e","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("i","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("o","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("u","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("A","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("E","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("I","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("O","");
            arrOfPlaces[i] = arrOfPlaces[i].replace("U","");
            System.out.println(arrOfPlaces[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of places : ");
        int numOfPlaces = sc.nextInt();
        String arrOfPlaces[] = new String[numOfPlaces+1];
        System.out.println("Enter the places : ");
        for (int i=0; i<=numOfPlaces; i++) {
            arrOfPlaces[i] = sc.nextLine();
        }
        vowelsDelete(numOfPlaces, arrOfPlaces);
    }
}
