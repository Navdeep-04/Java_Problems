import java.util.Arrays;

public class MatrixMultiply {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int[][] brr = {{4,3},{2,1}};
        int[][] trr = new int[2][2];
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                int a = 0;
                for (int k = 0; k < brr[i].length; k++)
                {
                    a += arr[i][k] * brr[k][j];
                }
                trr[i][j] = a;
            }
        }
        for(int[] m : trr) {
            System.out.println(Arrays.toString(m));
        }
    }
}
