package Laba2;


import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class button_info implements ActionListener {
	public void actionPerformed(ActionEvent arg1) {
		final JFrame main_info = new JFrame("information");	// �������� ������������ ���� ����������
		main_info.setTitle ("��� ����������");
		main_info.setBounds(500,300,700,325);
		main_info.setResizable(false); // ������������� ������ ����
		
		JPanel main_panel_info = new JPanel(); // ������� ������
		main_panel_info.setLayout(null);
		main_info.add(main_panel_info);
		
		//�������� � ���������� ������
		
		JLabel fio1_info = new JLabel("���������: �������� ��������� ��������� ������ - 21130153");
		fio1_info.setBounds(0,0,600,40);
		main_panel_info.add(fio1_info);
		
		JLabel fio2_info = new JLabel("����������� �1: ����� ��������� ��������� ������ - 21130078");
		fio2_info.setBounds(0,50,600,40);
		main_panel_info.add(fio2_info);
		
		JLabel fio3_info = new JLabel("����������� �2: ����� �������� ��������� ������ - 21130367");
		fio3_info.setBounds(0,100,600,40);
		main_panel_info.add(fio3_info);
		
		JLabel fio4_info = new JLabel("����������� �3: ����� ��������� ��������� ������ - 21130734");
		fio4_info.setBounds(0,150,600,40);
		main_panel_info.add(fio4_info);
		
		JButton button_exit = new JButton("�����"); // ��������� ������
		button_exit.setBounds(200,200,300,40);
		main_panel_info.add(button_exit);
		
		button_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainactionPerformed(e);
			}
			private void mainactionPerformed(ActionEvent arg0) {
				main_info.setVisible(false);
			}
			});
		main_info.setVisible(true);
	}
}
