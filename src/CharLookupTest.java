public class CharLookupTest {
    public static void main(String[] args) {

        int remainder = 1;
        String key = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letter = key.charAt(--remainder);
        System.out.println(letter);
    }
}
