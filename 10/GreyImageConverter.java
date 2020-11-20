import java.awt.image.*;
//import java.awt.Image.BufferedImage;
import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

//import java.imageio.*;

// 흑백 영상으로 변환하는 코드
class GreyImageConverter extends ImageConverter{
    @Override
    public Color convert(Color color) {
        int greyRGB = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
        return new Color(greyRGB, greyRGB, greyRGB);
    }

    @Override
    public String getFileName() {
        return "g_";
    }
}