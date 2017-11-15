public class ReturnArray {
    public static void main(String[] args) {
        int[] b = getNums();

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] getNums() {
        int[] a = {1,2,3,4};
        return a;
    }
}