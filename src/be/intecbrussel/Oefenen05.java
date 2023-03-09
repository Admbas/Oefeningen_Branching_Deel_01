package be.intecbrussel;

public class Oefenen05 {
    public static void main(String[] args) {
        //Oefening 5
//
//     Maak 3 variabelen van de zelfde type aan met verschillende waarden.
//
//     Nu ga je een applicatie schrijven diegaat kijken welke van deze 3 variabelen
//     de maximale waarde heeft en welke de minimale waarde heeft.
//     Jeprint de 2 variabelen uit min en max.Maximum value: 30Minimum value: 10


        int getal1 = 50;
        int getal2 = 5;
        int getal3 = 30;
        int minumumValue=0;
        int maximumValue=0;

        if (getal1 > getal2 && getal1 > getal3) {maximumValue=getal1;}
        else if (getal2 > getal1 && getal2 > getal3) {maximumValue=getal2;}
        else maximumValue=getal3;

        if (getal1 < getal2 && getal1 < getal3) {minumumValue=getal1;}
        else if (getal2 < getal1 && getal2 < getal3) {minumumValue=getal2;}
        else minumumValue=getal3;




        System.out.println("Maximum Value = "+ maximumValue);
        System.out.println("Minimum Value = "+ minumumValue);

    }
}
