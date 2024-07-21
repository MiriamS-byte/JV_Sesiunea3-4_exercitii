package itFactory.sesiunea3_4.exercitii3_4;

import java.util.Scanner;

public class PretCantitatProdus_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String produs1 = "Mere";
        String unit1 = "buc";
        String produs2 = "Banane";
        String unit2 = "kg";

        System.out.println("Meniul este: " + produs1 + "/ " + unit1 );
        System.out.println("             " + produs2 + "/ " + unit2 );

        System.out.print("Introduceti produsul dorit: ");
        String produs = scan.nextLine();

        if (produs.equals(produs1)) {
            System.out.print("Introduceti pretul pe : " + unit1 + " ");
            double pretUnit1 = scan.nextDouble();
            System.out.print("Introduceti cantitatea dorita: ");
            double cant1 = scan.nextDouble();
            System.out.println("Pretul total este: " + pretUnit1 * cant1);
        } else
            System.out.print("Introduceti pretul pe : " + unit2 + " ");
            double pretUnit2 = scan.nextDouble();
            System.out.print("Introduceti cantitatea dorita: ");
            double cant2 = scan.nextDouble();
            System.out.println("Pretul total este: " + pretUnit2 * cant2);



    }
}
