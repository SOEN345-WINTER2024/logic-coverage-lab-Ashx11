import org.junit.Test;
import static org.junit.Assert.*;

public class CheckItTest {

    @Test
    public void testPredicateTrue() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testPredicateFalse() {

        assertFalse(CheckIt.checkIt(false, true, false)); 
    }

    @Test
    public void testClauseCoverage() {
        assertFalse(CheckIt.checkIt(false, false, false)); 
        assertTrue(CheckIt.checkIt(true, false, false)); 
        assertTrue(CheckIt.checkIt(false, true, true)); 
    }

    @Test
    public void testCACC() {
        assertTrue(CheckIt.checkIt(true, true, false)); 
        assertTrue(CheckIt.checkIt(false, true, true)); 
        assertFalse(CheckIt.checkIt(false, false, true)); 
    }

    @Test
    public void testRACC() {
        assertTrue(CheckIt.checkIt(true, false, true)); 
        assertFalse(CheckIt.checkIt(false, false, true));
    }
}
