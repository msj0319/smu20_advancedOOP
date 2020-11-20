import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

class SepiaImageConverter extends ImageConverter {
    @Override
    public Color convert(Color color) {
        int grey = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
        return new Color(230 * grey / 255, 180 * grey / 255, 150 * grey / 255);
    }

    @Override
    public String getFileName() {
        return "s_";
    }
}