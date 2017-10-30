package tttttt2test;


public class ParameterConsumption {
    private ParameterConsumptionType type;
    private String delimiter;
    private boolean toggleValue;
    private Class<?> subsetClass;

    public ParameterConsumption(ParameterConsumptionType type) {
        this.type = type;
    }

    public ParameterConsumption(ParameterConsumptionType type, String delimiter) {
        this.type = type;
        this.delimiter = delimiter;
    }

    public ParameterConsumption(ParameterConsumptionType type, boolean toggleValue) {
        this.type = type;
        this.toggleValue = toggleValue;
    }

    public ParameterConsumption(ParameterConsumptionType type, Class<?> subsetClass) {
        this.type = type;
        this.subsetClass = subsetClass;
    }

    public ParameterConsumptionType getType() {
        return type;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public Class<?> getSubsetClass() {
        return subsetClass;
    }

    public boolean getToggleValue() {
        return toggleValue;
    }
}