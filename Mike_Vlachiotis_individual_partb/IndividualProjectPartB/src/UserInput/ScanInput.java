/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInput;

import Validation.InputValidation;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import model.Assignment;
import model.Course;
import model.Student;
import model.Trainer;

/**
 *
 * @author ironm
 */
public class ScanInput {

    public static LocalDate dateToLocalDate(Date date) {
        LocalDate asd = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return asd;
    }

    public static Date convertToDateUsingDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }

    public static Date convertToDateUsingInstant(LocalDate date) {
        return java.util.Date.from(date.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

    public static Trainer trainerInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Name of the Trainer");
        String firstName = input.next();
        System.out.println("Enter the Last Name of the Trainer");
        String lastName = input.next();
        System.out.println("Enter the Subject");
        String subject = input.next();
        Trainer t = new Trainer(firstName, lastName, subject);
        return t;
    }

    public static Student studentInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Name of the Student");
        String firstName = input.next();
        System.out.println("Enter the Last Name of the Student");
        String lastName = input.next();
        System.out.println("Enter Date of birth of the Student yyyy-mm-dd");
        LocalDate userInputDateOfBirth = InputValidation.giveADate(input);
        System.out.println("Enter tuition fees");
        double tuitionFees = InputValidation.giveNumbToDouble(input);
        Student s = new Student(firstName, lastName, convertToDateUsingInstant(userInputDateOfBirth), tuitionFees);
        return s;
    }

    public static Course courseInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Add a Title for the Course");
        String userInputTitle1 = input.next();
        System.out.println("Add a Stream for the Course");
        String userInputStream1 = input.next();
        System.out.println("Add a Type for the Course");
        String userInputType1 = input.next();
        System.out.println("Add a Start Date for the Course yyyy-MM-dd");
        LocalDate userInputStartDate1 = InputValidation.giveADate(input);
        System.out.println("Add an End Date for the Course yyyy-MM-dd");
        LocalDate userInputEndDate1 = InputValidation.giveADate(input);
        LocalDate startDate1 = userInputStartDate1;
        LocalDate endDate1 = userInputEndDate1;
        Course course = new Course(userInputTitle1, userInputStream1, userInputType1, convertToDateUsingInstant(startDate1), convertToDateUsingInstant(endDate1));
        return course;
    }

    public static Assignment assignmentInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Add a Title for the Assignment");
        String userInputTitle2 = input.next();
        System.out.println("Add a Description for the Assignment");
        String userInputDescription = input.next();
        System.out.println("Add SubDateTime for the assignment in this format yyyy-MM-dd HH:mm:ss");
        Date dateTime = InputValidation.giveADate2();
        System.out.println("Add an oral Mark for the Assignment");
        double oralMarkInput = InputValidation.giveNumbToDouble(input);
        System.out.println("Add total Mark for the Assignment");
        double totalMark = InputValidation.giveNumbToDouble(input);

        Assignment assignment = new Assignment(userInputTitle2, userInputDescription, dateTime, oralMarkInput, totalMark);

        return assignment;
    }
}
