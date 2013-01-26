import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;


public class fenetre extends JFrame{

	private JPanel panContener = (JPanel)getContentPane();

	
	public fenetre(){
		this.setSize(300,300);
		panContener.setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//panContener.setBackground(Color.BLACK);
		this.initToolbar();
		setVisible(true);
		
	}
	
	private JToolBar toolBar = new JToolBar();
	private JButton btn1 = new JButton(new ImageIcon ("images/btn1.png")),
					btn2 = new JButton(new ImageIcon ("images/btn2.png")),
					btn3= new JButton (new ImageIcon ("images/btn3.png")),
					btn4= new JButton (new ImageIcon ("images/btn4.png"));
	
	private Color fondButton=Color.white;
	
	
	private void initToolbar(){
		
		this.btn1.setEnabled(true);
		this.btn1.setToolTipText("Ajouter");
		//this.btn1.addActionListener((ActionListener) this);
		this.btn1.setBackground(fondButton);
		this.toolBar.add(btn1);
		
		this.btn2.setEnabled(true);
		this.btn2.setToolTipText("Valider");
		//this.btn2.addActionListener((ActionListener) this);
		this.btn2.setBackground(fondButton);
		this.toolBar.add(btn2);
		
		this.btn3.setEnabled(true);
		this.btn3.setToolTipText("Recherche");
		//this.btn3.addActionListener((ActionListener) this);
		this.btn3.setBackground(fondButton);
		this.toolBar.add(btn3);
		
		this.btn4.setEnabled(true);
		this.btn4.setToolTipText("Lecteur");
		//this.btn4.addActionListener((ActionListener) this);
		this.btn4.setBackground(fondButton);
		this.toolBar.add(btn4);
		
		this.setResizable(true);
		
		this.add(toolBar, BorderLayout.NORTH);
		
	}

}
