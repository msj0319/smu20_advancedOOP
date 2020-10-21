import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Image {
    ImageConverter imageConverter;
    String fileName;

    Image(String fileName) {
        this.fileName = fileName;
    }
    public void setImageConverter(ImageConverter imageConverter) {
        this.imageConverter = imageConverter;
    }

    public void performConvert(){
        ArrayList<Integer> colors;
        try {
            BufferedImage image = ImageIO.read(new File(fileName));

            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    colors = imageConverter.convert(color);
                    int outputRed = colors.get(0);
                    int outputGreen = colors.get(1);
                    int outputBlue = colors.get(2);
                    image.setRGB(x, y, new Color(outputRed, outputGreen, outputBlue).getRGB());
                }
            }
            ImageIO.write(image, "png", new File(imageConverter.getFileName() + fileName));

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
