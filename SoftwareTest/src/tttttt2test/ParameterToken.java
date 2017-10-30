package tttttt2test;
public class ParameterToken implements Token {
    private String value;

    public ParameterToken(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getParameterValue() {
        return value;
    }

    @Override
    public String toString() {
        return "<ParameterToken:" + value + ">";
    }
}
