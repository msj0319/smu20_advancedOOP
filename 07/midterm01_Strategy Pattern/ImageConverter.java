import java.awt.*;
import java.util.ArrayList;

public interface ImageConverter {
    ArrayList<Integer> convert(Color color);
    String getFileName();
}
