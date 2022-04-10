package com.tsystems.autotestuni.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.tsystems.autotestuni.advanced.EnglishLevel.*;

class EnglishLevelTest {

    @Test
    void getDescriptionTest() {
        final var values = EnglishLevel.values();
        Object o = A0;
        assertTrue(o instanceof IDescription, "Enum EnglishLevel should implement IStringValue interface");
        IDescription stringValue = (IDescription) o;
        assertEquals("beginner", stringValue.getDescription());
        o = A1;
        stringValue = (IDescription) o;
        assertEquals("elementary", stringValue.getDescription());
        o = A2;
        stringValue = (IDescription) o;
        assertEquals("pre-intermediate", stringValue.getDescription());
        o = B1;
        stringValue = (IDescription) o;
        assertEquals("intermediate", stringValue.getDescription());
        o = B2;
        stringValue = (IDescription) o;
        assertEquals("upper-intermediate", stringValue.getDescription());
        o = C1;
        stringValue = (IDescription) o;
        assertEquals("advanced", stringValue.getDescription());
        o = C2;
        stringValue = (IDescription) o;
        assertEquals("proficient", stringValue.getDescription());
    }

    @Test
    void nextLevelsTest() {
        var levels = new EnglishLevel[] {A1, A2, B1, B2, C1, C2};
        assertArrayEquals(levels, nextLevels(A0));
        levels = new EnglishLevel[] {A2, B1, B2, C1, C2};
        assertArrayEquals(levels, nextLevels(A1));
        levels = new EnglishLevel[] {B1, B2, C1, C2};
        assertArrayEquals(levels, nextLevels(A2));
        levels = new EnglishLevel[] {B2, C1, C2};
        assertArrayEquals(levels, nextLevels(B1));
        levels = new EnglishLevel[] {C1, C2};
        assertArrayEquals(levels, nextLevels(B2));
        levels = new EnglishLevel[] {C2};
        assertArrayEquals(levels, nextLevels(C1));
        levels = new EnglishLevel[] {};
        assertArrayEquals(levels, nextLevels(C2));
    }
}