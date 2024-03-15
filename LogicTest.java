import static org.junit.Assert.*;
import org.junit.Test;

public class LogicTest {

    public static boolean checkIt(boolean a, boolean b, boolean c) {
        return a || (b && c);
    }
    
    // Predicate Coverage
    @Test
    public void testPredicateTrue() {
        assertTrue("Predicate is true when a is true", checkIt(true, false, false));
    }
    
    @Test
    public void testPredicateFalse() {
        assertFalse("Predicate is false when all are false", checkIt(false, false, false));
    }
    
    // Clause Coverage
    @Test
    public void testClauseA() {
        assertTrue("Clause a true", checkIt(true, false, false));
        assertFalse("Clause a false", checkIt(false, false, true));
    }
    
    @Test
    public void testClauseB() {
        assertTrue("Clause b true", checkIt(false, true, true));
        assertFalse("Clause b false", checkIt(false, false, true));
    }
    
    @Test
    public void testClauseC() {
        assertTrue("Clause c true", checkIt(false, true, true));
        assertFalse("Clause c false", checkIt(false, true, false));
    }
    
    // CACC
    @Test
    public void testCACC() {
        assertTrue("CACC true", checkIt(true, true, false));
        assertFalse("CACC false", checkIt(false, true, false));
    }
    
    // RACC
    @Test
    public void testRACC() {
        assertFalse("RACC with a false, b true, c false", checkIt(false, true, false));
        assertTrue("RACC with a true, b true, c false", checkIt(true, true, false));
    }
}
