import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
//	JMenuBar menuBar;
//	JMenu fileMenu;
//	JMenu editMenu;
//	JMenu helpMenu;
//	JMenuItem loadItem;
//	JMenuItem saveItem;
//	JMenuItem exitItem;
//	
// 	MyFrame() {
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(500, 500);
//		this.setLayout(new FlowLayout());
//		
//		JMenuBar menuBar = new JMenuBar();
//		
//		JMenu fileMenu = new JMenu("File");
//		JMenu editMenu = new JMenu("Edit");
//		JMenu helpMenu = new JMenu("Help");
//		
//		loadItem = new JMenuItem("Load");
//		saveItem = new JMenuItem("Save");
//		exitItem = new JMenuItem("Exit");
//		
//		loadItem.addActionListener(this);
//		saveItem.addActionListener(this);
//		exitItem.addActionListener(this);
//		
//		fileMenu.setMnemonic(KeyEvent.VK_F); // alt + f for file
//		editMenu.setMnemonic(KeyEvent.VK_E); // alt + e for edit
//		helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h for help
//		
//		loadItem.setMnemonic(KeyEvent.VK_L); // l for load loads the file when l is pressed whrn the panel is open
//		saveItem.setMnemonic(KeyEvent.VK_S); // s for save -- saves the file when s is pressed when the paenl is open
//		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit -- exits out of the frame
//		
//		fileMenu.add(loadItem);
//		fileMenu.add(saveItem);
//		fileMenu.add(exitItem);
//		
//		menuBar.add(fileMenu);
//		menuBar.add(editMenu);
//		menuBar.add(helpMenu);
//		
//		this.setJMenuBar(menuBar);
//		
//		this.setVisible(true);
	
		JButton button;
		MyFrame() {
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLayout(new FlowLayout());
			
			button = new JButton("Select a file");
			button.addActionListener(this);
			
			this.add(button);
			this.pack();
			this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if (e.getSource() == loadItem) {
//			System.out.println("beep boop** you loaded a file");
//		}
//		if (e.getSource() == saveItem) {
//			System.out.println("beep boop** you saved a file");
//		}
//		if (e.getSource() == exitItem) {
//			System.exit(0);
//		}
		if(e.getSource() == button) {
			JFileChooser fileChooser = new JFileChooser();
			
//			fileChooser.setCurrentDirectory(new File("")); add a lik to a file
			int response = fileChooser.showOpenDialog(null);// select file to open ---returns 1 if a file is selected and 0 if cancelled
			//show save dialog box works to save a file
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
			
		}
	}

}
