/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication3;

/**
 *
 * @author demia
 */

import java.util.ArrayList;
import java.util.List;
public class Site implements Cloneable {
     private static List<Courses> c;
     private static List<Users> u;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public Site() {
        c=new ArrayList<>();
        u=new ArrayList<>();
    }

    public List<Courses> getC() {
        return c;
    }

    public List<Users> getU() {
        return u;
    }
     public static void Add_Course(Courses course){
         c.add(course);
     }
     public static void Add_Users(Users user){
         u.add(user);
     }
     public static Courses Get_Course(String nameOfCourse){
         int i;
         for( i =0 ; i < c.size();i++)
        {
            if(c.get(i).getNameOf_course().equals(nameOfCourse) )// array of courses 
                break;
        }
         return c.get(i);
     }
     public static Users Get_User(String nameOfUser){
         int i;
         for( i =0 ; i < u.size();i++)
        {
            if(u.get(i).getName().equals(nameOfUser ))// array of courses 
                break;
        }
         return u.get(i);
     }
     
//     public static Courses Get_Course(String nameOfcourse){
//     
//         for(int i =0 ; i < c.size();i++)
//        {
//            if(c.get(i).getNameOf_course() ==nameOfcourse )// array of courses 
//                return c.get(i);
//        }
////         System.out.println("not exist");
////         return null;
//     }
//     
//     
//     public static Users Get_User(String nameOfUser){
//     
//         for(int i =0 ; i < u.size();i++)
//        {
//            if(u.get(i).getName() ==nameOfUser )// array of courses 
//                return u.get(i);
//        }
////         System.out.println("not exist");
////         return null;
//     }
}