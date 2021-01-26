package GUI_AND_Function;

import javax.swing.JButton;

import Image.Images;

public class Puzzle20x20 {
	static int 가로 = 20;
	static int 세로 = 20;
	static int[][]result=new int[가로][세로];
	static int k=0;
	static int a = 0;
	static int answer_cherry=200; 
	static int answer_bear=310;
	static int answer_captain=206;
	static int answer_20x20[]= {answer_cherry,answer_bear,answer_captain};
	static int stack=0;
	
	public Puzzle20x20(String puzzlename) {
		switch(puzzlename) {
		case "체리":
			int[] row_hint1 = { 4 };
			int[] row_hint2 = { 3, 6,4 };
			int[] row_hint3 = {9,3,3 };
			int[] row_hint4 = { 3,2,1,1,5,2 };
			int[] row_hint5 = {2,2,2,2,4,1 };
			int[] row_hint6 = { 1,4,1,2,5 };
			int[] row_hint7 = { 4,1,1,2 };
			int[] row_hint8 = {5,1,2};
			int[] row_hint9 = { 4,1,1 };
			int[] row_hint10 = { 2,2, 1 };
			int[] row_hint11 = { 1,2 };
			int[] row_hint12 = {1,1 };
			int[] row_hint13 = { 5,5 };
			int[] row_hint14 = {2,4,2,4 };
			int[] row_hint15 = { 6,2,6,2};
			int[] row_hint16 = { 6,1,6,1};
			int[] row_hint17 = { 5,1,5,1 };
			int[] row_hint18 = {4,2,5,2 };
			int[] row_hint19 = {2,2,3,2};
			int[] row_hint20 = {5,5 };
			
			int[] cul_hint1 = { 2,3,4 };
			int[] cul_hint2 = {2,4,6 };
			int[] cul_hint3 = { 2,4,8 };
			int[] cul_hint4 = { 3,4,1,4,1};
			int[] cul_hint5 = { 2,4,5,1};
			int[] cul_hint6 = { 5,7,1 };
			int[] cul_hint7 = {2,3,2,2 };
			int[] cul_hint8 = { 1,3,2,2 };
			int[] cul_hint9 = { 4,4 };
			int[] cul_hint10 = { 2 };
			int[] cul_hint11 = { 4,4 };
			int[] cul_hint12 = { 1,2,6 };
			int[] cul_hint13 = { 3,3,8 };
			int[] cul_hint14 = { 4,4,1,6 };
			int[] cul_hint15 = { 1,3,8,1};
			int[] cul_hint16 = { 2,3,4,1 };
			int[] cul_hint17 = { 2,3,2,2 };
			int[] cul_hint18 = { 2,2,2,2 };
			int[] cul_hint19 = { 3,2,4 };
			int[] cul_hint20 = { 5 };
			
			puzzle(row_hint1, row_hint2, row_hint3, row_hint4, row_hint5, row_hint6, row_hint7, row_hint8, row_hint9,row_hint10,
					row_hint11,row_hint12,row_hint13,row_hint14,row_hint15,row_hint16,row_hint17,row_hint18,row_hint19,row_hint20,
					cul_hint1, cul_hint2, cul_hint3, cul_hint4, cul_hint5, cul_hint6, cul_hint7, cul_hint8,cul_hint9, cul_hint10, 
					cul_hint11,cul_hint12,cul_hint13,cul_hint14,cul_hint15,cul_hint16,cul_hint17,cul_hint18,cul_hint19,cul_hint20, 
					answer_cherry);
			break;
		case "곰돌이":
			int[] row_hint1_1 = { 20 };
			int[] row_hint2_2 = { 20 };
			int[] row_hint3_3 = {2,8,2 };
			int[] row_hint4_4 = { 2,2,6,2,2};
			int[] row_hint5_5= {2,1,1,1,1,2 };
			int[] row_hint6_6 = {2,12,2 };
			int[] row_hint7_7 = { 4,10,4};
			int[] row_hint8_8 = {4,1,2,1,4};
			int[] row_hint9_9 = { 3,12,3 };
			int[] row_hint10_10 = { 3,3,4,3,3 };
			int[] row_hint11_11 = { 3,5,5,3 };
			int[] row_hint12_12 = {3,12,3 };
			int[] row_hint13_13 = {2,2,4,2,4 };
			int[] row_hint14_14 = {2,1,2,2,4 };
			int[] row_hint15_15 = { 2,1,1,6,1,4};
			int[] row_hint16_16 = { 3,3,3,3};
			int[] row_hint17_17 = { 16,2};
			int[] row_hint18_18 = {1,15,2 };
			int[] row_hint19_19 = {2,14,1};
			int[] row_hint20_20 = {4,10,2,1};
			
			int[] cul_hint1_1 = { 12,3,3};
			int[] cul_hint2_2 = {12,4,2};
			int[] cul_hint3_3 = { 2,7,3,1 };
			int[] cul_hint4_4 = { 2,2,2,3,2,1};
			int[] cul_hint5_5 = { 2,1,1,4,4};
			int[] cul_hint6_6= { 2,9,6 };
			int[] cul_hint7_7 = {3,2,6,5 };
			int[] cul_hint8_8 = { 4,2,1,2,2,4 };
			int[] cul_hint9_9 = { 4,2,5,1,4 };
			int[] cul_hint10_10 = { 4,5,2,1,4 };
			int[] cul_hint11_11 = { 4,5,2,1,4 };
			int[] cul_hint12_12 = { 4,2,5,1,4 };
			int[] cul_hint13_13 = {4,2,1,2,2,4 };
			int[] cul_hint14_14 = {3,2,6,5 };
			int[] cul_hint15_15 = { 2,9,6};
			int[] cul_hint16_16 = { 2,1,1,4,4 };
			int[] cul_hint17_17 = { 2,2,2,3,4 };
			int[] cul_hint18_18 = { 2,10,2 };
			int[] cul_hint19_19 = {18};
			int[] cul_hint20_20 = { 20 };
			puzzle(row_hint1_1, row_hint2_2, row_hint3_3, row_hint4_4, row_hint5_5, row_hint6_6, row_hint7_7, row_hint8_8, row_hint9_9,
					row_hint10_10,row_hint11_11,row_hint12_12,row_hint13_13,row_hint14_14,row_hint15_15,row_hint16_16,row_hint17_17,
					row_hint18_18,row_hint19_19,row_hint20_20,cul_hint1_1, cul_hint2_2, cul_hint3_3, cul_hint4_4, cul_hint5_5, cul_hint6_6,
					cul_hint7_7, cul_hint8_8,cul_hint9_9, cul_hint10_10, cul_hint11_11,cul_hint12_12,cul_hint13_13,cul_hint14_14,cul_hint15_15,
					cul_hint16_16,cul_hint17_17,cul_hint18_18,cul_hint19_19,cul_hint20_20, answer_bear);
			
			break;
			
		case "후크선장":
			int[] row_hint11_1 = { 5 };
			int[] row_hint22_2 = { 2,2 };
			int[] row_hint33_3 = {1,2,2,1 };
			int[] row_hint44_4 = {5,1,1,5};
			int[] row_hint55_5= {5,1,5};
			int[] row_hint66_6 = {5,5,3 };
			int[] row_hint77_7 = { 5,1,5,2,2};
			int[] row_hint88_8 = {11,1,1};
			int[] row_hint99_9 = { 1,1,1,2 };
			int[] row_hint1010_10 = { 1,4,1,2 };
			int[] row_hint1111_11 = { 2,1,3,2,1 };
			int[] row_hint1212_12 = {2,3,2,5 };
			int[] row_hint1313_13 = {2,3,6 };
			int[] row_hint1414_14 = {11,1,4 };
			int[] row_hint1515_15 = {3,3,6};
			int[] row_hint1616_16 = { 9,1,1};
			int[] row_hint1717_17 = { 7,1,1};
			int[] row_hint1818_18 = {1,3,1,1,1};
			int[] row_hint1919_19 = {4,5,1};
			int[] row_hint2020_20 = {16,1};
			
			int[] cul_hint11_1 = {3,2};
			int[] cul_hint22_2 = {4,2,2};
			int[] cul_hint33_3 = { 11,2};
			int[] cul_hint44_4 = {6,4,3};
			int[] cul_hint55_5 = { 7,4,1};
			int[] cul_hint66_6= { 2,3,1,4,1 };
			int[] cul_hint77_7 = {1,1,2,1,3,1 };
			int[] cul_hint88_8 = {1,1,2,1,1,3,1};
			int[] cul_hint99_9 = { 1,1,1,3,1,3,1 };
			int[] cul_hint1010_10 = {2,3,3,4,1 };
			int[] cul_hint1111_11 = {7,8,1 };
			int[] cul_hint1212_12 = { 6,4,3 };
			int[] cul_hint1313_13 = {11,2 };
			int[] cul_hint1414_14 = {4,2,2 };
			int[] cul_hint1515_15 = { 3,3,2};
			int[] cul_hint1616_16 = { 2,2,6 };
			int[] cul_hint1717_17 = {2,4};
			int[] cul_hint1818_18 = { 1,6 };
			int[] cul_hint1919_19 = {2,2,4};
			int[] cul_hint2020_20 = { 3,9 };
			puzzle(row_hint11_1, row_hint22_2, row_hint33_3, row_hint44_4, row_hint55_5, row_hint66_6, row_hint77_7, row_hint88_8, row_hint99_9,
					row_hint1010_10,row_hint1111_11,row_hint1212_12,row_hint1313_13,row_hint1414_14,row_hint1515_15,row_hint1616_16,row_hint1717_17,
					row_hint1818_18,row_hint1919_19,row_hint2020_20,cul_hint11_1, cul_hint22_2, cul_hint33_3, cul_hint44_4, cul_hint55_5, cul_hint66_6,
					cul_hint77_7, cul_hint88_8,cul_hint99_9, cul_hint1010_10, cul_hint1111_11,cul_hint1212_12,cul_hint1313_13,cul_hint1414_14,cul_hint1515_15,
					cul_hint1616_16,cul_hint1717_17,cul_hint1818_18,cul_hint1919_19,cul_hint2020_20, answer_captain);
			
			break;
		}
}
	public void swap(int[] temp) {
		for (int j = 0; j < 가로; j++) 
			result[k][j] = temp[j];	
	}
	public  void swap_cul(int[] temp) {
		for (int j = 0; j < 가로; j++) 
			result[j][a] = temp[j];
	}
public  void complete() {
	stack=0;
	int i=0,j=0;
	for (i = 0; i < 가로; i++) {
		for (j = 0; j < 세로; j++) {
			if(result[i][j]==1)
				stack++;		
			}

	}

}
public void produce() {
	for (int i = 0; i < 가로; i++) {
		for (int j = 0; j < 세로; j++) {
	Project2.puzzle20x20[i][j]=new JButton();
	Project2.puzzle20x20[i][j].setIcon(Images.basic);
	Project2.puzzle20x20[i][j].setContentAreaFilled(false);
	Project2.puzzle20x20[i][j].setFocusPainted(false);
	Project2.puzzle20x20[i][j].setBounds(300+25*j,150+25*i , 25, 25);
	Project2.puzzle20x20[i][j].setVisible(false);
	if(result[i][j]==1)
		Project2.puzzle20x20[i][j].setText("1");
	else
		Project2.puzzle20x20[i][j].setText("-1");
		}
	}
}
public void puzzle(int[] row1,int[] row2,int[] row3,int[] row4,int[] row5,int[] row6,int[] row7,int[] row8,int[] row9,int[] row10,
		int[] row11,int[] row12,int[] row13,int[] row14,int[] row15,int[] row16,int[] row17,int[] row18,int[] row19,int[] row20,
		int[] cul1,int[] cul2,int[] cul3,int[] cul4,int[] cul5,int[] cul6,int[] cul7,int[] cul8,int[] cul9,int[] cul10,int[] cul11,
		int[] cul12,int[] cul13,int[] cul14,int[] cul15,int[] cul16,int[] cul17,int[] cul18,int[] cul19,int[] cul20,int answer	) {

	for(int i=0;i<가로;i++) 
		for(int j=0;j<세로;j++) 
			result[i][j] = 0;
	
do{
		stack=0;
		k=0;
		a=0;
	int row_hint1[] = { result[0][0], result[0][1], result[0][2], result[0][3], result[0][4],result[0][5],result[0][6],result[0][7],
			result[0][8],result[0][9],result[0][10],result[0][11],result[0][12],result[0][13],result[0][14],result[0][15],result[0][16],result[0][17],
			result[0][18],result[0][19]};
	int[] row_num1 = { 20 };
	int[] row_temp1 = solve(row_num1,row_hint1);
	swap(row_temp1);
	k++;


	int row_hint2[] = { result[1][0], result[1][1], result[1][2], result[1][3], result[1][4],result[1][5],result[1][6],result[1][7],
			result[1][8],result[1][9],result[1][10],result[1][11],result[1][12],result[1][13],result[1][14],result[1][15],result[1][16],result[1][17],
			result[1][18],result[1][19]};
	int[] row_num2 = {20};
	int[] row_temp2 = solve(row_num2,row_hint2);
	swap(row_temp2);
	k++;

	
	int row_hint3[] ={ result[2][0], result[2][1], result[2][2], result[2][3], result[2][4],result[2][5],result[2][6],result[2][7],
			result[2][8],result[2][9],result[2][10],result[2][11],result[2][12],result[2][13],result[2][14],result[2][15],result[2][16],result[2][17],
			result[2][18],result[2][19]};
	int[] row_num3 = {2,8,2 };
	int[] row_temp3 = solve(row_num3,row_hint3);
	swap(row_temp3);
	k++;

	
	int row_hint4[] ={ result[3][0], result[3][1], result[3][2], result[3][3], result[3][4],result[3][5],result[3][6],result[3][7],
			result[3][8],result[3][9],result[3][10],result[3][11],result[3][12],result[3][13],result[3][14],result[3][15],result[3][16],result[3][17],
			result[3][18],result[3][19]};
	int[] row_num4 = { 2,2,6,2,2};
	int[] row_temp4 = solve(row_num4,row_hint4);
	
	swap(row_temp4);
	k++;

	int row_hint5[] ={ result[4][0], result[4][1], result[4][2], result[4][3], result[4][4],result[4][5],result[4][6],result[4][7],
			result[4][8],result[4][9],result[4][10],result[4][11],result[4][12],result[4][13],result[4][14],result[4][15],result[4][16],result[4][17],
			result[4][18],result[4][19]};
	int[] row_num5 = {2,1,1,1,1,2};
	int[] row_temp5 = solve(row_num5,row_hint5);
	swap(row_temp5);
	k++;

	int row_hint6[] ={ result[5][0], result[5][1], result[5][2], result[5][3], result[5][4],result[5][5],result[5][6],result[5][7],
			result[5][8],result[5][9],result[5][10],result[5][11],result[5][12],result[5][13],result[5][14],result[5][15],result[5][16],result[5][17],
			result[5][18],result[5][19]};
	int[] row_num6 = { 2,12,2};
	int[] row_temp6 = solve(row_num6,row_hint6);
	swap(row_temp6);
	k++;

	int row_hint7[] ={ result[6][0], result[6][1], result[6][2], result[6][3], result[6][4],result[6][5],result[6][6],result[6][7],
			result[6][8],result[6][9],result[6][10],result[6][11],result[6][12],result[6][13],result[6][14],result[6][15],result[6][16],result[6][17],
			result[6][18],result[6][19]};
	int[] row_num7 = {4,10,4};
	int[] row_temp7 = solve(row_num7,row_hint7);
	swap(row_temp7);
	k++;

	int row_hint8[] ={ result[7][0], result[7][1], result[7][2], result[7][3], result[7][4],result[7][5],result[7][6],result[7][7],
			result[7][8],result[7][9],result[7][10],result[7][11],result[7][12],result[7][13],result[7][14],result[7][15],result[7][16],result[7][17],
			result[7][18],result[7][19]};
	int[] row_num8= {4,1,2,1,4 };
	int[] row_temp8 = solve(row_num8,row_hint8);
	swap(row_temp8);
	k++;
	
	int row_hint9[] ={ result[8][0], result[8][1], result[8][2], result[8][3], result[8][4],result[8][5],result[8][6],result[8][7],
			result[8][8],result[8][9],result[8][10],result[8][11],result[8][12],result[8][13],result[8][14],result[8][15],result[8][16],result[8][17],
			result[8][18],result[8][19]};
	int[] row_num9= {3,12,3};
	int[] row_temp9 = solve(row_num9,row_hint9);
	swap(row_temp9);
	k++;

	int row_hint10[] = { result[9][0], result[9][1], result[9][2], result[9][3], result[9][4],result[9][5],result[9][6],result[9][7],
			result[9][8],result[9][9],result[9][10],result[9][11],result[9][12],result[9][13],result[9][14],result[9][15],result[9][16],result[9][17],
			result[9][18],result[9][19]};
	int[] row_num10 = {3,3,4,3,3};
	int[] row_temp10 = solve(row_num10,row_hint10);
	swap(row_temp10);
	k++;
	int row_hint11[] = { result[10][0], result[10][1], result[10][2], result[10][3], result[10][4],result[10][5],result[10][6],result[10][7],
			result[10][8],result[10][9],result[10][10],result[10][11],result[10][12],result[10][13],result[10][14],result[10][15],result[10][16],result[10][17],
			result[10][18],result[10][19]};
	int[] row_num11 = {3,5,5,3};
	int[] row_temp11 = solve(row_num11,row_hint11);
	swap(row_temp11);
	k++;
	int row_hint12[] = { result[11][0], result[11][1], result[11][2], result[11][3], result[11][4],result[11][5],result[11][6],result[11][7],
			result[11][8],result[11][9],result[11][10],result[11][11],result[11][12],result[11][13],result[11][14],result[11][15],result[11][16],result[11][17],
			result[11][18],result[11][19]};
	int[] row_num12 = {3,12,3};
	int[] row_temp12 = solve(row_num12,row_hint12);
	swap(row_temp12);
	k++;
	int row_hint13[] = { result[12][0], result[12][1], result[12][2], result[12][3], result[12][4],result[12][5],result[12][6],result[12][7],
			result[12][8],result[12][9],result[12][10],result[12][11],result[12][12],result[12][13],result[12][14],result[12][15],result[12][16],result[12][17],
			result[12][18],result[12][19]};
	int[] row_num13 = {2,2,4,2,4};
	int[] row_temp13 = solve(row_num13,row_hint13);
	swap(row_temp13);
	k++;
	int row_hint14[] = { result[13][0], result[13][1], result[13][2], result[13][3], result[13][4],result[13][5],result[13][6],result[13][7],
			result[13][8],result[13][9],result[13][10],result[13][11],result[13][12],result[13][13],result[13][14],result[13][15],result[13][16],result[13][17],
			result[13][18],result[13][19]};
	int[] row_num14 = {2,1,2,2,4};
	int[] row_temp14 = solve(row_num14,row_hint14);
	swap(row_temp14);
	k++;
	int row_hint15[] = { result[14][0], result[14][1], result[14][2], result[14][3], result[14][4],result[14][5],result[14][6],result[14][7],
			result[14][8],result[14][9],result[14][10],result[14][11],result[14][12],result[14][13],result[14][14],result[14][15],result[14][16],result[14][17],
			result[14][18],result[14][19]};
	int[] row_num15 = {2,1,1,6,1,4};
	int[] row_temp15 = solve(row_num15,row_hint15);
	swap(row_temp15);
	k++;
	int row_hint16[] = { result[15][0], result[15][1], result[15][2], result[15][3], result[15][4],result[15][5],result[15][6],result[15][7],
			result[15][8],result[15][9],result[15][10],result[15][11],result[15][12],result[15][13],result[15][14],result[15][15],result[15][16],result[15][17],
			result[15][18],result[15][19]};
	int[] row_num16 = {3,3,3,3};
	int[] row_temp16 = solve(row_num16,row_hint16);
	swap(row_temp16);
	k++;
	int row_hint17[] = { result[16][0], result[16][1], result[16][2], result[16][3], result[16][4],result[16][5],result[16][6],result[16][7],
			result[16][8],result[16][9],result[16][10],result[16][11],result[16][12],result[16][13],result[16][14],result[16][15],result[16][16],result[16][17],
			result[16][18],result[16][19]};
	int[] row_num17 = {16,2};
	int[] row_temp17 = solve(row_num17,row_hint17);
	swap(row_temp17);
	k++;
	int row_hint18[] = { result[17][0], result[17][1], result[17][2], result[17][3], result[17][4],result[17][5],result[17][6],result[17][7],
			result[17][8],result[17][9],result[17][10],result[17][11],result[17][12],result[17][13],result[17][14],result[17][15],result[17][16],result[17][17],
			result[17][18],result[17][19]};
	int[] row_num18 = {1,15,2};
	int[] row_temp18 = solve(row_num18,row_hint18);
	swap(row_temp18);
	k++;
	int row_hint19[] = { result[18][0], result[18][1], result[18][2], result[18][3], result[18][4],result[18][5],result[18][6],result[18][7],
			result[18][8],result[18][9],result[18][10],result[18][11],result[18][12],result[18][13],result[18][14],result[18][15],result[18][16],result[18][17],
			result[18][18],result[18][19]};
	int[] row_num19 = {2,14,1};
	int[] row_temp19 = solve(row_num19,row_hint19);
	swap(row_temp19);
	k++;
	int row_hint20[] = { result[19][0], result[19][1], result[19][2], result[19][3], result[19][4],result[19][5],result[19][6],result[19][7],
			result[19][8],result[19][9],result[19][10],result[19][11],result[19][12],result[19][13],result[19][14],result[19][15],result[19][16],result[19][17],
			result[19][18],result[19][19]};
	int[] row_num20 = {4,10,2,1};
	int[] row_temp20 = solve(row_num20,row_hint20);
	swap(row_temp20);
	k++;
	// --------첫 가로 구하기
	

	int hint1[] = { result[0][0], result[1][0], result[2][0], result[3][0], result[4][0],result[5][0],result[6][0],result[7][0],
			result[8][0],result[9][0],result[10][0], result[11][0], result[12][0], result[13][0], result[14][0],result[15][0],result[16][0],result[17][0],
			result[18][0],result[19][0] };
	int[] cul_hint1 = {12,3,3 };
	int[] cul_temp1 = solve(cul_hint1, hint1);
	swap_cul(cul_temp1);
	a++;

	int hint2[] = { result[0][1], result[1][1], result[2][1], result[3][1], result[4][1],result[5][1],result[6][1],result[7][1],
			result[8][1],result[9][1],result[10][1], result[11][1], result[12][1], result[13][1], result[14][1],result[15][1],result[16][1],result[17][1],
			result[18][1],result[19][1] };
	int[] cul_hint2 = {12,4,2 };
	int[] cul_temp2 = solve(cul_hint2, hint2);
	swap_cul(cul_temp2);
	a++;

	int hint3[] = { result[0][2], result[1][2], result[2][2], result[3][2], result[4][2],result[5][2],result[6][2],result[7][2],
			result[8][2],result[9][2],result[10][2], result[11][2], result[12][2], result[13][2], result[14][2],result[15][2],result[16][2],result[17][2],
			result[18][2],result[19][2] };
	int[] cul_hint3 = {2,7,3,1};
	int[] cul_temp3 = solve(cul_hint3, hint3);
	swap_cul(cul_temp3);
	a++;

	int hint4[] ={ result[0][3], result[1][3], result[2][3], result[3][3], result[4][3],result[5][3],result[6][3],result[7][3],
			result[8][3],result[9][3],result[10][3], result[11][3], result[12][3], result[13][3], result[14][3],result[15][3],result[16][3],result[17][3],
			result[18][3],result[19][3] };
	int[] cul_hint4 = {2,2,2,3,2,1};
	int[] cul_temp4 = solve(cul_hint4, hint4);
	swap_cul(cul_temp4);
	a++;

	int hint5[] ={ result[0][4], result[1][4], result[2][4], result[3][4], result[4][4],result[5][4],result[6][4],result[7][4],
			result[8][4],result[9][4],result[10][4], result[11][4], result[12][4], result[13][4], result[14][4],result[15][4],result[16][4],result[17][4],
			result[18][4],result[19][4] };
	int[] cul_hint5 = {2,1,1,4,4 };
	int[] cul_temp5 = solve(cul_hint5, hint5);
	swap_cul(cul_temp5);
	a++;

	int hint6[] ={ result[0][5], result[1][5], result[2][5], result[3][5], result[4][5],result[5][5],result[6][5],result[7][5],
			result[8][5],result[9][5],result[10][5], result[11][5], result[12][5], result[13][5], result[14][5],result[15][5],result[16][5],result[17][5],
			result[18][5],result[19][5] };
	int[] cul_hint6 = {2,9,6};
	int[] cul_temp6 = solve(cul_hint6, hint6);
	swap_cul(cul_temp6);
	a++;

	int hint7[] = { result[0][6], result[1][6], result[2][6], result[3][6], result[4][6],result[5][6],result[6][6],result[7][6],
			result[8][6],result[9][6],result[10][6], result[11][6], result[12][6], result[13][6], result[14][6],result[15][6],result[16][6],result[17][6],
			result[18][6],result[19][6] };
	int[] cul_hint7 = {3,2,6,5};
	int[] cul_temp7 = solve(cul_hint7, hint7);
	swap_cul(cul_temp7);
	a++;

	int hint8[] = { result[0][7], result[1][7], result[2][7], result[3][7], result[4][7],result[5][7],result[6][7],result[7][7],
			result[8][7],result[9][7],result[10][7], result[11][7], result[12][7], result[13][7], result[14][7],result[15][7],result[16][7],result[17][7],
			result[18][7],result[19][7] };
	int[] cul_hint8 = { 4,2,1,2,2,4 };
	int[] cul_temp8 = solve(cul_hint8, hint8);
	swap_cul(cul_temp8);
	a++;

	int hint9[] = { result[0][8], result[1][8], result[2][8], result[3][8], result[4][8],result[5][8],result[6][8],result[7][8],
			result[8][8],result[9][8],result[10][8], result[11][8], result[12][8], result[13][8], result[14][8],result[15][8],result[16][8],result[17][8],
			result[18][8],result[19][8] };
	int[] cul_hint9 = {4,2,5,1,4 };
	int[] cul_temp9 = solve(cul_hint9, hint9);
	swap_cul(cul_temp9);
	a++;
	
	int hint10[] = { result[0][9], result[1][9], result[2][9], result[3][9], result[4][9],result[5][9],result[6][9],result[7][9],
			result[8][9],result[9][9],result[10][9], result[11][9], result[12][9], result[13][9], result[14][9],result[15][9],result[16][9],result[17][9],
			result[18][9],result[19][9] };
	int[] cul_hint10 = {4,5,2,1,4 };
	int[] cul_temp10 = solve(cul_hint10, hint10);
	swap_cul(cul_temp10);
	a++;
	int hint11[] = { result[0][10], result[1][10], result[2][10], result[3][10], result[4][10],result[5][10],result[6][10],result[7][10],
			result[8][10],result[9][10],result[10][10], result[11][10], result[12][10], result[13][10], result[14][10],result[15][10],result[16][10],result[17][10],
			result[18][10],result[19][10] };
	int[] cul_hint11= { 4,5,2,1,4 };
	int[] cul_temp11 = solve(cul_hint11, hint11);
	swap_cul(cul_temp11);
	a++;
	int hint12[] = { result[0][11], result[1][11], result[2][11], result[3][11], result[4][11],result[5][11],result[6][11],result[7][11],
			result[8][11],result[9][11],result[10][11], result[11][11], result[12][11], result[13][11], result[14][11],result[15][11],result[16][11],result[17][11],
			result[18][11],result[19][11] };
	int[] cul_hint12 = {4,2,5,1,4};
	int[] cul_temp12 = solve(cul_hint12, hint12);
	swap_cul(cul_temp12);
	a++;
	int hint13[] = { result[0][12], result[1][12], result[2][12], result[3][12], result[4][12],result[5][12],result[6][12],result[7][12],
			result[8][12],result[9][12],result[10][12], result[11][12], result[12][12], result[13][12], result[14][12],result[15][12],result[16][12],result[17][12],
			result[18][12],result[19][12] };
	int[] cul_hint13 = {4,2,1,2,2,4};
	int[] cul_temp13 = solve(cul_hint13, hint13);
	swap_cul(cul_temp13);
	a++;
	int hint14[] = { result[0][13], result[1][13], result[2][13], result[3][13], result[4][13],result[5][13],result[6][13],result[7][13],
			result[8][13],result[9][13],result[10][13], result[11][13], result[12][13], result[13][13], result[14][13],result[15][13],result[16][13],result[17][13],
			result[18][13],result[19][13] };
	int[] cul_hint14 = {3,2,6,5};
	int[] cul_temp14= solve(cul_hint14, hint14);
	swap_cul(cul_temp14);
	a++;

	int hint15[] = { result[0][14], result[1][14], result[2][14], result[3][14], result[4][14],result[5][14],result[6][14],result[7][14],
			result[8][14],result[9][14],result[10][14], result[11][14], result[12][14], result[13][14], result[14][14],result[15][14],result[16][14],result[17][14],
			result[18][14],result[19][14] };
	int[] cul_hint15= {2,9,6};
	int[] cul_temp15 = solve(cul_hint15, hint15);
	swap_cul(cul_temp15);
	a++;
	int hint16[] = { result[0][15], result[1][15], result[2][15], result[3][15], result[4][15],result[5][15],result[6][15],result[7][15],
			result[8][15],result[9][15],result[10][15], result[11][15], result[12][15], result[13][15], result[14][15],result[15][15],result[16][15],result[17][15],
			result[18][15],result[19][15] };
	int[] cul_hint16 = {2,1,1,4,4 };
	int[] cul_temp16 = solve(cul_hint16, hint16);
	swap_cul(cul_temp16);
	a++;
	int hint17[] = { result[0][16], result[1][16], result[2][16], result[3][16], result[4][16],result[5][16],result[6][16],result[7][16],
			result[8][16],result[9][16],result[10][16], result[11][16], result[12][16], result[13][16], result[14][16],result[15][16],result[16][16],result[17][16],
			result[18][16],result[19][16] };
	int[] cul_hint17 = {2,2,2,3,4 };
	int[] cul_temp17 = solve(cul_hint17, hint17);
	swap_cul(cul_temp17);
	a++;
	int hint18[] = { result[0][17], result[1][17], result[2][17], result[3][17], result[4][17],result[5][17],result[6][17],result[7][17],
			result[8][17],result[9][17],result[10][17], result[11][17], result[12][17], result[13][17], result[14][17],result[15][17],result[16][17],result[17][17],
			result[18][17],result[19][17] };
	int[] cul_hint18 = {2,10,2 };
	int[] cul_temp18 = solve(cul_hint18, hint18);
	swap_cul(cul_temp18);
	a++;
	int hint19[] = { result[0][18], result[1][18], result[2][18], result[3][18], result[4][18],result[5][18],result[6][18],result[7][18],
			result[8][18],result[9][18],result[10][18], result[11][18], result[12][18], result[13][18], result[14][18],result[15][18],result[16][18],result[17][18],
			result[18][18],result[19][18] };
	int[] cul_hint19 = { 18 };
	int[] cul_temp19= solve(cul_hint19, hint19);
	swap_cul(cul_temp19);
	a++;
	int hint20[] = { result[0][19], result[1][19], result[2][19], result[3][19], result[4][19],result[5][19],result[6][19],result[7][19],
			result[8][19],result[9][19],result[10][19], result[11][19], result[12][19], result[13][19], result[14][19],result[15][19],result[16][19],result[17][19],
			result[18][19],result[19][19] };
	int[] cul_hint20 = { 20 };
	int[] cul_temp20 = solve(cul_hint20, hint20);
	swap_cul(cul_temp20);
	a++;

	complete();
}while(stack!=answer_bear);
	
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
		int can_dum[] = new int[가로+2];
		can_dum[0] = 0;
		for (int i = 1; i <= 가로; i++)
			can_dum[i] = temp[i - 1];
		can_dum[가로+1] = 0;
		int ans[] = new int[20];
		int summ = 0;
		int stack = 0;
		int ans_stack = 0;
		for (int i = 0; i < 가로; i++) {
			if (temp[i] == 0)
				stack++;
			if (stack == 가로)
				ans[ans_stack] = 0;
		}
		for (int i = 1; i < 가로+1; i++) {
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
