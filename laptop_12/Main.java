package itFactory.sesiunea3_4.exercitii3_4.laptop_12;

import itFactory.sesiunea3_4.exercitii3_4.laptop_12.componente.MemorieSSD;
import itFactory.sesiunea3_4.exercitii3_4.laptop_12.componente.Ram;
import itFactory.sesiunea3_4.exercitii3_4.laptop_12.electronice.Laptop;

public class Main {
        public static void main(String[] args) {
            Laptop laptop1 = new Laptop();
            laptop1.setMarca("Asus");
            laptop1.setCuloare("Negru");
            laptop1.setDimensiuneEcran(15.6);

            Ram laptop1_ram = new Ram();
            laptop1_ram.setTipMemorie("DDR3");
            laptop1_ram.setUnitateMasura("GB");
            laptop1_ram.setCapacitateMemorie(16);

            MemorieSSD laptop1_memory = new MemorieSSD();
            laptop1_memory.setCapacitateStocare(256);
            laptop1_memory.setUnitateMasura("GB");

            System.out.println("Detalii laptop: ");
            System.out.println("Marca: " + laptop1.getMarca());
            System.out.println("Culoare: " + laptop1.getCuloare());
            System.out.println("Dimensiune ecran: " + laptop1.getDimensiuneEcran());
            System.out.println(" ");
            System.out.println("Memorie RAM: ");
            System.out.println("Tip memorie RAM: " + laptop1_ram.getTipMemorie());
            System.out.println("Unitete de Masura: " + laptop1_ram.getUnitateMasura());
            System.out.println("Capacitate memorie RAM: " + laptop1_ram.getCapacitateMemorie());
            System.out.println(" ");
            System.out.println("Spatiu de stocare: ");
            System.out.println("Capacitate stocare SSD: " + laptop1_memory.getCapacitateStocare());
            System.out.println("Unitate de masura stocare SSD: " + laptop1_memory.getUnitateMasura());



        }

}
