package it.epicode.esercizio2;

import it.epicode.esercizio2.exceptions.DivideBy0Exception;
import org.slf4j.Logger;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Logger logger = org.slf4j.LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("scegli modalità");
            System.out.println("1. Int");
            System.out.println("2. Double");
            int modalita = scanner.nextInt();
            if (modalita == 1) {
                try {
                    System.out.println("Inserisci i kilometri: ");
                    int km = scanner.nextInt();
                    System.out.println("Inserisci i litri: ");
                    int litri = scanner.nextInt();
                    if (litri == 0) {
                        throw new DivideBy0Exception("litri = 0");
                    }
                    int consumo = km / litri;
                    System.out.println("il consumo è: " + consumo + "km/l");
                } catch (DivideBy0Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (modalita == 2) {
                System.out.println("Inserisci i kilometri: ");
                double km = scanner.nextDouble();
                System.out.println("Inserisci i litri: ");
                double litri = scanner.nextDouble();
                if (litri == 0) {
                    throw new DivideBy0Exception("litri = 0");
                }
                double consumo = km / litri;
                System.out.println("il consumo è: " + consumo + "km/l");
            } else {
                throw new Exception("Modalità non valida");
            }
        } catch (Exception e) {
            logger.error("Errore: " + e.getMessage());
        }

    }

}
