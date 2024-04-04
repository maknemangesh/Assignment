package makne;
import java.util.*;
public class demo1 {
	 	
	 
		    public static void mergeArrays(int[] X, int[] Y, int m, int n) {
		        int i = m - 1;  
		        int j = n - 1;  
		        int k = m + n - 1;  
		        while (i >= 0 && j >= 0) {
		            if (X[i] > Y[j]) {
		                X[k--] = X[i--];
		            } else {
		                X[k--] = Y[j--];
		            }
		        }
		        while (j >= 0) {
		            X[k--] = Y[j--];
		        }
		    }
		    public static void printArray(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		    public static void main(String[] args) {
		        int[] X = {1, 4, 7, 8, 0, 0, 0};  
		        int[] Y = {2, 3, 9};  
		        int m = 4;  
		        int n = 3;  
		        System.out.println("Original arrays:");
		        System.out.print("X[]: ");
		        printArray(X);
		        System.out.print("Y[]: ");
		        printArray(Y);
		        mergeArrays(X, Y, m, n);
		        System.out.println("Merged array:");
		        printArray(X);
		    }
		}


