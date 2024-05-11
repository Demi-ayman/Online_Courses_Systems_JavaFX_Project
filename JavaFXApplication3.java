/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author demia
 */
public class JavaFXApplication3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Text name = new Text("Username :");
        TextField namefld = new TextField();
        Text pass = new Text("Password:");
        TextField passfld = new TextField();

        Button btn = new Button("Login");
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(20, 20, 20, 20)); // Set padding around the grid pane// Set padding around the grid pane
        pane.setHgap(10); // Set horizontal gap between components

        pane.add(name, 0, 0);
        pane.add(namefld, 1, 0);
        pane.add(pass, 0, 1);
        pane.add(passfld, 1, 1);
        pane.add(btn, 1, 3);

        GridPane.setHalignment(btn, HPos.RIGHT); // Align the button to the right
        
  //      Users inst1  = new Instructor("Tasneem" , "Tasneem@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",25,"Female","12379");
        
        btn.setOnAction(event -> {
                String email = namefld.getText(); // Retrieve the value from the first name TextField
                String password = passfld.getText(); // Retrieve the value from the password TextField
                Site.Get_User("Tasneem").login(email, password);
                boolean isValid1 = Site.Get_User("Tasneem").isLogedIn();
                
                        
                if(isValid1){
                    System.out.println("Login successful");
                    primaryStage.close();
                    Platform.exit();
                }
                else{
                    System.out.println("Invalid credentials");
                    primaryStage.close();
                    Platform.exit();
                }
            });
        
        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Site site=new Site();
        Scanner input = new Scanner(System.in);
        Site.Add_Users( new Instructor("Tasneem" , "Tasneem@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",25,"Female","12379"));
                launch(args);
         if(Site.Get_User("Tasneem").isLogedIn()){
        ((Instructor)Site.Get_User("Tasneem")).addCourses(new Courses("java","CSE213","Udamy","Three Months"));
        ((Instructor)Site.Get_User("Tasneem")).addCourses(new Courses("C++","CSE211","Udamy","Two Months"));
        ((Instructor)Site.Get_User("Tasneem")).addTask("java",new Quiz(new Time(2024,5,3,1,5),30,"Quiz",new Time(2024,5,3,1,5)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("java",new Assignment(15,"Assignment",new Time(2024,5,3,1,5)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("java",new Project(40,"Project",new Time(2024,12,4,2,7)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("C++",new Quiz(new Time(2024,8,4,1,10),10,"Quiz",new Time(2024,5,3,1,5)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("C++",new Assignment(15,"Assignment",new Time(2024,4,5,7,20)));
        ((Instructor)Site.Get_User("Tasneem")).addTask("C++",new Project(20,"Project",new Time(2024,3,9,8,25)));
         for(Courses c:((Instructor)Site.Get_User("Tasneem")).getCourses())
             System.out.println(c);

        Site.Add_Users( new Student ( "Gerges", "gerges@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",21,"Male","57379"));
        Site.Add_Users(new Student ( "Youstina", "yous@eng.asu.edu.eg","Faculty of engineering ASU","Computer and systems",21,"Female","57439"));
        List <Courses> GergesCourses = new ArrayList<>();
        GergesCourses.add(Site.Get_Course("java"));
        GergesCourses.add(Site.Get_Course("C++"));
        for(Courses c:GergesCourses ){
        System.out.println(c);
        }
        List <Courses> YoustinaCourses = new ArrayList<>();
        YoustinaCourses.add(Site.Get_Course("C++"));
        for(Courses c:YoustinaCourses ){
        System.out.println(c);
        }
        ((Student)Site.Get_User("Gerges")).setCourses(GergesCourses);
        ((Student)Site.Get_User("Youstina")).setCourses(YoustinaCourses);
        for(Courses c:((Student)Site.Get_User("Gerges")).getCourses() ){
        System.out.println(c);
        }    
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Youstina"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Quiz"),3 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Youstina"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Assignment"),5 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Youstina"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Project"),8 );
        System.out.println("The Course Grade of Youstina : "+((Student)Site.Get_User("Youstina")).getCourseGradePercentage(Site.Get_Course("C++")));
        System.out.println("The Final Grade of Youstina : "+((Student)Site.Get_User("Youstina")).finalGrade());
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Quiz"),8 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Assignment"),7 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("C++") , Site.Get_Course("C++").getATask("Project"),15 );
        System.out.println("The Course Grade of Gerges of C++ :"+((Student)Site.Get_User("Gerges")).getCourseGradePercentage(Site.Get_Course("C++")));
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("java"), Site.Get_Course("java").getATask("Quiz"),25 );
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("java") , Site.Get_Course("java").getATask("Assignment"),12 );  
        ((Instructor)Site.Get_User("Tasneem")).setGrade((Student)Site.Get_User("Gerges"),Site.Get_Course("java") , Site.Get_Course("java").getATask("Project"),30 );
        System.out.println("The Course Grade of Gerges of java : "+((Student)Site.Get_User("Gerges")).getCourseGradePercentage(Site.Get_Course("java")));
        System.out.println("The Final Grade of Gerges :"+((Student)Site.Get_User("Gerges")).finalGrade());
        List <Student> students = new ArrayList<>();
        students.add(((Student)Site.Get_User("Youstina")));
        students.add(((Student)Site.Get_User("Gerges")));
        Collections.sort(students);}
         else{
             System.out.println("Try enter a vaild Email or Password ");
         }
        System.out.println("Thanks");

    }
    
}
