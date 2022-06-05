package com.company.observersTesting;

import com.company.observersTesting.data.Cities;
import com.company.observersTesting.data.KindergartenNames;
import com.company.observersTesting.data.Letters;
import com.company.observersTesting.data.Names;
import com.company.observersTesting.observers.IHumanObserver;

import java.time.LocalDateTime;
import java.util.Random;

public class HumanLifecycle {

    private final boolean isMale;
    private IHumanObserver[] observers;

    public HumanLifecycle() {
        this.isMale = new Random().nextBoolean();
    }


    public void lifeCycle() {
        System.out.println("\tРождение");
        doBirth();
        System.out.println("\n\tХождение в садик");
        doGoingToKindergarten();
        System.out.println("\n\tХождение в школу");
        doGoingToSchool();
        System.out.println("\n\tХождение в университет");
        doGoingToUniversity();
        System.out.println("\n\tСоздание семьи");
        doCreatingFamily();
        System.out.println("\n\tРождение детей");
        doGiveBirthToChildren();
        System.out.println("\n\tСмерть");
        doDie();
    }

    private void doBirth() {
        final LocalDateTime timeOfBirth = LocalDateTime.now();
        final double height = Math.random() * (60 - 30) + 30;
        final double weight = Math.random() * (1 - 5) + 1;
        final Cities locationOfBirth = Cities.values()[new Random().nextInt(Cities.values().length)];
        for (IHumanObserver observer : observers) {
            System.out.print(observer.getObserverName() + ": ");
            observer.onBirth(isMale, timeOfBirth, height, weight, locationOfBirth);
        }

    }

    private void doGoingToKindergarten() {

        final KindergartenNames kindergartenName = KindergartenNames.values()
                [new Random().nextInt(KindergartenNames.values().length)];
        for (IHumanObserver observer : observers) {
            System.out.print(observer.getObserverName() + ": ");
            observer.onGoingToKindergarten(kindergartenName);
        }


    }

    private void doGoingToSchool() {
        final int schoolNumber = (int) (Math.random() * (100 - 1) + 1);
        final char groupLetterIndex = Letters.getRandomLetterOfClass();
        for (IHumanObserver observer : observers) {
            System.out.print(observer.getObserverName() + ": ");
            observer.onGoingToSchool(schoolNumber, groupLetterIndex);
        }
    }

    private void doGoingToUniversity() {
        final int speciality = (int) (Math.random() * (300 - 1) + 1);
        //TODO Переделать в random
        final String university = "Karazin";
        final boolean isFeePaying = new Random().nextBoolean();
        for (IHumanObserver observer : observers) {
            System.out.print(observer.getObserverName() + ": ");
            observer.onGoingToUniversity(university, speciality, isFeePaying);
        }
    }

    private void doCreatingFamily() {

        final String spouseName = Names.getRandomNameDependingOnGender(isMale);
        final Cities locationOfMarrying = Cities.values()[new Random().nextInt(Cities.values().length)];
        final LocalDateTime timeOfMarrying = LocalDateTime.now();
        for (IHumanObserver observer : observers) {
            System.out.print(observer.getObserverName() + ": ");
            observer.onCreatingFamily(spouseName, timeOfMarrying, locationOfMarrying);
        }
    }

    private void doGiveBirthToChildren() {
        final int childrenCount = (int) (Math.random() * (5 - 1) + 1);
        for (IHumanObserver observer : observers) {
            System.out.print(observer.getObserverName() + ": ");
            observer.onGivingBirthToChildren(childrenCount);
        }
    }

    private void doDie() {
        final LocalDateTime timeOfDeath = LocalDateTime.now();
        final Cities locationOfDeath = Cities.values()[new Random().nextInt(Cities.values().length)];
        for (IHumanObserver observer : observers) {
            System.out.print(observer.getObserverName() + ": ");
            observer.onDeath(timeOfDeath, locationOfDeath);
        }
    }

    public IHumanObserver[] getObservers() {
        return observers;
    }

    public void setObservers(IHumanObserver[] observers) {
        this.observers = observers;
    }
}
