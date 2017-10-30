package tttttt2test;
public class ParameterConsumptionBuilder {
    private boolean no_parameters = false;
    private boolean toggle_value = false;
    private boolean single_parameter = false;
    private boolean until_delimiter = false;
    private boolean all_available = false;
    private boolean sub_set = false;
    private boolean loose_args = false;
    private String delimiter = null;
    private Class<?> subsetClass = null;

    public void addNoArgs(boolean value) {
        no_parameters = true;
        this.toggle_value = value;
    }

    public void addSingleParameter() {
        single_parameter = true;
    }

    public void addUntilDelimiter(String delimiter) {
        until_delimiter = true;
        this.delimiter = delimiter;
    }

    public void addAllAvailable() {
        all_available = true;
    }

    public void addLooseArgs() {
        loose_args = true;
    }

    public void addSubSet(Class<?> subsetClass) {
        this.sub_set = true;
        this.subsetClass = subsetClass;
    }

    public ParameterConsumption getParameterConsumption() {
        int parameterConsumptionTypeCounter = 0;
        if (no_parameters) parameterConsumptionTypeCounter++;
        if (single_parameter) parameterConsumptionTypeCounter++;
        if (until_delimiter) parameterConsumptionTypeCounter++;
        if (all_available) parameterConsumptionTypeCounter++;
        if (sub_set) parameterConsumptionTypeCounter++;
        if (loose_args) parameterConsumptionTypeCounter++;
        if (parameterConsumptionTypeCounter == 0) {
            throw new InvalidOptionConfigurationException("No parameter consumption type specified");
        }
        if (parameterConsumptionTypeCounter > 1) {
            throw new InvalidOptionConfigurationException("Multiple parameter consumption types specified");
        }

        if (no_parameters) {
            return new ParameterConsumption(ParameterConsumptionType.NO_ARGS, toggle_value);
        }
        if (single_parameter) {
            return new ParameterConsumption(ParameterConsumptionType.SINGLE_ARGUMENT);
        }
        if (until_delimiter) {
            return new ParameterConsumption(ParameterConsumptionType.UNTIL_DELIMITER, delimiter);
        }
        if (all_available) {
            return new ParameterConsumption(ParameterConsumptionType.ALL_AVAILABLE);
        }
        if (sub_set) {
            return new ParameterConsumption(ParameterConsumptionType.SUB_SET, subsetClass);
        }
        if (loose_args) {
            return new ParameterConsumption(ParameterConsumptionType.LOOSE_ARGS);
        }
        throw new InternalErrorException("Internal error: no matching parameter consumption types");
    }

}