package Laba2;

import java.awt.event.ActionEvent;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.*;


public class j_combo_box implements ActionListener {
	private JComboBox j_combo_box;
	public void actionPerformed(ActionEvent e) {
		JComboBox j_combo_box = (JComboBox)e.getSource();
        int choice = j_combo_box.getSelectedIndex();
        //���������� ������������ ��������
        if (choice == 0){
        	subversion.logotip.setBounds(285, 0, 150, 150);
        	//� ������� ������ ����
        	
        }
        if (choice == 1){
        	subversion.logotip.setBounds(150, 80, 150, 150);
        	//� ��������
        }
        if (choice == 2){
        	subversion.logotip.setBounds(0, 0, 150, 150);
        	//� ������� ����� ����
        	
        }
        if (choice == 3){
        	array arr = new array();
          	 int[] mass = arr.arrr();
          	 JFrame jFrame = new JFrame();
               JOptionPane.showMessageDialog(jFrame, "����������������� ������: "+ Arrays.toString(mass)+" \n��������������� ������: " + Arrays.toString(sortirovka.sortirovka(mass)));
   		
        	
        }
}
}