package tttttt2test;

import java.util.Iterator;

public interface Tokenizer extends Iterator<Token> {

	public void setParameterTerminator(String parameterTerminator);

	public boolean hasNext();

	public Token peek();

	public Token next();

	public void remove();
}