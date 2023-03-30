package type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntegerPartTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        IntegerPart.main(null);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "2" + ln
        ));
    }
}