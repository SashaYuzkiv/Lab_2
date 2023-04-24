public class BetweenLetterSpacesRemover {
    public String removeNonLetterSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        boolean inBetweenLetters = false;
        boolean previousCharIsLetter = false;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (inBetweenLetters && !previousCharIsLetter) {
                    sb.append(" ");
                }
                sb.append(c);
                inBetweenLetters = true;
                previousCharIsLetter = true;
            } else if (c == ' ') {
                if (inBetweenLetters) {
                    sb.append(c);
                }
                inBetweenLetters = false;
            } else {
                previousCharIsLetter = false;
            }
        }

        return sb.toString();
    }
}
