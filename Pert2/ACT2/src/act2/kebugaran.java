package act2;

import java.util.Scanner;

class Kebugaran {
    int hari;
    int latihan;
    int jumlahPushUp; 

    // Constructor untuk latihan per hari
    public Kebugaran(int latihan) {
        this.latihan = latihan;
        System.out.println("Latihan Perhari: " + latihan);
    }

    // Constructor untuk menghitung jumlah push-up dan hari latihan
    public Kebugaran(int jumlahPushUp, int hari) {
        this.jumlahPushUp = jumlahPushUp;
        this.hari = hari;
        int totalLatihan = jumlahPushUp * hari;
        System.out.println("Total Latihan: " + totalLatihan + " push-up selama " + hari + " hari.");
    }

    // Menu pilihan gerakan latihan
    public static void pilihan() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Latihan Penurunan Berat Badan");
        System.out.println("2. Latihan Peningkatan Massa Otot");
        System.out.print("Silahkan pilih latihan: ");
        int pilih = input.nextInt();

        // Pilihan latihan sesuai input user
        switch (pilih) {
            case 1 -> {
                latihanPenurunanBeratBadan();
                mintaInputLatihan(input); 
            }
            case 2 -> {
                latihanPeningkatanMassaOtot();
                mintaInputLatihan(input);
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    // Latihan untuk menurunkan berat badan (Penurunan Berat Badan)
    public static void latihanPenurunanBeratBadan() {
        System.out.println("Latihan Penurunan Berat Badan: ");
        System.out.println("1. Jumping Jacks - Melatih seluruh tubuh dan membakar kalori dengan cepat.");
        System.out.println("2. Burpees - Gerakan eksplosif yang efektif untuk menurunkan berat badan.");
        System.out.println("3. Mountain Climbers - Membantu membakar lemak di area perut dan kaki.");
        System.out.println("Insight: Fokus pada latihan kardio yang cepat dan intens untuk memaksimalkan pembakaran kalori.");
    }

    // Latihan untuk meningkatkan massa otot (Peningkatan Massa Otot)
    public static void latihanPeningkatanMassaOtot() {
        System.out.println("Latihan Peningkatan Massa Otot: ");
        System.out.println("1. Push-up - Membantu meningkatkan massa otot tubuh bagian atas.");
        System.out.println("2. Squat - Efektif untuk membentuk otot kaki dan meningkatkan kekuatan tubuh.");
        System.out.println("3. Deadlift - Latihan beban yang membantu membangun otot seluruh tubuh.");
        System.out.println("Insight: Fokus pada latihan kekuatan (strength training) untuk meningkatkan massa otot dan menambah berat.");
    }

    // Method untuk meminta input push-up dan hari latihan
    public static void mintaInputLatihan(Scanner input) {
        System.out.print("Masukkan jumlah push-up per hari: ");
        int jumlahPushUp = input.nextInt();
        System.out.print("Masukkan jumlah hari latihan: ");
        int hari = input.nextInt();
        
        new Kebugaran(jumlahPushUp, hari);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        
        pilihan();
    }
}
