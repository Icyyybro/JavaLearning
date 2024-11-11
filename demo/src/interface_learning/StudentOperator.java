package interface_learning;

import java.util.ArrayList;

public interface StudentOperator {
    public final static int MAXSCORE = 100;
    public final static int MINSCORE = 0;

    void printInfo(ArrayList<Student> students);

    void printScore(ArrayList<Student> students);

}
