package type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MathPowTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        MathPow.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "9.0" + ln
        ));
    }
}