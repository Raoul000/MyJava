package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel {
	private JPanel panel;
	private JTextField display;
	private double result;
	private String lastcommand;
	private boolean start = true;

	public CalculatorPanel() {
		setLayout(new BorderLayout());
		display = new JTextField();
		display.setHorizontalAlignment(JTextField.RIGHT);
		result = 0;
		display.setText("" + result);
		add(display, BorderLayout.NORTH);
		ActionListener insert = new InsertAction();
		ActionListener command = new CommandAction();
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 4));
		addButton("7", insert);
		addButton("8", insert);
		addButton("9", insert);
		addButton("/", command);
		addButton("4", insert);
		addButton("5", insert);
		addButton("6", insert);
		addButton("*", command);
		addButton("1", insert);
		addButton("2", insert);
		addButton("3", insert);
		addButton("+", command);
		addButton("0", insert);
		addButton(".", insert);
		addButton("=", command);
		add(panel, BorderLayout.CENTER);
	}

	private void addButton(String s, ActionListener listener) { // 添加按键
		JButton button = new JButton(s);
		button.addActionListener(listener);
		panel.add(button);
	}

	private class InsertAction implements ActionListener { // 关于insert的事件处理
		public void actionPerformed(ActionEvent event) {
			String input = event.getActionCommand();
			if (start) {
				display.setText("");
				start = false;
			}
			display.setText(display.getText() + input);
		}
	}

	private class CommandAction implements ActionListener { // 关于Command的事件处理
		public void actionPerformed(ActionEvent event) {
			String command = event.getActionCommand();
			if (command.equals("=")) {
				if (lastcommand.equals("+"))
					result += Double.parseDouble(display.getText());
				if (lastcommand.equals("-"))
					result -= Double.parseDouble(display.getText());
				if (lastcommand.equals("*"))
					result *= Double.parseDouble(display.getText());
				if (lastcommand.equals("/"))
					result /= Double.parseDouble(display.getText());
				display.setText("" + result);
				start = true;
			} else {
				result = Double.parseDouble(display.getText());
				lastcommand = command;
				start = true;
			}
		}
	}
}
