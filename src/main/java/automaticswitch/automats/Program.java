package automaticswitch.automats;

import automaticswitch.conductor.Conductor;
import automaticswitch.conductor.PuGV1_5mm;
import automaticswitch.conductor.PuGV2_5mm;

public class Program {
    public static void main(String[] args) {

        AV1P av1P_25A0 = new AV1P_25A("Schneider Electric", "B", "QF1");
        AV1P av1P_16A1 = new AV1P_16A("Schneider Electric", "C", "Q1");
        AV1P av1P_16A2 = new AV1P_16A("Schneider Electric", "C", "Q2");
        AV1P av1P_25A3 = new AV1P_25A("Schneider Electric", "B", "Q3");

        Conductor c2_5mm1 = new PuGV2_5mm("Prysmian", "Белый");
        Conductor c2_5mm2 = new PuGV2_5mm("Prysmian", "Белый");
        Conductor c2_5mm3 = new PuGV2_5mm("Prysmian", "Белый");

        c2_5mm1.conductorStart(av1P_25A0);
        c2_5mm1.conductorFinish(av1P_16A1);
        c2_5mm2.jumperStart(av1P_16A1);
        c2_5mm2.jumperFinish(av1P_16A2);
        c2_5mm3.jumperStart(av1P_16A2);
        c2_5mm3.jumperFinish(av1P_25A3);

        System.out.println(av1P_25A0.info());
        System.out.println(av1P_16A1.info());
        System.out.println(av1P_16A2.info());
        System.out.println(av1P_25A3.info());
        System.out.println(c2_5mm1.info());
        System.out.println(c2_5mm2.info());
        System.out.println(c2_5mm3.info());
    }
}
