/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication3;

import java.util.InputMismatchException;

/**
 *
 * @author demia
 */
public class Time {
    int months , year , day , hour , minutes ;

    public Time() {
    }

    public Time(int year, int months, int day, int hour, int minutes) {
        try {
        if (day > 31 || day < 1)
            throw new InputMismatchException("the day must be less than 31 or positive");
        else 
            this.day =day;
        if (months > 12 || months < 1 )
            throw new InputMismatchException("the month must be less than 12 or positive") ;
        else
            this.months =months ;
        if (year < 2024 )
            throw new InputMismatchException("the year can't be less than 2024 ") ;
        else
            this.year = year;
        if (hour > 23 || hour < 0)
            throw new InputMismatchException("the hour must be less than 24 or positive") ;
        else
            this.hour = hour;
        if (minutes > 59 || minutes < 0)
            throw new InputMismatchException("the minutes must be less than 60 or positive");
        else
            this.minutes = minutes ;
        }catch(InputMismatchException e)
        {
            System.out.println( e);
        }
    }

    
    public void SetTime(int day, int year, int months, int hour, int minutes) 
    { 
        
        try {
        if (day > 31 || day < 1)
            throw new InputMismatchException("the day must be less than 31 or positive");
        else 
            this.day =day;
        if (months > 12 || months < 1 )
            throw new InputMismatchException("the month must be less than 12 or positive") ;
        else
            this.months =months ;
        if (year < 2024 )
            throw new InputMismatchException("the year can't be less than 2024 ") ;
        else
            this.year = year;
        if (hour > 23 || hour < 0)
            throw new InputMismatchException("the hour must be less than 24 or positive") ;
        else
            this.hour = hour;
        if (minutes > 59 || minutes < 0)
            throw new InputMismatchException("the minutes must be less than 60 or positive");
        else
            this.minutes = minutes ;
        }catch(InputMismatchException e)
        {
            System.out.println( e);
        }
//        try {
//            int d = Integer.parseInt(Integer.toString(day)); 
//            int y = Integer.parseInt(Integer.toString(year)); 
//            int m = Integer.parseInt(Integer.toString(months)); 
//            int mi = Integer.parseInt(Integer.toString(minutes)); 
//        } catch (NumberFormatException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        }
    }
        
    }