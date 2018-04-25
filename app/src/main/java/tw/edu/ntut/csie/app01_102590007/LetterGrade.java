package tw.edu.ntut.csie.app01_102590007;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class LetterGrade {
    public String TransScoreToGrade(int score){
        if(score > 100 || score < 0)
            return "X";
        else if (score >= 90 && score <= 100)
            return "A";
        else if (score >= 80 && score <= 89)
            return "B";
        else if (score >= 70 && score <=79)
            return "C";
        else if (score >= 60 && score <=69)
            return "D";
        else
            return "F";
    }
}
