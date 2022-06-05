package com.company.observersTesting.observers;

import com.company.observersTesting.data.Cities;
import com.company.observersTesting.data.KindergartenNames;

import java.time.LocalDateTime;

public class Brother implements IHumanObserver {
    final String observerName = "Брат";

    @Override
    public void onBirth(boolean isMale, LocalDateTime timeOfBirth, double height, double weight, Cities locationOfBirth) {
        if (isMale) System.out.println("У меня брат, мы покорим этот мир");
        else System.out.println("Лучше родился бы брат, но ладно...");

    }

    @Override
    public void onDeath(LocalDateTime timeOfDeath, Cities locationOfDeath) {
        System.out.println("Жаль конечно, но зато теперь все будет доставаться только мне");

    }

    @Override
    public void onGoingToSchool(int schoolNumber, char groupLetterIndex) {
        if (schoolNumber == 5) System.out.println("Черт, почему имеено в мою школу... Других чтоли мало ");
        else System.out.println(("Спасибо, что мы в разных школах"));
    }

    @Override
    public void onGoingToKindergarten(KindergartenNames sadikName) {
        System.out.println("Теперь мне придется забирать этого ребенка с садика");
    }

    @Override
    public void onGoingToUniversity(String UniversityName, int speciality, boolean isFeePaying) {
        if (isFeePaying) System.out.println("Учится на контракте, впрочем ничего удивительного");
        else System.out.println("Бюджет!? невероятное везение");
    }

    @Override
    public void onCreatingFamily(String spouseName, LocalDateTime timeOfMarrying, Cities locationOfMarrying) {
        System.out.println("Я думал, что у него никогда не получится найти себе кого-то");
    }

    @Override
    public void onGivingBirthToChildren(int childrenCount) {
        if (childrenCount == 0) System.out.println("Нет детей? хорошо! таким не стоит размножаться");
        else System.out.println("Теперь мне еще терпеть этих детей. Я переезжаю");

    }

    @Override
    public String getObserverName() {
        return observerName;
    }
}
