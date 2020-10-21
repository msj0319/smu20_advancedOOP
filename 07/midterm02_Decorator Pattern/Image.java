import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Image {
    IColorConverter iColorConverter;
    final String fileName = "house.png"; // 원본 영상 파일 이름

    public Image (IColorConverter iColorConverter) {
        this.iColorConverter = iColorConverter;
    }

    public void setImageConverter(IColorConverter iColorConverter) {
        this.iColorConverter = iColorConverter;
    }

    public void performConvert(){
        ArrayList<Integer> colors;
        try {
            BufferedImage image = ImageIO.read(new File(fileName));

            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    colors = iColorConverter.convert(color);
                    int outputRed = colors.get(0);
                    int outputGreen = colors.get(1);
                    int outputBlue = colors.get(2);
                    image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
                }
            }
            ImageIO.write(image, "png", new File(iColorConverter.getFileName() + fileName));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
