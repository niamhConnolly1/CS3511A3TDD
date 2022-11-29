package colour;

/**
 *Colours is a java program.
 * ------
 * It contains the variables:
 * red which is the type float, and it represents the percentage of red in a colour,
 * green which is also a float type, and it represents the percentage of green in a colour,
 * blue which is a float type too, and it represents the percentage of blue in a colour, and
 * redGreenBlue is a string type, and it represents the binary value for red, green and blue combined.
 *-------
 *This class contains getters for red, green, blue and redGreenBlue.
 */
public class Colours {

    /**
     * red is a float type and represents the percentage of red in a colour.
     */
    float red;
    /**
     * green is a float type and represents the percentage of green in a colour.
     */
    float green;
    /**
     * blue is a float type and represents the percentage of blue in a colour.
     */
    float blue;
    /**
     * redGreenBlue is a string type and represents the combined RGB value,
     * consisting of the red component in bits 16-23, the green component in bits 8-15, and the blue
     * component in bits 0-7.
     * It must be in the order Red Green Blue.
     */
    String redGreenBlue;

    /**
     *This instantiates the colours.
     * @param r is the red value, it must be a float and in the range 0.0 to 1.0.
     * @param g is the green value, it must be a float and in the range 0.0 to 1.0.
     * @param b is the blue value, it must be a float and in the range 0.0 to 1.0.
     * @param rgb is the red green blue value, it must be a string.
     *            The first 8 bits represent the red, the next 8 bits represent the green and
     *            the last 8 bits represent the blue.
     */
    public Colours(float r, float g, float b, String rgb){
        red = r;
        green = g;
        blue = b;
        redGreenBlue = rgb;
    }

    /**
     * getter for the red value.
     * @return the value red.
     */
    public float getRed() {
        return red;
    }

    /**
     * getter for the green value.
     * @return the value for green.
     */
    public float getGreen() {
        return green;
    }

    /**
     * getter for the blue value.
     * @return the value blue.
     */
    public float getBlue() {
        return blue;
    }

    /**
     * getter for the redGreenBlue value.
     * @return the redGreenBlue value.
     */
    public String getRGB() {
        return redGreenBlue;
    }
}
