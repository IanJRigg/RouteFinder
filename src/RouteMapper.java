import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class RouteMapper {
	private final double RADIUS;
	private HashMap <String, City> cities;
	private Route[] routes;
	
	public RouteMapper(){
		RADIUS = 3959;
		MapMaker map = new MapMaker();
		cities = map.makeGraph();
	}
	public void test(){
		for(int i = 0; i < 100; i++){
			System.out.println(findRoute(cities.get("San Diego"), cities.get("San Francisco")).toString());
		}
	}
	public Route[] createRouteList(City source, City destination){
		Route[] routeList = new Route[3];
		Route tempRoute = new Route();
		for(int i = 0; i < 100; i++){
			tempRoute = findRoute(source, destination);
			
		}
		return insertionSort(routeList);
	}
	public Route findRoute(City source, City destination){
		int distance = 0;
		int farthest = (int)(1.50 * Math.ceil(haversine(source, destination)));
		City currentCity = source;
		City nextCity;
		City prevCity = null;
		Route cities = new Route();
		cities.addCity(source);
		while(true){
			nextCity = searchCities(currentCity, destination, cities);
			/*System.out.println("Cities: " + cities.toString());
			System.out.println("NextCity: " + nextCity.getName());
			System.out.println(distance);*/
			distance += currentCity.getDistance(nextCity);
			cities.addCity(nextCity);
			if(nextCity.compareTo(destination) == 0)
				return cities;
			currentCity = nextCity;
			if(distance > farthest){
				cities.makeEmpty();
				break;
			}
		}
		return cities;
	}
	public City searchCities(City source, City destination, Route currentRoute){
		Iterator<City> it = source.destIt();
		City temp;
		ArrayList <City >destinations = new ArrayList<City>(); 
		while(it.hasNext()){
			temp = it.next();
			if(temp.compareTo(destination) == 0)
				return destination;
			destinations.add(temp);
		}
		do{
			temp = destinations.get((int)(Math.random() * destinations.size()));
		}while(currentRoute.wasVisited(temp));
		return temp;
	}
	public Route[] insertionSort(Route[] routes){
		int index, value, j;
		index = routes.length;
		Route temp;
		for(int i = 1; i < routes.length; i++){
		    value = routes[i].addTotalDistance();
		    j = i - 1;
		    temp = routes[i];
		    while(j >= 0 && routes[j].addTotalDistance() > value){
		      routes[j + 1] = routes[j];
		      j = j - 1;
		    }
		    routes[j + 1] = temp;
		  }
		return routes;
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
}
