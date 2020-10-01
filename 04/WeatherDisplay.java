import javax.swing.*;
import java.awt.*;

public class WeatherDisplay extends DisplayDecorator {
    Display displayComponent;
    LabelPanel labelPanel;
    public WeatherDisplay(Display display, int width, int height) {
        super(display, width, height);
        displayComponent = display;
        labelPanel = new LabelPanel();
    }

    @Override
    public JPanel create() {
        // 레이블을 담을 패널 생성
        JPanel panel = new JPanel();
        // 레이블 또는 다른 패널이 추가될 때 세로 방향으로 나열되도록 레이아웃 설정
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // 문자열을 보일 데코레이터 레이블 생성
        JPanel decoratorPanel = displayComponent.create();
        panel.add(decoratorPanel);
        // 패널에 레이블을 붙임.
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        // 패널의 전체 크기 지정
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        return panel;
    }

    @Override
    public void show() {
        displayComponent.show();
        labelPanel.updateText("Weather: 온도: 20도, 습도: 60");

    }

    @Override
    public int getHeight() {
        return super.getHeight() + displayComponent.getHeight();
    }
}
