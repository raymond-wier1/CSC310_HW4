package csc310_hw4_2;
import java.util.Scanner;
public class CSC310_HW4_2 {
    
    
    public static void Inorder(int [] a, int n) {
        if(2*n+1 < a.length)
            Inorder(a, 2*n+1);
        System.out.println(a[n]);
        if(2*n+2 < a.length)
            Inorder(a, 2*n+2);
    }
    
    public static void Preorder(int [] a, int n) {
        System.out.println(a[n]);
        if (2*n +1 < a.length)
            Preorder(a, 2 * n + 1);
        if(2*n+2 < a.length)
            Preorder(a, 2*n+2);
    }
    
    
    public static void main(String[] args) {
        int a[] = new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = i+1;
        }
        Inorder(a, 0);
        System.out.println();
        Preorder(a, 0);
    }
    
}
