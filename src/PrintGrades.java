/*Write a program that uses a while loop to prompt the user
to enter any number of exam scores
and the resulting program will print out the grade, A, B, C, D or F.

If you're finished:
Modify your program to print + or - after the grade.
A+ 97 to 100
A 94 to 96
A- 90 to 93
B+ 87 to 89
B 84 to 86
B- 80 to 83
C+ 77 to 79
C 74 to 76
C- 70 to 73
D 60 to 69
Go back to School if you get below 60
*/

import java.util.Scanner;

public class PrintGrades {

    public static void main(String[] args) {

        int count=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter exam score as integer percentage in range 1 to 100 :");
        int score = input.nextInt();

        /*
        while(score>0)
        {
            count++;
            if(score>=90 && score<=100) {
                System.out.println("You scored : A");
            }
            else if(score>=80 && score<=89){
                System.out.println("You scored : B");
            }
            else if(score>=70 && score<=79){
                System.out.println("You scored : C");
            }
            else if(score>=60 && score<=69){
                System.out.println("You scored : D");
            }
            else if(score>=0 && score<=59) {
                System.out.println("Go back to School if you get below 60...");
            }
            System.out.println("Enter exam score as integer percentage in range 0 to 100 :");
            score = input.nextInt();
        }
        */

        while(score>0)
        {
            count++;
            if(score>=97 && score<=100) {
                System.out.println("You scored : A+");
            }
            else if(score>=94 && score<=96){
                System.out.println("You scored : A");
            }
            else if(score>=90 && score<=93){
                System.out.println("You scored : A-");
            }
            else if(score>=87 && score<=89){
                System.out.println("You scored : B+");
            }
            else if(score>=84 && score<=86){
                System.out.println("You scored : B");
            }
            else if(score>=80 && score<=83){
                System.out.println("You scored : B-");
            }
            else if(score>=77 && score<=79){
                System.out.println("You scored : C+");
            }
            else if(score>=74 && score<=76){
                System.out.println("You scored : C");
            }
            else if(score>=70 && score<=73){
                System.out.println("You scored : C-");
            }
            else if(score>=60 && score<=69){
                System.out.println("You scored : D");
            }
            else if(score>=0 && score<=59) {
                System.out.println("Go back to School if you get below 60...");
            }
            System.out.println("Enter exam score as integer percentage in range 1 to 100 :");
            System.out.println("Enter 0 to quit");
            score = input.nextInt();
        }

    }
}
