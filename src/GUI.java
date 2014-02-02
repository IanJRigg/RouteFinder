public class GUI {
	
	public GUI(){
		
	}
	public void createGUI(){
		RouteMapper mapper = new RouteMapper();
		System.out.println(mapper.findRoute().toString());
	}
}
