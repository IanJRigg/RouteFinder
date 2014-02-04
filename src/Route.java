import java.util.Iterator;
import java.util.Stack;

public class Route implements Comparable<Route>{
	private Stack<City> route;
	
	public Route(){
		route = new Stack<City>();
	}
	public void addCity(City nextCity){
		route.push(nextCity);
	}
	public int addTotalDistance(){
		int distance = 0;
		if(route.size() <= 1)
			return distance;
		City destination = route.pop();
		City source = route.pop();
		while(!route.isEmpty()){
			distance += source.getDistance(destination);
			destination = source;
			source = route.pop();
		}
		return distance;	
	}
	public int compareTo(Route r){
		return 0;
	}
	public String toString(){
		Iterator<City> it = route.iterator();
		StringBuilder sb = new StringBuilder();
		while(it.hasNext())
			sb.append(it.next().getName() + "\n");
		return sb.toString();
	}
	public void makeEmpty(){
		route.removeAllElements();
	}
	public boolean wasVisited(City nextCity){
		Iterator<City> it = route.iterator();
		while(it.hasNext()){
			if(nextCity.compareTo(it.next()) == 0)
				return true;
		}
		return false;
	}
}