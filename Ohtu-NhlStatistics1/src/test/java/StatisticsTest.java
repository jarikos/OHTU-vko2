/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JKosk2
 */
public class StatisticsTest {
    Statistics stats;
    ReaderStub stub;
    
    @Before
    public void setUp() {
        stub = new ReaderStub();
        stats = new Statistics(stub);
    }
//    }
    
    @Test
    public void StatisticsOK(){
//        ReaderStub stub = new ReaderStub();
//        Statistics stats = new Statistics(stub);

        assertEquals("[Gretzky              EDM 35 + 89 = 124]", stats.topScorers(0).toString());
    }
    
    @Test
    public void StatisticsTeam(){
//        ReaderStub stub = new ReaderStub();
//        Statistics stats = new Statistics(stub);

        assertEquals("[Lemieux              PIT 45 + 54 = 99]", stats.team("PIT").toString());
        //System.out.println(stats.team("PIT"));
    }

//    @BeforeClass
//    public static void setUpClass() throws Exception {
//    }
//
//    @AfterClass
//    public static void tearDownClass() throws Exception {
//    }
//
//    
//    @After
//    public void tearDown() {
//    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
