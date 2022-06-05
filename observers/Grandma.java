package com.company.observersTesting.observers;

import com.company.observersTesting.data.Cities;
import com.company.observersTesting.data.KindergartenNames;

import java.time.LocalDateTime;

public class Grandma implements IHumanObserver {
    final String observerName = "Бабушка";

    @Override
    public void onBirth(boolean isMale, LocalDateTime timeOfBirth, double height, double weight, Cities locationOfBirth) {
        if (isMale) System.out.println("Внук! Боже, как я счастлива");
        else System.out.println("Я научу свою внучку всему");

    }

    @Override
    public void onDeath(LocalDateTime timeOfDeath, Cities locationOfDeath) {
        System.out.println("Боже, за что.... Пусть на небе будет спокойно тебе..");

    }

    @Override
    public void onGoingToSchool(int schoolNumber, char groupLetterIndex) {
        if (groupLetterIndex == 'А') System.out.println("A - Класс лидеров");
        else if (groupLetterIndex == 'В') System.out.println("Я тоже училась в \"В\"");
        else if (groupLetterIndex == 'Г') System.out.println("Пусть переведется. Класс \"Г\" - плохая примете");
        else if (groupLetterIndex == 'Б') System.out.println("О, Господи!!!.В Классе \"Б\" одни хулиганы");
        else System.out.println("Какая-то неоднозначная буква класса. Плохой знак");
    }

    @Override
    public void onGoingToKindergarten(KindergartenNames sadikName) {
        System.out.println("Уже в садике!!");
    }

    @Override
    public void onGoingToUniversity(String UniversityName, int speciality, boolean isFeePaying) {
        if (isFeePaying) {
            System.out.println("Жаль, что контракте. Бабушке теперь платить, но пусть учится!");
        } else {
            System.out.println("Гордость моя попала на бюджет ");
        }
        if (speciality == 122 || speciality == 123 || speciality == 124) {
            System.out.println("Нельзя было поступить на что-то нормальное?");
        }
    }

    @Override
    public void onCreatingFamily(String spouseName, LocalDateTime timeOfMarrying, Cities locationOfMarrying) {
        System.out.println("Главное не ссорьтесь");
    }

    public String getObserverName() {
        return observerName;
    }

    @Override
    public void onGivingBirthToChildren(int childrenCount) {
        if (childrenCount == 0) System.out.println("Когда будут уже правнуки");
        else System.out.println("Я прабабушка!!!");


    }
}
