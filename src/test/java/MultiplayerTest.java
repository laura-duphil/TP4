/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bowling.MultiPlayerGame;
import bowling.Multijoueur;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedago
 */
public class MultiplayerTest {
    private Multijoueur game;
    
    public MultiplayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        MultiPlayerGame game = new Multijoueur() {};
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * Le premier joueur fait un strike
     * le joueur suivant marque 0 points
     * @throws Exception 
     */
    @Test
    public void testUnStrikeUnZeroPt() throws Exception {
        String[] tabJoueurs = { "John", "Paul", "Georges", "Ringo" };
        game.startNewGame(tabJoueurs);
        for (int i = 0; i < 10; i++) {
            //john fait un strike
            game.lancer(10);
            //paul fait 0 points dans son tour
            game.lancer(0);
            game.lancer(0);
            
        }
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
