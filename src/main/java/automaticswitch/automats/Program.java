package automaticswitch.automats;

import automaticswitch.conductor.Conductor;
import automaticswitch.conductor.PuGV1_5mm;
import automaticswitch.conductor.PuGV2_5mm;

public class Program {
    public static void main(String[] args) {

        AV1P av1P_16A = new AV1P_16A("Schneider Electric", "C", "Q1");
        AV1P av1P_25A = new AV1P_25A("Schneider Electric", "B", "Q2");

        System.out.println(av1P_16A.getCONTACT_1());
        System.out.println(av1P_16A.getCONTACT_2());

        System.out.println(av1P_25A.getCONTACT_2());

        Conductor c1_5mm = new PuGV1_5mm("Prysmian", "Белый");
        Conductor c2_5mm = new PuGV2_5mm("Prysmian", "Синий");

        System.out.println(c1_5mm);
        System.out.println(c2_5mm);

        System.out.println(c2_5mm.conductorStart(av1P_16A));
        System.out.println(c1_5mm.conductorFinish(av1P_25A));
    }

}
