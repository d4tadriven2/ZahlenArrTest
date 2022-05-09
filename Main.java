package de.hsh.zahlenarraytest;
import de.hsh.prog.zahlenarray.*;

/** Klasse Main*/
public class Main {
    
    /** Hauptprogramm*/
    public static void main(String[] args) {
        
//        Zahlenarray array= new Zahlenarray(10000, 500000);
//        int anzahl= ZahlenPruefer.anzahlVerschiedene(array);
//        System.out.println("Anzahl: "+anzahl);
        
        MeinZahlenarray array= new MeinZahlenarray(10000, 500000);  
        int anzahl= ZahlenPruefer.anzahlVerschiedene(array);
        System.out.println("Anzahl: "+anzahl);
        System.out.println("istEnthalten verbraucht durchschnittlich "
                            +1000*array.getDurchschnittlicheAbfragezeit()+" ns");
    
//        Zeitmesser z = new Zeitmesser();
//        z.start();
//        int i = 0;
//        while(i < 100000) {
//            i++;
//        }
//        z.stop();
//        System.out.println(z.getGemesseneGesamtzeit());
    }       
}
