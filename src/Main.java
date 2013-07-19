
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final JButton deny = new JButton("Deny");
		deny.setEnabled(false);
		
		JOptionPane.showOptionDialog(null,
		    "You otha brothas",
		    "I like big butts and I cannot lie",
		    JOptionPane.NO_OPTION,
		    JOptionPane.WARNING_MESSAGE,
		    null,
		    new JButton[]{deny},
		    deny);
	}

}
