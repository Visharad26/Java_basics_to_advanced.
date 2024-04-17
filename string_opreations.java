public class string_opreations {
    // Function equalsIgnoreCase
    public static void main(String[] args) {
        String str = "HEllO";
        String str1 = "hELLo";
        System.out.println(str.equalsIgnoreCase(str1));

        // Function upperCase

        String a1 = "hello";
        String a2 = "HEllo";
        System.out.println(a1.toUpperCase());
        System.out.println(a2.toUpperCase());
        // SubString Operations
        String b1 = "Geeks for Geeks";
        String slice_1 = b1.substring(2, 8);
        String slice_2 = b1.substring(1);
        System.out.println(slice_1);
        System.out.println(slice_2);

    }
}
