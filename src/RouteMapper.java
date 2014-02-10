import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class RouteMapper {
	private final double RADIUS;
	
	public RouteMapper(){
		RADIUS = 3959;
		MapMaker map = new MapMaker();
	}
	public Route[] createRouteList(City source, City destination){
		if(source.compareTo(destination) == 0)
			return new Route[3];
		Route[] routes = new Route[3];
		Route tempRoute = new Route();
		Route best;
		int limit = (int)(haversine(source, destination) / 100);
		do{
			best = findRoute(source, destination);
		}while(best.getDistance() == 100000);
		for(int i = 0; i < limit; i++){
			tempRoute = findRoute(source, destination);
			if(tempRoute.getDistance() == 100000){
				--i;
				continue;
			}
			routes = processRoute(routes, tempRoute);
		}
		return routes;		
		//return insertionSort(routeList);
	}	
	public Route findRoute(City source, City destination){
		int farthest = (int)(1.25 * Math.ceil(haversine(source, destination)));
		City currentCity = source;
		City nextCity, prevCity;
		Route cities = new Route();
		cities.addCity(source);
		prevCity = null;
		while(cities.getDistance() < farthest){
			nextCity = searchCities(currentCity, destination, prevCity);
			if(nextCity == null)
				break;
			cities.addCity(nextCity);
			prevCity = currentCity;
			currentCity = nextCity;
			if(currentCity.compareTo(destination) == 0){
				return cities;
			}
		}
		cities.setDistance();
		return cities;
	}
	public City searchCities(City currentCity, City destination, City prevCity){
		Iterator<City> it = currentCity.destIt();
		int cityCounter = 0;
		City temp;
		ArrayList <City> destinations = new ArrayList<City>(); 
		while(it.hasNext()){
			temp = it.next();
			if(temp.compareTo(destination) == 0)
				return destination;
			if(prevCity != null && temp.compareTo(prevCity) == 0)
				continue;
			if(haversine(temp, destination) > haversine(currentCity, destination) + 50)
				// If the city isn't closer or close to the currentcity, don't consider it
				continue;
			if((temp.numDest() == 1 && temp.destIt().next().compareTo(destination) != 0))
				continue;
			destinations.add(temp);
			cityCounter++;
		}
		if(cityCounter == 0)
			return null;
		temp = destinations.get((int)(Math.random() * cityCounter));
		return temp;
	}
	public Route[] processRoute(Route[] routes, Route currentRoute){
		for(int i = 0; i < 3; i++){
			if(routes[i] == null)
				break;
			if(currentRoute.compareTo(routes[i]) == 0)
				return routes;
		}
		if(routes[0] == null){
			routes[0] = currentRoute;
			return routes;
		}	
		else if(routes[1] == null){
			if(routes[0].getDistance() > currentRoute.getDistance()){
				routes[1] = routes[0];
				routes[0] = currentRoute;
			}
			else
				routes[1] = currentRoute;
			return routes;
		}
		else if(routes[2] == null){
			if(routes[1].getDistance() < currentRoute.getDistance())
				routes[2] = currentRoute;
			else if(routes[0].getDistance() < currentRoute.getDistance()){
				routes[2] = routes[1];
				routes[1] = currentRoute;
			}
			else{
				routes[2] = routes[1];
				routes[1] = routes[0];
				routes[0] = currentRoute;
			}
			return routes;
		}
		else{
			if(routes[1].getDistance() < currentRoute.getDistance())
				routes[2] = currentRoute;
			else if(routes[0].getDistance() < currentRoute.getDistance()){
				routes[2] = routes[1];
				routes[1] = currentRoute;
			}
			else{
				routes[2] = routes[1];
				routes[1] = routes[0];
				routes[0] = currentRoute;
			}
			return routes;
		}
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
