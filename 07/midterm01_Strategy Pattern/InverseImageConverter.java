import java.awt.Color;
import java.util.ArrayList;

class InverseImageConverter implements ImageConverter {
    @Override
    public ArrayList<Integer> convert(Color color) {
        ArrayList<Integer> colors = new ArrayList<>();

        int outputRed = 255 - color.getRed();
        int outputGreen = 255 - color.getGreen();
        int outputBlue = 255 - color.getBlue();

        colors.add(outputRed);
        colors.add(outputGreen);
        colors.add(outputBlue);

        return colors;
    }
    public String getFileName() {
        return "i_";
    }
}