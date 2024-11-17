import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

class ExtendedStringTokenizer extends StringTokenizer {

    private ArrayList<String> tokens = new ArrayList<>();
    private HashSet<String> seenTokens = new HashSet<>();

    public ExtendedStringTokenizer(String string, String delimiter) {
        super(string, delimiter);
    }

    public ExtendedStringTokenizer(String string) {
        super(string);
    }

    @Override
    public String nextToken() {
        String token = super.nextToken();

        tokens.add(token);

        return token;
    }

    public String[] nonrepeatingTokens() {
        ArrayList<String> nrTokens = new ArrayList<>();

        for (String token : tokens) {
            if (!seenTokens.contains(token)) {
                seenTokens.add(token);
                nrTokens.add(token);
            }
        }

        return nrTokens.toArray(new String[0]);
    }
}
