package it.epicode.esercizio1;

import it.epicode.esercizio1.exceptions.OutOfBoundException;
import org.slf4j.Logger;

import java.util.Scanner;

public class Main {
    static final Logger logger = org.slf4j.LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = (int) (Math.random() * 10);
        int num4 = (int) (Math.random() * 10);
        int num5 = (int) (Math.random() * 10);
        int[] array = new int[5];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;
        array[3] = num4;
        array[4] = num5;
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4]);

        Scanner scanner = new Scanner(System.in);
        while (true) {
        try {

                System.out.println("Inserisci un numero da inserire nell'array");
                int numero = scanner.nextInt();
                if(numero == 0){
                break;
                }
                System.out.println("Decidere la posizione in cui inserire il numero");
                int posizione = scanner.nextInt();
                if(posizione == 0){
                    break;
                } else if (posizione > 5 || posizione < 1) {
                    throw new OutOfBoundException("posizione non valida");
                }
                int[] array2 = new int[5];
                array2[0] = array[0];
                array2[1] = array[1];
                array2[2] = array[2];
                array2[3] = array[3];
                array2[4] = array[4];
                array2[posizione - 1] = numero;
                System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2] + ", " + array2[3] + ", " + array2[4] + ", ");

        } catch (OutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        }
        System.out.println("FINE");
    }
}
