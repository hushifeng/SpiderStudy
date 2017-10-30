package tttttt2test;

public class SwitchToken implements Token {
	String value;
	String parameterValue;

	public SwitchToken(String value, String parameterValue) {
		this.value = value;
		this.parameterValue = parameterValue;
	}

	public String getValue() {
		return value;
	}

	public String getParameterValue() {
		return parameterValue;
	}

	public String toString() {
		return "<SwitchToken:" + value + "(" + parameterValue + ")>";
	}
}
