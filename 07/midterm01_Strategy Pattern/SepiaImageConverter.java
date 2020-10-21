//import java.awt.Image.BufferedImage;
import java.awt.Color;
        import java.util.ArrayList;

//import java.imageio.*;

class SepiaImageConverter implements ImageConverter {
    @Override
    public ArrayList<Integer> convert(Color color) {
        ArrayList<Integer> colors = new ArrayList<>();
        int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
        int outputRed = 230 * grey / 255;
        int outputGreen = 180 * grey / 255;
        int outputBlue =  150 * grey / 255;

        colors.add(outputRed);
        colors.add(outputGreen);
        colors.add(outputBlue);

        return colors;
    }
    public String getFileName() {
        return "s_";
    }
}