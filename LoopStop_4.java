package itFactory.sesiunea3_4.exercitii3_4;

import java.util.Scanner;

public class LoopStop_4 {
    public static void main(String[] args) {

        String oprire = "stop";
        String cuvant;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti textul: ");
        cuvant = scanner.nextLine();

        while (!(cuvant.equals(oprire))) {
            System.out.print("Introduceti textul: ");
            cuvant = scanner.nextLine();

        }
        System.out.println("Am iesit din program! ");

        }
    }

