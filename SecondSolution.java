import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int m = scanner.nextInt();
	int[][] matrix = new int[n][m];
	int[][] rotate = new int[m][n];
	int[][] arr = new int[m][n];
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			matrix[i][j] = scanner.nextInt();
		}
	}
	for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            rotate[i][j] = matrix[j][i];
        }
    }

        for (int i = 0; i < m; i++) {
        	int index = n - 1;
            for (int j = 0; j < n; j++) {
                arr[i][j] = rotate[i][index];
                index--;
            }
        }


//		for (int[] x:matrix) {
//			System.out.println(Arrays.toString(x));
//		}
//		for (int[] x:arr) {
//			System.out.println(Arrays.toString(x));
//		}
		for (int i = 0; i < m; i++) {         //this equals to the row in our matrix.
			for (int j = 0; j < n; j++) {   //this equals to the column in each row.
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); //change line on console as row comes to end in the matrix.
		}
    }
}
