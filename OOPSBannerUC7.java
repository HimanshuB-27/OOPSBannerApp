public class OOPSBannerUC7 {

    /**
     * Inner static class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to get pattern by character
     */
    public static String[] getCharacterPattern(CharacterPatternMap[] patterns, char ch) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7];
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {
            new CharacterPatternMap('O', new String[]{
                " ******* ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " ******* "
            }),
            new CharacterPatternMap('P', new String[]{
                " ******** ",
                " *      * ",
                " *      * ",
                " ******** ",
                " *        ",
                " *        ",
                " *        "
            }),
            new CharacterPatternMap('S', new String[]{
                " ******* ",
                " *     * ",
                " *       ",
                " ******* ",
                "       * ",
                " *     * ",
                " ******* "
            })
        };

        String text = "OOPS";

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = getCharacterPattern(patterns, ch);
                line.append(pattern[i]).append(" ");
            }

            banner[i] = line.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}