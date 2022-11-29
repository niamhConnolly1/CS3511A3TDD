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


    public void setRed(float redValue) {
        red = redValue;
    }

    public float getRed() {
        return red;
    }

    public void setGreen(float greenValue) {
        green = greenValue;
    }

    public float getGreen() {
        return green;
    }

    public void setBlue(float blueValue) {
        blue = blueValue;
    }

    public float getBlue() {
        return blue;
    }
}
