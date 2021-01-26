package GUI_AND_Function;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Left_Right_Button {
	static int index = 1;
	static int index2 = 1;

	public static void move(ActionEvent e) {
		if ((JButton) e.getSource() == Project2.left) {

			if (index % 14 == 13) {
				Project2.explanation.setText("각 크기별 클리어 횟수와 퀘스트가 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[12]);
				Project2.right.setVisible(true);
				index--;

			} else if (index % 14 == 12) {
				Project2.tutorial.setText("환경설정");
				Project2.explanation.setText("노래를 on/off 할 수 있으며 다른 노래를 선택할 수 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[11]);
				index--;

			} else if (index % 14 == 11) {
				Project2.tutorial.setText("실전모드");
				Project2.explanation.setText("제한 시간이 있습니다. 5x5: 100초, 10x10: 200초, 20x20:480초");
				Project2.manuallbl.setIcon(Project2.imagemanual[10]);
				index--;

			} else if (index % 14 == 10) {
				Project2.explanation.setText("문제의 크기를 선택 시 자동으로 게임이 시작됩니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[9]);
				index--;

			} else if (index % 14 == 9) {
				Project2.explanation.setText("실전모드 클릭 시 문제의 크기를 선택할 수 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[8]);
				index--;

			} else if (index % 14 == 8) {
				Project2.tutorial.setText("연습모드");
				Project2.explanation.setText("정답 발판을 칠하면 정답의 개수가 줄어듭니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[7]);
				index--;

			} else if (index % 14 == 7) {
				Project2.explanation.setText("게임을 시작하면 정답의 개수와 게임 화면이 출력됩니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[6]);
				index--;
			} else if (index % 14 == 6) {
			
				Project2.explanation.setText("문제를 선택 할 수 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[5]);
				index--;
			} else if (index % 14 == 5) {
				Project2.explanation.setText("연습모드 클릭 시 문제의 크기를 선택 할 수 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[4]);
				index--;
			} else if (index % 14 == 4) {
				Project2.explanation.setVisible(false);
				Project2.tutorial.setText("게임방법");
				Project2.manuallbl.setIcon(Project2.imagemanual[3]);
				index--;
			} else if (index % 14 == 3) {
				Project2.manuallbl.setBounds(312, 180, 400, 400);
				Project2.explanation.setVisible(false);
				Project2.manuallbl.setIcon(Project2.imagemanual[2]);
				index--;
			} else if (index % 14 == 2) {
				Project2.manuallbl.setIcon(Project2.imagemanual[1]);
				index--;
			} else if (index % 14 == 1) {
				Project2.manuallbl.setIcon(Project2.imagemanual[0]);
				Project2.left.setVisible(false);
			}

		} else if ((JButton) e.getSource() == Project2.right)

		{
			if (index % 14 == 1) {
				Project2.manuallbl.setIcon(Project2.imagemanual[1]);
				Project2.left.setVisible(true);
				index++;
			} else if (index % 14 == 2) {
				Project2.manuallbl.setIcon(Project2.imagemanual[2]);
				index++;
			} else if (index % 14 == 3) {
				Project2.manuallbl.setBounds(220, 80, 600, 600);
				Project2.manuallbl.setIcon(Project2.imagemanual[3]);
				index++;
			} else if (index % 14 == 4) {
				Project2.explanation.setVisible(true);
				Project2.tutorial.setText("연습모드");
				Project2.explanation.setText("연습모드 클릭 시 문제의 크기를 선택 할 수 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[4]);
				index++;
			} else if (index % 14 == 5) {
				Project2.explanation.setText("문제를 선택 할 수 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[5]);
				index++;
			} else if (index % 14 == 6) {
				Project2.explanation.setText("게임을 시작하면 정답의 개수와 게임 화면이 출력됩니다.");
				
				Project2.manuallbl.setIcon(Project2.imagemanual[6]);
				index++;
			} else if (index % 14 == 7) {
			
				Project2.explanation.setText("정답 발판을 칠하면 정답의 개수가 줄어듭니다.");
			
				Project2.manuallbl.setIcon(Project2.imagemanual[7]);
				index++;
			} else if (index % 14 == 8) {
				Project2.tutorial.setText("실전모드");
				Project2.explanation.setText("실전모드 클릭 시 문제의 크기를 선택할 수 있습니다.");
				
				Project2.manuallbl.setIcon(Project2.imagemanual[8]);
				index++;
			} else if (index % 14 == 9) {
				Project2.explanation.setText("문제의 크기를 선택 시 자동으로 게임이 시작됩니다.");
			
				Project2.manuallbl.setIcon(Project2.imagemanual[9]);
				index++;
			} else if (index % 14 == 10) {
				Project2.explanation.setText("제한 시간이 있습니다. 5x5: 100초, 10x10: 200초, 20x20:480초");
				
				Project2.manuallbl.setIcon(Project2.imagemanual[10]);
				index++;
			} else if (index % 14 == 11) {
				Project2.tutorial.setText("환경설정");
				Project2.explanation.setText("노래를 on/off 할 수 있으며 다른 노래를 선택할 수 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[11]);
				index++;
			} else if (index % 14 == 12) {
				Project2.tutorial.setText("달성도");
				Project2.explanation.setText("각 크기별 클리어 횟수와 퀘스트가 있습니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[12]);
				index++;
			} else if (index % 14 == 13) {
				Project2.explanation.setText("퀘스트의 클리어 조건에 대한 힌트는 없습니다. 하지만 퀘스트 클리어 시 그에 맞는 보상이 지급됩니다.");
				Project2.manuallbl.setIcon(Project2.imagemanual[13]);
				Project2.right.setVisible(false);
			
			}
		}
	}

	public static void gamemove(ActionEvent e, JButton[] game, JLabel[] title, ImageIcon[] image) {
		if ((JButton) e.getSource() == Project2.left) {
			if (index2 % 3 == 2) {
				game[1].setIcon(image[1]);
				game[1].setVisible(true);
				game[2].setVisible(false);

				title[1].setVisible(true);
				title[2].setVisible(false);

				Project2.right.setVisible(true);
				index2--;
			} else if (index2 % 3 == 1) {
				game[0].setIcon(image[0]);
				game[0].setVisible(true);
				game[1].setVisible(false);

				title[0].setVisible(true);
				title[1].setVisible(false);
				Project2.left.setVisible(false);
			}
		} else if ((JButton) e.getSource() == Project2.right) {
			if (index2 % 3 == 1) {
				game[1].setIcon(image[1]);
				game[1].setVisible(true);
				game[0].setVisible(false);

				title[1].setVisible(true);
				title[0].setVisible(false);
				Project2.left.setVisible(true);
				index2++;
			} else if (index2 % 3 == 2) {
				game[2].setIcon(image[2]);
				game[2].setVisible(true);
				game[1].setVisible(false);

				title[2].setVisible(true);
				title[1].setVisible(false);
				Project2.right.setVisible(false);
			}

		}
	}
}
