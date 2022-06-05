package com.company.observersTesting.observers;

import com.company.observersTesting.data.Cities;
import com.company.observersTesting.data.KindergartenNames;

import java.time.LocalDateTime;

public interface IHumanObserver {

    void onBirth(boolean isMale,
                 LocalDateTime timeOfBirth,
                 double height,
                 double weight,
                 Cities locationOfBirth);

    void onDeath(LocalDateTime timeOfDeath, Cities locationOfDeath);

    void onGoingToSchool(int schoolNumber, char groupLetterIndex);

    void onGoingToKindergarten(KindergartenNames kindergartenName);

    void onGoingToUniversity(String UniversityName, int speciality, boolean isFeePaying);

    void onCreatingFamily(String spouseName, LocalDateTime timeOfMarrying, Cities locationOfMarrying);

    void onGivingBirthToChildren(int childrenCount);

    String getObserverName();

}
