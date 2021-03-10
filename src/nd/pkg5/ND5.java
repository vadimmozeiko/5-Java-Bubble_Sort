package nd.pkg5;

import java.util.Scanner;

public class ND5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk masyvo dydi:");
        int kiek = sc.nextInt();

        double[] sk = new double[kiek];

        for (int i = 0; i < sk.length; i++) {
            sk[i] = Math.random();
            System.out.println(sk[i]);
        }
        System.out.println();
        System.out.println("------------------");
        System.out.println();
        System.out.println("Surikiuotas didejimo tvarka:");
        System.out.println();

        double temp = 0;

        for (int i = 0; i < sk.length; i++) {
            for (int j = 0; j < sk.length; j++) {
                if (sk[i] < sk[j]) {
                    temp = sk[i];
                    sk[i] = sk[j];
                    sk[j] = temp;
                }
            }
        }
        for (int i = 0; i < sk.length; i++) {
            System.out.println(i + " - " + sk[i]);
        }
    }

}
