package com.trainings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by cherry on 8/7/17.
 */
public class Dog {
    private String name;
    private LocalDate birthday;
    private Season season;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        Season season =  Season.tellSeason(birthday);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printAllInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print your name:  ");
        String name = scanner.nextLine();
      //  System.out.println( "Dog's name is " + name);
        System.out.println("The name of the dog  is " + name );
      //  Scanner scanner2 = new Scanner(System.in);
        System.out.println("Print your birthday in format yyyy-mm-dd: ");
        birthday = LocalDate.parse(scanner.nextLine());
        System.out.println(name + " birthday is on " + birthday);
        this.season = Season.tellSeason(birthday);
        System.out.println(name + " was born in " + season);
    }

    public enum Season {
        WINTER(12), SPRING(3), SUMMER(6), FALL(9);
        private int month;

        Season (int monthOfSeason) {
            this.month = monthOfSeason;
        }
        Season() {
        }


        public static Season tellSeason (LocalDate birthday ) {
            Season result = null;

            int birthdayMonth = birthday.getMonthValue();

            if (birthdayMonth >= SPRING.month && birthdayMonth < SUMMER.month) {
                result = SPRING;
            } else if (birthdayMonth >= SUMMER.month && birthdayMonth < FALL.month) {
                result = SUMMER;
            } else if (birthdayMonth >= FALL.month && birthdayMonth < WINTER.month) {
                result = FALL;
            } else if (birthdayMonth == WINTER.month) {
                result = WINTER;
            }else if (birthdayMonth < SPRING.month){
                result = WINTER;
            }
            return result;
        }

    }

}
