import java.util.Scanner;

public class homework05 {
    public static void main(String[] args) {
        double total, discound, discound2,roundtrip,total7;
        Scanner read = new Scanner(System.in);
        System.out.print("Distance to travel (KM): ");
        int km = read.nextInt();

        System.out.print("How old are you: ");
        int old = read.nextInt();

        System.out.print("Type of travel (Please press 2 for round-trip or if you want one way, you should press 1): ");
        int trip = read.nextInt();

        if ((km > 0 && old > 0) && (trip == 1 || trip == 2)) {
            switch (trip) {
                case 1:
                    total = ((double) km * 0.10);
                    if (old < 12) {
                        discound = (total / 2);
                        System.out.println("Discount price: " + String.format("%.2f", discound)+" TL");
                    } else if (old > 12 && old < 24) {
                        discound = (total * 0.10);
                        System.out.println("Discount price: " + String.format("%.2f", discound)+" TL");
                    } else if (old > 65) {
                        discound = (total * 0.30);
                        System.out.println("Discount price: " + String.format("%.2f", discound)+" TL");
                    } else {
                        System.out.println("Total: " + String.format("%.2f", total)+" TL");
                    }
                    break;
                case 2:
                    total = ((double) km * 0.10);
                    if (old < 12) {
                        discound = (total / 2);
                        discound2 = (total-discound);
                        roundtrip = (discound2*0.20);
                        total7 = ((discound2-roundtrip)*2);
                        System.out.print("Discount price: " + String.format("%.2f", total7)+" TL");
                    } else if (old > 12 && old < 24) {
                        discound = (total * 0.10);
                        discound2 = (total-discound);
                        roundtrip = (discound2*0.20);
                        total7 = ((discound2-roundtrip)*2);
                        System.out.print("Discount price: " + String.format("%.2f", total7)+" TL");
                    } else if (old > 65) {
                        discound2 = (total * 0.30);
                        discound2 = (total-discound2);
                        roundtrip = (discound2*0.20);
                        total7 = ((discound2-roundtrip)*2);
                        System.out.print("Discount price: " + String.format("%.2f", total7)+" TL");
                    } else {
                        System.out.print("Total: " + String.format("%.2f", total)+" TL");
                    }
                    break;
            }
        } else {
            System.out.println("Incorrect entry... ");
        }

    }
}
