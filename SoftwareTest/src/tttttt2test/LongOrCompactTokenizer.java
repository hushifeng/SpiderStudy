package tttttt2test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LongOrCompactTokenizer implements Tokenizer {

    private PeekIterator<String> stringIterator;
    private boolean parameterEscapeEncountered = false;
    private String parameterTerminator = null;
    private LinkedList<SwitchToken> splitTokens = new LinkedList<SwitchToken>();

    public LongOrCompactTokenizer(PeekIterator<String> stringIterator) {
        this.stringIterator = stringIterator;
    }

    public void setParameterTerminator(String parameterTerminator) {
        this.parameterTerminator = parameterTerminator;
    } 

    public boolean hasNext() {
        return stringIterator.hasNext();
    }

    public Token peek() {
        if (!splitTokens.isEmpty()) {
            return splitTokens.peek();
        }
        String value = stringIterator.peek();

        if (parameterEscapeEncountered) {
            return new ParameterToken(value);
        }

        if (value.equals(parameterTerminator)) {
            return new ParameterToken(value);
        }
        if (parameterTerminator != null) {
            return new ParameterToken(value);
        }
        if (isParameterEscape(value)) {
            parameterEscapeEncountered = true;
            return peek();
        }
        if (isSwitch(value)) {
            if (isShortSwitchList(value)) {
                List<SwitchToken> tokens = splitSwitchTokens(value);
                return tokens.get(0);
            } else {
                return new SwitchToken(value.substring(2), value);
            }
        } else {
            return new ParameterToken(value);
        }
    }

    public Token next() {
        if (!splitTokens.isEmpty()) {
            return splitTokens.remove();
        }
        String value = stringIterator.next();

        if (parameterEscapeEncountered) {
            return new ParameterToken(value);
        }

        if (value.equals(parameterTerminator)) {
            parameterTerminator = null;
            return new ParameterToken(value);
        }
        if (parameterTerminator != null) {
            return new ParameterToken(value);
        }
        if (isParameterEscape(value)) {
            parameterEscapeEncountered = true;
            return next();
        }
        if (isSwitch(value)) {
            if (isShortSwitchList(value)) {
                splitTokens.addAll(splitSwitchTokens(value));
                return splitTokens.remove();
            } else {
                return new SwitchToken(value.substring(2), value);
            }
        } else {
            return new ParameterToken(value);
        }
    }

    public void remove() {
        stringIterator.remove();
    }

    private boolean isSwitch(String parameter) {
        return parameter.matches("-.*");
    }

    private boolean isParameterEscape(String value) {
        return ("--".equals(value) && !parameterEscapeEncountered);
    }

    private boolean isLongSwitch(String value) {
        return value.matches("--..*");
    }

    private boolean isShortSwitchList(String value) {
        return value.matches("-[^-].*");
    }

    private List<SwitchToken> splitSwitchTokens(String value) {
        ArrayList<SwitchToken> tokens = new ArrayList<SwitchToken>();
        for (int i = 1; i < value.length(); i++) {
            tokens.add(new SwitchToken(String.valueOf(value.charAt(i)), value));
        }
        return tokens;
    }

}