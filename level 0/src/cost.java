import javax.swing.JOptionPane;

public class cost {
	public static void main(String[] args) {

		String cost = JOptionPane.showInputDialog("How much does Kanye West cost in 2020?");

		float costInt = Float.parseFloat(cost);

		String money = JOptionPane.showInputDialog("How much money do you have?");
		
		Float moneyInt = Float.parseFloat(money);
		
		if(costInt > moneyInt){
	
		JOptionPane.showMessageDialog(null,"You don't have enough money, sorry.");
		}
		
		else{
		float difference = moneyInt - costInt;
		
		JOptionPane.showMessageDialog(null, difference);
		}
	
	
	
	
	
	
	}
}