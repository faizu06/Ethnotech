import java.util.Scanner;

public class Student{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][];
        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\n Student " + (i + 1) + " (" + marks[i].length + " Subject/s):");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("  Enter Subject " + (j + 1) + " Marks : ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            double average = 0;

            System.out.print(" Student " + (i + 1) + " Marks  : ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
                total += marks[i][j];
            }

            average = (double) total / marks[i].length;

            System.out.println();
            System.out.println(" Total          : " + total);
            System.out.printf(" Average        : %.2f%n", average);
           }
        sc.close();
    }
}
