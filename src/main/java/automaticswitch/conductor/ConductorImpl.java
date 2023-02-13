package automaticswitch.conductor;

import automaticswitch.automats.AV1P;

public interface ConductorImpl<T> {
    T getSECTION();

    String conductorStart(AV1P av);

    String conductorFinish(AV1P av);
}
