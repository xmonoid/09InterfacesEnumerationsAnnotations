package com.tsystems.autotestuni.advanced;

/**
 * Given:
 * - enum {@link EnglishLevel}
 * - interface {@link IDescription}
 *
 * Required:
 * 1. Create a constructor for the enum to assign a corresponding description to each enum value:
 *    A0 -> beginner
 *    A1 -> elementary
 *    A2 -> pre-intermediate
 *    B1 -> intermediate
 *    B2 -> upper-intermediate
 *    C1 -> advanced
 *    C2 -> proficient
 *
 * 2. Make {@link EnglishLevel} to implement {@link IDescription} and
 *    do implement its {@code getDescription()} method to pass {@code getDescriptionTest()} test.
 *
 * 3. Implement {@code nextLevels()} method the next way:
 *    it should return an array which contains all levels above the passed one;
 *    for example:
 *        nextLevels(A0) -> {A1, A2, B1, B2, C1, C2}
 *        nextLevels(B1) -> {B2, C1, C2}
 *        nextLevels(C2) -> {}  // an empty array
 */
public enum EnglishLevel implements IDescription {

    A0("beginner"),
    A1("elementary"),
    A2("pre-intermediate"),
    B1("intermediate"),
    B2("upper-intermediate"),
    C1("advanced"),
    C2("proficient");

    private String description;

    EnglishLevel(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static EnglishLevel[] nextLevels(EnglishLevel currentLevel) {
        EnglishLevel[] levels = EnglishLevel.values();
        int count = 0;
        for (EnglishLevel level : levels) {
            if (level.ordinal() > currentLevel.ordinal()) {
                count++;
            }
        }
        EnglishLevel[] result = new EnglishLevel[count];
        for (int i = 0; i < count; i++) {
            result[i] = levels[i + levels.length - count];
        }
        return result;
    }
}
