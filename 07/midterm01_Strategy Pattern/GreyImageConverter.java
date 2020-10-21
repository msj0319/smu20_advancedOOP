
import java.awt.Color;
import java.util.ArrayList;
// 흑백 영상으로 변환하는 코드
class GreyImageConverter implements ImageConverter {
    @Override
    public ArrayList<Integer> convert(Color color) {
        ArrayList<Integer> colors = new ArrayList<>();
        int outputRed = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
        int outputGreen = (color.getRed() + color.getGreen() + color.getBlue())  / 3;
        int outputBlue = (color.getRed() + color.getGreen() + color.getBlue())  / 3;

        colors.add(outputRed);
        colors.add(outputGreen);
        colors.add(outputBlue);

        return colors;
    }
    public String getFileName() {
        return "g_";
    }
}