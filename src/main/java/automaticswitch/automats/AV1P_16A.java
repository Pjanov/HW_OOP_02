package automaticswitch.automats;


public class AV1P_16A extends AV1P implements General{
    private final String NOMINAL_CURRENT = "16A";

    public AV1P_16A(String manufacturer, String characteristic, String marking) {
        super(manufacturer, characteristic, marking);
    }

    @Override
    public String toString() {
        return super.getCharacteristic() + " " + NOMINAL_CURRENT;
    }

    @Override
    public String getNOMINAL_CURRENT() {
        return NOMINAL_CURRENT;
    }

}
