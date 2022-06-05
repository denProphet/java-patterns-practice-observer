package com.company.observersTesting.data;

public class Names {

    public String[] maleNames = {
            "Никита",
            "Илья",
            "Алексей",
            "Вова",
            "Витаклик",
    };

    public String[] femaleNames = {
            "Саша",
            "Леся",
            "Диана",
            "Дарина",
            "Катя",
            "Тая",

    };

    public static String getRandomNameDependingOnGender(boolean isMale) {
        Names names = new Names();
        if (isMale) {
            return names.maleNames[(int) (Math.random() * (names.maleNames.length))];
        } else {
            return names.femaleNames[(int) (Math.random() * (names.femaleNames.length))];
        }
    }
}
