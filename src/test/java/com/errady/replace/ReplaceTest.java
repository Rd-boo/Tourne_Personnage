package com.errady.replace;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTest {

    @Test
    void NordTest() {
        Replace rp = new Replace();
        assertEquals("Nord", rp.tournePersonne(4));
    }

    @Test
    void EstTest() {
        Replace rp = new Replace();
        assertEquals("Est", rp.tournePersonne(13));
    }

    @Test
    void SudTest() {
        Replace rp = new Replace();
        assertEquals("Sud", rp.tournePersonne(26));
    }

    @Test
    void OuestTest() {
        Replace rp = new Replace();
        assertEquals("Ouest", rp.tournePersonne(39));
    }

    @Test
    void BigTest() {
        Replace rp = new Replace();
        assertEquals("Est", rp.tournePersonne(1001));
    }

}