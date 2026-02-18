public class StringManipulation {
    public static void main(String[] args) {

        String str = "HelloWorld";

        // i. Find length
        System.out.println("Length: " + str.length());

        // ii. Character at second and fourth position
        System.out.println("Character at second position: " + str.charAt(1));
        System.out.println("Character at fourth position: " + str.charAt(3));

        // iii. Substring using start index only
        System.out.println("Substring (start index 5): " + str.substring(5));

        // iv. Substring using start and end index
        System.out.println("Substring (2 to 7): " + str.substring(2, 7));

        // v. Concatenate strings
        String str2 = "Java";
        String result = str.concat(str2);
        System.out.println("Concatenated String: " + result);

        // vi. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // vii. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
