import java.util.HashMap; 
import java.util.Iterator;

public class City implements Comparable<City>{
	private HashMap<City, CityWrapper> destinations;
	private final String name;
	private float lat;
	private float lon;
	
	public City(String cityName, float latitude, float longitude){
		destinations = new HashMap<City, CityWrapper>();
		name = cityName;
		lat = latitude;
		lon = longitude;
	}
	public void addCity(City city, int distance, String interstate){
		CityWrapper tempWrap = new CityWrapper(interstate, distance);
		this.destinations.put(city, tempWrap);
	}
	public Iterator<City> destIt(){
		return destinations.keySet().iterator();
	}
	public int numDest(){
		return destinations.size();
	}
	public int getDistance(City city){
		if(this.destinations.containsKey(city) == false)
			return 0;
		return this.destinations.get(city).getDistance();
	}
	public String getName(){
		return this.name;
	}
	public float getLat(){
		return lat;
	}
	public float getLon(){
		return lon;
	}
	public int compareTo(City city){
		return city.getName().compareTo(getName());
	}
	class CityWrapper{
		private String interstate;
		private int distance;
		
		public CityWrapper(String inters, int dist){
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
