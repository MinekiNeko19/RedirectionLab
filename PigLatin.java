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

    public static String pigLatin(String s) {
        String[] diagraphs = new String[]{"bl", "br", "ch", "ck", "cl", "cr", 
        "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", 
        "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", 
        "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
        boolean diagraph = false;

        for (int i = 0; i < diagraphs.length && !diagraph; i++) {
            if (s.substring(0, 2).equals(diagraphs[i])) diagraph = true;
        }
        if (diagraph==true) {
            return s.substring(2) + s.substring(0,2) + "ay";
        } else {
            return pigLatinSimple(s);
        }
    }

    public static String pigLatinBest(String s) {
        if (s.toLowerCase().charAt(0) >= 97) {
            if (!(s.toLowerCase().charAt(s.length()-1) >= 97)) {
                return pigLatin(s.substring(0, s.length()-1)) + s.charAt(s.length()-1);
            } else {
                return pigLatin(s);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(pigLatinSimple("emu"));
        System.out.println(pigLatin("emu"));
        System.out.println(pigLatinBest("apple%"));
    }
}
