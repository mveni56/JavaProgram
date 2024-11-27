package arr;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StudentRegistration {
    public static int rollNumberCounter=1;
    static String fileName = "C:\\hadoop\\ve.txt";
    public static void main(String[] args) throws Exception
    {
        HashMap<Integer, ArrayList> studentMap=new HashMap<Integer, ArrayList>();

        String studentName;
        int rollNumber=0;
        int mathMark;
        int englishMark;
        int scienceMark;
        int socialMark;
        String toContinue;
        String status = "";
        int highScore =0;
        String rankHolder="";
        Scanner scanner = new Scanner(System.in);


    do {

        ArrayList studentList=new ArrayList();

        System.out.println("Please enter the student name : ");

        studentName = scanner.nextLine();
        studentList.add(studentName);
        rollNumber=rollNumberCounter++;


        do {

            System.out.println("enter the marks for Maths between 0 to 100: ");
            mathMark = scanner.nextInt();

        } while (mathMark < 0 || mathMark > 100);
        scanner.nextLine();

        do {
            System.out.println("enter the marks for English between 0 to 100: ");
            englishMark = scanner.nextInt();

        } while (englishMark < 0 || englishMark > 100);
        scanner.nextLine();

        do {
            System.out.println("enter the marks for Science between 0 to 100: ");
            scienceMark = scanner.nextInt();
        } while (scienceMark < 0 || scienceMark > 100);
        scanner.nextLine();

        do {
            System.out.println("enter the marks for Social between 0 to 100: ");
            socialMark = scanner.nextInt();
        } while (socialMark < 0 || socialMark > 100);
        scanner.nextLine();

        studentList.add(mathMark);
        studentList.add(englishMark);
        studentList.add(scienceMark);
        studentList.add(socialMark);

        int totalMarks = mathMark + englishMark + scienceMark + socialMark;
        studentList.add(totalMarks);
        double avarege = totalMarks / 4.0;
        studentList.add(avarege);

        if(mathMark < 35)
        {
            status = "You are failed  in Math";
        } else if (englishMark < 35) {
            status="You are failed in English";
        } else if (scienceMark < 35) {
            status="You are failed in Science";
        } else if (socialMark < 35) {
            status="You are failed in Social";
        }else
        {
            status="You passed in all ";
        }

        System.out.println("The total mark will be " + totalMarks);
        System.out.println("The average mark will be :" + avarege);
        System.out.println("The student name is : " + studentName);
        System.out.println("the roll number is : " + "CSC100 -0"+rollNumber);
        System.out.println("The english mark is : " + mathMark);
        System.out.println("The english mark is : " + englishMark);
        System.out.println("The english mark is : " + scienceMark);
        System.out.println("The english mark is : " + socialMark);
        System.out.println(status + "subject");

        if(totalMarks > highScore)
        {
            highScore =totalMarks;
            rankHolder=studentName;
        }

        studentMap.put(rollNumber,studentList);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,true))) {

            writer.write("Student Name :"+studentName);
            writer.newLine();
            writer.write("Total Mark :"+totalMarks);
            writer.newLine();
            writer.write("Roll Number :"+rollNumber);
            writer.newLine();
            writer.write("Pass/Fail :"+status);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Do you want to continue Y/N :");
        toContinue= scanner.next();
    }while(toContinue.equals("Y"));
        System.out.println("The rank holder name is : "+ rankHolder);
        System.out.println("Higest mark is : "+ highScore);


        System.out.println("The student Map is : "+studentMap);
        System.out.println("To get the student details, enter the roll number ");
        int studentRollNo=scanner.nextInt();

        ArrayList stList = studentMap.get(studentRollNo);
        /*Iterator itr=stList.iterator();
        while(itr.hasNext())
        {

            System.out.println("The iterator element will be : "+itr.next);

        }*/

        System.out.println("Student name is : "+stList.get(0));
        System.out.println("Student math mark is : "+stList.get(1));
        System.out.println("Student english mark is : "+stList.get(2));
        System.out.println("Student science mark is : "+stList.get(3));
        System.out.println("Student social mark is : "+stList.get(4));

    }


}
