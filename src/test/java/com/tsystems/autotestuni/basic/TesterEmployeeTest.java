package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterEmployeeTest {

    @Test
    void testConstructor() {
        final var testerEmployee = new TesterEmployee();
        assertEquals(Position.JUNIOR, testerEmployee.getCurrentPosition(),
                "Field currentPosition should have a default value Position.JUNIOR");
    }

    @Test
    void toNewPosition() {
        final var testerEmployee = new TesterEmployee();

        Object o = testerEmployee;
        assertTrue(o instanceof QualificationGrowth,
                "Class TesterEmployee should implement interface QualificationGrowth");

        assertEquals(Position.JUNIOR, testerEmployee.getCurrentPosition(),
                "Field currentPosition should have a default value Position.JUNIOR");
        testerEmployee.toNewPosition();
        assertEquals(Position.MIDDLE, testerEmployee.getCurrentPosition(),
                "Field currentPosition should have a value Position.MIDDLE");
        testerEmployee.toNewPosition();
        assertEquals(Position.SENIOR, testerEmployee.getCurrentPosition(),
                "Field currentPosition should have a value Position.SENIOR");
        testerEmployee.toNewPosition();
        assertEquals(Position.EXPERT, testerEmployee.getCurrentPosition(),
                "Field currentPosition should have a value Position.EXPERT");
        testerEmployee.toNewPosition();
        assertEquals(Position.ARCHITECT, testerEmployee.getCurrentPosition(),
                "Field currentPosition should have a value Position.ARCHITECT");
        testerEmployee.toNewPosition();
        assertEquals(Position.ARCHITECT, testerEmployee.getCurrentPosition(),
                "The value Position.ARCHITECT shouldn't be changed after toNewPosition() is called");
    }
}