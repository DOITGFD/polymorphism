import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[] rowS = new int[3];
        int[] colS = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
                rowS[i] += arr[i][j]; 
                colS[j] += arr[i][j]; 
            }
        }

        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i + 1) + " sum: " + rowS[i]);
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Column " + (j + 1) + " sum: " + colS[j]);
        }

        System.out.println("Maximum element: " + max);

        System.out.println("Transposed matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}