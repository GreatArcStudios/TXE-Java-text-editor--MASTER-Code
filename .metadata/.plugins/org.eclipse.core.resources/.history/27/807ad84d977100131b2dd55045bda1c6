import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

@SuppressWarnings("unused")
public class SettingsProgrammer extends JFrame {
	public static void main(String[] args) {
		new SettingsProgrammer();
	}

	public String webText = "Your website url here";
	static JTextField name = new JTextField(20);
	static JTextField website = new JTextField(20);
	static JTextField company = new JTextField(20);
	JButton okButton, cancelButton;
	public JRadioButton bold, italics, boldI, normal;
	public static String nameText = name.getText();
	public static String webText1 = website.getText();
	public static String companyText1 = company.getText();
	private static final long serialVersionUID = 1L;
	public String companyText = "Your Company/Orgniztion name here";
	public JButton nameB = new JButton("Name:");
	public JButton webB = new JButton("Website:");
	public JButton compB = new JButton("Company:");

	public SettingsProgrammer() {

		this.setSize(500, 500);
		this.setTitle("TXE Settings");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridBagLayout());
		addItem(panel1, nameB, 0, 0, 1, 1, GridBagConstraints.EAST);
		addItem(panel1, webB, 0, 1, 1, 1, GridBagConstraints.EAST);
		addItem(panel1, compB, 0, 2, 1, 1, GridBagConstraints.EAST);
		addItem(panel1, name, 1, 0, 2, 1, GridBagConstraints.WEST);
		addItem(panel1, website, 1, 1, 1, 1, GridBagConstraints.WEST);
		addItem(panel1, company, 1, 2, 2, 1, GridBagConstraints.WEST);

		Box formatBox = Box.createVerticalBox();
		bold = new JRadioButton("Java Syntax Style");
		italics = new JRadioButton("C++ Syntax Style");
		boldI = new JRadioButton("C Syntax Style");
		normal = new JRadioButton("Html Syntax Style");
		ButtonGroup formatGroup = new ButtonGroup();
		formatGroup.add(bold);
		formatGroup.add(boldI);
		formatGroup.add(italics);
		formatGroup.add(normal);
		formatBox.add(bold);
		formatBox.add(boldI);
		formatBox.add(italics);
		formatBox.add(normal);
		formatBox.setBorder(BorderFactory.createTitledBorder("Syntax Styles"));
		addItem(panel1, formatBox, 1, 3, 1, 1, GridBagConstraints.NORTH);
		// add panel1
		this.add(panel1);
		// pack frame
		this.pack();
		nameB.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TXEProgrammer.TXEAREA.getCaretPosition();
				TXEProgrammer.TXEAREA.insert(nameText, 20);

			}
		});
		bold.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TXEProgrammer.TXEAREA
						.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);

			}
		});
		italics.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				TXEProgrammer.TXEAREA
						.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_CPLUSPLUS);

			}
		});
		boldI.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				TXEProgrammer.TXEAREA
						.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);

			}
		});
		normal.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				TXEProgrammer.TXEAREA
						.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_HTML);

			}
		});
	}

	private void addItem(JPanel panel1, JComponent c, int x, int y, int width,
			int height, int align) {
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = x;
		gc.gridy = y;
		gc.gridheight = height;
		gc.gridwidth = width;
		gc.weightx = 100.0;
		gc.weighty = 100.0;
		gc.insets = new Insets(5, 5, 5, 5);
		gc.anchor = align;
		gc.fill = GridBagConstraints.NONE;
		panel1.add(c, gc);
	}

}
