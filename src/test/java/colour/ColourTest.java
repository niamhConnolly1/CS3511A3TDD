package colour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ColourTest {

    @Test
    void testRangeOfRed() {
        Colours redColour = new Colours(1.0F, 0.0F, 0.0F, "111111110000000000000000");
        redColour.setRed(0.95F);
        Assertions.assertTrue(0.0F <= redColour.getRed() && redColour.getRed() <= 1.0F);
    }

    @Test
    void testRangeOfGreen() {
        Colours greenColour = new Colours(0.0F, 1.0F, 0.0F, "000000001111111100000000");
        greenColour.setGreen(0.75F);
        Assertions.assertTrue(0.0F <= greenColour.getGreen() && greenColour.getGreen() <= 1.0F);
    }

    @Test
    void testRangeOfBlue() {
        Colours blueColour = new Colours(0.0F, 0.0F, 1.0F, "000000000000000011111111");
        blueColour.setBlue(0.55F);
        Assertions.assertTrue(0.0F <= blueColour.getBlue() && blueColour.getBlue() <= 1.0F);

    }
}
