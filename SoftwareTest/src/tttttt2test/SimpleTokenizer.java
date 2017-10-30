package tttttt2test;
public class SimpleTokenizer implements Tokenizer {

	private PeekIterator<String> stringIterator;
	private boolean parameterEscapeEncountered = false;
	private String parameterTerminator = null;

	public SimpleTokenizer(PeekIterator<String> stringIterator) {
		this.stringIterator = stringIterator;
	}

	public void setParameterTerminator(String parameterTerminator) {
		this.parameterTerminator = parameterTerminator;
	}

	public boolean hasNext() {
		return stringIterator.hasNext();
	}

	public Token peek() {
		String value = stringIterator.peek();
		return makeToken(value);
	}

	public Token next() {
		String value = stringIterator.next();
		return makeToken(value);
	} 

	private Token makeToken(String value) {
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
		if (!parameterEscapeEncountered && isSwitch(value)) {
			return new SwitchToken(value.substring(1), value);
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

}