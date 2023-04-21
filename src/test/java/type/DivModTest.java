package type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DivModTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        DivMod.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "3" + ln
                        + "2" + ln
        ));
    }
}