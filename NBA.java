//Name:Kaleb_Befekadu
//PantherID:002-515-849
//Due Date: July 07
//==================================================================
//imported java.util.Scanner to use scanner class.
//imported java.util.Arrays to use the array class.
import java.util.Arrays;
import java.util.Scanner;

public class NBA
{
//main method where code is executed 
public static void main(String[] args) {
		
	//takes input from the user
		Scanner input = new Scanner (System.in);
		String ifAddPlayer;
		String playerName;
		
		//construct Team Heat which will ask the user to input player by yes and no. 
		System.out.println("Creat the NBA team of Heats ...... ");
		NBATeaml heat= new NBATeaml("Heats");
		System.out.print("Add a play to Heats? (yes/no): ");
		ifAddPlayer= input.next();
		// Creates a while loop that checks if the user input is yes-
		//-and if it yes it ask the user to input another player.
		while (ifAddPlayer.equalsIgnoreCase("yes")){
	    		System.out.print("What is the name to be added? ");
		    	playerName=input.next();
		    	heat.addAPlayer(playerName);
			
	    		System.out.print("Add one more play to Heats? (yes/no): ");
	    		// if it is yes and the user adds a player it is saved in this variable.
			ifAddPlayer= input.next();
		 }
		//construct Team spurs which will ask the user to input player by yes and no. 
		System.out.println("Creat the NBA team of Spurs ...... ");
		NBATeaml spurs= new NBATeaml("Spurs");
		System.out.print("Add a play to Spurs? (yes/no): ");
		ifAddPlayer= input.next();
		// Creates a while loop that checks if the user input is yes-
		//-and if it yes it ask the user to input another player.
		while (ifAddPlayer.equalsIgnoreCase("yes")){
	    		System.out.print("What is the name to be added? ");
	    		// saves the name of the player in this variable
		    	playerName=input.next();
		    	spurs.addAPlayer(playerName);
			
	    		System.out.print("Add one more play to Spurs? (yes/no): ");
	    		// if it is yes and the user adds a player it is saved in this variable.
			ifAddPlayer= input.next();
		}
/* by generating a random number it simulate a series of 7 games; 
 * if the random number is bigger than 0.5, Heat wins; 
 * otherwise Heat losses a game. 
 * As soon as team wins 4 games, the series is over. */
		  int games = 7;   
		    while (games >0)
		    {
		        if (Math.random() > 0.5)
		            heat.winAgame(spurs);
		        else
		            spurs.winAgame(heat);
		        games--;
		    }
		    // prints letting the user the game started 
		    System.out.println("Game on Now.......");
		    // checks who won the game in the if condition and prints the statement
		if (heat.Getwins() > spurs.Getwins()) {
			System.out.println("Heat ***WIN the series***");
			 //if the above condition is not true spurs win and prints the statement
		}else {
			System.out.println("Spurs ***WIN the series***");
		}
		// prints spurs and heat
		System.out.println(heat);
		System.out.println(spurs);

	}
}













/*
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class NbaPlayoff {

	public class NbaPlayofff extends JFrame {
	private JTextField txtName;
	private JTextField txtAge;
	private NBATeami spurs;
	private NBAcourtPanel court;
	private JLabel lMax, lMin, lAvg, lNum;

	public void NbaPlayoff(){
	spurs=new NBATeami("Spurs");
	court=new NBAcourtPanel(spurs);
	add(court.getParent(), BorderLayout.CENTER);

	JLabel lMax0=new JLabel("Max Age:");
	lMax=new JLabel("");
	JLabel lMin0=new JLabel("Min Age:");
	lMin=new JLabel("");
	JLabel lAvg0=new JLabel("Average Age:");
	lAvg=new JLabel("");
	JLabel lNum0=new JLabel("Number of Players:");
	lNum =new JLabel("");
	JPanel rp=new JPanel(new GridLayout(8, 1)); //right panel
	rp.add(lNum0);
	rp.add(lNum);
	rp.add(lMax0);
	rp.add(lMax);
	rp.add(lMin0);
	rp.add(lMin);rp.add(lAvg0);
	rp.add(lAvg);
	add(rp, BorderLayout.EAST);

	JLabel l1=new JLabel("Player Name:");
	txtName= new JTextField(); 
	txtName.setPreferredSize(new Dimension(120,24));
	JLabel l2=new JLabel("Player Age:");
	txtAge= new JTextField(); 
	txtAge.setPreferredSize(new Dimension(120,24));
	//	
//		JButton jbtAdd=new JButton("Add A Player");
//		jbtAdd.addActionListener(new ActionListener() {
//		public void actionPerformed(ActionEvent e) {
//		int age=Integer.parseInt(txtAge.getText());
//		spurs.addAPlayer(txtName.getText(), age);
//		lMax.setText(spurs.getMaxAge()+"");
//		lMin.setText(spurs.getMinAge()+"");
//		lAvg.setText(spurs.getAvgAge()+"");
//		lNum.setText(spurs.getNumOfPlayer()+"");
	//	
//		court.repaint();
//		}}); 

	JButton jbtClear= new JButton("Clear");
	jbtClear.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	txtName.setText("");
	txtAge.setText("");
	}}); 

	JPanel pBot=new JPanel();
	pBot.add(l1);
	pBot.add(txtName);
	pBot.add(l2);
	pBot.add(txtAge);
//		pBot.add(jbtAdd);
	pBot.add(jbtClear);
	add(pBot, BorderLayout.SOUTH);


	}

	public void main(String[] args) {

		NbaPlayoff frame = new NbaPlayoff();

	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setSize(800, 400); 
	frame.setVisible(true);
	}

	}

	public void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}


	}
	
	
	

	
		import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class NBACourtPanel {
//NBAcourtPanel

public class NBAcourtPanel {
private NBATeam team;
private JPanel court;

public NBAcourtPanel(NBATeam team) {
this.team = team;
}

public JPanel getPanel() {
return court;
}
}
}


	
	*/
	
	