package type;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class Task13Test {
    @Test
    public void when15DollarsThen912dot75RUB() {
        ByteArrayInputStream in = new ByteArrayInputStream("15 60.85".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task13.main(null);
        String expected = "912.75";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5DollarsThen5dot05EUR() {
        ByteArrayInputStream in = new ByteArrayInputStream("5 1.01".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task13.main(null);
        String expected = "5.05";
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when50DollarsThen43dot37GBP() {
        ByteArrayInputStream in = new ByteArrayInputStream("50 0.87".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task13.main(null);
        String expected = "43.50";
        assertThat(out.toString(), is(expected));
    }
}
