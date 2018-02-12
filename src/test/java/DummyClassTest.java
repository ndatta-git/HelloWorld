package my.newsite.com;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DummyClassTest extends TestCase {

    public void testNothing() {
    }

    public void testWillAlwaysPass() {
        assertTrue(true);
    }

    public void testWillAlwaysFail() {
        fail("Demo Test Failure!");
    }

}

