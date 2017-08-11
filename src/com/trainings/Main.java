package com.trainings;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

	Dog brusselGriffon = new Dog();
//	brusselGriffon.setName("Chui");
//	brusselGriffon.setBirthday(LocalDate.of(2000,6,14));
	brusselGriffon.printAllInfo();

	Dog bullDog =new Dog();
//	bullDog.setName("Richi");
//	bullDog.setBirthday(LocalDate.of(2014, 1, 12));
	bullDog.printAllInfo();
    }
}
