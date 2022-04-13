import java.util.*;

public class Nomer5 {
    public static void main(String[] args) {
        int[] a = {4,6,1,3,5};
        System.out.println("Mencari Nilai Maximum suatu nilai");
        int max=a[0];
        int min=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Nilai Maximum = "+max);
        System.out.println("=======================");
    }
}