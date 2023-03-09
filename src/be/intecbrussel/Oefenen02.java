package be.intecbrussel;

public class Oefenen02 {
    public static void main(String[] args) {
        //Oefening 2
//        Schrijf een programma dat de leeftijd controleert.
//        tussen 0 t/m 20, 21 t/m 40, 41 t/m 60, 61 t/m 80, 81 t/m100.
//        Maak een print out voor elke leeftijdscategorie naar keuze.
//

        int leeftijd =105;

        if (leeftijd < 0 || leeftijd>100){
            System.out.println("!!! De leeftijd moet tussen 0 t/m 100 !!!");
        }
        else if (leeftijd <= 20) {
            System.out.println("jouw leeftijdscategorie is tussen 0 t/m 20 ");
        } else if (leeftijd <= 40) {
            System.out.println("jouw leeftijdscategorie is tussen 21 t/m 40");

        } else if (leeftijd<= 60) {
            System.out.println("jouw leeftijdscategorie is tussen 41 t/m 60");

        } else if (leeftijd<=80) {
            System.out.println("jouw leeftijdscategorie is tussen 61 t/m 80");

        }else System.out.println("jouw leeftijdscategorie is tussen 81 t/m 100");
    }
}
