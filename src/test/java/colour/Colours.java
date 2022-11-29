package colour;

public class Colours {

    float red;
    float green;
    float blue;
    String redGreenBlue;

    public Colours(float r, float g, float b, String rgb){
        red = r;
        green = g;
        blue = b;
        redGreenBlue = rgb;
    }


    public float getRed() {
        return red;
    }

    public float getGreen() {
        return green;
    }

    public float getBlue() {
        return blue;
    }

    public String getRGB() {
        return redGreenBlue;
    }
}
