package csc310_hw4_1;
import java.util.Scanner;   

public class CSC310_HW4_1 {
    
    public static void Insertion(int [] c) {
        // Array a holds the key
        int[] a = new int[c.length];
        // Array b holds the value
        int[] b = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            a[i] = i;
            b[i] = c[i];
        }
        // Sorting the numbers based on the b array
        for (int i = 0; i < b.length; i++) {
            for (int j = i+1; j < b.length; j++) {
                if(b[i] > b[j]) {
                    int t = b[i];
                    b[i] = b[j];
                    b[j] = t;
                    
                    int p = a[i];
                    a[i] = a[j];
                    a[j] = p;
                }
            }
        }
        
        // print the key and value
        for (int i = 0; i < b.length; i++) {
            System.out.println("Key "+a[i]+" holds value "+b[i]+".");
        }
    }
    
    public static void main(String[] args) {
        // Array a holds the key
        // Array b holds the value
        int[] c = new int[9];
        c[0] = 20;
        c[1] = 5;
        c[2] = 72;
        c[3] = 43;
        c[4] = 1;
        c[5] = 9;
        c[6] = 55;
        c[7] = 48;
        c[8] = 30;
        Insertion(c);
    }
    
}
