import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashMap;

public class GUI {
	private JFrame frame;
	private JSplitPane splitPane;
	private JPanel selectionPanel;
	private JTabbedPane routesPane;
	private JComboBox sourceBox;
	private JComboBox destBox;
	private RouteMapper mapper;
	private MapMaker mapMaker;
	private HashMap<String, City> mapGraph;
	private String[] cityList;
	private Route[] routeList;
	private JTextPane test;
	
	public GUI(){
		frame = new JFrame();
		selectionPanel = new JPanel();
		routesPane = new JTabbedPane();
		test = new JTextPane();
		test.setEditable(false);
		routesPane.addTab("<html><body><table width='107'>Route 1</table></body></html>", test);
		routesPane.addTab("<html><body><table width='107'>Route 2</table></body></html>", new JTextPane());
		routesPane.addTab("<html><body><table width='107'>Route 3</table></body></html>", new JTextPane());
		mapper = new RouteMapper();
		mapMaker = new MapMaker();
		mapGraph = mapMaker.makeGraph();
		Object[] cityArray = mapGraph.keySet().toArray();
		cityList = Arrays.copyOf(cityArray, cityArray.length, String[].class);
		insertionSort();
		routeList = new Route[3];
		sourceBox = new JComboBox(cityList);
		destBox = new JComboBox(cityList);
	}
	public void createGUI(){
		GridLayout layout = new GridLayout(1, 2);
		frame.setLayout(layout);
		selectionPanel.setLayout(new GridLayout(5,1));
		selectionPanel.add(new JPanel());
		JPanel temp1 = new JPanel();
		temp1.setBackground(new Color(0xFFFFFFFF));
		temp1.add(new JLabel("Destination City"));
		temp1.add(destBox);
		JPanel temp = new JPanel();
		temp.add(new JLabel("Source City     "));
		temp.add(sourceBox);
		temp.setBackground(new Color(0xFFFFFFFF));
		selectionPanel.add(temp);
		selectionPanel.add(temp1);
		JPanel buttonPanel = new JPanel();
		JButton search = new JButton("Search for routes");
		search.addActionListener(new searchActionListener());
		buttonPanel.add(search);
		buttonPanel.setBackground(new Color(0xFFFFFFFF));
		selectionPanel.add(new JPanel());
		selectionPanel.add(buttonPanel);
		frame.getContentPane().add(selectionPanel);
		frame.getContentPane().add(routesPane);		
		frame.setSize(800, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void insertionSort(){
		int index, j;
		index = cityList.length;
		String temp, value;
		for(int i = 1; i < cityList.length; i++){
		    value = (String)cityList[i];
		    j = i - 1;
		    temp = cityList[i];
		    while(j >= 0 && cityList[j].compareTo(value) > 0){
		      cityList[j + 1] = cityList[j];
		      j = j - 1;
		    }
		    cityList[j + 1] = temp;
		  }
	}
	class searchActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			City source = mapGraph.get(sourceBox.getSelectedItem());
			City destination = mapGraph.get(destBox.getSelectedItem());
			routeList = mapper.createRouteList(source, destination);
			if(routeList == null)
				((JEditorPane) routesPane.getComponentAt(0)).setText("You are already at your destination.");
			for(int i = 0; i < 3; i++){
				if(routeList[i] == null){
					((JEditorPane) routesPane.getComponentAt(i)).setText("No route available");
					break;
				}
				((JEditorPane) routesPane.getComponentAt(i)).setText(routeList[i].toString());
			}
		}
	}
}
