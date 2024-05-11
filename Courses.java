/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author demia
 */
public class Courses {
    private String nameOf_course ;
    private String codeOf_course ; 
    private static int no_of_course = 0 ;  // no of courses we have 
    private boolean pass;
    private String organization ; 
    private double grade ; 
    private String duration  ; // instructor put the duration of the course 
    private List<Tasks> tasks;   
    private Instructor intructor;
    //private List<Lesson> lessons;
    //private List<Student> enrolledStudents;
    public Courses() {  // no argement
        no_of_course ++ ;
    }

    public Courses(String nameOf_course, String codeOf_course, String organization, String duration) {
        this.nameOf_course = nameOf_course;
        this.codeOf_course = codeOf_course;
        this.organization = organization;     
        this.duration = duration; // Time in months
        this.tasks=new ArrayList<>()  ;
    }
    public String getNameOf_course() {
        return nameOf_course;
    }

    public void setNameOf_course(String nameOf_course) {
        this.nameOf_course = nameOf_course;
    }

    public String getCodeOf_course() {
        return codeOf_course;
    }

    public void setCodeOf_course(String codeOf_course) {
        this.codeOf_course = codeOf_course;
    }

    public static int getNo_of_course() {
        return no_of_course;
    }

    public static void setNo_of_course(int no_of_course) {
        Courses.no_of_course = no_of_course;
    }

    public boolean isPass() {
        return pass;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

//    public double getGrade() {
//        for(int i=0;i<tasks.size();i++)
//        grade+=tasks.get(i).getGrade();
//        try {
//        double x = grade/tasks.size() ; 
//        return x;
//        }catch(ArithmeticException e)
//        {
//            e.printStackTrace();
//            return 0;
//        }  
//    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDuration() {
        return duration ;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Instructor getIntructor() {
        return intructor;
    }

    public void setIntructor(Instructor intructor) {  // they want to delete the set instructor :( 
        this.intructor = intructor;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
    @Override
    public String toString() {
        return "Courses{" + "nameOf_course=" + nameOf_course + ", codeOf_course=" + codeOf_course + ", pass=" + pass + ", organization=" +
                organization + ", duration=" + duration + '}';
    }
    public boolean Passing()
    {
        return (this.grade >= 50);
    }
    public int getnoOfItem(){
        return this.tasks.size();
    }
    public Tasks getATask(String name){
        int j;
    for( j= 0; j< this.getTasks().size() ; j++)
                {
                    if(this.getTasks().get(j).getName().equals(name))
                        break;
                }
              return this.getTasks().get(j);
    }
    public void addTasks(Tasks task){
        try {
        tasks.add(task);
        }catch(NullPointerException e)
        {
            System.out.println("point to null");
        }
    }
}
//    void setT(List<Tasks> t) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }