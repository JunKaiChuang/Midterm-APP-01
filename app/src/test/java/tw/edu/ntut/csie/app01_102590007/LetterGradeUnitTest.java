package tw.edu.ntut.csie.app01_102590007;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LetterGradeUnitTest {
    LetterGrade lg;
    @Before
    public void setUp(){
        lg = new LetterGrade();
    }

    @After
    public void tearDown(){
        lg = null;
    }

    @Test
    public void TestLetterGrade(){
        assertEquals("A", lg.TransScoreToGrade(95));
        assertEquals("B", lg.TransScoreToGrade(85));
        assertEquals("C", lg.TransScoreToGrade(75));
        assertEquals("D", lg.TransScoreToGrade(65));
        assertEquals("F", lg.TransScoreToGrade(55));
        assertEquals("X", lg.TransScoreToGrade(101));
        assertEquals("X", lg.TransScoreToGrade(-1));
    }
}