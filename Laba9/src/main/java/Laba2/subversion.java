package Laba2; //����� Java �������

import java.awt.event.ActionListener; //���������� ��� ������� ���������
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)


import java.awt.event.ActionEvent;

public class subversion {
	
	protected JFrame main_GUI;
	protected JPanel main_panel;
	protected static subversion student;
	protected static image_info logotip;
	
	public subversion() {
	JFrame main_GUI = new JFrame("subversion");	// �������� ������������ ����
	main_GUI.setTitle ("Using subversion for developers");
	main_GUI.setBounds(500,250,400,450);
	main_GUI.setResizable(false); // ������������� ������ ����
	
	JMenuBar jmb = new JMenuBar();// �������� ������ ��� ����������� ����
	main_GUI.setJMenuBar(jmb);

	JMenu menuu = new JMenu("����");// �������� ����������� ����
	jmb.add(menuu);

	final JMenuItem loogotip = new JMenuItem("���������� ������� �����"); // �������� ������ ����
	menuu.add(loogotip);
	
	JMenuItem fail = new JMenuItem("��������� ���� � ������6"); // �������� ������ ����
	menuu.add(fail);
	
	JMenuItem vihod = new JMenuItem("�����"); // �������� ������ ����
	menuu.add(vihod);

	vihod.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent arg0) {

			System.exit(1);

	}
	});
	
	final JPanel main_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	main_panel.setLayout(null);
	main_GUI.add(main_panel);
	
	JLabel laba_info = new JLabel("������������ ������ �2"); // ����������� ������ ��� �����������
	laba_info.setBounds(120,0,150,30);
	main_panel.add(laba_info);
	
	JButton button_exit = new JButton("�����"); // ��������� ������
	button_exit.setBounds(260,200,100,40);
	ActionListener action_listener = new listener_button(); //������� ���������
	button_exit.addActionListener(action_listener); // ��������� ��������� � ������
	main_panel.add(button_exit);
	
	JButton button_information = new JButton("����������"); // ��������� ������ ����������
	button_information.setBounds(10,200,150,40);
	button_info action_info = new button_info(); //������� ��������� � ������ ����������
	button_information.addActionListener(action_info); // ��������� ��������� � ������ ����������
	main_panel.add(button_information);
	
	JLabel mult1 = new JLabel("������� ������� �������:");
	mult1.setBounds(20,255,160,20);
	main_panel.add(mult1);

	final JTextField mult1t = new JTextField();
	mult1t.setBounds(180,250,140,30);
	main_panel.add(mult1t); 
	
	JLabel mult2 = new JLabel("������� ���������:");
	mult2.setBounds(20,290,150,20);
	main_panel.add(mult2);

	final JTextField mult2t = new JTextField();
	mult2t.setBounds(180,285,140,30);
	main_panel.add(mult2t); 
	
	final JLabel result = new JLabel("��������� �������: ");
	result.setBounds(20,320,200,20);
	main_panel.add(result);
	
	
	JButton scet = new JButton("����������"); // ��������� ������
	scet.setBounds(20,350,130,30);
	scet.addActionListener(new ActionListener () {
	
	public void actionPerformed(ActionEvent e) {
	double m1 = Double.valueOf(mult1t.getText());
	mult1t.setText("");
	double m2 = Double.valueOf(mult2t.getText());
	mult2t.setText("");
	
	
	double r = m1*2+m2;
	result.setText("�������� �����: " + String.valueOf(r));
	}



	});
	
	main_panel.add(scet);
	
	String[] items = new String[4];//�������� ���� ������� ����������� ������
    items[0] = "����������� ������� ����� � ������� ������ ����";
    items[1] = "����������� ������� ����� � ��������";
    items[2] = "����������� ������� ����� � ������� ����� ����";
    items[3] = "������������� ������ � �������6";
    JComboBox j_combo_boxx = new JComboBox(items);//�������� ����������� ������
    j_combo_boxx.setBounds(10, 150,350,40);
    ActionListener j_combo_box =  new j_combo_box();
    j_combo_boxx.addActionListener (j_combo_box);
    main_panel.add(j_combo_boxx);//��������� ���������� ������ �� �����
	
	loogotip.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent arg0) {

			logotip = new image_info();
		logotip.setBounds(285, 0, 150, 150);

		main_panel.add(logotip);
		main_panel.repaint();
		loogotip.setEnabled(false);
		}

		});

	//�������� �����

    JPanel panel_file = new JPanel();
    panel_file.setLayout(new BoxLayout(panel_file, BoxLayout.Y_AXIS));
    main_panel.add(Box.createVerticalGlue());
    final JLabel label_file = new JLabel("��������� ����");
    label_file.setBounds(150, 20, 125, 30);
    main_panel.add(label_file);

	final JTextArea area_file = new JTextArea();    
	area_file.setBounds(0,80,600,50);
	area_file.setEditable(false);
	main_panel.add(area_file);
	JScrollPane scroll = new JScrollPane(area_file, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	scroll.setSize(365, 70);
    scroll.setLocation(10,60);      
	main_panel.add(scroll);
	
    fail.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg1) {
	        JFileChooser fileopen = new JFileChooser();             
	        int files = fileopen.showDialog(null, "������� ����");                
	        if (files == JFileChooser.APPROVE_OPTION) {
	        	File file = fileopen.getSelectedFile();
	            label_file.setText(file.getName());
	        	try (BufferedReader reader=new BufferedReader(new FileReader(file))) {
	                String line;
	                while ((line = reader.readLine()) != null ) {
	                	area_file.append(line + "\n");
	                }
	            }
	        	catch (IOException ex) {}
	        }
        }
    });  
	
	//����� �������� �����
	
	main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� ���� JFrame � �������� Java
	}
	
	public static void main(String[] args) { // ���������� �������: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

}
