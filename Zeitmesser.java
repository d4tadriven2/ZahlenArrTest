package de.hsh.zahlenarraytest;

/** Klasse Zeitmesser, misst die vergangene Zeit*/
public class Zeitmesser {
    private long start;
    private long ende;
    private long ersterStart;
    private boolean zeitLauft;

    /** Konstruktor von Zeitmesser*/
    public Zeitmesser() {
        zeitLauft = false;
        start = 0;
    }
    
    /** startet die Zeitmessung*/
    public void start() {
        if (zeitLauft == true) {
            throw new IllegalStateException();
        }
        zeitLauft = true;
        start = ende;
        if (start == 0) {
            ersterStart = System.currentTimeMillis();
            start = ersterStart;
        }
    }
    
    /** stoppt die Zeitmessung*/
    public void stop() {
        if (zeitLauft == false) {
            throw new IllegalStateException();
        }
        zeitLauft = false;
        ende = System.currentTimeMillis();
    }
    
    /** Gibt die Gesamtzeit zurück(Aufsummierte start-stop)*/
    public long getGemesseneGesamtzeit() {
        if (zeitLauft == true) {
            throw new IllegalStateException();
        }
        return ende- ersterStart;
    }
    
}
