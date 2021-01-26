package GUI_AND_Function;

public class Back{
public void back(int index) {
	if(index==2) { //연습모드 난이도 선택 화면에서의 뒤로가기 버튼
		Project2.screen_index=1;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==3) { //5x5문제 선택 화면에서의 뒤로가기 버튼
		Project2.screen_index=2;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==4) { //5x5게임화면에서의 뒤로가기 버튼
		Project2.screen_index=3;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==5) { //10x10문제 선택 화면에서의 뒤로가기 버튼
		Project2.screen_index=2;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==6) { //10x10게임화면에서의 뒤로가기 버튼
		Project2.screen_index=5;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==7) { //20x20문제 선택 화면에서의 뒤로가기 버튼
		Project2.screen_index=2;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==8) { //20x20게임화면에서의 뒤로가기 버튼
		Project2.screen_index=7;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==9) { //실전모드 난이도 선택 화면에서의 뒤로가기 버튼
		Project2.screen_index=1;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==10) { //실전모드 게임 화면에서의 뒤로가기 버튼
		Project2.screen_index=9;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==11) { //실전모드 게임 화면에서의 뒤로가기 버튼
		Project2.screen_index=9;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==12) { //실전모드 게임 화면에서의 뒤로가기 버튼
		Project2.screen_index=9;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==15) {  //도움말 화면에서의 뒤로가기 버튼
		Project2.screen_index=1;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==16) {  //도움말 화면에서의 뒤로가기 버튼
		Project2.screen_index=1;
		Screen screen=new Screen(Project2.screen_index);
	}
	if(index==17) {  //달성도 화면에서의 뒤로가기 버튼
		Project2.screen_index=1;
		Screen screen=new Screen(Project2.screen_index);
	}
}
}
