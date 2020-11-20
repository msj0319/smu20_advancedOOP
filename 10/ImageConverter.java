import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConverter {

    final String HOUSE = "house.png";
    final String IMAGE_FORMAT = "png";

    public final void convert() throws IOException {
        // 이미지 파일 데이터를 메모리에 넣음
        BufferedImage image = readImageFile();
        // 이미지의 각 픽셀 정보에 대해 컬러 변환을 한 후 다시 저장
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                // (x, y)에 해당되는 픽셀의 RGB 정보를 받아서 Color에 저장
                Color color = new Color(image.getRGB(x, y));
                // RGB 값을 각각 읽어서 컬러 변환
                Color colorConverter = convert(color);
                // 새로 만들어진 RGB 값을 (x, y)좌표 픽셀 컬러로 저장
                image.setRGB(x, y, colorConverter.getRGB());
            }
        }
        writeImageFile(image);
    }

    public BufferedImage readImageFile() throws IOException {
        return ImageIO.read(new File(HOUSE));
    }
    public abstract Color convert(Color color);

    public abstract String getFileName();

    public void writeImageFile(BufferedImage image) throws IOException {
        ImageIO.write(image, IMAGE_FORMAT, new File(getFileName() + HOUSE));
    }
}
