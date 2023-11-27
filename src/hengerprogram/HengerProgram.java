/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hengerprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author SzendefiKrisztoferDá
 */
public class HengerProgram {

    private ArrayList<Henger> hengerek;
    
    public static void main(String[] args) {
        new HengerProgram().run();
    }
    
    public double atlagTerfogat(){
        double osszterfogat = 0;
        for (Henger henger : hengerek) {
            osszterfogat += henger.terfogat();
        }
        return osszterfogat / Henger.getHengerDarab();
    }
    
    public double csovekSulya() {
        double csoveksuly = 0;
        for (Henger henger : hengerek) {
            if (henger instanceof Cso) {
                csoveksuly += ((Cso) henger).suly();
            }
        }
        return csoveksuly;
    }
    
    private List<Henger> lista(){
        hengerek = new ArrayList<>();
        hengerek.add(new Henger(1, 1));
        hengerek.add(new TomorHenger(1, 1));
        hengerek.add(new Cso(1, 1, .5));
        hengerek.add(new Cso(1, 1, .1));
        return Collections.unmodifiableList(hengerek);
    };
    
    public void run() {
        lista();
        System.out.println(toString());
        System.out.println("atlag terfogat: " + atlagTerfogat());
        System.out.println("csovek sulya : " + csovekSulya());
        System.out.println("hengerek szama: " + Henger.getHengerDarab());
    }

    @Override
    public String toString() {
        return "HengerProgram{" + "hengerek=" + hengerek + '}';
    }
    
}
