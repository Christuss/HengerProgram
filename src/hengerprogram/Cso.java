/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hengerprogram;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class Cso extends TomorHenger {

    private double falvastagsag;

    public Cso(double falvastagsag, double fajsuly, double sugar, double magassag) {
        super(fajsuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double falvastagsag, double sugar, double magassag) {
        super(1, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

}
