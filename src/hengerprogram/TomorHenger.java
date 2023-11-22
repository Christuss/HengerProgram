/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class TomorHenger extends Henger {
    private double fajsuly;

    public TomorHenger(double fajsuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magassag) {
        super(sugar, magassag);
        this.fajsuly = 1;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    
    
    
}
