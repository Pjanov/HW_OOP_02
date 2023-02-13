package automaticswitch.conductor;


public class PuGV1_5mm extends Conductor implements ConductorImpl {
    private final String SECTION = "1.5mm";

    public PuGV1_5mm(String manufacturer, String color) {
        super(manufacturer, color);
    }

    @Override
    public String getSECTION() {
        return SECTION;
    }

}
