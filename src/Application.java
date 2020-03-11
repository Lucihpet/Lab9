import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * The Application Class is both a Window and an Event Handler (or will be)
 *   Find the TODOs and implement the ActionListener interface below
 */


//TODO: Extend this class so that it implements ActionListener
public class Application extends JFrame implements ActionListener {
	JButton myButton = new JButton( "Hello World" );
	
	//TODO: implement the actionPerformed method
	
	public  Application() {
		super("Window");
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//add the button to the display
		this.add(myButton);
		
		//TODO: when this class implements actionlistener, the line below will compile
		myButton.addActionListener( this );
	}
	
	//A one line main
	public static void main(String[] args) {
		JFrame app = new Application();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFrame frame = new JFrame("Message Dialog");
		JOptionPane.showMessageDialog(frame, "Lab 9 Action Performed.");
	}
}
