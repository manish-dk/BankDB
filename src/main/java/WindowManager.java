import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowManager {
		Frame outer;
		Frame createFrame;
		Frame depositFrame;
		Frame withdrawFrame;
		TextField name;
		TextField address;
		TextField id;
		TextField amount;
		GridLayout grid = new GridLayout(4,4);
		FlowLayout flow = new FlowLayout();
		
		public void home() {
			
			outer = new Frame("Bank");
			outer.setVisible(true);
			outer.setSize(300,400);
			Panel buttonPanel = new Panel();
			buttonPanel.setVisible(true);
			buttonPanel.setLayout(grid);
			outer.add(buttonPanel,BorderLayout.CENTER);

			Button createBtn = new Button("Create Account");
			Button depositBtn = new Button("Deposit");
			Button withdrawBtn = new Button("Withdraw");
			Button exitBtn = new Button("Exit");
			
			buttonPanel.add(createBtn);
			buttonPanel.add(depositBtn);
			buttonPanel.add(withdrawBtn);
			buttonPanel.add(exitBtn);
			
			createBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					outer.setVisible(false);
					create();
				}
			});
			
			depositBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					outer.setVisible(false);
					deposit();
				}
			});
			
			withdrawBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					outer.setVisible(false);
					withdraw();
				}
			});
			
			exitBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		
		public void create() {
			createFrame = new Frame("Create Account");
			createFrame.setVisible(true);
			createFrame.setSize(300,400);
			Panel buttonPanel = new Panel();
			Panel upperPanel = new Panel();
			Panel lowerPanel = new Panel();
			upperPanel.setVisible(true);
			upperPanel.setLayout(flow);
			lowerPanel.setVisible(true);
			lowerPanel.setLayout(flow);
			buttonPanel.setVisible(true);
			buttonPanel.setLayout(grid);
			createFrame.add(buttonPanel,BorderLayout.SOUTH);
			createFrame.add(upperPanel,BorderLayout.NORTH);
			createFrame.add(lowerPanel,BorderLayout.CENTER);
			Label n = new Label("Name: ");
			Label a = new Label("Address: ");
			name = new TextField();
			address = new TextField();
			Button submitBtn = new Button("Create Account");
			Button cancelBtn = new Button("Cancel");
			
			name.setColumns(20);
			address.setColumns(20);
			upperPanel.add(n);
			upperPanel.add(name);
			lowerPanel.add(a);
			lowerPanel.add(address);
			buttonPanel.add(submitBtn);
			buttonPanel.add(cancelBtn);
			
			cancelBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					createFrame.setVisible(false);
					cancel();
				}
			});
			submitBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					createFrame.setVisible(false);
					cancel();
					createAcc(name.getText(),address.getText());
				}
			});
		}
		public void withdraw() {
			withdrawFrame = new Frame("Withdraw Money");
			withdrawFrame.setVisible(true);
			withdrawFrame.setSize(300,400);
			Panel buttonPanel = new Panel();
			Panel upperPanel = new Panel();
			Panel lowerPanel = new Panel();
			upperPanel.setVisible(true);
			upperPanel.setLayout(flow);
			lowerPanel.setVisible(true);
			lowerPanel.setLayout(flow);
			buttonPanel.setVisible(true);
			buttonPanel.setLayout(grid);
			withdrawFrame.add(buttonPanel,BorderLayout.SOUTH);
			withdrawFrame.add(upperPanel,BorderLayout.NORTH);
			withdrawFrame.add(lowerPanel,BorderLayout.CENTER);
			Label n = new Label("ID: ");
			Label a = new Label("Amount: ");
			id = new TextField();
			amount = new TextField();
			Button submitBtn = new Button("Withdraw");
			Button cancelBtn = new Button("Cancel");
			
			id.setColumns(20);
			amount.setColumns(20);
			upperPanel.add(n);
			upperPanel.add(id);
			lowerPanel.add(a);
			lowerPanel.add(amount);
			buttonPanel.add(submitBtn);
			buttonPanel.add(cancelBtn);
			
			cancelBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					withdrawFrame.setVisible(false);
					cancel();
				}
			});
			submitBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					withdrawFrame.setVisible(false);
					cancel();
					submit(id.getText(),"-"+amount.getText());
				}
			});
			
		}
		public void deposit() {
			depositFrame = new Frame("Deposit Money");
			depositFrame.setVisible(true);
			depositFrame.setSize(300,400);
			Panel buttonPanel = new Panel();
			Panel upperPanel = new Panel();
			Panel lowerPanel = new Panel();
			upperPanel.setVisible(true);
			upperPanel.setLayout(flow);
			lowerPanel.setVisible(true);
			lowerPanel.setLayout(flow);
			buttonPanel.setVisible(true);
			buttonPanel.setLayout(grid);
			depositFrame.add(buttonPanel,BorderLayout.SOUTH);
			depositFrame.add(upperPanel,BorderLayout.NORTH);
			depositFrame.add(lowerPanel,BorderLayout.CENTER);
			Label n = new Label("ID: ");
			Label a = new Label("Amount: ");
			id = new TextField();
			amount = new TextField();
			Button submitBtn = new Button("Deposit");
			Button cancelBtn = new Button("Cancel");
			
			id.setColumns(20);
			amount.setColumns(20);
			upperPanel.add(n);
			upperPanel.add(id);
			lowerPanel.add(a);
			lowerPanel.add(amount);
			buttonPanel.add(submitBtn);
			buttonPanel.add(cancelBtn);
			
			cancelBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					depositFrame.setVisible(false);
					cancel();
				}
			});
			
			submitBtn.addActionListener(
					new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					depositFrame.setVisible(false);
					cancel();
					submit(id.getText(),amount.getText());
				}
			});
		}
		
		public void submit(String id, String amount) {
			
		}
		
		public void cancel() {
			outer.setVisible(true);
		}
		
		public void createAcc(String name,String address) {
			
		}
}
