package com.tsystems.autotestuni.basic;

/**
 * Given:
 * - enum {@link Position};
 * - class {@link TesterEmployee} with a field {@code currentPosition} of type {@link Position};
 * - interface {@link QualificationGrowth}.
 *
 * Required:
 * 1. The field {@code currentPosition} gets a value {@link Position.JUNIOR} when an object of {@link TesterEmployee}
 *    is created.
 * 2. Make it so that class {@link TesterEmployee} implemented interface {@link QualificationGrowth}
 * 3. Implement the method {@code toNewPosition()} in such way that a value of the field {@code currentPosition}
 *    was changed to the next in enum {@link Position}. For example, {@link Position.JUNIOR} -> {@link Position.MIDDLE},
 *    {@link Position.MIDDLE} -> {@link Position.SENIOR} etc.
 *    Te value {@link Position.ARCHITECT} should not be changed.
 */
public class TesterEmployee implements QualificationGrowth {

    private Position currentPosition;

    public TesterEmployee() {
        currentPosition = Position.JUNIOR;
    }

    @Override
    public void toNewPosition() {
        if (currentPosition == Position.ARCHITECT) {
            return;
        }
        Position[] positions = Position.values();
        currentPosition = positions[ currentPosition.ordinal() + 1 ];
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
