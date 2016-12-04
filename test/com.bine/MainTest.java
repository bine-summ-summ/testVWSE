package com.bine;

import com.bine.Main;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Selzer on 04.12.2016.
 */
public class MainTest {
    @Test
    public void sagCiao() throws Exception {
        String s = "Ciao";
        assertEquals(s, Main.sagCiao());
    }

}