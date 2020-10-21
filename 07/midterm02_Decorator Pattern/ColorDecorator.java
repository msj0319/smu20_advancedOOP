import java.awt.*;
import java.util.ArrayList;

public abstract class ColorDecorator extends IColorConverter  {
    abstract ArrayList<Integer> convert(Color color);
    abstract String getFileName();
}
