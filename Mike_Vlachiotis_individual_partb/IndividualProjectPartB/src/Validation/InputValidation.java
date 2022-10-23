/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ironm
 */
public class InputValidation {

    public static int giveNumbToInt(Scanner input) {
        int result;
        while (true) {
            try {
                String in = input.next();
                int number = Integer.parseInt(in);
                result = number;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please give only numbers!");
            }
        }
        return result;
    }

    public static double giveNumbToDouble(Scanner input) {
        double result;
        while (true) {
            try {
                String in = input.next();
                double number = Double.parseDouble(in);
                result = number;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please give only numbers!");
            }
        }
        return result;
    }

    public static LocalDate giveADate(Scanner input) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate result;
        while (true) {
            try {
                String in = input.next();
                result = LocalDate.parse(in, format);
                break;
            } catch (DateTimeException e) {
                System.out.println("Wrong input try entering the Date on this format yyyy-MM-dd");
            }
        }
        return result;
    }

    public static LocalDateTime giveADateTime(Scanner input) {
        DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime result;
        while (true) {
            try {
                String in = input.next();
                result = LocalDateTime.parse(in, format);

                break;
            } catch (DateTimeException e) {
                System.out.println("Wrong input try entering the Date time on this format 2007-12-03T10:15:30");
            }
        }
        return result;
    }

    public static Date giveADate2() {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date input = null;
        boolean kappa = true;

        while (kappa) {

            if (!sc.hasNextLine()) {
                System.out.println("Please enter Sub Date Time on this format (yyyy-MM-dd HH:mm:ss)!");
            } else {
                try {
                    String date = sc.nextLine();
                    input = format.parse(date);
                    kappa = false;
                } catch (ParseException ex) {
                    System.out.println("Please enter Sub Date Time on this format (yyyy-MM-dd HH:mm:ss)!");
                }
            }

        }

        return input;
    }
}
