package com.errady.replace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTest {

    @Test
    void NordTest() {
        Replace rp = new Replace();
        assertEquals(Orientation.Nord, rp.tournePersonne(4));
    }

    @Test
    void EstTest() {
        Replace rp = new Replace();
        assertEquals(Orientation.Est, rp.tournePersonne(13));
    }

    @Test
    void SudTest() {
        Replace rp = new Replace();
        assertEquals(Orientation.Sud, rp.tournePersonne(26));
    }

    @Test
    void OuestTest() {
        Replace rp = new Replace();
        assertEquals(Orientation.Ouest, rp.tournePersonne(39));
    }

    @Test
    void PassLimitsTest() {
        Replace rp = new Replace();
        assertEquals(Orientation.OverLimit, rp.tournePersonne(1001));
    }

}