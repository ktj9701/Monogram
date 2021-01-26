package GUI_AND_Function;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.event.*;

import Message.License;
import Image.Images;

public class Project2 extends JFrame implements Runnable {
	Font font = new Font("맑은 고딕", Font.BOLD, 30);
	Font answer_font = new Font("맑은 고딕", Font.BOLD, 15);
	Font timer_font = new Font("맑은 고딕", Font.BOLD, 20);
	Font title_font = new Font("맑은 고딕", Font.BOLD, 30);
	static JLabel screen = new JLabel();
	public static ImageIcon backgroundscreen = new ImageIcon(Driver2.class.getResource("../images/gamebackground.png"));
	static ImageIcon[] imagemanual = new ImageIcon[14]; // 게임 방법 사진 변수
	static ImageIcon[] image5x5 = new ImageIcon[3]; // 5x5 크기의 문제 사진
	static ImageIcon[] image5x5_hint1 = new ImageIcon[3]; // 5x5 크기의 문제의 가로 힌트
	static ImageIcon[] image5x5_hint2 = new ImageIcon[3]; // 5x5 크기의 문제의 세로 힌트
	static ImageIcon[] image10x10 = new ImageIcon[3]; // 10x10 크기의 문제의 힌트
	static ImageIcon[] image10x10_hint1 = new ImageIcon[3]; // 10x10 크기의 문제의 가로 힌트
	static ImageIcon[] image10x10_hint2 = new ImageIcon[3]; // 10x10 크기의 문제의 세로 힌트
	static ImageIcon[] image20x20 = new ImageIcon[3]; // 20x20 크기의 문제의 힌트
	static ImageIcon[] image20x20_hint1 = new ImageIcon[3]; // 20x20 크기의 문제의 가로 힌트
	static ImageIcon[] image20x20_hint2 = new ImageIcon[3];// 20x20 크기의 문제의 세로 힌트

//시작화면 
	JLabel project_name = new JLabel();
	JButton start = new JButton("게임시작");
	JButton exit = new JButton("종료");

//메인화면 버튼
	static JButton practice = new JButton("연습게임");
	static JButton game = new JButton("실전게임");
	static JButton manual = new JButton("도움말");
	static JButton setting = new JButton("환경설정");
	static JButton achivement = new JButton();
	static JButton menuexit = new JButton("종료");

//게임모드 버튼
	static JButton easy = new JButton("5X5");
	static JButton normal = new JButton("10X10");
	static JButton hard = new JButton("20X20");

	// 도움말 버튼 및 컴포넌트
	static JButton left = new JButton();
	static JButton right = new JButton();
	static JLabel manuallbl = new JLabel();
	static JLabel tutorial = new JLabel("게임방법");
	static JLabel explanation = new JLabel();
	
	
	// 환경설정 버튼
	static JButton music_off = new JButton("음악 끄기"); // 음악 끄기 버튼
	static JButton music_basic = new JButton("기본음악"); // 음악 켜기 버튼
	static JButton music_type1 = new JButton("type1"); // 타입1 음악 켜기 버튼
	static JButton music_type2 = new JButton("type2"); // 타입2 음악 켜기 버튼
	static JButton music_type3 = new JButton("type3"); // 타입2 음악 켜기 버튼
	static JButton hidden_music = new JButton("hidden"); // 타입2 음악 켜기 버튼
	static JButton hidden_music2 = new JButton("hidden2"); // 타입2 음악 켜기 버튼
	static JButton copyright = new JButton("라이센스"); // 음악 제작자 버튼

	// 문제 선택화면 컴포넌트
	static JLabel selectsize= new JLabel();
	static JButton game5x5[] = new JButton[3]; // 5x5 크기의 문제 버튼
	static JLabel[] lbl5x5_title = new JLabel[3]; // 문제 제목
	static JButton game10x10[] = new JButton[3]; // 10x10 크기의 문제 버튼
	static JLabel[] lbl10x10_title = new JLabel[3]; // 문제 제목
	static JButton game20x20[] = new JButton[3]; // 20x20 크기의 문제 버튼
	static JLabel[] lbl20x20_title = new JLabel[3]; // 문제 제목
	static JButton puzzle5x5[][] = new JButton[5][5]; // 5x5 크기의 문제 버튼
	static JButton puzzle10x10[][] = new JButton[10][10]; // 10x10 크기의 문제 버튼
	static JButton puzzle20x20[][] = new JButton[20][20]; // 20x20 크기의 문제 버튼

	// 뒤로가기 버튼 & 화면 전환
	static JButton back = new JButton();
	static int screen_index = 0; // 시작화면은 0번 (각 화면마다 고유 번호를 지정해줄 것)
	static int random;
	int answer = 0;
	static JLabel answer_cnt = new JLabel();

	int ok_stack = 0;
	int no_stack = 0;
	static JLabel hint_one = new JLabel();
	static JLabel hint_two = new JLabel();

	// 달성도 화면 설정
	static int clear[] = { 0, 0, 0 }; // 각 크기별의 문제 점수
	static JLabel clearlbl[] = new JLabel[3]; // clear 출력할 레이블
	static JButton hidden[] = new JButton[2];
	static boolean hidden_boolean[] = { false, false };
	static JLabel quest = new JLabel("퀘스트");
	// 패널
	static JPanel background = new JPanel() {
		public void paintComponent(Graphics g) {
			g.drawImage(backgroundscreen.getImage(), 0, 0, null); // 사진은 나중에 찾기
			setOpaque(false);
			super.paintComponent(g);
		}
	};

	// 이벤트 목록
	startlistener startlistener = new startlistener(); // 시작화면 버튼 이벤트
	menulistener menulistener = new menulistener(); // 메뉴화면 버튼 이벤트
	gamelistener gamelistener = new gamelistener(); // 버튼 이벤트
	praticelistener praticeevent = new praticelistener(); // 연습모드 화면 내의 버튼들의 이벤트
	settinglistener settinglistener = new settinglistener(); // 환경설정 화면 내의 버튼들의 이벤트
	achivementlistener achivementlistener = new achivementlistener(); // 달성도 화면 내의 버튼들의 이벤트
	answerlistener answerevent = new answerlistener(); // 답 클릭 버튼 이벤트
	etclistener etclistener = new etclistener();

	// 외부 클래스 모음
	Setting set = new Setting(); // 좌표 ,크기 설정 클래스
	Left_Right_Button move = new Left_Right_Button(); // 좌우 이동 버튼 이벤트클래스
	Back bac = new Back();
	Music BackgroundMusic = new Music("intromusic.mp3", true);
	quicksort quick = new quicksort();
	Random Random = new Random();
	// 시간
	Thread t;
	static int minute = 0; // 분
	static int second = 0; // 초
	static int timer = 0; // 경과 시간(초)
	static JLabel time = new JLabel(); // 타임을 알려주는 레이블

	public Project2() {
		t = new Thread(this); // 쓰레드 선언
		BackgroundMusic.start(); // 노래 재생

		setTitle("PIXEL BEGINNER");
		setSize(Driver2.SCREEN_WIDTH, Driver2.SCREEN_HEIGHT);
		
	
		
		// 사진 배열에 사진 선언
		imagemanual[0] = Images.manual1;
		imagemanual[1] = Images.manual2;
		imagemanual[2] = Images.manual3;
		imagemanual[3]=Images.block_flow;
		imagemanual[4] = Images.pratice1;
		imagemanual[5]= Images.pratice2;
		imagemanual[6] = Images.pratice3;
		imagemanual[7] = Images.pratice4;
		imagemanual[8] = Images.game1;
		imagemanual[9] = Images.game2;
		imagemanual[10]= Images.game3;
		imagemanual[11] = Images.setting1;
		imagemanual[12] = Images.achivement1;
		imagemanual[13] = Images.achivement2;
		
		
		
		image5x5[0] = Images.home;
		image5x5[1] = Images.question_mark;
		image5x5[2] = Images.북녘북;
		image5x5_hint1[0] = Images.home_one;
		image5x5_hint1[1] = Images.question_mark_one;
		image5x5_hint1[2] = Images.북녘북_one;
		image5x5_hint2[0] = Images.home_two;
		image5x5_hint2[1] = Images.question_mark_two;
		image5x5_hint2[2] = Images.북녘북_two;

		image10x10[0] = Images.rabbit;
		image10x10[1] = Images.camel;
		image10x10[2] = Images.dinosaur;
		image10x10_hint1[0] = Images.rabbit_one;
		image10x10_hint1[1] = Images.camel_one;
		image10x10_hint1[2] = Images.dinosaur_one;
		image10x10_hint2[0] = Images.rabbit_two;
		image10x10_hint2[1] = Images.camel_two;
		image10x10_hint2[2] = Images.dinosaur_two;
		image20x20[0] = Images.cherry;
		image20x20[1] = Images.bear;
		image20x20[2] = Images.captain;
		image20x20_hint1[0] = Images.cherry_one;
		image20x20_hint1[1] = Images.bear_one;
		image20x20_hint1[2] = Images.captain_one;
		image20x20_hint2[0] = Images.cherry_two;
		image20x20_hint2[1] = Images.bear_two;
		image20x20_hint2[2] = Images.captain_two;

		background.setLayout(null);
		setContentPane(background);
		set.setlabel(project_name, 730, 60, 250, 200, true, this);
		project_name.setIcon(Images.name);
		set.setlabel(screen, 0, 0, 1024, 690, true, this);
		screen.setIcon(Images.startscreen);
		// 시작, 메인화면 버튼 설정
		set.setbutton(start, 760, 400, 120, 45, true, this);
		start.setIcon(Images.start);
		set.set_clean(start);
		set.setbutton(exit, 760, 460, 120, 45, true, this);
		exit.setIcon(Images.exit);
		set.set_clean(exit);
		set.setbutton(practice, 780, 100, 120, 70, false, this);
		practice.setIcon(Images.practice);
		set.set_clean(practice);
		set.setbutton(game, 780, 200, 120, 70, false, this);
		game.setIcon(Images.game);
		set.set_clean(game);
		set.setbutton(manual, 780, 300, 120, 70, false, this);
		manual.setIcon(Images.manual);
		set.set_clean(manual);
		set.setbutton(setting, 780, 400, 120, 70, false, this);
		setting.setIcon(Images.setting);
		set.set_clean(setting);
		set.setbutton(achivement, 770, 500, 120, 70, false, this);
		achivement.setIcon(Images.achivement);
		set.set_clean(achivement);
		set.setbutton(menuexit, 780, 600, 120, 70, false, this);
		menuexit.setIcon(Images.menuexit);
		set.set_clean(menuexit);
		// 게임 크기 선택 버튼 설정
		set.setbutton(easy, 750, 200, 150, 70, false, this);
		easy.setIcon(Images.easy);
		set.set_clean(easy);
		set.setbutton(normal, 750, 300, 150, 70, false, this);
		normal.setIcon(Images.normal);
		set.set_clean(normal);
		set.setbutton(hard, 750, 400, 150, 70, false, this);
		hard.setIcon(Images.hard);
		set.set_clean(hard);
		set.setlabel(selectsize, 720, 100, 180, 70, false, this);
		selectsize.setIcon(Images.size);
		// 왼쪽 오른쪽 전환 버튼 설정
		set.setbutton(left, 110, 310, 40, 40, false, this);
		left.setIcon(Images.left);
		set.set_clean(left);
		set.setbutton(right, 850, 310, 40, 40, false, this);
		right.setIcon(Images.right);
		set.set_clean(right);
		// 환경설정 화면 버튼 설정
		set.setbutton(music_off, 720, 400, 260, 70, false, this);
		set.setbutton(music_basic, 740, 100, 55, 70, false, this);
		music_basic.setIcon(Images.music_1);
		set.set_clean(music_basic);
		set.setbutton(music_type1, 880, 100, 90, 70, false, this);
		music_type1.setIcon(Images.music_2);
		set.set_clean(music_type1);
		set.setbutton(music_type2, 720, 200, 95, 70, false, this);
		music_type2.setIcon(Images.music_3);
		set.set_clean(music_type2);
		set.setbutton(music_type3, 880, 200, 90, 70, false, this);
		music_type3.setIcon(Images.music_4);
		set.set_clean(music_type3);
		set.setbutton(hidden_music, 720, 300, 100, 70, false, this);
		set.setbutton(hidden_music2, 880, 300, 100, 70, false, this);
		set.setbutton(copyright, 840, 600, 160, 70, false, this);
		// 뒤로가기 버튼 설정
		set.setbutton(back, 946, 0, 64, 64, false, this);
		back.setIcon(Images.back);
		set.set_clean(back);
		// 게임 행렬 (로직) 설정
		game5x5[0] = new JButton();
		game5x5[1] = new JButton();
		game5x5[2] = new JButton();
		set.setbutton(game5x5[0], 300, 200, 400, 400, false, this);
		set.setbutton(game5x5[1], 300, 200, 400, 400, false, this);
		set.setbutton(game5x5[2], 300, 200, 400, 400, false, this);

		game10x10[0] = new JButton();
		game10x10[1] = new JButton();
		game10x10[2] = new JButton();
		set.setbutton(game10x10[0], 300, 200, 400, 400, false, this);
		set.setbutton(game10x10[1], 300, 200, 400, 400, false, this);
		set.setbutton(game10x10[2], 300, 200, 400, 400, false, this);

		game20x20[0] = new JButton();
		game20x20[1] = new JButton();
		game20x20[2] = new JButton();
		set.setbutton(game20x20[0], 250, 150, 500, 500, false, this);
		set.setbutton(game20x20[1], 250, 150, 500, 500, false, this);
		set.setbutton(game20x20[2], 250, 150, 500, 500, false, this);

		// 버튼 이벤트 처리
		start.addActionListener(startlistener);
		exit.addActionListener(startlistener);

		practice.addActionListener(menulistener);
		game.addActionListener(menulistener);
		manual.addActionListener(menulistener);
		setting.addActionListener(menulistener);
		achivement.addActionListener(menulistener);
		menuexit.addActionListener(menulistener);

		left.addActionListener(etclistener); // 시작 버튼 이벤트
		right.addActionListener(etclistener); // 시작 버튼 이벤트
		back.addActionListener(etclistener); // 뒤로 가기 버튼 이벤트

		music_off.addActionListener(settinglistener); // 음악 끄기 버튼 이벤트
		music_basic.addActionListener(settinglistener); // 음악 켜기 버튼 이벤트
		music_type1.addActionListener(settinglistener); // 음악 켜기 버튼 이벤트
		music_type2.addActionListener(settinglistener); // 음악 켜기 버튼 이벤트
		music_type3.addActionListener(settinglistener); // 음악 켜기 버튼 이벤트
		hidden_music.addActionListener(settinglistener); // 음악 켜기 버튼 이벤트
		hidden_music2.addActionListener(settinglistener); // 음악 켜기 버튼 이벤트
		copyright.addActionListener(settinglistener); // 라이센스 버튼 이벤트

		easy.addActionListener(gamelistener);
		normal.addActionListener(gamelistener);
		hard.addActionListener(gamelistener);

		game5x5[0].addActionListener(praticeevent);
		game5x5[1].addActionListener(praticeevent);
		game5x5[2].addActionListener(praticeevent);
		game10x10[0].addActionListener(praticeevent);
		game10x10[1].addActionListener(praticeevent);
		game10x10[2].addActionListener(praticeevent);
		game20x20[0].addActionListener(praticeevent);
		game20x20[1].addActionListener(praticeevent);
		game20x20[2].addActionListener(praticeevent);

		// 퍼즐 제목 레이블 설정
		lbl5x5_title[0] = new JLabel("당신이 매일 가는 곳");
		lbl5x5_title[1] = new JLabel("?");
		lbl5x5_title[2] = new JLabel("북쪽");
		set.setlabel(lbl5x5_title[0], 500, 70, 150, 100, false, this);
		set.setlabel(lbl5x5_title[1], 360, 70, 300, 100, false, this);
		set.setlabel(lbl5x5_title[2], 475, 70, 150, 100, false, this);
		lbl5x5_title[0].setFont(title_font);
		lbl5x5_title[1].setFont(title_font);
		lbl5x5_title[2].setFont(title_font);

		lbl10x10_title[0] = new JLabel("달리는 토끼");
		lbl10x10_title[1] = new JLabel("낙타");
		lbl10x10_title[2] = new JLabel("공룡");
		set.setlabel(lbl10x10_title[0], 475, 70, 300, 100, false, this);
		set.setlabel(lbl10x10_title[1], 475, 70, 300, 100, false, this);
		set.setlabel(lbl10x10_title[2], 420, 70, 300, 100, false, this);
		lbl10x10_title[0].setFont(title_font);
		lbl10x10_title[1].setFont(title_font);
		lbl10x10_title[2].setFont(title_font);

		lbl20x20_title[0] = new JLabel("체리");
		lbl20x20_title[1] = new JLabel("곰돌이");
		lbl20x20_title[2] = new JLabel("후크 선장");
		set.setlabel(lbl20x20_title[0], 450, 70, 150, 100, false, this);
		set.setlabel(lbl20x20_title[1], 470, 70, 150, 100, false, this);
		set.setlabel(lbl20x20_title[2], 450, 70, 150, 100, false, this);
		lbl20x20_title[0].setFont(title_font);
		lbl20x20_title[1].setFont(title_font);
		lbl20x20_title[2].setFont(title_font);
		
		
		// 사전순 정렬
		lbl5x5_title = quick.quickSort(lbl5x5_title, game5x5, image5x5, image5x5_hint1, image5x5_hint2, 0,
				lbl5x5_title.length - 1, Puzzle5x5.answer_5x5);
		lbl10x10_title = quick.quickSort(lbl10x10_title, game10x10, image10x10, image10x10_hint1, image10x10_hint2, 0,
				lbl10x10_title.length - 1, Puzzle10x10.answer_10x10);
		lbl20x20_title = quick.quickSort(lbl20x20_title, game20x20, image20x20, image20x20_hint1, image20x20_hint2, 0,
				lbl20x20_title.length - 1, Puzzle20x20.answer_20x20);

		// 정답 갯수 레이블 설정
		set.setlabel(answer_cnt, 800, 250, 200, 80, false, this);
		answer_cnt.setFont(answer_font);
		// 타이머 레이블 설정
		set.setlabel(time, 800, 120, 200, 80, false, this);
		time.setText("0");
		time.setFont(timer_font);
		// 메뉴얼 레이블 설정
		set.setlabel(manuallbl, 312, 180, 400, 400, false, this);
		set.setlabel(tutorial, 440, 40, 400, 100, false, this);
		tutorial.setFont(title_font);
		explanation.setBounds(400,600,600,50);
		explanation.setVisible(false);
		add(explanation);
		
		// 달성도 화면 내에 버튼 및 레이블 설정
		hidden[0] = new JButton();
		hidden[1] = new JButton();
		set.setbutton(hidden[0], 750, 200, 60, 60, false, this);
		hidden[0].setIcon(Images.hidden_1);
		set.set_clean(hidden[0]);
		set.setbutton(hidden[1], 860, 200, 60, 60, false, this);
		hidden[1].setIcon(Images.hidden_2);
		set.set_clean(hidden[1]);

		set.setlabel(quest, 790, 100, 200, 60, false, this);
		quest.setFont(font);
		hidden[0].addActionListener(achivementlistener);
		hidden[1].addActionListener(achivementlistener);
		clearlbl[0] = new JLabel("5x5크기 클리어 횟수: " + clear[0]);
		clearlbl[1] = new JLabel("10x10크기 클리어 횟수: " + clear[1]);
		clearlbl[2] = new JLabel("20x20크기 클리어 횟수: " + clear[2]);
		set.setlabel(clearlbl[0], 750, 300, 150, 70, false, this);
		set.setlabel(clearlbl[1], 750, 350, 150, 70, false, this);
		set.setlabel(clearlbl[2], 750, 400, 150, 70, false, this);

		// 게임 힌트 레이블 설정
		hint_one.setVisible(false);
		add(hint_one);
		hint_two.setVisible(false);
		add(hint_two);

		setVisible(true);
		setResizable(false); // 프로그램 크기 조절 불가 설정
		setLocationRelativeTo(null); // 화면 중앙에 오도록 하는 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class startlistener implements ActionListener { // 초기 화면 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if ((JButton) e.getSource() == start) { // 시작버튼 이벤트
				screen_index = 1; // 메인화면은 1번
				start.setVisible(false);
				exit.setVisible(false);
				project_name.setVisible(false);
				Screen screen = new Screen(screen_index);
			} else if ((JButton) e.getSource() == exit)
				System.exit(0); // 종료
		}
	}

	class menulistener implements ActionListener { // 메뉴 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			if ((JButton) e.getSource() == menuexit) // 종료 버튼 이벤트
				System.exit(0); // 종료
			else if ((JButton) e.getSource() == practice) { // 연습모드 이벤트
				screen_index = 2; // 난이도 설정 화면은 2번
				Screen screen = new Screen(screen_index);
			} else if ((JButton) e.getSource() == game) { // 실전모드 이벤트
				screen_index = 9; // 실전모드 퍼즐 크기 선택 화면은 9번
				Screen screen = new Screen(screen_index);
			} else if ((JButton) e.getSource() == manual) { // 도움말 이벤트
				screen_index = 15; // 도움말 화면은 15번
				manuallbl.setIcon(imagemanual[0]);
				Screen screen = new Screen(screen_index);
			} else if ((JButton) e.getSource() == setting) { // 환경설정 이벤트
				screen_index = 16; // 환경설정 화면은 16번
				Screen screen = new Screen(screen_index);
			} else if ((JButton) e.getSource() == achivement) { // 달성도 이벤트
				screen_index = 17; // 달성도는 17번
				Screen screen = new Screen(screen_index);
			}
		}
	}

	class gamelistener implements ActionListener { // 문제 크기 버튼 이벤트
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if ((JButton) e.getSource() == easy) { // 5x5 문제 선택 이벤트
				if (screen_index == 2) { // 연습 모드로 입장 시
					screen_index = 3;
					game5x5[0].setVisible(true);
					Screen screen = new Screen(screen_index);
				} else if (screen_index == 9) { // 실전모드로 입장 시
					screen_index = 10;
					//Random Random = new Random();
					random = Random.nextInt(3);
					Screen screen = new Screen(screen_index);
					JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요.");
					hint_one.setBounds(300, 50, 400, 150);
					hint_two.setBounds(150, 200, 150, 400);
					hint_one.setIcon(image5x5_hint1[random]);
					hint_one.setVisible(true);
					hint_two.setIcon(image5x5_hint2[random]);// 힌트 예시
					hint_two.setVisible(true);
					ok_stack = 0;
					no_stack = 0;
					answer = Puzzle5x5.answer_5x5[random];
					Puzzle5x5 puzzle = new Puzzle5x5(lbl5x5_title[random].getText());
					manage_puzzle5x5();
					timer = 0;
					t.start();
					time.setVisible(true);
				}
			} else if ((JButton) e.getSource() == normal) { // 10x10 문제 선택 이벤트
				if (screen_index == 2) { // 연습모드로 입장시
					screen_index = 5;
					game10x10[0].setVisible(true);
					Screen screen = new Screen(screen_index);
				} else if (screen_index == 9) { // 실전모드로 입장시
					screen_index = 11;
					//Random Random = new Random();
					random = Random.nextInt(3);
					Screen screen = new Screen(screen_index);
					JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요.");
					hint_one.setBounds(300, 50, 400, 150);
					hint_two.setBounds(150, 200, 150, 400);
					hint_one.setIcon(image10x10_hint1[random]);
					hint_one.setVisible(true);
					hint_two.setIcon(image10x10_hint2[random]);// 힌트 예시
					hint_two.setVisible(true);
					ok_stack = 0;
					no_stack = 0;
					answer = Puzzle10x10.answer_10x10[random];
					Puzzle10x10 puzzle = new Puzzle10x10(lbl10x10_title[random].getText());
					timer = 0;
					t.start();
					time.setVisible(true);
					manage_puzzle10x10();
				}
			} else if ((JButton) e.getSource() == hard) { // 20x20 문제 선택 이벤트
				if (screen_index == 2) { // 연습 모드로 입장 시
					screen_index = 7;
					game20x20[0].setVisible(true);
					Screen screen = new Screen(screen_index);
				} else if (screen_index == 9) { // 실전모드로 입장 시
					screen_index = 12;
					
					random = Random.nextInt(3);
					Screen screen = new Screen(screen_index);
					JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요.");
					hint_one.setBounds(300, 0, 500, 150);
					hint_two.setBounds(150, 150, 150, 500);
					hint_one.setIcon(image20x20_hint1[random]);
					hint_one.setVisible(true);
					hint_two.setIcon(image20x20_hint2[random]);// 힌트 예시
					hint_two.setVisible(true);
					ok_stack = 0;
					no_stack = 0;
					answer = Puzzle20x20.answer_20x20[random];
					Puzzle20x20 puzzle = new Puzzle20x20(lbl20x20_title[random].getText());
					timer = 0;
					t.start();
					time.setVisible(true);
					manage_puzzle20x20();
				}
			}
		}
	}

	class settinglistener implements ActionListener { // 환경설정 내의 버튼들의 이벤트
		public void actionPerformed(ActionEvent e) {
			if ((JButton) e.getSource() == music_off) // 노래 끄기 이벤트
				BackgroundMusic.close();

			else if ((JButton) e.getSource() == music_basic) { // 노래 켜기 이벤트
				BackgroundMusic.close();
				BackgroundMusic = new Music("intromusic.mp3", true);
				BackgroundMusic.start();
			} else if ((JButton) e.getSource() == music_type1) { // 노래 켜기 이벤트
				BackgroundMusic.close();
				BackgroundMusic = new Music("type1.mp3", true);
				BackgroundMusic.start();
			} else if ((JButton) e.getSource() == music_type2) { // 노래 켜기 이벤트
				BackgroundMusic.close();
				BackgroundMusic = new Music("type2.mp3", true);
				BackgroundMusic.start();
			} else if ((JButton) e.getSource() == music_type3) { // 노래 켜기 이벤트
				BackgroundMusic.close();
				BackgroundMusic = new Music("type3.mp3", true);
				BackgroundMusic.start();
			} else if ((JButton) e.getSource() == hidden_music) { // 노래 켜기 이벤트
				if (hidden_boolean[0] == true) {
					BackgroundMusic.close();
					BackgroundMusic = new Music("hidden.mp3", true);
					BackgroundMusic.start();
				} else
					JOptionPane.showMessageDialog(null, "퀘스트 클리어를 하세요");
			} else if ((JButton) e.getSource() == copyright) { // 라이센스 이벤트
				License license = new License();
			} else if ((JButton) e.getSource() == hidden_music2) { // 노래 켜기 이벤트
				if (hidden_boolean[1] == true) {
					BackgroundMusic.close();
					BackgroundMusic = new Music("hidden2.mp3", true);
					BackgroundMusic.start();
				} else
					JOptionPane.showMessageDialog(null, "퀘스트 클리어를 하세요");
			} else if ((JButton) e.getSource() == copyright) { // 라이센스 이벤트
				License license = new License();
			}
		}
	}

	class achivementlistener implements ActionListener { // 달성도 화면 내의 버튼들의 이벤트
		public void actionPerformed(ActionEvent e) {
			if ((JButton) e.getSource() == hidden[0]) {
				if (clear[0] >= 1 && clear[1] >= 1) {
					hidden_boolean[0] = true;
					JOptionPane.showMessageDialog(null, "노래가 해금되었습니다");
				} else if (hidden_boolean[0] == false)
					JOptionPane.showMessageDialog(null, "게임을 난이도 별로 클리어 하면 해금");
			} else if ((JButton) e.getSource() == hidden[1]) {
				if (clear[0] >= 1 && clear[1] >= 1 && clear[2] >= 1) {
					hidden_boolean[1] = true;
					JOptionPane.showMessageDialog(null, "노래가 해금되었습니다");
				} else if (hidden_boolean[1] == false)
					JOptionPane.showMessageDialog(null, "게임을 난이도 별로 클리어 하면 해금");
			}
		}
	}

	class praticelistener implements ActionListener { // 연습게임 난이도 별 이벤트
		public void actionPerformed(ActionEvent e) {
			if ((JButton) e.getSource() == game5x5[0]) { // 5x5 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 50, 400, 150);
				hint_two.setBounds(150, 200, 150, 400);
				hint_one.setIcon(image5x5_hint1[0]);
				hint_one.setVisible(true);
				hint_two.setIcon(image5x5_hint2[0]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle5x5.answer_5x5[0];
				screen_index = 4; // 연습모드 5x5 게임화면은 4번
				Screen screen = new Screen(screen_index);

				Puzzle5x5 puzzle = new Puzzle5x5(lbl5x5_title[0].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle5x5();

			} else if ((JButton) e.getSource() == game5x5[1]) { // 5x5 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 50, 400, 150);
				hint_two.setBounds(150, 200, 150, 400);
				hint_one.setIcon(image5x5_hint1[1]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image5x5_hint2[1]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle5x5.answer_5x5[1];

				screen_index = 4; // 연습모드 5x5 게임화면은 4번
				Screen screen = new Screen(screen_index);

				Puzzle5x5 puzzle = new Puzzle5x5(lbl5x5_title[1].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle5x5();

			} else if ((JButton) e.getSource() == game5x5[2]) { // 5x5 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 50, 400, 150);
				hint_two.setBounds(150, 200, 150, 400);
				hint_one.setIcon(image5x5_hint1[2]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image5x5_hint2[2]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle5x5.answer_5x5[2];

				screen_index = 4; // 연습모드 5x5 게임화면은 4번
				Screen screen = new Screen(screen_index);

				Puzzle5x5 puzzle = new Puzzle5x5(lbl5x5_title[2].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle5x5();
			} else if ((JButton) e.getSource() == game10x10[0]) { // 5x5 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 50, 400, 150);
				hint_two.setBounds(150, 200, 150, 400);
				hint_one.setIcon(image10x10_hint1[0]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image10x10_hint2[0]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle10x10.answer_10x10[0];

				screen_index = 6; // 연습모드 10x10 게임화면은 6번
				Screen screen = new Screen(screen_index);

				Puzzle10x10 puzzle = new Puzzle10x10(lbl10x10_title[0].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle10x10();
			} else if ((JButton) e.getSource() == game10x10[1]) { // 5x5 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 50, 400, 150);
				hint_two.setBounds(150, 200, 150, 400);
				hint_one.setIcon(image10x10_hint1[1]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image10x10_hint2[1]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle10x10.answer_10x10[1];

				screen_index = 6; // 연습모드 10x10 게임화면은 6번
				Screen screen = new Screen(screen_index);

				Puzzle10x10 puzzle = new Puzzle10x10(lbl10x10_title[1].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle10x10();
			} else if ((JButton) e.getSource() == game10x10[2]) { // 5x5 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 50, 400, 150);
				hint_two.setBounds(150, 200, 150, 400);
				hint_one.setIcon(image10x10_hint1[2]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image10x10_hint2[2]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle10x10.answer_10x10[2];

				screen_index = 6; // 연습모드 10x10 게임화면은 6번
				Screen screen = new Screen(screen_index);

				Puzzle10x10 puzzle = new Puzzle10x10(lbl10x10_title[2].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle10x10();
			} else if ((JButton) e.getSource() == game20x20[0]) { // 20x20 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 0, 500, 150);
				hint_two.setBounds(150, 150, 150, 500);
				hint_one.setIcon(image20x20_hint1[0]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image20x20_hint2[0]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle20x20.answer_20x20[0];

				screen_index = 8; // 연습모드 20x20 게임화면은 8번
				Screen screen = new Screen(screen_index);

				Puzzle20x20 puzzle = new Puzzle20x20(lbl20x20_title[0].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle20x20();
			} else if ((JButton) e.getSource() == game20x20[1]) { // 20x20 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 0, 500, 150);
				hint_two.setBounds(150, 150, 150, 500);
				hint_one.setIcon(image20x20_hint1[1]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image20x20_hint2[1]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle20x20.answer_20x20[1];

				screen_index = 8; // 연습모드 20x20 게임화면은 8번
				Screen screen = new Screen(screen_index);

				Puzzle20x20 puzzle = new Puzzle20x20(lbl20x20_title[1].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle20x20();
			} else if ((JButton) e.getSource() == game20x20[2]) { // 20x20 게임화면 이벤트
				JOptionPane.showMessageDialog(null, "게임을 시작합니다. 문제를 생성 중이니 잠시만 기다려 주세요");
				hint_one.setBounds(300, 0, 500, 150);
				hint_two.setBounds(150, 150, 150, 500);
				hint_one.setIcon(image20x20_hint1[2]); // 힌트 예시
				hint_one.setVisible(true);
				hint_two.setIcon(image20x20_hint2[2]);// 힌트 예시
				hint_two.setVisible(true);
				ok_stack = 0;
				no_stack = 0;
				answer = Puzzle20x20.answer_20x20[2];

				screen_index = 8; // 연습모드 20x20 게임화면은 8번
				Screen screen = new Screen(screen_index);

				Puzzle20x20 puzzle = new Puzzle20x20(lbl20x20_title[2].getText());
				answer_cnt.setText("남은 정답 수: " + answer);
				answer_cnt.setVisible(true);
				manage_puzzle20x20();
			}
		}
	}

	class answerlistener implements ActionListener { // 정답 이벤트 클래스(클릭 시 반응)
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if (btn.getText() == "1") { // 정답 선택 이벤트
				btn.setIcon(Images.block);
				ok_stack++;
				if (screen_index != 10)
					answer_cnt.setText("남은 정답 수: " + (answer - ok_stack));

				btn.setText("ban_answer_block");
				if (ok_stack == answer && no_stack == 0) { // 클리어 조건에 만족했을때
					t.interrupt();
					t = new Thread();
					time.setVisible(false);
					if (screen_index == 10)
						clear[0]++;
					if (screen_index == 11)
						clear[1]++;
					if (screen_index == 12)
						clear[2]++;
					JOptionPane.showMessageDialog(null, "정답입니다");

				}
			} else if (btn.getText() == "-1") { // 오답 선택 이벤트
				btn.setIcon(Images.block);
				no_stack++; // 오답 갯수 증가
				btn.setText("ban_no_answer_block");
			} else if (btn.getText() == "ban_answer_block") { // 정답 버튼을 x표시할 경우
				btn.setIcon(Images.ban);
				ok_stack--;
				if (screen_index != 10)
					answer_cnt.setText("남은 정답 수: " + (answer - ok_stack));

				btn.setText("basic_answer_block");
			} else if (btn.getText() == "ban_no_answer_block") {// 오답 버튼을 x표시할 경우
				btn.setIcon(Images.ban);
				no_stack--;
				if (ok_stack == answer && no_stack == 0) { // 클리어 조건에 만족했을때
					t.interrupt();
					t = new Thread();
					time.setVisible(false);
					if (screen_index == 10)
						clear[0]++;
					if (screen_index == 11)
						clear[1]++;
					if (screen_index == 12)
						clear[2]++;
					JOptionPane.showMessageDialog(null, "정답입니다");

				}
				btn.setText("basic_no_answer_block");
			} else if (btn.getText() == "basic_answer_block") {// 정답 버튼 초기로 돌릴때
				btn.setIcon(Images.basic);
				btn.setText("1");
			} else if (btn.getText() == "basic_no_answer_block") {// 오답 버튼 초기로 돌릴때
				btn.setIcon(Images.basic);
				btn.setText("-1");
			}
		}
	}

	class etclistener implements ActionListener { // 기타 버튼 클래스
		public void actionPerformed(ActionEvent e) {
			if ((JButton) e.getSource() == left || (JButton) e.getSource() == right) { // 왼쪽, 오른쪽 이벤트
				if (screen_index == 15) // 도움말 버튼 클릭 시
					Left_Right_Button.move(e);
				else if (screen_index == 3) // 연습모드의 5x5 크기 선택 시
					Left_Right_Button.gamemove(e, game5x5, lbl5x5_title, image5x5);
				else if (screen_index == 5) // 연습모드의 10x10 크기 선택 시
					Left_Right_Button.gamemove(e, game10x10, lbl10x10_title, image10x10);
				else if (screen_index == 7) // 연습모드의 20x20 크기 선택 시
					Left_Right_Button.gamemove(e, game20x20, lbl20x20_title, image20x20);
			} else if ((JButton) e.getSource() == back) { // 뒤로 가기 버튼 이벤트
				if (screen_index == 10 || screen_index == 11 || screen_index == 12) {
					time.setText("" + 0);
					t.interrupt();
					t = new Thread();
					time.setVisible(false);
				}
				bac.back(screen_index);
			}
		}

	}

	public void manage_puzzle5x5() { // 5x5 행렬 관리 메소드
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				add(puzzle5x5[i][j]);
				puzzle5x5[i][j].setVisible(true);
				puzzle5x5[i][j].addActionListener(answerevent);
			}
		}
	}

	public void manage_puzzle10x10() { // 10x10 행렬 관리 메소드
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				add(puzzle10x10[i][j]);
				puzzle10x10[i][j].setVisible(true);
				puzzle10x10[i][j].addActionListener(answerevent);
			}
		}
	}

	public void manage_puzzle20x20() { // 20x20 행렬 관리 메소드
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				add(puzzle20x20[i][j]);
				puzzle20x20[i][j].setVisible(true);
				puzzle20x20[i][j].addActionListener(answerevent);
			}
		}
	}

	public void run() { // 시간 메소드
		while (true) {
			try {
				while (true) {
					if (screen_index != 10 && screen_index != 11 && screen_index != 12)
						timer = 0;

					if (screen_index == 10 && timer == 100) { // 실전모드 5x5크기 타임오버 조건
						JOptionPane.showMessageDialog(null, "Game Over");
						screen_index = 9;
						Screen screen = new Screen(screen_index);
					} else if (screen_index == 11 && timer == 200) { // 실전모드 10x10크기 타임오버 조건
						JOptionPane.showMessageDialog(null, "Game Over");
						screen_index = 9;
						Screen screen = new Screen(screen_index);
					} else if (screen_index == 12 && timer == 480) { // 실전모드 20x20크기 타임오버 조건
						JOptionPane.showMessageDialog(null, "Game Over");
						screen_index = 9;
						Screen screen = new Screen(screen_index);
					}
					minute = timer / 60;
					second = timer % 60;
					time.setText(minute + "분 : " + second + "초");
					Thread.sleep(1000);
					timer++;
					repaint();
				}
			} catch (InterruptedException e) {

			}
		}
	}
}