package tttttt2test;

import java.util.LinkedList;

public class TokenQueue {

	private PeekIterator<String> iterator;
	private LinkedList<Token> tokens = new LinkedList<Token>();
	private PeekIterator<String> stringIterator;
	private boolean parameterEscapeEncountered = false;
	private String parameterTerminator = null;
	private LinkedList<SwitchToken> splitTokens = new LinkedList<SwitchToken>();

	public boolean hasMore() {
		return !tokens.isEmpty() && !iterator.hasNext();
	}

}
