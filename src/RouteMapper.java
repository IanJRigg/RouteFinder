import java.util.HashMap;

public class RouteMapper {
	private HashMap <String, City> cities;
	
	public RouteMapper(){
		MapMaker map = new MapMaker();
		cities = map.makeGraph();
	}
	
}
