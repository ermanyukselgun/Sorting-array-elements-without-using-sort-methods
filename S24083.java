

import java.util.Random;
import java.util.Scanner;

public class S24083 {

    public static void main(String[] args) {
        int n;
        while (true) {
            System.out.print("n sayisini giriniz : ");
            Scanner read = new Scanner(System.in);
            n = read.nextInt();
            if (n > 0) {
                break;
            }
        }

        Random random = new Random();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = random.nextInt(51) - 25;

        }
        System.out.print("list :");

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        int sonuc = list[0];

        if (negatifsayikontrol(list)) {

            if (sonuc > 0) {
                for (int i = 1; i < list.length; i++) {
                    if (list[i] < 0) {
                        sonuc = list[i];
                        break;
                    }

                }

            }
            for (int i = 0; i < list.length; i++) {
                if (list[i] < 0) {
                    if (sonuc < list[i]) {
                        sonuc = list[i];

                    }

                }
            }

        } else {
            sonuc = 0;
            
        }
        
        System.out.println("");
        System.out.println("Sonuc: " + sonuc);

    }

    public static boolean negatifsayikontrol(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result = true;
                break;
            }
        }
        return result;
    }

}
