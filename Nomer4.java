/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-1
 */
public class Nomer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menentukan angka ganjil dan genap");
        System.out.println("");
        System.out.println("Angka dari = [4,6,1,3,5]");
        
        int[] angka = {4,6,1,3,5};
        
        System.out.print("=> [");
        for(int a=0; a<5; a++){
            if(angka[a] %2 == 0){
                System.out.print("Genap,");
            }
            else{
                System.out.print("Ganjil");
            }  
        }
        System.out.println("]");
                    
                    
    }
}
