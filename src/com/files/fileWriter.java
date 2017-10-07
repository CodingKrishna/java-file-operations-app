package com.files;



import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class fileWriter extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fileWriter frame = new fileWriter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public  fileWriter() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("enterText");
		lblNewLabel.setBounds(43, 40, 64, 14);
		contentPane.add(lblNewLabel);

		final JTextArea textArea = new JTextArea();
		textArea.setBounds(176, 35, 188, 107);
		contentPane.add(textArea);

		JButton btnNewButton = new JButton("submit");
		btnNewButton.setBounds(92, 195, 89, 23);
		contentPane.add(btnNewButton);

		File outFile = new File("D://TextField.txt");
		FileOutputStream outFileStream = new FileOutputStream(outFile);
		final PrintWriter writer = new PrintWriter(outFileStream);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				writer.write(textArea.getText());

				writer.close();

			}
		});

	}
}


