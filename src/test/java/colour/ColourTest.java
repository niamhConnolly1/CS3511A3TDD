package colour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ColourTest is a java program.
 * This is a test class for Colours.java.
 * It contains 6 test methods.
 * These test methods check the range of the red, green and blue values
 * and check they are between 0.0 and 1.0.
 * They also check if the red, green and blue values colour corresponds with the redGreenBlue colour.
 * These test methods can also check if 2 colours are the same
 * by comparing their red, blue, green and redGreenBlue values to see if they're equal.
 * They also check that the length of the redGreenBlue value is correct.
 */
public class ColourTest {

    /**
     * This test method checks the range of the red value
     * and makes sure it's between 0.0 and 1.0.
     * redColour is a new Colours object created to represent the colour red.
     */
    @Test
    void testRangeOfRed() {
        Colours redColour = new Colours(1.0F, 0.0F, 0.0F, "111111110000000000000000");
        Assertions.assertTrue(0.0F <= redColour.getRed() && redColour.getRed() <= 1.0F);
    }

    /**
     * This test method checks the range of the green value
     * and makes sure it's between 0.0 and 1.0.
     * greenColour is a new Colours object created to represent the colour green.
     */
    @Test
    void testRangeOfGreen() {
        Colours greenColour = new Colours(0.0F, 1.0F, 0.0F, "000000001111111100000000");
        Assertions.assertTrue(0.0F <= greenColour.getGreen() && greenColour.getGreen() <= 1.0F);
    }

    /**
     * This test method checks the range of the blue value
     * and makes sure it's between 0.0 and 1.0.
     * blueColour is a new Colours object created to represent the colour blue.
     */
    @Test
    void testRangeOfBlue() {
        Colours blueColour = new Colours(0.0F, 0.0F, 1.0F, "000000000000000011111111");
        Assertions.assertTrue(0.0F <= blueColour.getBlue() && blueColour.getBlue() <= 1.0F);
    }

    /**
     * This test method checks if the red, green and blue values colour
     * corresponds with the redGreenBlue colour.
     * pinkColour is a new Colours object created to represent the colour pink.
     * It checks the red percentage, green percentage and blue percentage,
     * and it checks the 24bit binary number given as a string to represent the redGreenBlue value.
     */
    @Test
    void testColourEqualsRGB() {
        Colours pinkColour = new Colours(1.0F, 0.75F, 0.79F, "11111111110000011001011");
        Assertions.assertEquals(1.0F, pinkColour.getRed());
        Assertions.assertEquals(0.75F, pinkColour.getGreen());
        Assertions.assertEquals(0.79F, pinkColour.getBlue());
        Assertions.assertSame("11111111110000011001011", pinkColour.getRGB());
    }

    /**
     * This test method checks if 2 colours are the same.
     * 2 goldColour objects were created to represent the colour gold.
     * It checks if both reds are equal, if both greens are equal,
     * if both blues are equal and if both redGreenBlue values are the same.
     */
    @Test
    void testIfColoursAreEqual() {
        Colours goldColour1 = new Colours(1.0F, 0.84F, 0.0F, "111111110111110100000000");
        Colours goldColour2 = new Colours(1.0F, 0.84F, 0.0F, "111111110111110100000000");
        Assertions.assertEquals(goldColour1.getRed(), goldColour2.getRed());
        Assertions.assertEquals(goldColour1.getGreen(), goldColour2.getGreen());
        Assertions.assertEquals(goldColour1.getBlue(), goldColour2.getBlue());
        Assertions.assertSame(goldColour1.getRGB(), goldColour2.getRGB());
    }

    /**
     * This test method checks if the length of the redGreenBlue value is correct.
     * It must be 24 in length because bits 16-23 represent the red value,
     * bits 8-15 represent the green value,
     * and bits 0-7 represent the blue value.
     * lightGreenColour is a new Colours object created to represent the colour light green.
     */
    @Test
    void testLengthOfRGB() {
        Colours lightGreenColour = new Colours(0.56F, 0.94F, 0.56F, "100100001110111010010000");
        Assertions.assertEquals(24, lightGreenColour.getRGB().length());
    }
}
