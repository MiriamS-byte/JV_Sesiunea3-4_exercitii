package itFactory.sesiunea3_4.exercitii3_4.geometrie_13;

import itFactory.sesiunea3_4.exercitii3_4.geometrie_13.FormeGeometrice.Dreptunghi;
import itFactory.sesiunea3_4.exercitii3_4.geometrie_13.FormeGeometrice.Patrat;
import itFactory.sesiunea3_4.exercitii3_4.geometrie_13.FormeGeometrice.Triunghi;

public class Main {
    public static void main(String[] args) {


        Patrat patrat1 = new Patrat();
        Dreptunghi dreptunghi1 = new Dreptunghi();
        Triunghi triunghi1 = new Triunghi();


        System.out.println("Perimetrul triunghiului este: " + triunghi1.perimetruTriunghi(10, 12, 14) );
        System.out.println("Perimetrul patratului este: " + patrat1.perimetruPatrat(50));
        System.out.println("Perimetrul dreptunghiului este: " + dreptunghi1.perimetruDreptunghi(21, 12) );
        System.out.println("Aria dreptunghiului este: " + dreptunghi1.perimetruDreptunghi(21, 12) );



    }
}
