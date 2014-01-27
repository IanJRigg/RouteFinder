import java.util.HashMap; 

public class City {
	private HashMap<City, NodeWrapper> destinations;
	private String cityName;
	
	public City(String name){
		destinations = new HashMap<City, NodeWrapper>();
		cityName = name;
	}
	public void addCity(City city, int distance, String interstate){
		NodeWrapper tempWrap = new NodeWrapper(interstate, distance);
		this.destinations.put(city, tempWrap);
	}
	public HashMap<City, NodeWrapper> getDestinations(){
		return this.destinations;
	}
	public int getDistance(City city){
		if(this.destinations.containsKey(city) == false)
			return 0;
		return this.destinations.get(city).getDistance();
	}
	public String getName(){
		return this.cityName;
	}
	class NodeWrapper{
		private String interstate;
		private int distance;
		
		public NodeWrapper(String inters, int dist){
			interstate = inters;
			distance = dist;
		}
		public int getDistance(){
			return distance;
		}
		public String getInterstate(){
			return interstate;
		}
	}
}
