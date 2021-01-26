package GUI_AND_Function;

import javax.swing.JButton;

import Image.Images;

//힌트가 1개일때
public class Puzzle10x10 {
	static int 가로 = 10;
	static int 세로 = 10;
	static int[][] result = new int[가로][세로];
	static int k = 0;
	static int a = 0;
	static int answer_rabbit = 51;
	static int answer_camel = 49;
	static int answer_dinosaur = 50;
	static int answer_10x10[] = { answer_rabbit, answer_camel, answer_dinosaur };
	static int stack = 0;

	public Puzzle10x10(String puzzlename) {
		switch (puzzlename) {
		case "달리는 토끼":
			int[] row_hint1 = { 4 };
			int[] row_hint2 = { 3, 1 };
			int[] row_hint3 = { 1, 6 };
			int[] row_hint4 = { 1, 1, 1 };
			int[] row_hint5 = { 1, 1, 2 };
			int[] row_hint6 = { 1, 1, 1 };
			int[] row_hint7 = { 10 };
			int[] row_hint8 = { 1, 6 };
			int[] row_hint9 = { 6 };
			int[] row_hint10 = { 2, 1 };

			int[] cul_hint1 = { 3, 2 };
			int[] cul_hint2 = { 1, 1, 1 };
			int[] cul_hint3 = { 9 };
			int[] cul_hint4 = { 1, 3 };
			int[] cul_hint5 = { 1, 1, 1, 3 };
			int[] cul_hint6 = { 1, 1, 3 };
			int[] cul_hint7 = { 1, 1, 1, 4 };
			int[] cul_hint8 = { 9 };
			int[] cul_hint9 = { 1 };
			int[] cul_hint10 = { 2 };
			puzzle(row_hint1, row_hint2, row_hint3, row_hint4, row_hint5, row_hint6, row_hint7, row_hint8, row_hint9,
					row_hint10, cul_hint1, cul_hint2, cul_hint3, cul_hint4, cul_hint5, cul_hint6, cul_hint7, cul_hint8,
					cul_hint9, cul_hint10, answer_rabbit);
			break;

		case "낙타":
			int[] row_hint11 = { 1, 1 };
			int[] row_hint22 = { 3, 5 };
			int[] row_hint33 = { 3, 6 };
			int[] row_hint44 = { 8 };
			int[] row_hint55 = { 7 };
			int[] row_hint66 = { 2, 3 };
			int[] row_hint77 = { 1, 1 };
			int[] row_hint88 = { 1, 1 };
			int[] row_hint99 = { 1, 1 };
			int[] row_hint1010 = { 2, 2 };

			int[] cul_hint11 = { 2 };
			int[] cul_hint22 = { 2 };
			int[] cul_hint33 = { 3 };
			int[] cul_hint44 = { 3, 1 };
			int[] cul_hint55 = { 9 };
			int[] cul_hint66 = { 5 };
			int[] cul_hint77 = { 5 };
			int[] cul_hint88 = { 6, 1 };
			int[] cul_hint99 = { 9 };
			int[] cul_hint1010 = { 3 };
			puzzle(row_hint11, row_hint22, row_hint33, row_hint44, row_hint55, row_hint66, row_hint77, row_hint88,
					row_hint99, row_hint1010, cul_hint11, cul_hint22, cul_hint33, cul_hint44, cul_hint55, cul_hint66,
					cul_hint77, cul_hint88, cul_hint99, cul_hint1010, answer_camel);
			break;

		case "공룡":
			
			int[] row_hint111 = { 2 };
			int[] row_hint222 = {6 };
			int[] row_hint333 = {5 };
			int[] row_hint444 = { 4 };
			int[] row_hint555 = { 5 };
			int[] row_hint666 = { 1,5,1 };
			int[] row_hint777 = { 4,1};
			int[] row_hint888 = { 7 };
			int[] row_hint999 = { 5 };
			int[] row_hint101010 = { 4 };
			
			int[] cul_hint111 = {2 };
			int[] cul_hint222 = { 2,2 };
			int[] cul_hint333 = { 3,1,1};
			int[] cul_hint444 = { 8,1};
			int[] cul_hint555 = { 9 };
			int[] cul_hint666 = { 1,7 };
			int[] cul_hint777 = { 1,4 };
			int[] cul_hint888 = { 1,2 };
			int[] cul_hint999 = { 2 };
			int[] cul_hint101010 = { 3};
			puzzle(row_hint111,row_hint222,row_hint333,row_hint444,row_hint555,row_hint666,row_hint777,row_hint888,row_hint999,row_hint101010,
					cul_hint111,cul_hint222,cul_hint333,cul_hint444,cul_hint555,cul_hint666,cul_hint777,cul_hint888,cul_hint999,cul_hint101010,answer_dinosaur);
break;

		}
	}

	public void swap(int[] temp) {
		for (int j = 0; j < 가로; j++)
			result[k][j] = temp[j];
	}

	public void swap_cul(int[] temp) {
		for (int j = 0; j < 가로; j++)
			result[j][a] = temp[j];
	}

	public void complete() {
		stack = 0;
		for (int i = 0; i < 가로; i++) {
			for (int j = 0; j < 세로; j++) {
				if (result[i][j] == 1)
					stack++;
			}
		}

	}

	public void produce() {
		for (int i = 0; i < 가로; i++) {
			for (int j = 0; j < 세로; j++) {
				Project2.puzzle10x10[i][j] = new JButton();
				Project2.puzzle10x10[i][j].setIcon(Images.basic);
				Project2.puzzle10x10[i][j].setContentAreaFilled(false);
				Project2.puzzle10x10[i][j].setFocusPainted(false);
				Project2.puzzle10x10[i][j].setBounds(300 + 40 * j, 200 + 40 * i, 40, 40);
				Project2.puzzle10x10[i][j].setVisible(false);
				if (result[i][j] == 1)
					Project2.puzzle10x10[i][j].setText("1");
				else
					Project2.puzzle10x10[i][j].setText("-1");
			}
		}
	}

	public void puzzle(int[] row1,int[] row2,int[] row3,int[] row4,int[] row5,int[] row6,int[] row7,int[] row8,int[] row9,int[] row10,
			int[] cul1,int[] cul2,int[] cul3,int[] cul4,int[] cul5,int[] cul6,int[] cul7,int[] cul8,int[] cul9,int[] cul10,int answer) {
		for (int i = 0; i < 가로; i++)
			for (int j = 0; j < 세로; j++)
				result[i][j] = 0;

		do {
			k = 0;
			a = 0;
			int row_hint1[] = { result[0][0], result[0][1], result[0][2], result[0][3], result[0][4], result[0][5],
					result[0][6], result[0][7], result[0][8], result[0][9] };
			int[] row_num1 =row1;
			int[] row_temp1 = solve(row_num1, row_hint1);
			swap(row_temp1);
			k++;

			int row_hint2[] = { result[1][0], result[1][1], result[1][2], result[1][3], result[1][4], result[1][5],
					result[1][6], result[1][7], result[1][8], result[1][9] };
			int[] row_num2 =row2;
			int[] row_temp2 = solve(row_num2, row_hint2);
			swap(row_temp2);
			k++;

			int row_hint3[] = { result[2][0], result[2][1], result[2][2], result[2][3], result[2][4], result[2][5],
					result[2][6], result[2][7], result[2][8], result[2][9] };
			int[] row_num3 = row3;
			int[] row_temp3 = solve(row_num3, row_hint3);
			swap(row_temp3);
			k++;

			int row_hint4[] = { result[3][0], result[3][1], result[3][2], result[3][3], result[3][4], result[3][5],
					result[3][6], result[3][7], result[3][8], result[3][9] };
			int[] row_num4 = row4;
			int[] row_temp4 = solve(row_num4, row_hint4);
			swap(row_temp4);
			k++;

			int row_hint5[] = { result[4][0], result[4][1], result[4][2], result[4][3], result[4][4], result[4][5],
					result[4][6], result[4][7], result[4][8], result[4][9] };
			int[] row_num5 = row5;
			int[] row_temp5 = solve(row_num5, row_hint5);
			swap(row_temp5);
			k++;

			int row_hint6[] = { result[5][0], result[5][1], result[5][2], result[5][3], result[5][4], result[5][5],
					result[5][6], result[5][7], result[5][8], result[5][9] };
			int[] row_num6 =row6;
			int[] row_temp6 = solve(row_num6, row_hint6);
			swap(row_temp6);
			k++;

			int row_hint7[] = { result[6][0], result[6][1], result[6][2], result[6][3], result[6][4], result[6][5],
					result[6][6], result[6][7], result[6][8], result[6][9] };
			int[] row_num7 = row7;
			int[] row_temp7 = solve(row_num7, row_hint7);
			swap(row_temp7);
			k++;

			int row_hint8[] = { result[7][0], result[7][1], result[7][2], result[7][3], result[7][4], result[7][5],
					result[7][6], result[7][7], result[7][8], result[7][9] };
			int[] row_num8 = row8;
			int[] row_temp8 = solve(row_num8, row_hint8);
			swap(row_temp8);
			k++;

			int row_hint9[] = { result[8][0], result[8][1], result[8][2], result[8][3], result[8][4], result[8][5],
					result[8][6], result[8][7], result[8][8], result[8][9] };
			int[] row_num9 =row9;
			int[] row_temp9 = solve(row_num9, row_hint9);
			swap(row_temp9);
			k++;

			int row_hint10[] = { result[9][0], result[9][1], result[9][2], result[9][3], result[9][4], result[9][5],
					result[9][6], result[9][7], result[9][8], result[9][9] };
			int[] row_num10 =row10;
			int[] row_temp10 = solve(row_num10, row_hint10);
			swap(row_temp10);
			k++;

			// --------첫 가로 구하기

			int hint1[] = { result[0][0], result[1][0], result[2][0], result[3][0], result[4][0], result[5][0],
					result[6][0], result[7][0], result[8][0], result[9][0] };
			int[] cul_hint1 =cul1;
			int[] cul_temp1 = solve(cul_hint1, hint1);
			swap_cul(cul_temp1);
			a++;

			int hint2[] = { result[0][1], result[1][1], result[2][1], result[3][1], result[4][1], result[5][1],
					result[6][1], result[7][1], result[8][1], result[9][1] };
			int[] cul_hint2 =cul2;
			int[] cul_temp2 = solve(cul_hint2, hint2);
			swap_cul(cul_temp2);
			a++;

			int hint3[] = { result[0][2], result[1][2], result[2][2], result[3][2], result[4][2], result[5][2],
					result[6][2], result[7][2], result[8][2], result[9][2] };
			int[] cul_hint3 = cul3;
			int[] cul_temp3 = solve(cul_hint3, hint3);
			swap_cul(cul_temp3);
			a++;

			int hint4[] = { result[0][3], result[1][3], result[2][3], result[3][3], result[4][3], result[5][3],
					result[6][3], result[7][3], result[8][3], result[9][3] };
			int[] cul_hint4 = cul4;
			int[] cul_temp4 = solve(cul_hint4, hint4);
			swap_cul(cul_temp4);
			a++;

			int hint5[] = { result[0][4], result[1][4], result[2][4], result[3][4], result[4][4], result[5][4],
					result[6][4], result[7][4], result[8][4], result[9][4] };
			int[] cul_hint5 =cul5;
			int[] cul_temp5 = solve(cul_hint5, hint5);
			swap_cul(cul_temp5);
			a++;

			int hint6[] = { result[0][5], result[1][5], result[2][5], result[3][5], result[4][5], result[5][5],
					result[6][5], result[7][5], result[8][5], result[9][5] };
			int[] cul_hint6 = cul6;
			int[] cul_temp6 = solve(cul_hint6, hint6);
			swap_cul(cul_temp6);
			a++;

			int hint7[] = { result[0][6], result[1][6], result[2][6], result[3][6], result[4][6], result[5][6],
					result[6][6], result[7][6], result[8][6], result[9][6] };
			int[] cul_hint7 = cul7;
			int[] cul_temp7 = solve(cul_hint7, hint7);
			swap_cul(cul_temp7);
			a++;

			int hint8[] = { result[0][7], result[1][7], result[2][7], result[3][7], result[4][7], result[5][7],
					result[6][7], result[7][7], result[8][7], result[9][7] };
			int[] cul_hint8 = cul8;
			int[] cul_temp8 = solve(cul_hint8, hint8);
			swap_cul(cul_temp8);
			a++;

			int hint9[] = { result[0][8], result[1][8], result[2][8], result[3][8], result[4][8], result[5][8],
					result[6][8], result[7][8], result[8][8], result[9][8] };
			int[] cul_hint9 = cul9;
			int[] cul_temp9 = solve(cul_hint9, hint9);
			swap_cul(cul_temp9);
			a++;

			int hint10[] = { result[0][9], result[1][9], result[2][9], result[3][9], result[4][9], result[5][9],
					result[6][9], result[7][9], result[8][9], result[9][9] };
			int[] cul_hint10 = cul10;
			int[] cul_temp10 = solve(cul_hint10, hint10);
			swap_cul(cul_temp10);
			a++;

			complete();
		} while (stack != answer);

		produce();
	}

	public static int[] solve(int[] h, int[] hint) {
		int n = 0;
		int sum[] = new int[세로];
		for (int i = 0; i < 가로; i++)
			sum[i] = 0;

		int temp[] = new int[세로];
		for (int ii = 0; ii < 세로; ii++)
			temp[ii] = 0;

		for (int ii = 0; ii < Math.pow(2, 가로); ii++) {
			int can_dum[] = new int[가로 + 2];
			can_dum[0] = 0;
			for (int i = 1; i <= 가로; i++)
				can_dum[i] = temp[i - 1];
			can_dum[가로 + 1] = 0;
			int ans[] = new int[10];
			int summ = 0;
			int stack = 0;
			int ans_stack = 0;
			for (int i = 0; i < 가로; i++) {
				if (temp[i] == 0)
					stack++;
				if (stack == 가로)
					ans[ans_stack] = 0;
			}
			for (int i = 1; i < 가로 + 1; i++) {
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
						if (hint[i] == 1)
							ok[index2++] = i;
						else if (hint[i] == -1)
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

			if (sum[i] == n)
				sum[i] = 1;
			else if (sum[i] == 0)
				sum[i] = -1;
			else
				sum[i] = 0;

		}
		return sum;
	}
}
