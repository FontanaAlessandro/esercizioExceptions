package pkg;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static Scanner tastiera = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Premere per generare un'eccezione:");
        System.out.println("1) Arithmetic Exception");
        System.out.println("2) Mull Pointer Exception");
        System.out.println("3) Class Cascade Exception");
        System.out.println("4) Array Index out of bound Exception");
        System.out.println("5) String Index out of bound Exception");
        System.out.println("6) Number format Exception");
        System.out.println();
        int[] a = new int[]{1, 2, 3};
        String stringa = "ciao";

        int c = tastiera.nextInt();
        switch (c) {
            case 1:
                System.out.print(2/0);
            case 2:
                String s = null;
                System.out.println(s.length());
            case 3:
                String b = " ";
                System.out.println(b.lastIndexOf(33));
            case 4:
                System.out.println(a[4]);
            case 5:
                System.out.println(stringa.charAt(-1));
            case 6:
                Integer.parseInt(null);
            default:
                System.out.println("Errore: inserisci un numero tra 1 e 6");
        }
    }
}