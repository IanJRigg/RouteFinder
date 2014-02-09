import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class RouteMapper {
	private final double RADIUS;
	private HashMap <String, City> cityTable;
	
	public RouteMapper(){
		RADIUS = 3959;
		MapMaker map = new MapMaker();
		cityTable = map.makeGraph();
	}
	public String test(){
			return createRouteList(cityTable.get("San Diego"), cityTable.get("New York")).toString();
	}
	public Route createRouteList(City source, City destination){
		// Take a route and rate it against the others in the array
		// if the route is shorter than the first move the others
		Route routes = new Route();
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
			if(i < 2 || best.getDistance() > tempRoute.getDistance()){
				System.out.println("New Best route: " + tempRoute.toString());
				best = tempRoute;
			}
		}
		System.out.println("Route: " + best.toString());
		return best;		
		//return insertionSort(routeList);
	}	
	public Route findRoute(City source, City destination){
		/*
		 * start at one city, choose a non visited destination at random
		 * add the city to the route
		 * 		When choosing a random city to add to the cities route, 
		 * 		haversine the city in question to the destination.
		 * 		If the city is closer to the destination than the previous city,
		 * 		add the city to the array of cities to be randomly chosen.
		 * mark all of the destinations as visited 
		 */
		int farthest = (int)(1.50 * Math.ceil(haversine(source, destination)));
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
				/* If there is a city with only one destination and that destination is not the 
					destinationt that is currently being searched for, just continue
				*/
				continue;
			destinations.add(temp);
			cityCounter++;
		}
		if(cityCounter == 0)
			return null;
		temp = destinations.get((int)(Math.random() * cityCounter));
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
