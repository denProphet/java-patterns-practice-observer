package com.company.observersTesting.data;

public class Letters {
    public char[] lettersOfClass = {
            'А', 'Б', 'В', 'Г', 'Д', 'Е',
    };


    public static char getRandomLetterOfClass() {
        Letters letters = new Letters();
        return letters.lettersOfClass[(int) (Math.random() * (letters.lettersOfClass.length))];
    }
}

