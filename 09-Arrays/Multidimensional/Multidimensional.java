public class Multidimensional {
    public static void main(String[] args) {
        int[][] data = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
             };

        for (int i = 0; i < data.length; i++) {
            for (int j=0; j < data[i].length; j++) {
                System.out.printf("%3d", data[i][j] * data[i][j]);
            }
            System.out.printf("\\n");
        }
    }
}