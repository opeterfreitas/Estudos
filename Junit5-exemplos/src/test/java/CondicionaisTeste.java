import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {

    @Test
    // @EnabledIfEnvironmentVariable(named = "USER", matches = "fulano")
    //@DisabledIfEnvironmentVariable(named = "USER", matches = "fulano")
    //@EnabledOnOs(OS.WINDOWS)
    //@EnabledOnOs({OS.WINDOWS, OS.LINUX})
    //@EnabledOnJre(JAVA_17)
    //@EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsuarioPeter() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
