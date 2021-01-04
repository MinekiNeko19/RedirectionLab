public class PigLatin {
    public static String pigLatinSimple(String s) {
        String translated = s;
        if (s.charAt(0) != 'a' && s.charAt(0) != 'e' &&
        s.charAt(0) != 'i' && s.charAt(0) != 'o' && s.charAt(0) != 'u') {
            translated = s.substring(1) + s.charAt(0) + "ay";
        } else {
            translated += "hay";
        }
        return translated;
    }
    public static void main(String[] args) {
        System.out.println(pigLatinSimple("aaron"));
    }
}
