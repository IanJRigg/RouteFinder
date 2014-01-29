import java.util.HashMap;

public class MapMaker {
	private HashMap<String, City> toreturn;
	
	public MapMaker(){ 
		toreturn = new HashMap<String, City>();
	}
	public HashMap<String, City> makeGraph(){
		City sanDiego = new City("San Diego", 32.70f, -117.15f);
		City losAngeles = new City("Los Angeles", 34.04f, -118.25f);
		City sanBernardino = new City("San Bernardino", 34.10f, -117.30f);
		City sacramento = new City("Sacramento", 38.55f, -121.47f);
		City portland =  new City("Portland", 45.53f, -122.67f);
		City seattle = new City("Seattle", 47.60f, -122.32f);
		City lasVegas = new City("Las Vegas", 36.17f, -115.14f);
		City saltLakeCity = new City("Salt Lake City", 40.75f, -111.87f);
		City reno = new City("Reno", 39.53f, -119.79f);
		City phoenix = new City("Phoenix", 33.45f, -112.07f);
		City barstow = new City("Barstow", 34.90f, -117.03f);
		City flagstaff = new City("Flagstaff", 35.17f, -111.62f);
		City tucson = new City("Tucson", 32.23f, -110.93f);
		City cheyenne = new City("Cheyenne", 41.14f, -104.80f);
		City denver = new City("Denver", 39.73f, -104.97f);
		City albuquerque = new City("Albuquerque", 35.11f, -106.61f);
		City boise = new City("Boise", 43.61f, -116.24f);
		City spokane = new City("Spokane", 47.65f, -117.42f);
		City butte = new City("Butte", 46.00f, -112.53f);
		City pocatello = new City("Pocatello", 42.88f, -112.42f);
		City billings = new City("Billings", 45.78f, -108.56f);
		City bismarck = new City("Bismarck", 46.81f, -100.78f);
		City rapidCity = new City("Rapid City", 44.08f, -103.23f);
		City buffaloW = new City("Buffalo WY", 44.33f, -106.70f);
		City lasCruces = new City("Las Cruces", 32.30f, -106.77f);
		City elPaso = new City("El Paso", 31.79f, -106.42f);
		City amarillo = new City("Amarillo", 35.18f, -101.84f);
		City sanAntonio = new City("San Antonio", 29.42f, -98.50f);
		City kent = new City("Kent", 31.26f, -104.23f);
		City fortWorth = new City("Fort Worth", 32.75f, -97.32f);
		City oklahomaCity = new City("Oklahoma City", 35.48f, -97.53f);
		City dallas = new City("Dallas", 32.77f, -97.78f);
		City austin = new City("Austin", 30.25f, -97.45f);
		City corpusChristi = new City("Coprus Christi", 27.74f, -97.40f);
		City houston = new City("Houston", 29.75f, -95.37f);
		City salina = new City("Salina", 38.82f, -97.60f);
		City wichita = new City("Wichita", 37.68f, -97.33f);
		City emporia = new City("Emporia", 38.40f, -96.19f);
		City topeka = new City("Topeka", 39.05f, -95.67f);
		City kansasCity = new City("Kansas City", 39.17f, -94.97f);
		City lincoln = new City("Lincoln", 40.80f, -96.66f);
		City omaha = new City("Omaha", 41.25f, -96.00f);
		City siouxCity = new City("Sioux City", 42.49f, -96.35f);
		City siouxFalls = new City("Sioux Falls", 43.53f, -96.71f);
		City fargo = new City("Fargo", 46.85f, -96.79f);
		City desMoines = new City("Des Moines", 41.58f, -93.61f);
		City albertLea = new City("Albert Lea", 43.63f, -93.36f);
		City minneapolis = new City("Minneapolis", 44.98f, -93.24f);
		City stPaul = new City("St Paul", 44.96f, -93.10f);
		City stLouis = new City("St. Louis", 38.61f, -90.17f);
		City littleRock = new City("Little Rock", 34.71f, -92.31f);
		City tulsa = new City("Tulsa", 36.11f, -95.93f);
		City springfieldMO = new City("Springfield MO", 37.19f, -93.29f);
		City memphis = new City("Memphis", 35.11f, -89.96f);
		City shreveport = new City("Shreveport", 32.50f, -93.73f);
		City lafayette = new City("Lafayette", 30.21f, -92.03f);
		City beaumont = new City("Beaumont", 30.06f, -94.11f);
		City batonRouge = new City("Baton Rouge", 30.75f, -91.23f);
		City newOrleans = new City("New Orleans", 29.97f, -90.05f);
		City hammond = new City("Hammond", 30.50f, -90.45f);
		City slidell = new City("Slidell", 30.27f, -89.77f);
		City jackson = new City("Jackson", 32.28f, -90.18f);
		City davenport = new City("Davenport", 41.53f, -90.58f);
		City springfieldIL = new City("Springfield IL", 39.78f, -89.65f);
		City effingham = new City("Effingham", 39.11f, -88.53f);
		City champaign = new City("Champaign", 40.11f, -88.26f);
		City bloomington = new City("Bloomington", 40.48f, -88.98f);
		City chicago = new City("Chicago", 41.87f, -87.61f);
		City gary = new City("Gary", 41.56f, -87.33f);
		City rockford = new City("Rockford", 42.26f, -89.07f);
		City lasalle = new City("Lasalle", 41.33f, -89.09f);
		City rochelle = new City("Rochelle", 41.92f, -89.05f);
		City madison = new City("Madison", 43.08f, -89.40f);
		City milwaukee = new City("Milwaukee", 43.05f, -87.95f);
		City greenBay = new City("Green Bay", 44.50f, -88.00f);
		City tomah = new City("Tomah", 43.98f, -90.50f);
		City indianapolis = new City("Indianapolis", 39.79f, -86.15f);
		City louisville = new City("Louisville", 38.25f, -85.77f);
		City nashville = new City("Nashville", 36.16f, -86.79f);
		City birmingham = new City("Birmingham", 33.52f, -86.82f);
		City montgomery = new City("Montgomery", 32.34f, -86.27f);
		City mobile = new City("Mobile", 30.68f, - 88.03f);
		City meridian = new City("Meridian", 32.36f, -88.70f);
		City mtVernon = new City("Mt Vernon", 38.30f, -88.90f);
		City goreville = new City("Goreville", 37.53f, -88.97f);
		City silkeston = new City("Silkeston", 36.86f, -89.59f);
		City atlanta = new City("Atlanta", 33.75f, -84.38f);
		City chattanooga = new City("Chattanooga", 35.03f, -85.26f);
		City lexington = new City("Lexington", 38.01f, -84.49f);
		City knoxville = new City("Knoxville", 35.97f, -83.94f);
		City cincinnati = new City("Cincinnati", 39.10f, -83.52f);
		City pensacola = new City("Pensacola", 30.43f, -87.20f);
		City tallahassee = new City("Tallahassee", 30.45f, 84.25f);
		City lakeCity = new City("Lake City", 30.18f, -82.63f);
		City jacksonville = new City("Jacksonville", 30.33f, -81.65f);
		City tampa = new City("Tampa", 27.97f, -82.47f);
		City fortLauderdale = new City("Fort Lauderdale", 26.26f, -80.26f);
		City miami = new City("Miami", 25.79f, -80.22f);
		City daytonaBeach = new City("Daytona Beach", 29.20f, -81.03f);
		City orlando = new City("Orlando", 28.40f, -81.29f);
		City macon = new City("Macon", 32.83f, -83.65f);
		City savannah = new City("Savannah", 32.09f, -81.09f);
		City augusta = new City("Augusta", 33.47f, -81.97f);
		City columbia = new City("Columbia", 34.00f, -81.03f);
		City bowman = new City("Bowman", 33.33f, -80.67f);
		City charleston = new City("Charleston", 32.79f, -79.83f);
		City florence = new City("Florence", 34.19f, -79.77f);
		City dayton = new City("Dayton", 39.75f, -84.19f);
		City columbus = new City("Columbus", 39.98f, -82.99f);
		City toledo = new City("Toledo", 41.64f, -83.56f);
		City angola = new City("Angola", 41.62f, -85.00f);
		City fortWayne = new City("Fort Wayne", 41.07f, -85.13f);
		City detroit = new City("Detroit", 42.32f, -83.03f);
		City cleveland = new City("Cleveland", 41.47f, -81.66f);
		City lansing = new City("Lansing", 42.73f, -84.53f);
		City grandRapids = new City("Grand Rapids", 42.95f, -85.64f);
		City marshall = new City("Marshall", 42.27f, -84.95f);
		City flint = new City("Flint", 43.00f, -83.68f);
		City cambridge = new City("Cambridge", 40.01f, -81.59f);
		City charlestonWV = new City("Charleston WV", 38.33f, -81.62f);
		City seville = new City("Seville", 41.00f, -81.85f);
		City akron = new City("Akron", 41.07f, -81.52f);
		City greenville = new City("Greenvile", 34.83f, -82.38f);
		City clinton = new City("Clinton", 34.47f, -81.86f);
		City spartanburg = new City("Spartanburg", 34.93f, -81.91f);
		City northJackson = new City("North Jackson", 41.10f, -80.49f);
		City washington = new City("Washington PA", 40.17f, -80.25f);
		City morgantown = new City("Morgantown", 39.64f, -79.96f);
		City beckley = new City("Beckley", 37.77f, 81.17f);
		City wytheville = new City("Wytheville", 36.93f, -81.09f);
		City kingsport = new City("Kingsport", 36.53f, -82.55f);
		City asheville = new City("Asheville", 35.57f, -82.55f);
		City dandridge = new City("Dandridge", 36.01f, -83.44f);
		City benson = new City("Benson", 35.35f, -78.54f);
		City raleigh = new City("Raleigh", 35.81f, -78.63f);
		City greensboro = new City("Greensboro", 36.08f, -79.81f);
		City charlotte = new City("Charlotte", 35.21f, -80.83f);
		City statesville = new City("Statesville", 35.78f, -80.86f);
		City richmond = new City("Richmond", 37.54f, -77.46f);
		City washingtonDC = new City("Washington DC", 38.88f, -77.05f);
		City lexingtonVA = new City("Lexington VA", 37.58f, -79.43f);
		City staunton = new City("Staunton", 38.15f, -79.08f);
		City strasburg = new City("Strasburg", 38.98f, -78.35f);
		City baltimore = new City("Baltimore", 39.28f, -76.61f);
		City hagerstown = new City("Hagerstown", 39.62f, -77.71f);
		City hancock = new City("Hancock", 39.70f, -78.17f);
		City pittsburgh = new City("Pittsburgh", 40.44f, -80.00f);
		City mercer = new City("Mercer", 41.22f, -80.23f);
		City harrisburg = new City("Harrisburg", 40.28f, -76.87f);
		City philadelphia = new City("Philadelphia", 39.96f, -75.17f);
		City erie = new City("Erie", 42.12f, -80.10f);
		City buffaloNY = new City("Buffalo NY", 42.90f, -78.83f);
		City syracuse = new City("Syracuse", 43.05f, -71.15f);
		City albany = new City("Albany", 42.65f, -73.75f);
		City springfieldMA = new City("Springfield MA", 42.11f, -72.55f);
		City southbridge = new City("Southbridge", 42.08f, -72.03f);
		City hartford = new City("Hartford", 41.76f, -72.67f);
		City auburn = new City("Auburn MA", 42.20f, -71.83f);
		City eastLyme = new City("East Lyme", 41.35f, -72.21f);
		City newHaven = new City("New Haven", 41.30f, -72.92f);
		City providence = new City("Providence", 41.81f, -71.42f);
		City boston = new City("Boston", 42.35f, -71.05f);
		City portChester = new City("Port Chester", 41.00f, -73.67f);
		City brewster = new City("Brewster", 41.38f, -73.60f);
		City newburgh = new City("Newburgh", 41.52f, -74.02f);
		City suffern = new City("Suffern", 41.10f, -74.08f);
		City parsippany = new City("Parsippany", 40.86f, -74.42f);
		City newYork = new City("New York", 43.00f, -75.00f);
		City binghamton = new City("Binghamton", 35.15f, -89.97f);
		City scranton = new City("Scranton", 41.40f, -75.67f);
		City tannersville = new City("Tannersville", 41.03f, -75.30f);
		City allentown = new City("Allentown", 40.60f, -75.47f);
		City bellefonte = new City("Bellefonte", 40.90f, -77.77f);
		City jonestown = new City("Jonestown", 40.24f, -76.44f);
		City hazleton = new City("Hazleton", 40.96f, -76.97f);
		City hickoryRun = new City("Hickory Run St. Park", 41.04f, -75.68f);
		City newStanton = new City("New Stanton", 40.21f, -79.60f);
		City bedford = new City("Bedford", 40.00f, -78.50f);
		City breezewood = new City("Breezewood", 39.98f, -78.23f);
		City concord = new City("Concord", 43.20f, -71.53f);
		City lebanon = new City("Lebanon", 43.61f, -72.25f);
		City stJohnsbury = new City("St Johnsbury", 44.44f, -72.00f);
		City portlandME = new City("Portland ME", 43.67f, 70.27f);
		City augustaME = new City("Augusta ME", 44.32f, 69.77f);
		City sanFrancisco = new City("San Francisco", 37.78f, -122.43f);
		
		// Western Longitudes are negative, as are southern latitudes.
		
		
		
		toreturn.put("San Diego", sanDiego);
		toreturn.put("Los Angeles", losAngeles);
		toreturn.put("San Bernardino", sanBernardino);
		toreturn.put("Sacramento", sacramento);
		toreturn.put("Portland", portland);
		toreturn.put("Seattle", seattle);
		toreturn.put("Las Vegas", lasVegas);
		toreturn.put("Salt Lake City", saltLakeCity);
		toreturn.put("Reno", reno);
		toreturn.put("Phoenix", phoenix);
		toreturn.put("Barstow", barstow);
		toreturn.put("Flagstaff", flagstaff);
		toreturn.put("Tucson", tucson);
		toreturn.put("Cheyenne", cheyenne);
		toreturn.put("Denver", denver);
		toreturn.put("Albuquerque", albuquerque);
		toreturn.put("Bosie", boise);
		toreturn.put("Spokane", spokane);
		toreturn.put("Butte", butte);
		toreturn.put(pocatello.getName(), pocatello);
		toreturn.put("Billings", billings);
		toreturn.put("Bismarck", bismarck);
		toreturn.put("Rapid City", rapidCity);
		toreturn.put("Buffalo WY", buffaloW);
		toreturn.put("Las Cruces", lasCruces);
		toreturn.put("El Paso", elPaso);
		toreturn.put("Amarillo", amarillo);
		toreturn.put("San Antonio", sanAntonio);
		toreturn.put(kent.getName(), kent);
		toreturn.put("Fort Worth", fortWorth);
		toreturn.put("Oklahoma City", oklahomaCity);
		toreturn.put("Dallas", dallas);
		toreturn.put("Austin", austin);
		toreturn.put("Corpus Christi", corpusChristi);
		toreturn.put("Houston", houston);
		toreturn.put("Salina", salina);
		toreturn.put("Wichita", wichita);
		toreturn.put("Emporia", emporia);
		toreturn.put("Topeka", topeka);
		toreturn.put("Kansas City", kansasCity);
		toreturn.put("Lincoln", lincoln);
		toreturn.put("Omaha", omaha);
		toreturn.put("Sioux City", siouxCity);
		toreturn.put("Sioux Falls", siouxFalls);
		toreturn.put("Fargo", fargo);
		toreturn.put("Des Moines", desMoines);
		toreturn.put("Albert Lea", albertLea);
		toreturn.put("Minneapolis", minneapolis);
		toreturn.put("St Paul", stPaul);
		toreturn.put("St. Louis", stLouis);
		toreturn.put("Little Rock", littleRock);
		toreturn.put("Tulsa", tulsa);
		toreturn.put(springfieldMO.getName(), springfieldMO);
		toreturn.put("Memphis", memphis);
		toreturn.put("Shreveport", shreveport);
		toreturn.put("Lafayette", lafayette);
		toreturn.put(beaumont.getName(), beaumont);
		toreturn.put(batonRouge.getName(), batonRouge);
		toreturn.put(newOrleans.getName(), newOrleans);
		toreturn.put(hammond.getName(), hammond);
		toreturn.put(slidell.getName(), slidell);
		toreturn.put(jackson.getName(), jackson);
		toreturn.put(davenport.getName(), davenport);
		toreturn.put(springfieldIL.getName(), springfieldIL);
		toreturn.put(effingham.getName(), effingham);
		toreturn.put(champaign.getName(), champaign);
		toreturn.put(bloomington.getName(), bloomington);
		toreturn.put(chicago.getName(), chicago);
		toreturn.put(gary.getName(), gary);
		toreturn.put(rockford.getName(), rockford);
		toreturn.put(lasalle.getName(), lasalle);
		toreturn.put(rochelle.getName(), rochelle);
		toreturn.put(madison.getName(), madison);
		toreturn.put(milwaukee.getName(), milwaukee);
		toreturn.put(greenBay.getName(), greenBay);
		toreturn.put(tomah.getName(), tomah);
		toreturn.put(indianapolis.getName(), indianapolis);
		toreturn.put(louisville.getName(), louisville);
		toreturn.put(nashville.getName(), nashville);
		toreturn.put(birmingham.getName(), birmingham);
		toreturn.put(montgomery.getName(), montgomery);
		toreturn.put(mobile.getName(), mobile);
		toreturn.put(meridian.getName(), meridian);
		toreturn.put(mtVernon.getName(), mtVernon);
		toreturn.put(goreville.getName(), goreville);
		toreturn.put(silkeston.getName(), silkeston);
		toreturn.put(atlanta.getName(), atlanta);
		toreturn.put(chattanooga.getName(), chattanooga);
		toreturn.put(lexington.getName(), lexington);
		toreturn.put(knoxville.getName(), knoxville);
		toreturn.put(cincinnati.getName(), cincinnati);
		toreturn.put(pensacola.getName(), pensacola);
		toreturn.put(tallahassee.getName(), tallahassee);
		toreturn.put(lakeCity.getName(), lakeCity);
		toreturn.put(jacksonville.getName(), jacksonville);
		toreturn.put(tampa.getName(), tampa);
		toreturn.put(fortLauderdale.getName(), fortLauderdale);
		toreturn.put(miami.getName(), miami);
		toreturn.put(daytonaBeach.getName(), daytonaBeach);
		toreturn.put(orlando.getName(), orlando);
		toreturn.put(macon.getName(), macon);
		toreturn.put(savannah.getName(), savannah);
		toreturn.put(augusta.getName(), augusta);
		toreturn.put(columbia.getName(), columbia);
		toreturn.put(bowman.getName(), bowman);
		toreturn.put(charleston.getName(), charleston);
		toreturn.put(florence.getName(), florence);
		toreturn.put(dayton.getName(), dayton);
		toreturn.put(columbus.getName(), columbus);
		toreturn.put(toledo.getName(), toledo);
		toreturn.put(angola.getName(), angola);
		toreturn.put(fortWayne.getName(), fortWayne);
		toreturn.put(detroit.getName(), detroit);
		toreturn.put(cleveland.getName(), cleveland);
		toreturn.put(lansing.getName(), lansing);
		toreturn.put(grandRapids.getName(), grandRapids);
		toreturn.put(marshall.getName(), marshall);
		toreturn.put(flint.getName(), flint);
		toreturn.put(cambridge.getName(), cambridge);
		toreturn.put(charlestonWV.getName(), charlestonWV);
		toreturn.put(seville.getName(), seville);
		toreturn.put(akron.getName(), akron);
		toreturn.put(greenville.getName(), greenville);
		toreturn.put(clinton.getName(), clinton);
		toreturn.put(spartanburg.getName(), spartanburg);
		toreturn.put(northJackson.getName(), northJackson);
		toreturn.put(washington.getName(), washington);
		toreturn.put(morgantown.getName(), morgantown);
		toreturn.put(beckley.getName(), beckley);
		toreturn.put(wytheville.getName(), wytheville);
		toreturn.put(kingsport.getName(), kingsport);
		toreturn.put(asheville.getName(), asheville);
		toreturn.put(dandridge.getName(),dandridge);
		toreturn.put(benson.getName(), benson);
		toreturn.put(raleigh.getName(), raleigh);
		toreturn.put(greensboro.getName(), greensboro);
		toreturn.put(charlotte.getName(), charlotte);
		toreturn.put(statesville.getName(), statesville);
		toreturn.put(richmond.getName(), richmond);
		toreturn.put(washingtonDC.getName(), washingtonDC);
		toreturn.put(lexingtonVA.getName(), lexingtonVA);
		toreturn.put(staunton.getName(), staunton);
		toreturn.put(strasburg.getName(), strasburg);
		toreturn.put(baltimore.getName(), baltimore);
		toreturn.put(hagerstown.getName(), hagerstown);
		toreturn.put(hancock.getName(), hancock);
		toreturn.put(pittsburgh.getName(), pittsburgh);
		toreturn.put(mercer.getName(), mercer);
		toreturn.put(harrisburg.getName(), harrisburg);
		toreturn.put(philadelphia.getName(), philadelphia);
		toreturn.put(erie.getName(), erie);
		toreturn.put(buffaloNY.getName(), buffaloNY);
		toreturn.put(syracuse.getName(), syracuse);
		toreturn.put(albany.getName(), albany);
		toreturn.put(springfieldMA.getName(), springfieldMA);
		toreturn.put(southbridge.getName(), southbridge);
		toreturn.put(hartford.getName(), hartford);
		toreturn.put(auburn.getName(), auburn);
		toreturn.put(eastLyme.getName(), eastLyme);
		toreturn.put(newHaven.getName(), newHaven);
		toreturn.put(providence.getName(), providence);
		toreturn.put(boston.getName(), boston);
		toreturn.put(portChester.getName(), portChester);
		toreturn.put(brewster.getName(), brewster);
		toreturn.put(newburgh.getName(), newburgh);
		toreturn.put(suffern.getName(), suffern);
		toreturn.put(parsippany.getName(), parsippany);
		toreturn.put(newYork.getName(), newYork); 
		toreturn.put(binghamton.getName(), binghamton);
		toreturn.put(scranton.getName(), scranton);
		toreturn.put(tannersville.getName(), tannersville);
		toreturn.put(allentown.getName(), allentown);
		toreturn.put(bellefonte.getName(), bellefonte);
		toreturn.put(jonestown.getName(), jonestown);
		toreturn.put(hazleton.getName(), hazleton);
		toreturn.put(hickoryRun.getName(), hickoryRun);
		toreturn.put(newStanton.getName(), newStanton);
		toreturn.put(bedford.getName(), bedford);
		toreturn.put(breezewood.getName(), breezewood);
		toreturn.put(concord.getName(), concord);
		toreturn.put(lebanon.getName(), lebanon);
		toreturn.put(stJohnsbury.getName(), stJohnsbury);
		toreturn.put(portlandME.getName(), portlandME);
		toreturn.put(augustaME.getName(), augustaME);
		toreturn.put(sanFrancisco.getName(), sanFrancisco);
		
		
		akron.addCity(seville, 24, "I-76W");
		akron.addCity(cambridge, 83, "I-77S");
		akron.addCity(cleveland, 38, "I-77N");
		akron.addCity(northJackson, 38, "I-76E");
		
		albany.addCity(syracuse, 144, "I-90W");
		albany.addCity(springfieldMA, 86, "I-90E");
		albany.addCity(newburgh, 86, "I-87S");
		albany.addCity(binghamton, 138, "I-88W");
		
		albertLea.addCity(desMoines, 148, "I-35S");
		albertLea.addCity(siouxFalls, 181, "I-90W");
		albertLea.addCity(minneapolis, 98, "I-35N to I-35W");
		albertLea.addCity(tomah, 162, "I-90E");
		
		albuquerque.addCity(denver, 445, "Interstate 25");
		albuquerque.addCity(flagstaff, 324, "I-40W");
		albuquerque.addCity(lasCruces, 226, "I-25S");
		albuquerque.addCity(amarillo, 285, "I-40E");
		
		allentown.addCity(philadelphia, 55, "I-476S");
		allentown.addCity(newYork, 94, "I-78E");
		allentown.addCity(jonestown, 56, "I-78W");
		allentown.addCity(hickoryRun, 36, "I-476N");
		
		amarillo.addCity(albuquerque, 285, "I-40W");
		amarillo.addCity(oklahomaCity, 260, "I-40E");
		
		angola.addCity(toledo, 76, "I-80E");
		angola.addCity(gary, 130, "I-80W");
		angola.addCity(fortWayne, 45, "I-69S");
		angola.addCity(marshall, 39, "I-69N");
		
		asheville.addCity(kingsport, 75, "I-26W");
		asheville.addCity(spartanburg, 63, "I-26E");
		asheville.addCity(dandridge, 80, "I-40W");
		asheville.addCity(statesville, 107, "I-40E");
		
		atlanta.addCity(birmingham, 152, "I-20W");
		atlanta.addCity(montgomery, 160, "I-85N");
		atlanta.addCity(chattanooga, 118, "I-75N");
		atlanta.addCity(macon, 84, "I-75S");
		atlanta.addCity(augusta, 140, "I-20E");
		atlanta.addCity(greenville, 145, "I-85N");
		
		auburn.addCity(southbridge, 12, "I-90W");
		auburn.addCity(eastLyme, 68, "I-395S");
		auburn.addCity(boston, 44, "I-90E");
		
		augusta.addCity(atlanta, 140, "I-20W");
		augusta.addCity(columbia, 71, "I-20E");
		
		augustaME.addCity(portlandME, 53, "I-295S");
		
		austin.addCity(sanAntonio, 80, "I-35S");
		austin.addCity(dallas, 197, "I-35N to I-35E");
		austin.addCity(fortWorth, 187, "I-35N to I-35W");
		
		baltimore.addCity(washingtonDC, 39, "I-95S");
		baltimore.addCity(hagerstown, 76, "I-70W");
		baltimore.addCity(harrisburg, 79, "I-83N");
		baltimore.addCity(philadelphia, 98, "I-95N");
		
		barstow.addCity(lasVegas, 152 , "Interstate 15");
		barstow.addCity(sanBernardino, 71 , "Interstate 15 to Interstate 215");
		barstow.addCity(flagstaff, 355, "Interstate 40");
		
		batonRouge.addCity(lafayette, 59, "I-10W");
		batonRouge.addCity(newOrleans, 80, "I-10E");
		batonRouge.addCity(hammond, 41, "I-12E");
		
		beaumont.addCity(lafayette, 134, "I-10E");
		beaumont.addCity(houston, 85, "I-10W");
		
		beckley.addCity(charlestonWV, 61, "I-77N");
		beckley.addCity(wytheville, 77, "I-77S");
		beckley.addCity(lexingtonVA, 126, "I-64E");
		
		bedford.addCity(newStanton, 68, "I-76W");
		bedford.addCity(bellefonte, 85, "I-99N");
		bedford.addCity(breezewood, 16, "I-76E");
		
		bellefonte.addCity(mercer, 139, "I-80W");
		bellefonte.addCity(hazleton, 106, "I-80E");
		bellefonte.addCity(bedford, 85, "I-99S");
		
		benson.addCity(florence, 116, "I-95S");
		benson.addCity(raleigh, 49, "I-40W");
		benson.addCity(richmond, 175, "I-95N");
		
		billings.addCity(butte, 226, "I-90W");
		billings.addCity(buffaloW, 165, "I-90E");
		billings.addCity(bismarck, 416, "I-94E");
		
		binghamton.addCity(albany, 138, "I-88E");
		binghamton.addCity(syracuse, 78, "I-81N");
		binghamton.addCity(scranton, 61, "I-81S");
		
		birmingham.addCity(nashville, 193, "I-65N");
		birmingham.addCity(montgomery, 93, "I-65S");
		birmingham.addCity(meridian, 147, "I-59N/I-20E");
		birmingham.addCity(memphis, 238, "I-22");
		birmingham.addCity(atlanta, 151, "I-20E");
		birmingham.addCity(chattanooga, 148, "I-59N");
		
		bismarck.addCity(billings, 416, "I-94W");
		bismarck.addCity(fargo, 196, "I-94E");
		
		bloomington.addCity(champaign, 51, "I-74");
		bloomington.addCity(springfieldIL, 62, "I-55S");
		bloomington.addCity(davenport, 135, "I-74");
		bloomington.addCity(chicago, 134, "I-55N");
		bloomington.addCity(lasalle, 63, "I-39N");
		
		boise.addCity(portland, 430, "Interstate 84");
		boise.addCity(saltLakeCity, 345, "Interstate 84");
		boise.addCity(pocatello, 238, "Interstate 86 to Interstate 84");
		
		boston.addCity(providence, 50, "I-93S to I-95S");
		boston.addCity(auburn, 44, "I-90W");
		boston.addCity(concord, 64, "I-93N");
		boston.addCity(portlandME, 108, "I-95N");
		
		bowman.addCity(columbia, 61, "I-26W");
		bowman.addCity(charleston, 54, "I-26E");
		bowman.addCity(savannah, 99, "I-95S");
		bowman.addCity(florence, 75, "I-95N");
		
		breezewood.addCity(bedford, 16, "I-76W");
		breezewood.addCity(hancock, 22, "I-70E");
		breezewood.addCity(harrisburg, 94, "I-76E");
		
		brewster.addCity(hartford, 64, "I-84");
		brewster.addCity(portChester, 33, "I-684S");
		brewster.addCity(newburgh, 32, "I-84W");
		
		buffaloNY.addCity(erie, 97, "I-90W");
		buffaloNY.addCity(syracuse, 152, "I-90E");
		
		buffaloW.addCity(billings, 165, "I-90W");
		buffaloW.addCity(cheyenne, 289, "I-25S");
		buffaloW.addCity(rapidCity, 210, "1-90E");
		
		butte.addCity(spokane, 315, "Interstate 90");
		butte.addCity(pocatello, 255, "Interstate 15");
		butte.addCity(billings, 226, "I-90E");
		
		cambridge.addCity(columbus, 80, "I-70W");
		cambridge.addCity(charlestonWV, 134, "I-77S");
		cambridge.addCity(akron, 83, "I-77N");
		cambridge.addCity(washington, 76, "I-70E");
		
		champaign.addCity(effingham, 79, "I-57S");
		champaign.addCity(springfieldIL, 86, "I-72W");
		champaign.addCity(bloomington, 51, "I-74");
		champaign.addCity(chicago, 135, "I-57N");
		champaign.addCity(indianapolis, 122, "I-74");
		
		charleston.addCity(bowman, 54, "I-26W");
		
		charlestonWV.addCity(cambridge, 134, "I-77N");
		charlestonWV.addCity(lexington, 175, "I-64W");
		charlestonWV.addCity(morgantown, 156, "I-79N");
		charlestonWV.addCity(beckley, 61, "I-77S");
		
		charlotte.addCity(greensboro, 90, "I-85N");
		charlotte.addCity(columbia, 93, "I-77S");
		charlotte.addCity(spartanburg, 75, "I-85S");
		charlotte.addCity(statesville, 41, "I-77N");
		
		chattanooga.addCity(atlanta, 118, "I-75S");
		chattanooga.addCity(birmingham, 148, "I-59S");
		chattanooga.addCity(nashville, 134, "I-24W");
		chattanooga.addCity(knoxville, 112, "I-75N");
		
		cheyenne.addCity(saltLakeCity, 440, "Interstate 80");
		cheyenne.addCity(denver, 101, "Interstate 25");
		cheyenne.addCity(buffaloW, 289, "I-25N");
		cheyenne.addCity(lincoln, 444, "I-80E");
		
		chicago.addCity(bloomington, 134, "I-55S");
		chicago.addCity(champaign, 135, "I-57S");
		chicago.addCity(gary, 32, "I-90E");
		chicago.addCity(lasalle, 97, "I-55S to I-80W");
		chicago.addCity(rockford, 78, "I-90W");
		chicago.addCity(rochelle, 79, "I-88W");
		chicago.addCity(milwaukee, 92, "I-94W");
		
		cincinnati.addCity(lexington, 84, "I-75S");
		cincinnati.addCity(louisville, 99, "I-71S");
		cincinnati.addCity(indianapolis, 112, "I-74");
		cincinnati.addCity(dayton, 61, "I-75N");
		cincinnati.addCity(columbus, 107, "I-71N");
		
		cleveland.addCity(toledo, 116, "I-80W");
		cleveland.addCity(akron, 38, "I-77S");
		cleveland.addCity(seville, 40, "I-71S");
		cleveland.addCity(northJackson, 62, "I-77S to I-480E to I-80E");
		cleveland.addCity(erie, 100, "I-90E");
		
		clinton.addCity(columbia, 61, "I-26E");
		clinton.addCity(greenville, 42, "I-385N");
		clinton.addCity(spartanburg, 34, "I-26W");
		
		columbia.addCity(augusta, 71, "I-20W");
		columbia.addCity(bowman, 61, "I-26E");
		columbia.addCity(florence, 75, "I-20E");
		columbia.addCity(clinton, 61, "I-26W");
		columbia.addCity(charlotte, 93, "I-77N");
		
		columbus.addCity(dayton, 67, "I-70W");
		columbus.addCity(cincinnati, 107, "I-71S");
		columbus.addCity(cambridge, 80, "I-70E");
		columbus.addCity(seville,  103,  "I-71N");
		
		concord.addCity(boston, 64, "I-93S");
		concord.addCity(lebanon, 74, "I-89N");
		concord.addCity(stJohnsbury, 107, "I-93N");
		
		corpusChristi.addCity(sanAntonio, 143, "I-37S");
		
		dallas.addCity(fortWorth, 33, "I-30W");
		dallas.addCity(oklahomaCity, 205, "I-35E to I-35N");
		dallas.addCity(austin, 197, "I-35E to I-35S");
		dallas.addCity(houston, 239, "I-45S");
		dallas.addCity(littleRock, 319, "I-30E");
		dallas.addCity(shreveport, 188, "I-20E");
		
		dandridge.addCity(kingsport, 60, "I-81N");
		dandridge.addCity(asheville, 80, "I-40E");
		dandridge.addCity(knoxville, 40, "I-40W");
		
		davenport.addCity(desMoines, 168, "I-80W");
		davenport.addCity(bloomington, 135, "I-74");
		davenport.addCity(rochelle, 98, "I-88E");
		davenport.addCity(lasalle, 87, "I-80E");
		
		dayton.addCity(cincinnati, 61, "I-75S");
		dayton.addCity(indianapolis, 109, "I-70W");
		dayton.addCity(columbus, 67, "I-70E");
		dayton.addCity(toledo, 142, "I-75N");
		
		daytonaBeach.addCity(fortLauderdale, 253, "I-95S");
		daytonaBeach.addCity(jacksonville, 100, "I-95N");
		daytonaBeach.addCity(orlando, 49, "I-4W");
		
		denver.addCity(cheyenne, 101, "Interstate 25");
		denver.addCity(albuquerque, 445, "Interstate 25");
		denver.addCity(lasVegas, 752, "I-15N to I-70E");
		denver.addCity(salina, 434, "I-70E");
		denver.addCity(lincoln, 488, "I-76E to I-80E");
		
		desMoines.addCity(omaha, 140, "I-80W");
		desMoines.addCity(kansasCity, 193, "I-35S");
		desMoines.addCity(albertLea, 148, "I-35N");
		desMoines.addCity(davenport, 168, "I-80E");
		
		detroit.addCity(toledo, 60, "I-75S");
		detroit.addCity(lansing, 90, "I-96W");
		detroit.addCity(marshall, 107, "I-94W");
		detroit.addCity(flint, 68, "I-75N");
		
		eastLyme.addCity(auburn, 68, "I-395N");
		eastLyme.addCity(newHaven, 41,"I-95S");
		eastLyme.addCity(providence, 60, "I-95N");
		
		effingham.addCity(stLouis, 101, "I-70W");
		effingham.addCity(champaign, 79, "I-57N");
		effingham.addCity(indianapolis, 142, "I-70E");
		effingham.addCity(mtVernon, 68, "I-59S");
		
		elPaso.addCity(lasCruces, 46, "I-10W");
		elPaso.addCity(kent, 167, "I-10E");
		
		emporia.addCity(wichita, 88, "I-35S");
		emporia.addCity(topeka, 60, "I-335N");
		emporia.addCity(kansasCity, 108, "I-35N");
		
		erie.addCity(cleveland, 100, "I-90W");
		erie.addCity(mercer, 67, "I-79S");
		erie.addCity(buffaloNY, 97, "I-90E");
		
		fargo.addCity(siouxFalls, 245, "I-29S");
		fargo.addCity(bismarck, 196, "I-94W");
		fargo.addCity(minneapolis, 235, "I-94E");
		
		flagstaff.addCity(barstow, 355, "Interstate 40");
		flagstaff.addCity(phoenix, 147, "Interstate 17");
		flagstaff.addCity(albuquerque, 324, "Interstate 40");
		
		flint.addCity(lansing, 56, "I-69W");
		flint.addCity(detroit, 68, "I-75S");
		
		florence.addCity(bowman, 75, "I-95S");
		florence.addCity(columbia, 75, "I-20W");
		florence.addCity(benson, 116, "I-95N");
		
		fortLauderdale.addCity(tampa, 259, "I-75N");
		fortLauderdale.addCity(miami, 25, "I-95S");
		fortLauderdale.addCity(daytonaBeach, 235, "I-95N");
		
		fortWayne.addCity(indianapolis, 130, "I-69S");
		fortWayne.addCity(angola, 45, "I-69N");
		
		fortWorth.addCity(kent, 441, "I-20W");
		fortWorth.addCity(oklahomaCity, 202, "I-35W to I-35N");
		fortWorth.addCity(dallas, 33, "I-30E");
		fortWorth.addCity(austin, 187, "I-35W to I-35S");
		
		gary.addCity(chicago, 32, "I-90W");
		gary.addCity(lasalle, 100, "I-80W");
		gary.addCity(indianapolis, 153, "I-65S");
		gary.addCity(angola, 130, "I-80E");
		gary.addCity(grandRapids, 150, "I-94E to I-196E");
		gary.addCity(marshall, 149, "I-94E");
		
		goreville.addCity(mtVernon, 47, "I-57N");
		goreville.addCity(nashville, 180, "I-24E");
		goreville.addCity(silkeston, 61, "I-57S");
		
		grandRapids.addCity(lansing, 68, "I-96E");
		grandRapids.addCity(gary, 150, "I-196W to I-94W");
		
		greenBay.addCity(madison, 118, "I-43S");
		
		greensboro.addCity(raleigh, 62, "I-40E");
		greensboro.addCity(charlotte, 90, "I-85S");
		greensboro.addCity(statesville, 67, "I-40W");
		
		greenville.addCity(atlanta, 145, "I-85S");
		greenville.addCity(clinton, 42, "I-385S");
		greenville.addCity(spartanburg, 25, "I-85N");
		
		hagerstown.addCity(strasburg, 57, "I-81S");
		hagerstown.addCity(washingtonDC, 67, "I-70E to I-270S");
		hagerstown.addCity(baltimore, 76, "I-70E");
		hagerstown.addCity(hancock, 29, "I-70W");
		hagerstown.addCity(harrisburg, 77, "I-81N");
		
		hammond.addCity(batonRouge, 41, "I-12W");
		hammond.addCity(slidell, 47, "I-12E");
		hammond.addCity(jackson, 130, "I-55N");
		hammond.addCity(newOrleans, 55, "I-55S");
		
		hancock.addCity(hagerstown, 29, "I-70E");
		hancock.addCity(morgantown, 113, "I-68W");
		hancock.addCity(breezewood, 22, "I-70W");
		
		harrisburg.addCity(baltimore, 79, "I-83S");
		harrisburg.addCity(hagerstown, 77, "I-81S");
		harrisburg.addCity(philadelphia, 106, "I-76E");
		harrisburg.addCity(jonestown, 23, "I-81N");
		harrisburg.addCity(breezewood, 94, "I-76W");
		
		hartford.addCity(southbridge, 44, "I-84");
		hartford.addCity(springfieldMA, 31, "I-91N");
		hartford.addCity(newHaven, 39, "I-95S");
		hartford.addCity(brewster, 64, "I-84");
		
		hazleton.addCity(jonestown, 61, "I-81S");
		hazleton.addCity(bellefonte, 106, "I-80W");
		hazleton.addCity(scranton, 36, "I-81N");
		hazleton.addCity(hickoryRun, 17, "I-80E");
		
		hickoryRun.addCity(hazleton, 17, "I-80W");
		hickoryRun.addCity(scranton, 32, "I-476N to I-81N");
		hickoryRun.addCity(tannersville, 18, "I-80E");
		hickoryRun.addCity(allentown, 36, "I-476S");
		
		houston.addCity(sanAntonio, 197, "I-10W");
		houston.addCity(dallas, 239, "I-45N");
		houston.addCity(beaumont, 85, "I-10E");
		
		indianapolis.addCity(gary, 153, "I-65N");
		indianapolis.addCity(champaign, 122, "I-74");
		indianapolis.addCity(effingham, 142, "I-70W");
		indianapolis.addCity(louisville, 165, "I-65S");
		indianapolis.addCity(cincinnati, 112, "I-74");
		indianapolis.addCity(dayton, 109, "I-70E");
		indianapolis.addCity(fortWayne, 130, "I-69N");
		
		jackson.addCity(hammond, 130, "I-55S");
		jackson.addCity(shreveport, 217, "I-20W");
		jackson.addCity(memphis, 210, "I-55N");
		jackson.addCity(meridian, 93, "I-20E");
		
		jacksonville.addCity(lakeCity, 60, "I-10W");
		jacksonville.addCity(daytonaBeach, 100, "I-95S");
		
		jonestown.addCity(harrisburg, 23, "I-81S");
		jonestown.addCity(allentown, 56, "I-78E");
		jonestown.addCity(hazleton, 61, "I-81N");
		
		kansasCity.addCity(topeka, 65, "I-70W");
		kansasCity.addCity(emporia, 108, "I-35S");
		kansasCity.addCity(omaha, 189, "I-29N");
		kansasCity.addCity(desMoines, 193, "I-35N");
		kansasCity.addCity(stLouis, 248, "I-70E");
		
		kent.addCity(elPaso, 167, "I-10W");
		kent.addCity(sanAntonio, 384, "I-10E");
		kent.addCity(fortWorth, 441, "I-20E");
		
		kingsport.addCity(asheville, 75, "I-26E");
		kingsport.addCity(wytheville, 96, "I-81N");
		kingsport.addCity(dandridge, 60, "I-81S");
		
		knoxville.addCity(chattanooga, 112, "I-75S");
		knoxville.addCity(nashville, 180, "I-40W");
		knoxville.addCity(lexington, 170, "I-75N");
		knoxville.addCity(dandridge, 40, "I-40E");
		
		lafayette.addCity(shreveport, 212, "I-49N");
		lafayette.addCity(beaumont, 134, "I-10W");
		lafayette.addCity(batonRouge, 59, "I-10E");
		
		lakeCity.addCity(tallahassee, 105, "I-10W");
		lakeCity.addCity(jacksonville, 60, "I-10E");
		lakeCity.addCity(tampa, 177, "I-75S");
		lakeCity.addCity(macon, 210, "I-75N");
		
		lansing.addCity(detroit, 90, "I-96E");
		lansing.addCity(grandRapids, 68, "I-96W");
		lansing.addCity(marshall, 46, "I-69S");
		lansing.addCity(flint, 56, "I-69E");
		
		lasalle.addCity(bloomington, 63, "I-39S");
		lasalle.addCity(gary, 100, "I-80E");
		lasalle.addCity(davenport, 87, "I-80W");
		lasalle.addCity(chicago, 97, "I-80E to I-55N");
		lasalle.addCity(rochelle, 45, "I-39N");
		
		lasCruces.addCity(albuquerque, 226, "I-25N");
		lasCruces.addCity(tucson, 274, "I-10W");
		lasCruces.addCity(elPaso, 46, "I-10W");
		
		lasVegas.addCity(barstow, 152, "I-15S");
		lasVegas.addCity(saltLakeCity, 424, "Interstate 15");
		lasVegas.addCity(denver, 752, "Interstate 15 to Interstate 70");
		
		lebanon.addCity(concord, 74, "I-89S");
		lebanon.addCity(springfieldMA, 121, "I-91S");
		lebanon.addCity(stJohnsbury, 60, "I-91N");
		
		lexington.addCity(knoxville, 170, "I-75S");
		lexington.addCity(louisville, 80, "I-64W");
		lexington.addCity(cincinnati, 84, "I-75N");
		lexington.addCity(charlestonWV, 175, "I-64E");
		
		lexingtonVA.addCity(wytheville, 113, "I-81N");
		lexingtonVA.addCity(beckley, 126, "I-64W");
		lexingtonVA.addCity(staunton, 35, "I-81N");
		
		lincoln.addCity(denver, 488, "I-80W to I-76W");
		lincoln.addCity(cheyenne, 444, "I-80W");
		lincoln.addCity(omaha, 53, "I-80E");
		
		littleRock.addCity(dallas, 319, "I-30W");
		littleRock.addCity(oklahomaCity, 339, "I-40W");
		littleRock.addCity(memphis, 137, "I-40E");
		
		losAngeles.addCity(sanBernardino, 60, "Interstate 10");
		losAngeles.addCity(sanDiego, 121, "Interstate 5");
		losAngeles.addCity(sacramento, 384, "Interstate 5");
		
		louisville.addCity(indianapolis, 114, "I-65N");
		louisville.addCity(nashville, 174, "I-65S");
		louisville.addCity(mtVernon, 179, "I-64W");
		louisville.addCity(lexington, 80, "I-64E");
		louisville.addCity(cincinnati, 99, "I-71N");
		
		macon.addCity(lakeCity, 210, "I-75S");
		macon.addCity(atlanta, 84, "I-75N");
		macon.addCity(savannah, 156, "I-16E");
		
		madison.addCity(rockford, 68, "I-39S/I-90E");
		madison.addCity(milwaukee, 78, "I-94E");
		madison.addCity(greenBay, 118, "I-43N");
		madison.addCity(tomah, 97, "I-90W");
		
		marshall.addCity(gary, 149, "I-94W");
		marshall.addCity(detroit, 107, "I-94E");
		marshall.addCity(angola, 39, "I-69S");
		marshall.addCity(lansing, 46, "I-69N");
		
		memphis.addCity(littleRock, 137, "I-40W");
		memphis.addCity(silkeston, 142, "I-55N");
		memphis.addCity(jackson, 210, "I-55S");
		memphis.addCity(birmingham, 238, "I-22");
		memphis.addCity(nashville, 212, "I-40E");
		
		mercer.addCity(pittsburgh, 57, "I-79S");
		mercer.addCity(northJackson, 38, "I-80W");
		mercer.addCity(erie, 67, "I-79N");
		mercer.addCity(bellefonte, 139, "I-80E");
		
		meridian.addCity(slidell, 170, "I-59S");
		meridian.addCity(jackson, 93, "I-20W");
		meridian.addCity(birmingham, 147, "I-59S/I-20W");
		
		miami.addCity(fortLauderdale, 25, "I-95N");
		
		milwaukee.addCity(madison, 78, "I-94W");
		milwaukee.addCity(chicago, 92, "I-94E");
		
		minneapolis.addCity(albertLea, 98, "I-35W to I-35S");
		minneapolis.addCity(stPaul, 14, "I-94E");
		minneapolis.addCity(fargo, 235, "I-94W");
		
		mobile.addCity(montgomery, 168, "I-65N");
		mobile.addCity(slidell, 115, "I-10W");
		mobile.addCity(pensacola, 57, "I-10E");
		
		montgomery.addCity(birmingham, 93, "I-65S");
		montgomery.addCity(mobile, 168, "I-65S");
		montgomery.addCity(atlanta, 160, "I-85N");
		
		morgantown.addCity(washington, 49, "I-79N");
		morgantown.addCity(charlestonWV, 156, "I-79S");
		morgantown.addCity(hancock, 113, "I-68E");
		
		mtVernon.addCity(louisville, 179, "I-64E");
		mtVernon.addCity(stLouis, 80, "I-64W");
		mtVernon.addCity(effingham, 68, "I-57N");
		mtVernon.addCity(goreville, 47, "I-57S");
		
		nashville.addCity(louisville, 174, "I-65N");
		nashville.addCity(birmingham, 193, "I-65S");
		nashville.addCity(memphis, 212, "I-40W");
		nashville.addCity(goreville, 180, "I-24W");
		nashville.addCity(chattanooga, 134, "I-24E");
		nashville.addCity(knoxville, 180, "I-40E");
		
		newburgh.addCity(brewster, 32, "I-84E");
		newburgh.addCity(albany, 86, "I-87N");
		newburgh.addCity(suffern, 32, "I-87S");
		newburgh.addCity(scranton, 97, "I-84W");
		
		newHaven.addCity(eastLyme, 41, "I-95N");
		newHaven.addCity(hartford, 39, "I-91N");
		newHaven.addCity(portChester, 48, "I-95S");
		
		newStanton.addCity(pittsburgh, 33, "I-76W to I-376W");
		newStanton.addCity(washington, 41, "I-70W");
		newStanton.addCity(bedford, 68, "I-76E");
		
		newOrleans.addCity(batonRouge, 80, "I-10W");
		newOrleans.addCity(slidell, 30, "I-10E");
		newOrleans.addCity(hammond, 55, "I-55N");
		
		newYork.addCity(parsippany, 31, "I-280W");
		newYork.addCity(portChester, 32, "I-95N");
		newYork.addCity(philadelphia, 96, "I-95S");
		newYork.addCity(allentown, 94, "I-78W");
		
		northJackson.addCity(akron, 38, "I-76W");
		northJackson.addCity(cleveland, 62, "I-80W to I-480W to I-77N");
		northJackson.addCity(pittsburgh, 74, "I-76E");
		northJackson.addCity(mercer, 38, "I-80E");
		
		oklahomaCity.addCity(amarillo, 260, "I-40W");
		oklahomaCity.addCity(fortWorth, 202, "I-35S to I-35W");
		oklahomaCity.addCity(dallas, 205, "I-35S to I-35E");
		oklahomaCity.addCity(wichita, 161, "I-35N");
		oklahomaCity.addCity(littleRock, 339, "I-40E");
		oklahomaCity.addCity(tulsa, 107, "I-44E");
		
		omaha.addCity(lincoln, 53, "I-80W");
		omaha.addCity(kansasCity, 189, "I-29S");
		omaha.addCity(siouxCity, 101, "I-29N");
		omaha.addCity(desMoines, 140, "I-80E");
		
		orlando.addCity(daytonaBeach, 49, "I-4E");
		orlando.addCity(tampa, 84, "I-4W");
		
		parsippany.addCity(suffern, 26, "I-287N");
		parsippany.addCity(newYork, 31, "I-280E");
		parsippany.addCity(tannersville, 67, "I-80W");
		
		pensacola.addCity(mobile, 57, "I-10W");
		pensacola.addCity(tallahassee, 197, "I-10E");
		
		philadelphia.addCity(harrisburg, 106, "I-76W");
		philadelphia.addCity(baltimore, 98, "I-95S");
		philadelphia.addCity(newYork, 96, "I-95N");
		philadelphia.addCity(allentown, 55, "I-476N");
		
		phoenix.addCity(sanBernardino, 321, "Interstate 10");
		phoenix.addCity(flagstaff, 147, "Interstate 17");
		phoenix.addCity(tucson, 116, "Interstate 10");
		
		pittsburgh.addCity(washington, 30, "I-79S");
		pittsburgh.addCity(northJackson, 74, "I-76W");
		pittsburgh.addCity(mercer, 57, "I-79N");
		pittsburgh.addCity(newStanton, 33, "I-376E to I-76E");
		
		pocatello.addCity(butte, 255, "Interstate 15");
		pocatello.addCity(boise, 238, "Interstate 84 to Interstate 86");
		pocatello.addCity(saltLakeCity, 165, "Interstate 15");
		
		portland.addCity(sacramento, 580, "Interstate 5");
		portland.addCity(seattle, 173, "Interstate 5");
		portland.addCity(boise, 430, "Interstate 84");
		
		portlandME.addCity(boston, 108, "I-95S");
		portlandME.addCity(augustaME, 53, "I-295N");
		
		portChester.addCity(newHaven, 48, "I-95N");
		portChester.addCity(brewster, 33, "I-684N");
		portChester.addCity(suffern, 29, "I-287W");
		portChester.addCity(newYork, 32, "I-95S");
		
		providence.addCity(eastLyme, 60, "I-95S");
		providence.addCity(boston, 50, "I-95N to I-93N");
		
		raleigh.addCity(benson, 49, "I-40E");
		raleigh.addCity(greensboro, 62, "I-40W");
		raleigh.addCity(richmond, 157, "I-85N");
		
		rapidCity.addCity(buffaloW, 210, "I-90W");
		rapidCity.addCity(siouxFalls, 348, "I-90E");
		
		reno.addCity(saltLakeCity, 518, "Interstate 80");
		reno.addCity(sacramento, 132, "Interstate 80");
		
		richmond.addCity(benson, 175, "I-95S");
		richmond.addCity(raleigh, 157, "I-85S");
		richmond.addCity(washingtonDC, 109, "I-95N");
		richmond.addCity(staunton, 109, "I-64W");
		
		rochelle.addCity(lasalle, 45, "I-39S");
		rochelle.addCity(rockford, 27, "I-39N");
		rochelle.addCity(chicago, 79, "I-88E");
		rochelle.addCity(davenport, 98, "I-88W");
		
		rockford.addCity(rochelle, 27, "I-39S");
		rockford.addCity(chicago, 78, "I-90E");
		rockford.addCity(madison, 68, "I-39N/I-90W");
		
		sacramento.addCity(losAngeles, 384, "Interstate 5");
		sacramento.addCity(portland, 580, "Interstate 5");
		sacramento.addCity(reno, 132, "Interstate 80");
		sacramento.addCity(sanFrancisco, 87, "I-80W");
		
		salina.addCity(denver, 434, "I-70W");
		salina.addCity(wichita, 89, "I-135S");
		salina.addCity(topeka, 111, "I-70E");
		
		saltLakeCity.addCity(lasVegas, 424, "Interstate 15");
		saltLakeCity.addCity(reno, 518, "Interstate 80");
		saltLakeCity.addCity(cheyenne, 440, "Interstate 80");
		saltLakeCity.addCity(boise, 345, "Interstate 84");
		saltLakeCity.addCity(pocatello, 165, "Interstate 15");
		
		sanAntonio.addCity(kent, 384, "I-10W");
		sanAntonio.addCity(austin, 80, "I-35N");
		sanAntonio.addCity(corpusChristi, 143, "I-37N");
		sanAntonio.addCity(houston, 197, "I-10E");
		
		sanBernardino.addCity(losAngeles, 60, "Interstate 10");
		sanBernardino.addCity(sanDiego, 107, "Interstate 215 to Interstate 15");
		sanBernardino.addCity(barstow, 71, "Interstate 215 to Interstate 15");
		sanBernardino.addCity(phoenix, 321, "Interstate 10");
		
		sanDiego.addCity(losAngeles, 121, "Interstate 5");
		sanDiego.addCity(sanBernardino, 107, "Interstate 15 to Interstate 215");
		sanDiego.addCity(tucson, 410, "Interstate 8 to Interstate 10");
		
		sanFrancisco.addCity(sacramento, 87, "I-80E");
		
		savannah.addCity(macon, 156, "I-16W");
		savannah.addCity(bowman, 99, "I-95N");
		
		scranton.addCity(binghamton, 61, "I-81N");
		scranton.addCity(newburgh, 97, "I-84E");
		scranton.addCity(tannersville, 32, "I-380S");
		scranton.addCity(hazleton, 36, "I-81S");
		scranton.addCity(hickoryRun, 32, "I-81S to I-476S");
		
		seattle.addCity(portland, 173, "Interstate 5");
		seattle.addCity(spokane, 279, "Interstate 90");
		
		seville.addCity(columbus, 103, "I-71S");
		seville.addCity(akron, 24, "I-76E");
		seville.addCity(cleveland, 40, "I-71N");
		
		shreveport.addCity(dallas, 188, "I-20W");
		shreveport.addCity(lafayette, 212, "I-49S");
		shreveport.addCity(jackson, 217, "I-20E");
		
		silkeston.addCity(goreville, 61, "I-59N");
		silkeston.addCity(stLouis, 143, "I-55N");
		silkeston.addCity(memphis, 142, "I-55S");
		
		siouxCity.addCity(omaha, 101, "I-29S");
		siouxCity.addCity(siouxFalls, 89, "I-29N");
		
		siouxFalls.addCity(siouxCity, 89, "I-29S");
		siouxFalls.addCity(rapidCity, 348, "I-90W");
		siouxFalls.addCity(fargo, 245, "I-29N");
		siouxFalls.addCity(albertLea, 181, "I-90E");
		
		slidell.addCity(hammond, 47, "I-12W");
		slidell.addCity(newOrleans, 30, "I-10W");
		slidell.addCity(mobile, 115, "I-10E");
		slidell.addCity(meridian, 170, "I-59N");
		
		southbridge.addCity(springfieldMA, 30, "I-90W");
		southbridge.addCity(southbridge, 44, "I-84");
		southbridge.addCity(auburn, 12, "I-90E");
		
		spartanburg.addCity(greenville, 25, "I-85S");
		spartanburg.addCity(clinton, 34, "I-26E");
		spartanburg.addCity(asheville, 63, "I-26W");
		spartanburg.addCity(charlotte, 75, "I-85N");
		
		spokane.addCity(seattle, 279, "Interstate 90" );
		spokane.addCity(butte, 315, "Interstate 90");
		
		springfieldMO.addCity(tulsa, 181, "I-44W");
		springfieldMO.addCity(stLouis, 216, "I-44E");
		
		springfieldIL.addCity(stLouis,  97,  "I-55S");
		springfieldIL.addCity(champaign, 86, "I-72E");
		springfieldIL.addCity(bloomington, 72, "I-55N");
		
		springfieldMA.addCity(albany, 86, "I-90W");
		springfieldMA.addCity(southbridge, 30, "I-90E");
		springfieldMA.addCity(hartford, 31, "I-91S");
		springfieldMA.addCity(lebanon, 121, "I-91N");
		
		statesville.addCity(greensboro, 67, "I-40E");
		statesville.addCity(asheville, 107, "I-40W");
		statesville.addCity(charlotte, 41, "I-77S");
		statesville.addCity(wytheville, 92, "I-77N");
		
		staunton.addCity(lexingtonVA, 35, "I-81S");
		staunton.addCity(richmond, 109, "I-64E");
		staunton.addCity(strasburg, 83, "I-81N");
		
		stJohnsbury.addCity(lebanon, 60, "I-91S");
		stJohnsbury.addCity(concord, 107, "I-93S");
		
		stLouis.addCity(silkeston, 143, "I-55S");
		stLouis.addCity(kansasCity, 248, "I-70W");
		stLouis.addCity(springfieldMO, 216, "I-44W");
		stLouis.addCity(springfieldIL, 97, "I-55N");
		stLouis.addCity(effingham, 101, "I-70E");
		stLouis.addCity(mtVernon, 80, "I-64E");
		
		stPaul.addCity(minneapolis, 14, "I-94W");
		stPaul.addCity(tomah, 168, "I-94E");
		
		strasburg.addCity(staunton, 83, "I-81S");
		strasburg.addCity(washingtonDC, 80, "I-66E");
		strasburg.addCity(hagerstown, 57, "I-81N");
		
		suffern.addCity(newburgh, 32, "I-87N");
		suffern.addCity(portChester, 29, "I-287E");
		suffern.addCity(parsippany, 26, "I-287S");
		
		syracuse.addCity(buffaloNY, 152, "I-90W");
		syracuse.addCity(albany, 144, "I-90E");
		syracuse.addCity(binghamton, 78, "I-81S");
		
		tallahassee.addCity(pensacola, 197, "I-10W");
		tallahassee.addCity(lakeCity, 105, "I-10E");
		
		tampa.addCity(lakeCity, 177, "I-75N");
		tampa.addCity(fortLauderdale, 259, "I-75S");
		tampa.addCity(orlando, 84, "I-4E");		
		
		tannersville.addCity(scranton, 32, "I-380N");
		tannersville.addCity(parsippany, 67, "I-80E");
		tannersville.addCity(hickoryRun, 18, "I-80W");
		
		toledo.addCity(dayton, 142, "I-75S");
		toledo.addCity(angola, 76, "I-80W");
		toledo.addCity(detroit, 60, "I-75N");
		toledo.addCity(cleveland, 116, "I-80E");
		
		tomah.addCity(stPaul, 168, "I-94W");
		tomah.addCity(albertLea, 162, "I-90W");
		tomah.addCity(madison, 97, "I-90E");
		
		topeka.addCity(emporia, 60, "I-335S");
		topeka.addCity(salina, 111, "I-70W");
		topeka.addCity(kansasCity, 60, "I-70E");
		
		tucson.addCity(phoenix, 116, "Interstate 10");
		tucson.addCity(sanDiego, 410, "Interstate 10 to Interstate 8");
		tucson.addCity(lasCruces, 274, "I-10E");
		
		tulsa.addCity(oklahomaCity, 107, "I-44W");
		tulsa.addCity(springfieldMO, 181, "I-44E");
		
		washington.addCity(cambridge, 76, "I-70W");
		washington.addCity(morgantown, 49, "I-79S");
		washington.addCity(pittsburgh, 30, "I-79N");
		washington.addCity(newStanton, 41, "I-70E");
		
		washingtonDC.addCity(richmond, 109, "I-95S");
		washingtonDC.addCity(strasburg, 80, "I-66W");
		washingtonDC.addCity(baltimore, 39, "I-95N");
		washingtonDC.addCity(hagerstown, 67, "I-270N to I-70W");
		
		wichita.addCity(salina, 89, "I-135N");
		wichita.addCity(oklahomaCity, 161, "I-35S");
		wichita.addCity(emporia, 88, "I-35N");
		
		wytheville.addCity(beckley, 77, "I-77N");
		wytheville.addCity(kingsport, 96, "I-81S");
		wytheville.addCity(statesville, 92, "I-77S");
		wytheville.addCity(lexingtonVA, 113, "I-81N");

		return toreturn;
	}
}