package GUI_AND_Function;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Setting extends JFrame{  //스크롤페인과 버튼 위치, 크기 설정 클래스
	public void setbutton(JButton button,int a, int b, int c, int d,boolean bool,JFrame project2) {

		button.setBounds(a, b, c, d);
		button.setVisible(bool);
		project2.add(button);
		
	}
	public void setlabel(JLabel label,int a, int b, int c, int d,boolean bool,JFrame project2) {

		label.setBounds(a, b, c, d);
		label.setVisible(bool);
		project2.add(label);
	}
	public void set_clean(JButton button) {
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setFocusPainted(false);
	}
}
