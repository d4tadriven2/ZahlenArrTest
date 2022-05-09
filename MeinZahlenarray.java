package de.hsh.zahlenarraytest;
import de.hsh.prog.zahlenarray.*;
import java.util.Arrays;

/** Klasse MeinZahlenarray hat Zahlenarray als Superklasse*/
public class MeinZahlenarray extends Zahlenarray {
    private Zeitmesser zm;
    
    /** Konstruktor + Berechnung der Sortierzeit vom Array*/
    public MeinZahlenarray(int anzahl, int max) {
        super(anzahl, max);
        zm = new Zeitmesser();
        zm.start();
        Arrays.sort(getZahlenArray());
        zm.stop();
    }
    
    /** verbesserte istEnthalten Methode, prüft ob eine Zahl
     *  im Array enthalten ist*/
    @Override
    public boolean istEnthalten(int zahl) {
        return Arrays.binarySearch(getZahlenArray(), zahl) >= 0;
    }
    
    /** gibt die durchschnittliche Abfragezeit für den Aufruf der
     *  istEnthalten Methode + Sortierzeit zurück*/
    public double getDurchschnittlicheAbfragezeit() {
        for (int i=0; i<getMax(); i++) {
            zm.start();
            istEnthalten(i);
            zm.stop();
        }
        return (double)zm.getGemesseneGesamtzeit() / getMax();
    }
}
