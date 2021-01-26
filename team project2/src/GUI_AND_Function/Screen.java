package GUI_AND_Function;

import javax.swing.JButton;
import javax.swing.JLabel;

import Image.Images;

public class Screen {
	Screen(int index) {
		if (index == 1) {  //메인화면에서의 구성
			Project2.back.setVisible(false);
			Project2.selectsize.setVisible(false);
			Project2.manuallbl.setVisible(false);
			Project2.tutorial.setVisible(false);
			Project2.explanation.setVisible(false);
			Project2.left.setVisible(false);
			Project2.right.setVisible(false);
			Project2.screen.setVisible(true);
			Project2.screen.setIcon(Images.mainscreen);
			SetVisiblefunction.setting_off();
			SetVisiblefunction.achivement_off();
			SetVisiblefunction.menuButton_on();
			SetVisiblefunction.levelButton_off();
		}
		if(index ==2) {  //연습 모드 크기 선택 화면에서의 구성
			Project2.back.setVisible(true);
			Project2.screen.setVisible(true);
			Project2.selectsize.setVisible(true);
			Project2.screen.setIcon(Images.practicescreen);
			SetVisiblefunction.menuButton_off();
			SetVisiblefunction.levelButton_on();
			Project2.left.setVisible(false);
			Project2.right.setVisible(false);
			SetVisiblefunction.game_or_title_off();
		}
		if(index ==3) {  //5x5크기 문제 선택 화면에서의 구성
			Project2.screen.setVisible(false);
			Project2.selectsize.setVisible(false);
			Project2.lbl5x5_title[0].setVisible(true);		
			SetVisiblefunction.levelButton_off();
			Project2.game5x5[0].setVisible(true);
			Project2.right.setVisible(true);
			Left_Right_Button.index2=1;
			SetVisiblefunction.puzzle5x5_off();
			Project2.answer_cnt.setVisible(false);
		}
		if(index ==4) {  //5x5크기 게임 화면에서의 구성
			
			Project2.lbl5x5_title[0].setVisible(false);
			Project2.lbl5x5_title[1].setVisible(false);
			Project2.lbl5x5_title[2].setVisible(false);
			Project2.game5x5[0].setVisible(false);
			Project2.game5x5[1].setVisible(false);
			Project2.game5x5[2].setVisible(false);
			Project2.right.setVisible(false);
			Project2.left.setVisible(false);
		}
		if(index ==5) {  //10x10문제 선택 화면에서의 구성
			Project2.screen.setVisible(false);
			Project2.selectsize.setVisible(false);
			Project2.lbl10x10_title[0].setVisible(true);
			SetVisiblefunction.levelButton_off();
			Project2.game10x10[0].setVisible(true);
			Project2.right.setVisible(true);
			Left_Right_Button.index2=1;
			SetVisiblefunction.puzzle10x10_off();
			Project2.answer_cnt.setVisible(false);
		}
		if(index ==6) {  //10x10게임 화면에서의 구성
			Project2.lbl10x10_title[0].setVisible(false);
			Project2.lbl10x10_title[1].setVisible(false);
			Project2.lbl10x10_title[2].setVisible(false);
			Project2.game10x10[0].setVisible(false);
			Project2.game10x10[1].setVisible(false);
			Project2.game10x10[2].setVisible(false);
			Project2.right.setVisible(false);
			Project2.left.setVisible(false);
		}
		if(index ==7) {  //20x20문제 선택 화면에서의 구성
			Project2.screen.setVisible(false);
			Project2.selectsize.setVisible(false);
			Project2.lbl20x20_title[0].setVisible(true);
			SetVisiblefunction.levelButton_off();
			Project2.game20x20[0].setVisible(true);
			Project2.right.setVisible(true);
			Left_Right_Button.index2=1;
			SetVisiblefunction.puzzle20x20_off();
			Project2.answer_cnt.setVisible(false);
		}
		if(index ==8) {  //20x20크기 게임 화면에서의 구성
			Project2.lbl20x20_title[0].setVisible(false);
			Project2.lbl20x20_title[1].setVisible(false);
			Project2.lbl20x20_title[2].setVisible(false);
			Project2.game20x20[0].setVisible(false);
			Project2.game20x20[1].setVisible(false);
			Project2.game20x20[2].setVisible(false);
			Project2.right.setVisible(false);
			Project2.left.setVisible(false);
		}
		if(index ==9) {  //난이도 선택 화면에서의 구성			
			Project2.screen.setVisible(true);
			Project2.screen.setIcon(Images.gamescreen);
			Project2.back.setVisible(true);
			Project2.selectsize.setVisible(true);
			SetVisiblefunction.menuButton_off();
			SetVisiblefunction.levelButton_on();
			Project2.left.setVisible(false);
			Project2.right.setVisible(false);
			Project2.time.setVisible(false);
			SetVisiblefunction.game_or_title_off();
			SetVisiblefunction.puzzle5x5_off();
			SetVisiblefunction.puzzle10x10_off();
			SetVisiblefunction.puzzle20x20_off();
		
		}
		if(index==10) {
			Project2.screen.setVisible(false);
			Project2.selectsize.setVisible(false);
			SetVisiblefunction.levelButton_off();
		}
		if(index==11) {
			Project2.screen.setVisible(false);
			Project2.selectsize.setVisible(false);
			SetVisiblefunction.levelButton_off();
		}
		if(index==12) {
			Project2.screen.setVisible(false);
			Project2.selectsize.setVisible(false);
			SetVisiblefunction.levelButton_off();
		}
		if(index ==15) {  //도움말 화면에서의 구성
			Project2.screen.setVisible(false);
			Project2.back.setVisible(true);
			Project2.manuallbl.setVisible(true);
			Project2.left.setVisible(false);
			Left_Right_Button.index=1;
			Project2.tutorial.setText("게임방법");	
			Project2.explanation.setText("");
			Project2.right.setVisible(true);
			Project2.tutorial.setVisible(true);
			SetVisiblefunction.menuButton_off();
		}
		if(index ==16) {  //환경 설정 화면에서의 구성
			Project2.back.setVisible(true);
			Project2.screen.setVisible(true);
			Project2.screen.setIcon(Images.settingscreen);
			SetVisiblefunction.setting_on();
			SetVisiblefunction.menuButton_off();
		}
		if(index ==17) {  //달성도 화면에서의 구성
			Project2.back.setVisible(true);
			Project2.screen.setVisible(true);
			Project2.screen.setIcon(Images.achivementscreen);
			SetVisiblefunction.menuButton_off();
			SetVisiblefunction.achivement_on();
		}
	}
}
