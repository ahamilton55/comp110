public class ParseInt {
    public static void main(String[] args) {
        String arg = "19230a92";
        int n = 0;

        char[] c = arg.toCharArray();

        for(int i = c.length-1, p = 1; i >= 0 ; i--, p *= 10) {
            if(c[i] < '0' || c[i] > '9') {
                System.out.println("Invalid integer");
                System.exit(1);
            }

            n += (c[i] - '0') * p;
        }
        System.out.println(n);
    }
}