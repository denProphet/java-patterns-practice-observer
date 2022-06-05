package com.company.observersTesting;

import com.company.observersTesting.observers.Brother;
import com.company.observersTesting.observers.Grandma;
import com.company.observersTesting.observers.IHumanObserver;
import com.company.observersTesting.observers.Mother;

public class Test {


    public static void main(String[] args) {
        HumanLifecycle human = new HumanLifecycle();
        Grandma grandma = new Grandma();
        Brother brother = new Brother();
        Mother mother = new Mother();
        IHumanObserver[] observers = {
                mother,
                brother,
                grandma
        };

        human.setObservers(observers);
        human.lifeCycle();
    }


}
