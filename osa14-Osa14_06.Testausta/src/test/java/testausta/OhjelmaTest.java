package testausta;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OhjelmaTest {
    
    Ohjelma ohjelma = new Ohjelma();

    @Test
    public void TestaaOikeaPalautus(){
        String tulos = "Pulloja: " + 6 + "\n"
                + "Oppilaita: " + 3 + "\n"
                + "Keskiarvo: " + 2.0;
        String actual = ohjelma.palautus(6,3);
        assertEquals(tulos, actual);
    }
}
