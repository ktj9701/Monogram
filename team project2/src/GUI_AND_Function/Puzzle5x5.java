package GUI_AND_Function;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import Image.Images;

//힌트가 1개일때
public class Puzzle5x5 {
	static int 가로 = 5;
	static int 세로 = 5;
	static int[][]result=new int[가로][세로];
	static int k=0;
	static int a=0;
	static int answer_home=13; 
	static int answer_question_mark=6; 
	static int answer_북녘북=14;
	static int answer_5x5[]= {answer_home,answer_question_mark,answer_북녘북};
	static int stack;
	
	public Puzzle5x5(String puzzlename) {
		switch(puzzlename){
		case "?":
		int[] row_hint1 = { 3 };
		int[] row_hint2 = { 1 };
		int[] row_hint3 = { 1 };
		int[] row_hint4 = { 0 };
		int[] row_hint5 = { 1 };
		
		int[] cul_hint1 = { 0 };
		int[] cul_hint2 = { 1 };
		int[] cul_hint3 = { 1,1,1 };
		int[] cul_hint4 = { 2 };
		int[] cul_hint5 = { 0 };
		puzzle(row_hint1,row_hint2,row_hint3,row_hint4,row_hint5,cul_hint1,cul_hint2,cul_hint3,cul_hint4,cul_hint5,answer_question_mark);
		break;
		
		case "당신이 매일 가는 곳":
			int[] row_hint11 = { 1 };
			int[] row_hint22 = { 3 };
			int[] row_hint33 = { 2,2 };
			int[] row_hint44= { 1,1 };
			int[] row_hint55 = { 3 };
			
			int[] cul_hint11 = { 1 };
			int[] cul_hint22 = { 4 };
			int[] cul_hint33 = { 2,1 };
			int[] cul_hint44 = { 4 };
			int[] cul_hint55 = { 1 };
			puzzle(row_hint11,row_hint22,row_hint33,row_hint44,row_hint55,cul_hint11,cul_hint22,cul_hint33,cul_hint44,cul_hint55,answer_home);
			break;
			
		case "북쪽":
			int[] row_hint111 = { 1,1 };
			int[] row_hint222 = { 1,2 };
			int[] row_hint333 = { 2,1 };
			int[] row_hint444= { 1,1 };
			int[] row_hint555 = { 2,2 };
			
			int[] cul_hint111 = { 1,1 };
			int[] cul_hint222 = { 5 };
			int[] cul_hint333 = {0 };
			int[] cul_hint444 = { 5 };
			int[] cul_hint555 = { 1,1 };
			puzzle(row_hint111,row_hint222,row_hint333,row_hint444,row_hint555,cul_hint111,cul_hint222,cul_hint333,cul_hint444,cul_hint555,answer_북녘북);
			break;
	}
	}
	
	public  void swap(int[] temp) {
		for (int j = 0; j < 가로; j++) 
			result[k][j] = temp[j];
			
		
	}
	public  void swap_cul(int[] temp) {
		for (int j = 0; j < 가로; j++) 
			result[j][a] = temp[j];

	}
public  void complete() {
	stack=0;
	for (int i = 0; i < 가로; i++) {
		for (int j = 0; j < 세로; j++) {
			if(result[i][j]==1)
				stack++;
		}
	}
}

public void produce() {
	for (int i = 0; i < 가로; i++) {
		for (int j = 0; j < 세로; j++) {
			Project2.puzzle5x5[i][j] = new JButton();
			Project2.puzzle5x5[i][j].setIcon(Images.basic);
		
			Project2.puzzle5x5[i][j].setContentAreaFilled(false);
			Project2.puzzle5x5[i][j].setFocusPainted(false);
			
			Project2.puzzle5x5[i][j].setBounds(300 + 80* j, 200 + 80 * i, 80, 80);
			Project2.puzzle5x5[i][j].setVisible(false);
			if (result[i][j] == 1)
				Project2.puzzle5x5[i][j].setText("1");
			else
				Project2.puzzle5x5[i][j].setText("-1");
		}
	}
}
public void puzzle(int[] row1,int[] row2,int[] row3,int[] row4,int[] row5,int[] cul1,int[] cul2,int[] cul3,int[] cul4,int[] cul5,int answer) {
	for(int i=0;i<가로;i++) 
		for(int j=0;j<세로;j++) 
			result[i][j] = 0;
	do{
		k=0;
		a=0;
	int row_hint1[] = { result[0][0], result[0][1], result[0][2], result[0][3], result[0][4] };
	int[] row_num1 = row1;
	int[] row_temp1 = solve(row_num1,row_hint1);
	swap(row_temp1);
	k++;

	int row_hint2[] = { result[1][0], result[1][1], result[1][2], result[1][3], result[1][4] };
	int[] row_num2 = row2;
	int[] row_temp2 = solve(row_num2,row_hint2);
	swap(row_temp2);
	k++;

	int row_hint3[] = { result[2][0], result[2][1], result[2][2], result[2][3], result[2][4] };
	int[] row_num3 =row3;
	int[] row_temp3 = solve(row_num3,row_hint3);
	swap(row_temp3);
	k++;

	int row_hint4[] = { result[3][0], result[3][1], result[3][2], result[3][3], result[3][4] };
	int[] row_num4 =row4;
	int[] row_temp4 = solve(row_num4,row_hint4);
	swap(row_temp4);
	k++;

	int row_hint5[] = { result[4][0], result[4][1], result[4][2], result[4][3], result[4][4] };
	int[] row_num5 =row5;
	int[] row_temp5 = solve(row_num5,row_hint5);
	swap(row_temp5);
	k++;

	// --------첫 가로 구하기
	int hint1[] = { result[0][0], result[1][0], result[2][0], result[3][0], result[4][0] };

	int[] cul_hint1 = cul1;
	int[] cul_temp1 = solve(cul_hint1, hint1);
	swap_cul(cul_temp1);
	a++;
	
	int hint2[] = { result[0][1], result[1][1], result[2][1], result[3][1], result[4][1] };
	int[] cul_hint2 =cul2;
	int[] cul_temp2 = solve(cul_hint2, hint2);
	swap_cul(cul_temp2);
	a++;

	int hint3[] = { result[0][2], result[1][2], result[2][2], result[3][2], result[4][2] };
	int[] cul_hint3 = cul3;
	int[] cul_temp3 = solve(cul_hint3, hint3);
	swap_cul(cul_temp3);
	a++;

	int hint4[] = { result[0][3], result[1][3], result[2][3], result[3][3], result[4][3] };
	int[] cul_hint4 = cul4;
	int[] cul_temp4 = solve(cul_hint4, hint4);
	swap_cul(cul_temp4);
	a++;
	
	int hint5[] = { result[0][4], result[1][4], result[2][4], result[3][4], result[4][4] };
	int[] cul_hint5 =cul5;
	int[] cul_temp5 = solve(cul_hint5, hint5);
	swap_cul(cul_temp5);
	a++;

	
	complete();
}while(stack!=answer);
	
	
	produce();
}
	public  int[] solve(int[] h, int[] hint) {
		int n = 0;
		int sum[] = new int[가로];
		for (int i = 0; i < 가로; i++)
			sum[i] = 0;

		int temp[] = new int[가로];
		for (int ii = 0; ii < 가로; ii++)
			temp[ii] = 0;

		for (int ii = 0; ii < Math.pow(2, 가로); ii++) {
			int can_dum[] = new int[가로+2];
			can_dum[0] = 0;
			for (int i = 1; i <= 가로; i++)
				can_dum[i] = temp[i - 1];
			can_dum[가로+1] = 0;
			int ans[] = new int[5];
			int summ = 0;
			int stack = 0;
			int ans_stack = 0;
			for (int i = 0; i < 가로; i++) {
				if (temp[i] == 0)
					stack++;
				if (stack == 가로)
					ans[ans_stack] = 0;
			}
			for (int i = 1; i < 가로+2; i++) {
				summ += can_dum[i];
				if (can_dum[i] == 1 && can_dum[i + 1] == 0) {
					ans[ans_stack++] = summ;
					summ = 0;
				}
			}

			if (ans_stack == h.length) {
				int index = 0;
				for (int i = 0; i < ans_stack; i++) {
					if (ans[i] == h[i])
						index++;
				}
				if (index == h.length) {
					int index2 = 0, index3 = 0;
					int ok[] = new int[가로];  
					int ban[] = new int[가로];
					for (int i = 0; i < 가로; i++) {
						if (hint[i] == 1)   //힌트로 채워지는 칸
							ok[index2++] = i;
						else if (hint[i] == -1)  //힌트로 x가 채워지는 칸
							ban[index3++] = i;
					}
					int ok_sw = 1, ban_sw = 1;

					for (int i = 0; i < index2; i++) {
						if (temp[ok[i]] != 1)
							ok_sw = 0;
					}
					for (int i = 0; i < index3; i++) {
						if (temp[ban[i]] != 0)
							ban_sw = 0;
					}
					if (ok_sw * ban_sw == 1) {

						for (int k = 0; k < 가로; k++) {
							sum[k] += temp[k];
						}
						n += 1;
					}
				}
			}

			temp[0] += 1;
			for (int k = 0; k < 가로 - 1; k++) {
				if (temp[k] == 2) {
					temp[k] = 0;
					temp[k + 1] += 1;
				}
			}
		}
		for (int i = 0; i < 가로; i++) {
			if (sum[i] == 0||h[0]==0)
				sum[i] = -1;
			else if (sum[i] == n)
				sum[i] = 1;
			
			else
				sum[i] = 0;

		}
		return sum;
	}
}
