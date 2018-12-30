package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the number of courses offered: ");
        int course_number = input.nextInt();

        int counter = 0;
        float tgcp = 0; //total grade cumulative points
        float tnu = 0; //total number of points
        float gpa;
        int course_units[] = new int[course_number];
        char course_grades[] = new char[course_number];
        int course_points[] = new int[course_number];

        while (counter < course_number) {
            //Enter all the course units
            System.out.print("Please enter the course unit: ");
            course_units[counter] = input.nextInt();

            //Enter all the course grades
            System.out.print("Please enter the course grade: ");
            course_grades[counter] = input.next().charAt(0);

            if (course_grades[counter] == 'a' || course_grades[counter] == 'A') {
                course_points[counter] = 5;
            } else if (course_grades[counter] == 'b' || course_grades[counter] == 'B') {
                course_points[counter] = 4;
            } else if (course_grades[counter] == 'c' || course_grades[counter] == 'C') {
                course_points[counter] = 3;
            } else if (course_grades[counter] == 'd' || course_grades[counter] == 'D') {
                course_points[counter] = 2;
            } else if (course_grades[counter] == 'e' || course_grades[counter] == 'E') {
                course_points[counter] = 1;
            } else if (course_grades[counter] == 'f' || course_grades[counter] == 'F') {
                course_points[counter] = 0;
            } else {
                System.out.println("Enter a valid grade");
            }
            counter++;
        }
        System.out.println(Arrays.toString(course_units));
        System.out.println(course_number);
        System.out.println(Arrays.toString(course_points));
        System.out.println(course_grades);

        for (int i = 0; i < course_number; i++) {
            tnu += course_units[i];
            tgcp += course_units[i] * course_points[i];
        }
        gpa = tgcp /tnu;
        System.out.println("Your GPA is: " + gpa);
    }
}