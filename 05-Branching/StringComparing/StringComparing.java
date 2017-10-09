public class StringComparing {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcD";
        String u = "abcd";

        String sameAsS = s; // Uses the same memory location as the variable s

        System.out.println("s == t: " + (s == t));
        System.out.println("s.equals(t): " + s.equals(t));
        System.out.println();

        System.out.println("s == u: " + (s == u));
        System.out.println("s.equals(u): " + s.equals(u));
        System.out.println();

        System.out.println("s == sameAsS: " + (s == sameAsS));
        System.out.println("s.equals(sameAsS): " + s.equals(sameAsS));
        System.out.println();
    }
}