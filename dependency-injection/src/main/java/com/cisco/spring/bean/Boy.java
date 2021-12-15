package com.cisco.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    public GoodGirl gf;
    public Pet myPet;
    public Sport favSport;
    /* Field Injection */
    @Autowired
    public BestFriend bestFriend;

    /* Constructor Injection */
    @Autowired
    public Boy(@Qualifier("girl1") GoodGirl gf) {
        this.gf = gf;
        System.out.println(gf);
    }

    /* Setter Injection */
    @Autowired
    @Qualifier("cuteDog")
    public void setMyPet(Pet myPet){
        this.myPet = myPet;
    }

    /* Method Injection */
    @Autowired
    public void knowMySport(Sport favSport){
        this.favSport = favSport;
        favSport.play();
    }

}
