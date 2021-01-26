package Message;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class License extends JFrame{
	public License() {
		Font a=new Font("바탕",Font.BOLD,12);
		Font b=new Font("돋움",Font.PLAIN,12);
		setTitle("일정 소개");
		setSize(500, 200);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		
		 JTextArea multi = new JTextArea("제작자\nBackground: Biscuit(Prod. by Lukrembo)\n");
		 multi.append("type1: For U(Prod. by Ksolis)\n");
		 multi.append("type2: Come With Us(Prod. by Nat Keefe & Hot Buttered Rum)\n");
		 multi.append("type3: Greaser(Prod. by TrackTribe)\n");
		 multi.append("hidden: Block Party(Prod. by Bad Snacks)\n");
		 multi.append("hidden2: New Moon(Prod. by Bad Snacks)\n");
		 multi.setFont(a);
		 multi.setBounds(0,20,400,380);
		 multi.setWrapStyleWord(true); 
		 multi.setLineWrap(true); 
		 multi.setEditable(false); 
		
		add(multi);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null);  //화면 중앙에 오도록 하는 설정
		setVisible(true);

	}
}
