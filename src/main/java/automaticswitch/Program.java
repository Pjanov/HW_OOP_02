package automaticswitch;

public class Program {
    public static void main(String[] args) {
        AV1P av1P_16A = new AV1P_16A("Schneider Electric", "C");
        AV1P av1P_25A = new AV1P_25A("Schneider Electric", "B");

        System.out.println(av1P_16A);
        System.out.println(av1P_25A);
    }
}
