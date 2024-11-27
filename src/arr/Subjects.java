package arr;

import java.util.Scanner;

public class Subjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int mathMark;
        int englishMark;
        int scienceMark;
        int socialMark;
        boolean mathFlag = true;
        boolean englishFlag = true;

        do {
            System.out.println("enter the marks for Maths between 0 to 100: ");
            mathMark = scanner.nextInt();
            if (mathMark < 35) {
                mathFlag = false;
            }
        } while (mathMark < 0 || mathMark > 100);
        scanner.nextLine();

        do {
            System.out.println("enter the marks for English ");
            englishMark = scanner.nextInt();
            if (englishMark < 35) {
                englishFlag = false;
            }
        } while (englishMark < 0 || englishMark > 100);
        scanner.nextLine();

        do {
            System.out.println("enter the marks for Science ");
            scienceMark = scanner.nextInt();
        } while (scienceMark < 0 || scienceMark > 100);
        scanner.nextLine();

        do {
            System.out.println("enter the marks for Social ");
            socialMark = scanner.nextInt();
        } while (socialMark < 0 || socialMark > 100);
        scanner.nextLine();


        int totalMarks = mathMark + englishMark + scienceMark + socialMark;
        double avarege = totalMarks / 4.0;
        System.out.println("The total mark will be " + totalMarks);
        System.out.println("The average mark will be :" + avarege);

        if (totalMarks < 200) {
            System.out.println("Third Class");
        } else if (totalMarks < 350 && totalMarks > 200) {
            System.out.println("Second Class");
        } else {
            System.out.println("First class");
        }
        if (!mathFlag) {
            System.out.println("You are failed in math");

        }
        if (!englishFlag) {
            System.out.println("You are failed in english");
        }
        if (mathFlag && englishFlag) {
            System.out.println("You are Pass!!");
        }
    }
}

