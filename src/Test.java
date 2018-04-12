public class Test {
    public static void main(String[] args) {

        int remainder = 2;
        String key = "QWERTYUIOPASDFGHJKLZXCVBNM";
        char letter = key.charAt(--remainder);
        System.out.println(letter);
    }
}
