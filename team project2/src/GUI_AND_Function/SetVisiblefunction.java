package GUI_AND_Function;

import javax.swing.JButton;

public class SetVisiblefunction {
	public static void menuButton_off() {
		Project2.practice.setVisible(false);  
		Project2.game.setVisible(false);  
		Project2.manual.setVisible(false);  
		Project2.setting.setVisible(false);  
		Project2.achivement.setVisible(false);  
		Project2.menuexit.setVisible(false);  
	}
	public static void menuButton_on() {
		Project2.practice.setVisible(true);  
		Project2.game.setVisible(true);  
		Project2.manual.setVisible(true);  
		Project2.setting.setVisible(true);  
		Project2.achivement.setVisible(true);  
		Project2.menuexit.setVisible(true);  
	}
	public static void levelButton_on() {

		Project2.easy.setVisible(true); 
		Project2.normal.setVisible(true); 
		Project2.hard.setVisible(true); 

	}
	public static void levelButton_off() {
 
		Project2.easy.setVisible(false); 
		Project2.normal.setVisible(false); 
		Project2.hard.setVisible(false); 
	}
	public static void game_or_title_off() {
		Project2.game5x5[0].setVisible(false);
		Project2.game5x5[1].setVisible(false);
		Project2.game5x5[2].setVisible(false);
		Project2.game10x10[0].setVisible(false);
		Project2.game10x10[1].setVisible(false);
		Project2.game10x10[2].setVisible(false);
		Project2.game20x20[0].setVisible(false);
		Project2.game20x20[1].setVisible(false);
		Project2.game20x20[2].setVisible(false);
		Project2.lbl5x5_title[0].setVisible(false);
		Project2.lbl5x5_title[1].setVisible(false);
		Project2.lbl5x5_title[2].setVisible(false);
		Project2.lbl10x10_title[0].setVisible(false);
		Project2.lbl10x10_title[1].setVisible(false);
		Project2.lbl10x10_title[2].setVisible(false);
		Project2.lbl20x20_title[0].setVisible(false);
		Project2.lbl20x20_title[1].setVisible(false);
		Project2.lbl20x20_title[2].setVisible(false);
	}
	public static void puzzle5x5_off() {
		Project2.hint_one.setVisible(false);
		Project2.hint_two.setVisible(false);
		try {
			for(int i=0;i<5;i++) 
				for(int j=0;j<5;j++)
					Project2.puzzle5x5[i][j].setVisible(false);
			}
			catch(Exception e){
				
			}
	}
	public static void puzzle10x10_off() {
		Project2.hint_one.setVisible(false);
		Project2.hint_two.setVisible(false);
		try {
			for(int i=0;i<10;i++) 
				for(int j=0;j<10;j++)
					Project2.puzzle10x10[i][j].setVisible(false);
			}
			catch(Exception e){
				
			}
	}
	public static void puzzle20x20_off() {
		Project2.hint_one.setVisible(false);
		Project2.hint_two.setVisible(false);
		try {
			for(int i=0;i<20;i++) 
				for(int j=0;j<20;j++)
					Project2.puzzle20x20[i][j].setVisible(false);
			}
			catch(Exception e){
				
			}
	}
	public static void setting_off() {
		Project2.music_off.setVisible(false);
		Project2.music_basic.setVisible(false);
		Project2.music_type1.setVisible(false);
		Project2.music_type2.setVisible(false);
		Project2.music_type3.setVisible(false);
		Project2.hidden_music.setVisible(false);
		Project2.hidden_music2.setVisible(false);
		Project2.copyright.setVisible(false);
	}
	public static void setting_on() {
		Project2.music_off.setVisible(true);
		Project2.music_basic.setVisible(true);
		Project2.music_type1.setVisible(true);
		Project2.music_type2.setVisible(true);
		Project2.music_type3.setVisible(true);
		Project2.hidden_music.setVisible(true);
		Project2.hidden_music2.setVisible(true);
		Project2.copyright.setVisible(true);
	}
	public static void achivement_off() {
		Project2.quest.setVisible(false);
		Project2.hidden[0].setVisible(false);
		Project2.hidden[1].setVisible(false);
		Project2.clearlbl[0].setText("5x5크기 클리어 횟수: "+Project2.clear[0]);
		Project2.clearlbl[1].setText("10x10크기 클리어 횟수: "+Project2.clear[1]);
		Project2.clearlbl[2].setText("20x20크기 클리어 횟수: "+Project2.clear[2]);
		Project2.clearlbl[0].setVisible(false);
		Project2.clearlbl[1].setVisible(false);
		Project2.clearlbl[2].setVisible(false);
}
	public static void achivement_on() {
		Project2.quest.setVisible(true);
		Project2.hidden[0].setVisible(true);
		Project2.hidden[1].setVisible(true);
		Project2.clearlbl[0].setText("5x5크기 클리어 횟수: "+Project2.clear[0]);
		Project2.clearlbl[1].setText("10x10크기 클리어 횟수: "+Project2.clear[1]);
		Project2.clearlbl[2].setText("20x20크기 클리어 횟수: "+Project2.clear[2]);
		Project2.clearlbl[0].setVisible(true);
		Project2.clearlbl[1].setVisible(true);
		Project2.clearlbl[2].setVisible(true);
}
}
