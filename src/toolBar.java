import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;


public class toolBar {

	private JToolBar toolBar = new JToolBar();
	private JButton btn1 = new JButton(new ImageIcon ("images/btn1.jpg")),
					btn2 = new JButton(new ImageIcon ("images/btn2.jpg")),
					btn3= new JButton (new ImageIcon ("images/btn3.jpg")),
					btn4= new JButton (new ImageIcon ("images/btn4.jpg"));
	
	private Color fondButton=Color.white;
	
	public void toolBar(){
		initToolbar();
	}
	
	private void initToolbar(){
		
		this.btn1.setEnabled(false);
		this.btn1.addActionListener((ActionListener) this);
		this.btn1.setBackground(fondButton);
		this.toolBar.add(btn1);
		
		this.btn2.setEnabled(false);
		this.btn2.addActionListener((ActionListener) this);
		this.btn2.setBackground(fondButton);
		this.toolBar.add(btn2);
		
		this.btn3.setEnabled(false);
		this.btn3.addActionListener((ActionListener) this);
		this.btn3.setBackground(fondButton);
		this.toolBar.add(btn3);
		
		this.btn4.setEnabled(false);
		this.btn4.addActionListener((ActionListener) this);
		this.btn4.setBackground(fondButton);
		this.toolBar.add(btn4);
		
	}
}
