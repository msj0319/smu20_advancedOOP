import java.io.IOException;

public class MP10 {
    public static void main(String[] args) throws IOException {

        ImageConverter greyConverter = new GreyImageConverter();
        greyConverter.convert();

        ImageConverter SepiaConverter = new SepiaImageConverter();
        SepiaConverter.convert();

        ImageConverter InverseConverter = new InverseImageConverter();
        InverseConverter.convert();

    }
}
