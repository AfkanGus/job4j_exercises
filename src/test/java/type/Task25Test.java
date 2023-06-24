package type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Task25Test {
    public String ln = System.lineSeparator();

    @Test
    public void when335Then300Plus30Plus5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task25.separate(335);
        String expected = "300+30+5" + ln;
        assertThat(out.toString(), is(expected));
    }
}