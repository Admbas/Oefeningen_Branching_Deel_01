package be.intecbrussel;

public class Oefenen04 {
    public static void main(String[] args) {

        //  Oefening 4
//
//        Maak een variabel aan van het type char.
//        Schrijf dan een programma dat controleert of de variabel een kleineletter, hoofdletter of een getal is.


        char var = 'R';

        if (var >= 'A' && var <= 'Z') {
            System.out.println("char is a hoofdletter");

        } else if (var >= 'a' && var <= 'z') {
            System.out.println("char is a kleine dletter");

        } else System.out.println("char is een getal");
    }
}
