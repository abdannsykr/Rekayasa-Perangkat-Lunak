package act2;

import java.util.Scanner;

public class ACT2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int ulang = 1;  
        
        while(ulang == 1) {
            Kebugaran.pilihan();
            
            System.out.print("Latihan lagi? Ya=1, Tidak=2: ");
            ulang = input.nextInt();  // Mengambil
        }
        
        System.out.println("Program selesai.");
    }
}
