import javax.swing.JOptionPane;
public class Start {
	public static void main(String[] args)
	{
		String message = "Please enter a number";
		int startNumber = Integer.parseInt(JOptionPane.showInputDialog(message));
		Factor newFactor = new Factor(startNumber, 1);
		JOptionPane.showMessageDialog(null, newFactor.GetBaseNumber());
	}
}