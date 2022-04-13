import java.util.Scanner;
 
class Nomer2 {
  public static void main(String args[]){
   
  Scanner input = new Scanner(System.in);
  int uhuy1;
  
  System.out.println("Ganjil Genap Pendeteksi");
  System.out.println("=======================");
  
  System.out.print("Masukkan angka : ");
  uhuy1 = input.nextInt();
   
  if (uhuy1 % 2 != 0) {
    System.out.print(uhuy1 + " termasuk bilangan ganjil");
  }
  else {
    System.out.print(uhuy1 + " termasuk bilangan genap");
  }
   
  }
}
