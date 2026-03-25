import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        printBanner("OOPS", patternMap);
    }

    /**
     * Builds and returns the character pattern map
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ******* ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " ******* "
        });

        map.put('P', new String[]{
            " ******** ",
            " *      * ",
            " *      * ",
            " ******** ",
            " *        ",
            " *        ",
            " *        "
        });

        map.put('S', new String[]{
            " ******* ",
            " *     * ",
            " *       ",
            " ******* ",
            "       * ",
            " *     * ",
            " ******* "
        });

        return map;
    }

    /**
     * Renders the banner for a given word
     */
    public static void printBanner(String text, Map<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }
}