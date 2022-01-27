/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @modified by Zhenqian Fan
 * 
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        printInfo();
        Scanner input = new Scanner(System.in);
        Random card = new Random();
        int[] magicHand = new int[7];
        
        System.out.print("Enter number from 1 - 13: ");
        int n = input.nextInt();
        //System.out.println(n);
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = card.nextInt(13) + 1;
            System.out.println(magicHand[i] + " ");
            if (n == magicHand[i]) {
                System.out.println("    - Right Choice " + "(" + magicHand[i] + ")");
            }
            
        }
    }
    public static void printInfo()
       {
            System.out.println("Zhenqian Fan");
       }
}
