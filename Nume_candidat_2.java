package itFactory.sesiunea3_4.exercitii3_4;

import java.util.Scanner;

public class Nume_candidat_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduceti numele candidatului: ");
        String nume = scan.nextLine();
//        int numeMax = 25;

        while (nume.length()<3 && nume.length()>=25); {
            System.out.println("Nu ati introdus nici un nume " +
                    "sau numele introdus este prea lung pentru sistem!");

            System.out.print("Introduceti numele candidatului: ");
            nume = scan.nextLine();

        }
        System.out.println("Numele candidatului introdus este: " + nume);

    }
}
