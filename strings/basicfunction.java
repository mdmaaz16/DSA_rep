package strings;

public class basicfunction {
    public static void main(String[] args) {
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String str = new String(charArray);
        System.out.println(str); // Output: Hello

        String str1 = "Hello";
        char[] charArray1 = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c); // Output: Hello
        }

//         isDigit(char ch): Determines if the specified character is a digit.
// isLetter(char ch): Determines if the specified character is a letter.
// isLetterOrDigit(char ch): Determines if the specified character is a letter or digit.
// isLowerCase(char ch): Determines if the specified character is in lowercase.
// isUpperCase(char ch): Determines if the specified character is in uppercase.
// toLowerCase(char ch): Converts the specified character to lowercase.
// toUpperCase(char ch): Converts the specified character to uppercase.
// isWhitespace(char ch): Determines if the specified character is a whitespace character.
    }
}
