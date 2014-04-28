import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.*;

import org.pushingpixels.substance.api.skin.SubstanceGraphiteAquaLookAndFeel;

public class viewHtml extends JFrame {
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public static JEditorPane htmlPane = new JEditorPane("text/html", null);

	JScrollPane scroll = new JScrollPane(htmlPane);

	public viewHtml() {
		this.add(scroll);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(htmlPane);
		try {
			htmlPane.setText(TXE1.TXEAREA.getText());
		} catch (Exception e) {

		}

		this.setSize(1000, 600);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("HTML Viewer");
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				viewHtml vH = new viewHtml();
				try {
					UIManager
							.setLookAndFeel(new SubstanceGraphiteAquaLookAndFeel());
				} catch (UnsupportedLookAndFeelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(vH);

			}
		});
	}
}
