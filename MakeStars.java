import java.util.*;

public class MakeStars {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (n.hasNextLine()) {
            Scanner line = new Scanner(n.nextLine());
            while (line.hasNext()) {
                String word = line.next();
                for (int i = 0; i < word.length(); i++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
