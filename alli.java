package problems;
import java.util.*;

class alli {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			// ARRAY
			int a[] = {10, 45, 20, 90, 60};

			// 1. Sum of all numbers
			int sum = 0;
			for(int i = 0; i < a.length; i++) {
			    sum = sum + a[i];
			}
			System.out.println("Sum = " + sum);


			// 2. Second largest number
			int largest = a[0];
			int second = a[0];

			for(int i = 0; i < a.length; i++) {

			    if(a[i] > largest) {
			        second = largest;
			        largest = a[i];
			    }
			    else if(a[i] > second && a[i] != largest) {
			        second = a[i];
			    }
			}

			System.out.println("Second Largest = " + second);


			// 3. Compare two strings
			System.out.print("Enter first string: ");
			String s1 = sc.next();

			System.out.print("Enter second string: ");
			String s2 = sc.next();

			if(s1.equals(s2)) {
			    System.out.println("Strings are equal");
			}
			else {
			    System.out.println("Strings are not equal");
			}
		}
    }
}