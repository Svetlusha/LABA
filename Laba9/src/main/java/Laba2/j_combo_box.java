package Laba2;

import java.awt.event.ActionEvent;

import javax.swing.JComboBox;

import java.awt.event.*;


public class j_combo_box implements ActionListener {
	private JComboBox j_combo_box;
	public void actionPerformed(ActionEvent e) {
		JComboBox j_combo_box = (JComboBox)e.getSource();
        int choice = j_combo_box.getSelectedIndex();
        //выполнение передвижения логотипа
        if (choice == 0){
        	subversion.logotip.setBounds(285, 0, 150, 150);
        	//в верхний правый угол
        	
        }
        if (choice == 1){
        	subversion.logotip.setBounds(150, 80, 150, 150);
        	//в середину
        }
        if (choice == 2){
        	subversion.logotip.setBounds(0, 0, 150, 150);
        	//в верхний левый угол
        	
        }
        
}
}