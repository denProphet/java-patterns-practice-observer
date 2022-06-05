package com.company.observersTesting.observers;

import com.company.observersTesting.data.Cities;
import com.company.observersTesting.data.KindergartenNames;

import java.time.LocalDateTime;

public class Mother implements IHumanObserver {
    final String observerName = "Мама";


    @Override
    public void onBirth(boolean isMale, LocalDateTime timeOfBirth, double height, double weight, Cities locationOfBirth) {
        if (isMale) System.out.println("У меня СЫН, Будет моим защитником");
        else System.out.println("УРА, у меня дочь. Воспитаю ее принцессой");

    }

    @Override
    public void onDeath(LocalDateTime timeOfDeath, Cities locationOfDeath) {
        System.out.println("Какое горе");

    }

    @Override
    public void onGoingToSchool(int schoolNumber, char groupLetterIndex) {
        if (groupLetterIndex == 'А') System.out.println("Будет учиться в таком же классе, как и я");
        else System.out.println("В любом случае, неважно какая буква у класса, главное образование");
    }

    @Override
    public void onGoingToKindergarten(KindergartenNames sadikName) {
        System.out.println("Мой ребенок уже в садике. Какой взрослый");
    }

    @Override
    public void onGoingToUniversity(String UniversityName, int speciality, boolean isFeePaying) {
        if (isFeePaying) System.out.println("Ничего что на контракте, главное чтобы выучился");
        else System.out.println("Какой умничка, ребенок на бюджете. Учись хорошо!");
    }

    @Override
    public void onCreatingFamily(String spouseName, LocalDateTime timeOfMarrying, Cities locationOfMarrying) {
        System.out.println("Наконец-то свадьба. Живите счастливо!");
    }

    @Override
    public void onGivingBirthToChildren(int childrenCount) {
        if (childrenCount == 0) System.out.println("Когда будут уже внуки");
        else System.out.println("Я буду лучшей бабушкой для таких внуков");
    }

    @Override
    public String getObserverName() {
        return observerName;
    }
}
