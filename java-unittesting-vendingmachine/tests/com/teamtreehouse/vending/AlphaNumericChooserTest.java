package com.teamtreehouse.vending;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaNumericChooserTest {

    private AlphaNumericChooser chooser;

    @Before
    public void setUp() throws Exception {
        chooser = new AlphaNumericChooser(26, 10);
    }

    @Test
    public void validInputReturnsProperLocation() throws Exception {
        AlphaNumericChooser.Location loc = chooser.locationFromInput("B4");

        assertEquals("proper row", 1, loc.getRow());
        assertEquals("proper column", 3, loc.getColumn());
    }

    @Test(expected = InvalidLocationException.class)
    public void choosingWrongInputIsNotAllowed() throws InvalidLocationException {
        chooser.locationFromInput("WRONG");
    }

    @Test(expected = InvalidLocationException.class)
    public void choosingLargerThanMaxInsNotAllowed() throws Exception {
        chooser.locationFromInput("B52");
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructingLargerThanAlphabetNotAllowed() throws Exception {
        new AlphaNumericChooser(27, 10);
    }
}