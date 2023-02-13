package automaticswitch.conductor;

public class PuGV2_5mm extends Conductor implements ConductorImpl{
    private final String SECTION = "2.5mm";

    public PuGV2_5mm(String manufacturer, String color) {
        super(manufacturer, color);
    }

    @Override
    public String getSECTION() {
        return SECTION;
    }
}
