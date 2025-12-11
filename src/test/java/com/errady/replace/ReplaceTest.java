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
        assertEquals("Est", rp.tournePersonne(1));
    }

    @Test
    void SudTest() {
        Replace rp = new Replace();
        assertEquals("Sud", rp.tournePersonne(2));
    }

    @Test
    void OuestTest() {
        Replace rp = new Replace();
        assertEquals("Ouest", rp.tournePersonne(3));
    }

}