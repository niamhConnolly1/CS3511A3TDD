package colour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTest {

    @Test
    void testRangeOfRed() {
        Colours redColour = new Colours(1.0F, 0.0F, 0.0F, "111111110000000000000000");
        //redColour.setRed(0.95F);
        Assertions.assertTrue(0.0F <= redColour.getRed() && redColour.getRed() <= 1.0F);
    }

    @Test
    void testRangeOfGreen() {
        Colours greenColour = new Colours(0.0F, 1.0F, 0.0F, "000000001111111100000000");
        //greenColour.setGreen(0.75F);
        Assertions.assertTrue(0.0F <= greenColour.getGreen() && greenColour.getGreen() <= 1.0F);
    }

    @Test
    void testRangeOfBlue() {
        Colours blueColour = new Colours(0.0F, 0.0F, 1.0F, "000000000000000011111111");
        //blueColour.setBlue(0.55F);
        Assertions.assertTrue(0.0F <= blueColour.getBlue() && blueColour.getBlue() <= 1.0F);
    }

    @Test
    void testColourEqualsRGB() {
        Colours pinkColour = new Colours(1.0F, 0.75F, 0.79F, "11111111110000011001011");
        Assertions.assertEquals(1.0F, pinkColour.getRed());
        Assertions.assertEquals(0.75F, pinkColour.getGreen());
        Assertions.assertEquals(0.79F, pinkColour.getBlue());
        Assertions.assertTrue("11111111110000011001011" == pinkColour.getRGB());
    }

    @Test
    void testIfColoursAreEqual() {
        Colours goldColour1 = new Colours(1.0F, 0.84F, 0.0F, "111111110111110100000000");
        Colours goldColour2 = new Colours(1.0F, 0.84F, 0.0F, "111111110111110100000000");
        Assertions.assertEquals(goldColour1.getRed(), goldColour2.getRed());
        Assertions.assertEquals(goldColour1.getGreen(), goldColour2.getGreen());
        Assertions.assertEquals(goldColour1.getBlue(), goldColour2.getBlue());
        Assertions.assertTrue(goldColour1.getRGB() == goldColour2.getRGB());
    }
}
