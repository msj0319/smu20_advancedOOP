
import java.awt.Color;
import java.util.ArrayList;
// ��� �������� ��ȯ�ϴ� �ڵ�
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