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
				Project2.explanation.setText("�� ũ�⺰ Ŭ���� Ƚ���� ����Ʈ�� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[12]);
				Project2.right.setVisible(true);
				index--;

			} else if (index % 14 == 12) {
				Project2.tutorial.setText("ȯ�漳��");
				Project2.explanation.setText("�뷡�� on/off �� �� ������ �ٸ� �뷡�� ������ �� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[11]);
				index--;

			} else if (index % 14 == 11) {
				Project2.tutorial.setText("�������");
				Project2.explanation.setText("���� �ð��� �ֽ��ϴ�. 5x5: 100��, 10x10: 200��, 20x20:480��");
				Project2.manuallbl.setIcon(Project2.imagemanual[10]);
				index--;

			} else if (index % 14 == 10) {
				Project2.explanation.setText("������ ũ�⸦ ���� �� �ڵ����� ������ ���۵˴ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[9]);
				index--;

			} else if (index % 14 == 9) {
				Project2.explanation.setText("������� Ŭ�� �� ������ ũ�⸦ ������ �� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[8]);
				index--;

			} else if (index % 14 == 8) {
				Project2.tutorial.setText("�������");
				Project2.explanation.setText("���� ������ ĥ�ϸ� ������ ������ �پ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[7]);
				index--;

			} else if (index % 14 == 7) {
				Project2.explanation.setText("������ �����ϸ� ������ ������ ���� ȭ���� ��µ˴ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[6]);
				index--;
			} else if (index % 14 == 6) {
			
				Project2.explanation.setText("������ ���� �� �� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[5]);
				index--;
			} else if (index % 14 == 5) {
				Project2.explanation.setText("������� Ŭ�� �� ������ ũ�⸦ ���� �� �� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[4]);
				index--;
			} else if (index % 14 == 4) {
				Project2.explanation.setVisible(false);
				Project2.tutorial.setText("���ӹ��");
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
				Project2.tutorial.setText("�������");
				Project2.explanation.setText("������� Ŭ�� �� ������ ũ�⸦ ���� �� �� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[4]);
				index++;
			} else if (index % 14 == 5) {
				Project2.explanation.setText("������ ���� �� �� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[5]);
				index++;
			} else if (index % 14 == 6) {
				Project2.explanation.setText("������ �����ϸ� ������ ������ ���� ȭ���� ��µ˴ϴ�.");
				
				Project2.manuallbl.setIcon(Project2.imagemanual[6]);
				index++;
			} else if (index % 14 == 7) {
			
				Project2.explanation.setText("���� ������ ĥ�ϸ� ������ ������ �پ��ϴ�.");
			
				Project2.manuallbl.setIcon(Project2.imagemanual[7]);
				index++;
			} else if (index % 14 == 8) {
				Project2.tutorial.setText("�������");
				Project2.explanation.setText("������� Ŭ�� �� ������ ũ�⸦ ������ �� �ֽ��ϴ�.");
				
				Project2.manuallbl.setIcon(Project2.imagemanual[8]);
				index++;
			} else if (index % 14 == 9) {
				Project2.explanation.setText("������ ũ�⸦ ���� �� �ڵ����� ������ ���۵˴ϴ�.");
			
				Project2.manuallbl.setIcon(Project2.imagemanual[9]);
				index++;
			} else if (index % 14 == 10) {
				Project2.explanation.setText("���� �ð��� �ֽ��ϴ�. 5x5: 100��, 10x10: 200��, 20x20:480��");
				
				Project2.manuallbl.setIcon(Project2.imagemanual[10]);
				index++;
			} else if (index % 14 == 11) {
				Project2.tutorial.setText("ȯ�漳��");
				Project2.explanation.setText("�뷡�� on/off �� �� ������ �ٸ� �뷡�� ������ �� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[11]);
				index++;
			} else if (index % 14 == 12) {
				Project2.tutorial.setText("�޼���");
				Project2.explanation.setText("�� ũ�⺰ Ŭ���� Ƚ���� ����Ʈ�� �ֽ��ϴ�.");
				Project2.manuallbl.setIcon(Project2.imagemanual[12]);
				index++;
			} else if (index % 14 == 13) {
				Project2.explanation.setText("����Ʈ�� Ŭ���� ���ǿ� ���� ��Ʈ�� �����ϴ�. ������ ����Ʈ Ŭ���� �� �׿� �´� ������ ���޵˴ϴ�.");
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
