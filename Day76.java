public class Day76 {
    public static void main(String[] args) {
        String a = "belajar java";
        String b = "BELAJAR JAVA";
        String c = "";
        System.out.println(a.equals(b));
        System.out.println(b.equalsIgnoreCase(a));
        System.out.println(a.contains("java"));
        System.out.println(c.isEmpty());
    }
}
