package Onee;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentDemo extends JFrame {
    ComponentDemo() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 220);
        setVisible(true);
    }

    void showNorth() {
        // 북쪽 영역을 위한 패널들 생성
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(2, 0));

        // 라벨과 텍스트 필드 생성
        JLabel l1 = new JLabel("원의 반지름");
        JLabel l2 = new JLabel("원의 넓이");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        t2.setEnabled(false);

        // 컴포넌트를 패널에 추가
        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        panel.add(p1);
        panel.add(p2);

        // 패널을 프레임의 북쪽에 추가
        add(panel, BorderLayout.NORTH);
    }

    void showCenter() {
        // 중앙 영역을 위한 패널 생성
        JPanel panel = new JPanel();

        // 텍스트 영역 생성 및 초기화
        JTextArea area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타납니다.");
        area.setEditable(false);
        area.setForeground(Color.RED);

        // 텍스트 영역을 패널에 추가
        panel.add(area);

        // 패널을 프레임의 중앙에 추가
        add(panel, BorderLayout.CENTER);
    }

    void showSouth() {
        // 콤보 박스에서 사용할 문자열 배열
        String[] color = { "red", "blue" };

        // 남쪽 영역을 위한 패널 생성
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // 버튼과 콤보 박스, 버튼 생성
        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("리셋");

        // 컴포넌트를 패널에 추가
        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        // 패널을 프레임의 남쪽에 추가
        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new ComponentDemo();
    }
}
