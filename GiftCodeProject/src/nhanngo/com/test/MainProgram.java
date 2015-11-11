package nhanngo.com.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.Font;
import javax.swing.SwingConstants;

import nhanngo.com.model.Code;
import nhanngo.com.model.CodeList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class MainProgram {

	private JFrame frame;
	private JTextField txtLength;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainProgram window = new MainProgram();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainProgram() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 407, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtLength = new JTextField();
		txtLength.setBounds(108, 8, 144, 20);
		frame.getContentPane().add(txtLength);
		txtLength.setColumns(10);

		JLabel lblDiCa = new JLabel("Độ dài của Voucher");
		lblDiCa.setBounds(10, 11, 100, 14);
		frame.getContentPane().add(lblDiCa);

		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CodeList codeList=new CodeList();
				
				codeList.generateNumberCode(Integer.parseInt(txtLength.getText()));
				
				JTextArea textArea = new JTextArea();
				textArea.setBounds(10, 49, 371, 202);
				frame.getContentPane().add(textArea);
				
				for(Code c:codeList.getGiftCodeList().values())
				{
					textArea.setText(textArea.getText()+c+"\n");
					
					textArea.setAutoscrolls(true);
				}
				codeList.showCodeList();
			}
		});
		btnGenerate.setBounds(262, 7, 89, 23);
		frame.getContentPane().add(btnGenerate);

		JLabel lblMVoucher = new JLabel("Mã voucher");
		lblMVoucher.setBounds(10, 36, 100, 14);
		frame.getContentPane().add(lblMVoucher);
		
		
		
		
	}
}
