package Muhtar_SDET.Day7_IfStatements;

public class Task7_GradeNestedIf {
    public static void main(String[] args) {

        char gradeLevel = 'S';

        String result ="";

        if (gradeLevel == 'A' || gradeLevel == 'B' || gradeLevel == 'C'||gradeLevel == 'D'||gradeLevel == 'F') {
            if (gradeLevel == 'A') {
                result +=gradeLevel;
            }else if (gradeLevel == 'B') {
                result +=gradeLevel;
            }else if (gradeLevel == 'C') {
                result +=gradeLevel;
            }else if (gradeLevel == 'D') {
                result +=gradeLevel;
            }else {
                result +=gradeLevel;
            }
        }else {
            result +="invalid";
        }
        System.out.println("result is " +result);

    }
}

/*2. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
other wise: invalid

NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT */