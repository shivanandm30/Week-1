package com.coding.shiva.week1.introduction.introductionToSpringBoot;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Apple {
    void eatApple() {
        System.out.println("I am eating apple");
    }

    @PostConstruct
    void callThisBeforeAppleUser(){
        System.out.println("Creating the apple bean");
    }

    @PreDestroy
    void callThisBeforeDestroy(){
        System.out.println("Destroying apple Beans");
    }
}
