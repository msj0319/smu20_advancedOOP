import java.awt.*;
import java.util.ArrayList;

// 흑백 영상으로 변환하는 코드
class GreyImageConverter extends ColorDecorator {
    IColorConverter iColorConverter;
    public GreyImageConverter(IColorConverter iColorConverter) {
        this.iColorConverter = iColorConverter;
    }
    @Override
    public ArrayList<Integer> convert(Color color) {
        ArrayList<Integer> colors = iColorConverter.convert(color);
        int outputRed = (colors.get(0) + colors.get(1) + colors.get(2)) / 3;
        int outputGreen = (colors.get(0) + colors.get(1) + colors.get(2)) / 3;
        int outputBlue = (colors.get(0) + colors.get(1) + colors.get(2)) / 3;

        colors.add(0,outputRed);
        colors.add(1,outputGreen);
        colors.add(2,outputBlue);

        return colors;
    }

    public String getFileName() {
        return  "g_"+iColorConverter.getFileName();
    }
}