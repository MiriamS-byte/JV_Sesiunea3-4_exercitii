package itFactory.sesiunea3_4.exercitii3_4;

import java.util.Scanner;

public class User_parola_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userDefault = "administrator";
        String parolaDefault = "23AbC";

 System.out.print("Introduceti userul: ");
 String user = scan.nextLine();

System.out.print("Introduceti parola: ");
  String parola = scan.nextLine();

        while (!user.equals(userDefault) && !parola.equals(parolaDefault)){

            System.out.println("Credentiale gresite! ");

            System.out.print("Introduceti userul: ");
            user = scan.nextLine();
            System.out.print("Introduceti parola: ");
            parola = scan.nextLine();

        }
        System.out.println("Te-ai autentificat cu succes! ");

    }
}
