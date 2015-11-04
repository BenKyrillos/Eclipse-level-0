import javax.swing.JOptionPane;






public class happyorsad {
	public static void main(String[] args){
		
		
	
			int userMood = JOptionPane.showOptionDialog(null, "Are you happy or sad?", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "yes", "no" }, null);
			
			
			if(userMood == 0){
				JOptionPane.showMessageDialog(null, "Keep doing whatever your doing");
			}
			else{ 
				int sad = JOptionPane.showOptionDialog(null, "Are you sad or happy?", "Pop-up Title", 0,
						JOptionPane.INFORMATION_MESSAGE, null, new String[] { "yes", "no" }, null);
				
			}
	}
	}

