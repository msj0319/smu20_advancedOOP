import java.awt.*;
import java.util.ArrayList;

public class OriginalColorConverter extends IColorConverter {
    public OriginalColorConverter() {}
    @Override
    public ArrayList<Integer> convert(Color color){
        ArrayList<Integer> colors = new ArrayList<>();

        int outputRed = color.getRed();
        int outputGreen = color.getGreen();
        int outputBlue = color.getBlue();

        colors.add(outputRed);
        colors.add(outputGreen);
        colors.add(outputBlue);

        return colors;
    }

    @Override
    String getFileName() {
        return "";
    }
}
