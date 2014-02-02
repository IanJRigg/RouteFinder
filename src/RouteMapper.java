import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class RouteMapper {
	private final double RADIUS;
	private HashMap <String, City> cities;
	private Route[] routes;
	
	public RouteMapper(){
		RADIUS = 3959;
		MapMaker map = new MapMaker();
		cities = map.makeGraph();
	}
	public Route[] createRouteList(){
		Route[] routeList = new Route[3];
		return routeList;
	}
	public Route findRoute(City source, City destination){
		int distance = 0;
		int farthest = (int)(1.25 * Math.ceil(haversine(source, destination)));
		City currentCity = source;
		City tempCity;
		Route cities = new Route();
		while(distance < farthest){
			tempCity = searchCities(currentCity, destination);
			distance += currentCity.getDistance(tempCity);
			currentCity = tempCity;
			cities.addCity(currentCity);
			if(cities.addTotalDistance() > farthest)
				return null;
		}
		return cities;
	}
	public double haversine(City source, City destination){
		double deltaLat = Math.toRadians(destination.getLat() - source.getLat());
		double deltaLon = Math.toRadians(destination.getLon() - source.getLon());
		double sourceLat = Math.toRadians(source.getLat());
		double destLat = Math.toRadians(destination.getLat());
		
		double a = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2) + Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2) * Math.cos(sourceLat) * Math.cos(destLat);
        double c = 2 * Math.asin(Math.sqrt(a));
        return RADIUS * c; 

	}
	public Route[] rankRoutes(){
		Route orderedRoutes[] = new Route[10];
		return orderedRoutes;
	}	
	public City searchCities(City source, City destination){
		Iterator<City> it = source.destIt();
		City temp;
		City[] destinations = new City[source.numDest()]; 
		int index = -1;
		while(it.hasNext()){
			temp = it.next();
			if(temp.compareTo(destination) == 0)
				return destination;
			destinations[++index] = temp;
		}
		return destinations[(int)(Math.random() * destinations.length)];
	}
}
