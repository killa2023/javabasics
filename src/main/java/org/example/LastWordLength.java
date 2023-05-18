public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        // Remove any trailing whitespace from the string
        s = s.trim();

        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(" ");

        // If there are no spaces in the string, then the whole string is the last word
        if (lastSpaceIndex == -1) {
            return s.length();
        }

        // Otherwise, the last word starts after the last space in the string
        int lastWordStartIndex = lastSpaceIndex + 1;

        // Return the length of the last word
        return s.substring(lastWordStartIndex).length();
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        int length1 = lengthOfLastWord(s1);
        System.out.println("Input: " + s1);
        System.out.println("Output: " + length1);

        String s2 = "luffy is still joyboy";
        int length2 = lengthOfLastWord(s2);
        System.out.println("Input: " + s2);
        System.out.println("Output: " + length2);
    }
}
