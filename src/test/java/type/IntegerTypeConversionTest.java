package type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntegerTypeConversionTest {
    @Test
    public void testOut() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerTypeConversion.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln +
                        "1" + ln
        ));
    }
}