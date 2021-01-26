package GUI_AND_Function;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
public class quicksort {
	
	static int partition(JLabel[] label,JButton[] game,ImageIcon[] image,ImageIcon[] image_hint1,ImageIcon[] image_hint2, int start,int end,int[] answer) {
		
		
		String pivot=label[(start+end)/2].getText();
		while(start<=end) {
			while(pivot.compareTo(label[start].getText())>0)start++;
			while(pivot.compareTo(label[end].getText())<0) end--;
			
			if(start<=end) {
				String temp=label[start].getText();
				int gametemp= start;
				int answer_temp=answer[start];
				ImageIcon imagetemp=image[start];
				ImageIcon image_hint1_temp=image_hint1[start];
				ImageIcon image_hint2_temp=image_hint2[start];
				
				label[start].setText(label[end].getText());
				game[start].setIcon(image[end]);
				image[start]=image[end];
				image_hint1[start]=image_hint1[end];
				image_hint2[start]=image_hint2[end];
				answer[start]=answer[end];
				
				label[end].setText(temp);
				game[end].setIcon(imagetemp);
				image[end]=imagetemp;
				image_hint1[end]=image_hint1_temp;
				image_hint2[end]=image_hint2_temp;
				answer[end]=answer_temp;
				
				start++;
				end--;
			}
		}
		return start;
	}
	static JLabel[] quickSort(JLabel[] label,JButton[] game,ImageIcon[] image,ImageIcon[] image_hint1,ImageIcon[] image_hint2, int start, int end,int[] answer) {
		int p=partition(label,game,image,image_hint1,image_hint2,start,end,answer);

		if(start<p-1)
			quickSort(label,game,image,image_hint1,image_hint2,start,p-1,answer);
		if(p<end)
			quickSort(label,game,image,image_hint1,image_hint2,p,end,answer);
		return label;
	}

	
}
