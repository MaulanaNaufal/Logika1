

import java.util.Scanner;
class Nomer3{

    public static void main(String[] args) {
        Scanner penjumlahan = new Scanner (System.in);
        int Pertama, Kedua, Tiga, Empat, Lima, HasilJumlah;
       
            System.out.print("1. Masukkan Angka pertama: ");
            Pertama = penjumlahan.nextInt();
            
            System.out.print("2. Masukkan Angka kedua : ");
            Kedua = penjumlahan.nextInt();
            
            System.out.print("3. Masukkan Angka ketiga : ");
            Tiga = penjumlahan.nextInt();
            
            System.out.print("4. Masukkan Angka keempat : ");
            Empat = penjumlahan.nextInt();
            
            System.out.print("5. Masukkan Angka kelima : ");
            Lima = penjumlahan.nextInt();
            
            HasilJumlah = Pertama + Kedua + Tiga + Empat + Lima;
            
            System.out.println("Hasil Penjumlahan dari "+Pertama+" + "+Kedua+" + "+Tiga+" + "+Empat+" + "+Lima+" = "+HasilJumlah);
    }


}
