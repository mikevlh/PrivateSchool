/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import UserInput.ScanInput;
import static UserInput.ScanInput.trainerInput;
import dao.AssCourseDao;
import dao.AssignmentDao;
import dao.CourseDao;
import dao.StudentCourseDao;
import dao.StudentDao;
import dao.StudentMoreThanOneCourseDao;
import dao.TrainerCourseDao;
import dao.TrainerDao;
import java.util.Scanner;

/**
 *
 * @author ironm
 */
public class MainMenu {

    public static void menu() {
        System.out.println("Type 1 to see all Students");
        System.out.println("Type 2 to see all Trainers");
        System.out.println("Type 3 to see all Assignments");
        System.out.println("Type 4 to see all Courses");
        System.out.println("Type 5 to see all Students Per Course");
        System.out.println("Type 6 to see all Trainers Per Course");
        System.out.println("Type 7 to see all Assignments Per Course");
        System.out.println("Type 8 to see all the Students that Belong to more than 1 courses");
        System.out.println("Type 9 to insert a Student to the Database");
        System.out.println("Type 10 to insert a Course to the Database");
        System.out.println("Type 11 to insert a Trainer to the Database");
        System.out.println("Type 12 to insert an Assignment to the Database");
        Scanner input = new Scanner(System.in);
        String option = input.next();
        switch (option) {
            case "1":
                System.out.println(StudentDao.getAllStudents());
                menu();
                break;
            case "2":
                System.out.println(TrainerDao.getAllTrainers());
                menu();
                break;
            case "3":
                System.out.println(AssignmentDao.getAllAssignments());
                menu();
                break;
            case "4":
                System.out.println(CourseDao.getAllCourses());
                menu();
                break;
            case "5":
                System.out.println(StudentCourseDao.getAllStudentsPerCourse());
                menu();
                break;
            case "6":    
                System.out.println(TrainerCourseDao.getAllTrainersPerCourse());
                menu();
                break;
            case "7" :    
                System.out.println(AssCourseDao.getAllAssignmentsPerCourse());
                menu();
                break;
            case "8" :    
                System.out.println(StudentMoreThanOneCourseDao.getAllStudentsWithMoreThanOneCourses());
                menu();
                break;
            case "9" :   
                StudentDao.insertStudent(ScanInput.studentInput());
                menu();
                break;
            case "10" :
                CourseDao.insertCourse(ScanInput.courseInput());
                menu();
                break;
            case "11" :    
                TrainerDao.insertTrainer(trainerInput());
                menu();
                break;
            case "12" :
                AssignmentDao.insertTrainer(ScanInput.assignmentInput());
                menu();
                break;
            default:
                menu();

        }
    }
}
