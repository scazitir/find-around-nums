import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CANADA);
        Scanner scan = new Scanner(System.in);

        System.out.print("Size of row: ");
        int row = scan.nextInt();
        System.out.print("Size of column: ");
        int col = scan.nextInt();

        int[][] mtx = new int[row][col];
        for (int i = 0; i < mtx.length; i++){
            for (int j = 0; j < mtx[i].length; j++){
                mtx[i][j] = scan.nextInt();
            }
        }

        System.out.print("\nNumber to be found: ");
        int num = scan.nextInt();

        for (int i = 0; i < mtx.length; i++){
            for (int j = 0; j < mtx[i].length; j++){
                if(mtx[i][j] == num){
                    System.out.println("\nPosition [" + i + "][" + j + "]:");
                    if (i > 0){
                        System.out.println("UP: " + mtx[i - 1][j]);
                    }
                    if (j > 0){
                        System.out.println("LEFT: " + mtx[i][j - 1]);
                    }
                    if (j < mtx[i].length - 1) {
                        System.out.println("RIGHT: " + mtx[i][j + 1]);
                    }
                    if (i < mtx.length - 1){
                        System.out.println("DOWN: " + mtx[i + 1][j]);
                    }
                }
            }
        }

        scan.close();
    }
}
