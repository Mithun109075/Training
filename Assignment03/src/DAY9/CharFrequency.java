package DAY9;
public class CharFrequency {
    public static void main(String[] args) {

        String str = "programming";
        int[] freq = new int[256];   // array for ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character Frequencies:");

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] != 0) {
                System.out.println(str.charAt(i) + " : " + freq[str.charAt(i)]);
                freq[str.charAt(i)] = 0; // avoid repeating
            }
        }
    }
}