import java.awt.*;
import java.util.ArrayList;

class SepiaImageConverter extends ColorDecorator {
    IColorConverter iColorConverter;
    public SepiaImageConverter(IColorConverter iColorConverter) {
        this.iColorConverter = iColorConverter;
    }
    @Override
    public ArrayList<Integer> convert(Color color) {
        ArrayList<Integer> colors = iColorConverter.convert(color);
        int grey = (colors.get(0) + colors.get(1) + colors.get(2)) / 3;
        int outputRed = 230 * grey / 255;
        int outputGreen = 180 * grey / 255;
        int outputBlue =  150 * grey / 255;

        colors.add(0,outputRed);
        colors.add(1,outputGreen);
        colors.add(2,outputBlue);

        return colors;
    }
    public String getFileName() {
        return "s_"+ iColorConverter.getFileName();
    }
}