import java.util.Iterator;
import java.util.Stack;

public class Route implements Comparable<Route>{
	private Stack<City> route;
	private int distance;
	
	public Route(){
		route = new Stack<City>();
		distance = 0;
	}
	public void addCity(City nextCity){
		if(route.size() > 0)
			distance += nextCity.getDistance(route.peek());
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
	public boolean contains(City city){
		return route.contains(city);
	}
	public int getDistance(){
		return distance;
	}
	public void setDistance(){
		distance = 100000;
	}
	public int compareTo(Route r){
		return addTotalDistance() - r.addTotalDistance();
	}
	public String toString(){
		if(distance == 0)
			return route.toString();
		Object[] tempRoute = route.toArray();
		StringBuilder sb = new StringBuilder();
		sb.append("Starting at: " + tempRoute[0].toString() + "\n");
		for(int i = 1; i < route.size() - 1; i++){
			sb.append("Take: " + ((City) tempRoute[i]).getInterstate((City)tempRoute[i + 1]) + " To: " + tempRoute[i].toString() + " " + ((City) tempRoute[i]).getDistance((City)tempRoute[i + 1]) + " Miles\n");
		}
		sb.append("Arrive at: " + tempRoute[tempRoute.length - 1].toString() +  "\nTotal Distance: " + getDistance() + " Miles");
		return sb.toString();
	}
	public void makeEmpty(){
		route.removeAllElements();
	}
	public boolean isEmpty(){
		return route.isEmpty();
	}
}