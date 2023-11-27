/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class Henger {

    private static int hengerDarab;
    private double sugar;
    private double magassag;

    public Henger(double sugar, double magassag) {
        Henger.hengerDarab++;
        this.sugar = sugar;
        this.magassag = magassag;
    }
    
    public static int getHengerDarab(){
        return hengerDarab;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }
    
    public double terfogat() {
        return Math.pow(sugar, 2) * Math.PI * magassag;
    }

    @Override
    public String toString() {
        return "Henger{" + "sugar=" + sugar + ", magassag=" + magassag + '}';
    }
    
    
}
