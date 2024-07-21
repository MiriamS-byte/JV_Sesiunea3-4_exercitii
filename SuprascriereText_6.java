package itFactory.sesiunea3_4.exercitii3_4;

import java.util.Scanner;

public class SuprascriereText_6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ma numesc ___ \"Nume Prenume\" "+ "si sunt cursant la cursul de ___ \"testare\" " +
                " din cadrul companiei ____ \"facebook\" ");

        System.out.print("Introduceti numele si prenumele vostru: ");
        String numePrenume = scan.nextLine();
        System.out.print("Introduceti materia de curs: ");
        String materie = scan.nextLine();
        System.out.print("Introduceti numele companiei: ");
        String companie = scan.nextLine();

        System.out.println("Ma numesc " + numePrenume + " si sunt cursant la cursul de " + materie +
                " din cadrul companiei " + companie);


    }
}
