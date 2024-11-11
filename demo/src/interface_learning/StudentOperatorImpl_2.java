package interface_learning;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class StudentOperatorImpl_2 implements StudentOperator {

    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("-------------student info-------------");
        for (Student student : students) {
            System.out.printf("name: %s\tsex: %s\n", student.getName(), student.getSex());
        }
        System.out.println("--------------------------------------");
    }

    @Override
    public void printScore(ArrayList<Student> students) {
        int maxScore = MINSCORE;
        int minScore = MAXSCORE;
        int totalScore = 0;
        for (Student student : students) {
            maxScore = max(maxScore, student.getGrade());
            minScore = min(minScore, student.getGrade());
            totalScore += student.getGrade();
        }
        System.out.println("average score: " + totalScore / students.size() + '\n');
    }
}
