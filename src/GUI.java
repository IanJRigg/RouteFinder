import javax.swing.*;
import java.awt.*;

public class GUI {
	private JFrame frame;
	private JSplitPane splitPane;
	private JPanel selectionPanel;
	private JTabbedPane routesPane;
	private RouteMapper mapper;
	
	public GUI(){
		frame = new JFrame();
		selectionPanel = new JPanel();
		routesPane = new JTabbedPane();
		mapper = new RouteMapper();
	}
	public void createGUI(){
		GridLayout layout = new GridLayout(1, 2);
		JTextPane test = new JTextPane();
		//JScrollPane scrollPane = new JScrollPane();
		//scrollPane.add(test);
		test.setEditable(false);
		test.setText(mapper.test());
		
		routesPane.addTab("<html><body><table width='107'>Route 1</table></body></html>", new JScrollPane(test));
		routesPane.addTab("<html><body><table width='107'>Route 2</table></body></html>", new JTextPane());
		routesPane.addTab("<html><body><table width='107'>Route 3</table></body></html>", new JTextPane());
		selectionPanel.setBackground(new Color(0xFFFFFFFF));
		frame.setLayout(layout);
		frame.getContentPane().add(selectionPanel);
		frame.getContentPane().add(routesPane);		
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
