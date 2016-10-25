package lzw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lzwapp extends JFrame {

	private JPanel contentPane;
	private JTextField inp1;
	private JTextField textField;
	private String[]dictionary=new String[500];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lzwapp frame = new Lzwapp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lzwapp() {
		setTitle("LZW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 350);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInputFile = new JLabel("input file");
		lblInputFile.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblInputFile.setForeground(Color.GREEN);
		lblInputFile.setBounds(12, 77, 95, 29);
		contentPane.add(lblInputFile);
		
		inp1 = new JTextField();
		inp1.setBounds(141, 77, 114, 29);
		contentPane.add(inp1);
		inp1.setColumns(10);
		
		JLabel lblOutputFile = new JLabel("output file");
		lblOutputFile.setForeground(Color.GREEN);
		lblOutputFile.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		lblOutputFile.setBounds(333, 84, 110, 15);
		contentPane.add(lblOutputFile);
		
		textField = new JTextField();
		textField.setBounds(479, 77, 114, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCompress = new JButton("Compress");
		btnCompress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnCompress.setBackground(Color.BLACK);
		btnCompress.setForeground(Color.GREEN);
		btnCompress.setBounds(174, 194, 128, 25);
		contentPane.add(btnCompress);
		
		JButton btnDecompress = new JButton("Decompress");
		btnDecompress.setForeground(Color.GREEN);
		btnDecompress.setBackground(Color.BLACK);
		btnDecompress.setBounds(434, 194, 140, 25);
		contentPane.add(btnDecompress);
		
		JButton btnExit = new JButton("Exit");
		Image im=new ImageIcon(this.getClass().getResource("/out.png")).getImage();
		btnExit.setIcon(new ImageIcon(im));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.BLACK);
		btnExit.setForeground(Color.GREEN);
		btnExit.setBounds(292, 291, 117, 25);
		contentPane.add(btnExit);
	}
}
