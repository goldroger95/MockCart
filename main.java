package me.gui.com;
import java.util.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JTable;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.table.DefaultTableModel;
import javax.swing.UIManager;

import java.util.HashMap;

import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	//Hashmap to store item, qty pair
	static HashMap<String, Integer> map=new HashMap<String, Integer>();
	
	//add classes to contain item name, price and qty
	
	private void addtoTable(String item, int qty, int price, JTable table){
		//Add LinkedList code
		
	}
	// check and add item qty
	// implement with classes and objects
	
	private void addUpdateQty(String item){
		int qty_temp;
		if (map.containsKey(item)){
			qty_temp=(int) map.get(item);
			qty_temp+=1;
			map.put(item,qty_temp);
			System.out.println(qty_temp);	//DEBUG
		}
		else{
		map.put(item,1);
		qty_temp=(int) map.get(item);		//DEBUG
		System.out.println(qty_temp);		//DEBUG
		}
		//addtoTable("C", c, price_c, table);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		
		//JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JTable
		table = new JTable();
		table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		table.setBackground(UIManager.getColor("CheckBox.background"));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Item", "Price", "Qty", "Amt", "Close"},
			},
			new String[] {
				"Item", "Price", "Qty", "Amt", "Close"
			}
		));
		table.setBounds(228, 11, 196, 90);
		contentPane.add(table);
		
		
		//Label to display total
		JLabel total = new JLabel("");
		total.setBounds(376, 105, 48, 14);
		contentPane.add(total);
		
		
		//Total Label
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(342, 105, 24, 14);
		contentPane.add(lblTotal);
		
		//Del button
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(228, 101, 63, 23);
		contentPane.add(btnDelete);
		
		//Item Panel(Left)
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.setBounds(10, 11, 208, 251);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Buttons(A-E)
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addUpdateQty("A");			
			}
		});
		btnA.setBounds(24, 11, 61, 48);
		panel.add(btnA);
		
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addUpdateQty("B");		
			}
		});
		btnB.setBounds(120, 11, 61, 48);
		panel.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addUpdateQty("C");
					
			}
		});
		btnC.setBounds(24, 70, 61, 48);
		panel.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addUpdateQty("D");		
			}
		});
		btnD.setBounds(120, 70, 61, 48);
		panel.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addUpdateQty("E");		
			}
		});
		btnE.setBounds(24, 129, 61, 48);
		panel.add(btnE);
		
		
		//Panel for Calculator Pad
		//Functionality not to be added right now
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel_2.setBounds(216, 130, 208, 132);
		contentPane.add(panel_2);
		
		
		//Calculator Pad(dummy)
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 11, 39, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.setLayout(null);
		
		JButton button_12 = new JButton("0");
		button_12.setBounds(10, 113, 39, 23);
		panel_2.add(button_12);
		panel_2.add(btnNewButton);
		
		JButton button_4 = new JButton("2");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setBounds(59, 11, 39, 23);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.setBounds(108, 11, 39, 23);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("4");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_6.setBounds(10, 45, 39, 23);
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("5");
		button_7.setBounds(59, 45, 39, 23);
		panel_2.add(button_7);
		
		JButton button_8 = new JButton("6");
		button_8.setBounds(108, 45, 39, 23);
		panel_2.add(button_8);
		
		JButton button_9 = new JButton("7");
		button_9.setBounds(10, 79, 39, 23);
		panel_2.add(button_9);
		
		JButton button_10 = new JButton("8");
		button_10.setBounds(59, 79, 39, 23);
		panel_2.add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.setBounds(108, 79, 39, 23);
		panel_2.add(button_11);
		
		JButton btnEnter = new JButton("E");
		btnEnter.setToolTipText("Enter");
		btnEnter.setBounds(157, 79, 39, 57);
		panel_2.add(btnEnter);
		
		JButton btnCe = new JButton("C");
		btnCe.setToolTipText("Clear Everything(CE)");
		btnCe.setBounds(157, 11, 39, 57);
		panel_2.add(btnCe);
		
		JTextPane display = new JTextPane();	//Calc Display
		display.setBounds(59, 113, 88, 20);
		panel_2.add(display);
		
		
	}
}
