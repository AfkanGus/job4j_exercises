package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task12Test {
    @Test
    public void whenLocalClassThenFalse() {
        assertFalse(Task12.Nested.class.isLocalClass());
    }

    @Test
    public void whenMemberClassThenTrue() {
        assertTrue(Task12.Nested.class.isMemberClass());
    }

    @Test
    public void whenStaticThenFalse() {
        assertFalse(Modifier.isStatic(Task12.Nested.class.getModifiers()));
    }

    @Test
    public void whenAnonymousClassThenFalse() {
        assertFalse(Task12.Nested.class.isAnonymousClass());
    }
}