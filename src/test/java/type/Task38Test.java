package type;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Task38Test {
    /*Для согласовоности платформы с сиволом новой строки*/
    public String ln = System.lineSeparator();

    @Test
    public void when1234Then2340() {
        /*Для захвата вывода в консоль и сохранене его в байтовый массив*/
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        /*через setOut для изменения стандартного вывода выведим out через
         * PrintStream для печати выводного потока*/
        System.setOut(new PrintStream(out));
        Task38.leftShift(1234);
        String expected = "2340" + ln;
        /* assertThat  из JUnit для выполнения
        утверждений в тестах фактически -out  проверям с помошью toString()
         ожидаемое значение is(expected)*/
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1000Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1000);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1060Then600() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1060);
        String expected = "600" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when1006Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.leftShift(1006);
        String expected = "60" + ln;
        assertThat(out.toString(), is(expected));
    }
}