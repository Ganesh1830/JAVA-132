package lop;
import java.util.Scanner;

public class StudentMarksProject {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of students: ");
			int n = sc.nextInt();

			int marks[] = new int[n];

			// input marks
			for(int i = 0; i < n; i++) {
			    System.out.print("Enter marks of student " + (i+1) + ": ");
			    marks[i] = sc.nextInt();
			}

			int sum = 0;
			int max = marks[0];
			int min = marks[0];
			int pass = 0;
			int fail = 0;

			// process array
			for(int i = 0; i < n; i++) {

			    sum = sum + marks[i];

			    if(marks[i] > max) {
			        max = marks[i];
			    }

			    if(marks[i] < min) {
			        min = marks[i];
			    }

			    if(marks[i] >= 35) {
			        pass++;
			    } else {
			        fail++;
			    }
			}

			double avg = sum / n;

			// output
			System.out.println("\n------ RESULT ------");
			System.out.println("Total = " + sum);
			System.out.println("Average = " + avg);
			System.out.println("Highest = " + max);
			System.out.println("Lowest = " + min);
			System.out.println("Pass = " + pass);
			System.out.println("Fail = " + fail);
		}
    }
}