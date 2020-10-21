import java.awt.*;
import java.util.ArrayList;

class InverseImageConverter extends ColorDecorator {
    IColorConverter iColorConverter;
    public InverseImageConverter(IColorConverter iColorConverter) {
        this.iColorConverter = iColorConverter;
    }
    @Override
    public ArrayList<Integer> convert(Color color) {
        ArrayList<Integer> colors = iColorConverter.convert(color);

        int outputRed = 255 - colors.get(0);
        int outputGreen = 255 - colors.get(1);
        int outputBlue = 255 - colors.get(2);

        colors.add(0,outputRed);
        colors.add(1,outputGreen);
        colors.add(2,outputBlue);

        return colors;
    }
    public String getFileName() {
        return  "i_"+ iColorConverter.getFileName();
    }
}