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
    
    @Test
    public void statisticsOK(){

        assertEquals("[Gretzky              EDM 35 + 89 = 124]", stats.topScorers(0).toString());
    }
    
    @Test
    public void statisticsTeam(){

        assertEquals("[Lemieux              PIT 45 + 54 = 99]", stats.team("PIT").toString());
    }
    
    @Test
    public void testSetAssist(){
//        Player player = new Player("Crazy","KRO",6,4);
//        player.setAssists(2);
//        
//        assertEquals("8",player.getAssists());
    }
} 