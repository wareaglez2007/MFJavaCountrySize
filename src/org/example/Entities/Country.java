/**
 * 
 */
package org.example.Entities;

/**
 * @author Rostom Sahkain
 * 02-09-2021
 *
 */
public class Country {

	/**
	 * * Code VARCHAR(3) NOT NULL, Name VARCHAR(52) NOT NULL, Continent
	 * VARCHAR(20) NOT NULL, Region VARCHAR(26) NOT NULL, SurfaceArea
	 * DECIMAL(10,2) NOT NULL, IndepYear INT, Population INT NOT NULL,
	 * LifeExpectancy DECIMAL(3,1), GNP DECIMAL(10,2), GNPOld DECIMAL(10,2),
	 * LocalName VARCHAR(45) NOT NULL, GovernmentForm CHAR(45) NOT NULL,
	 * HeadOfState VARCHAR(60), Capital INT, Code2 VARCHAR(2) NOT NULL, PRIMARY
	 * KEY (Code))
	 * 
	 * Needed Country Name Capital City Name Country Population Country Size
	 * (Surface Area) Country Density (Surface Area / Population)
	 */
	private String code;
	private String name; // ->used
	private String continent;
	private String region;
	private double surfaceArea;// ->used
	private int indepYear;
	private int population;// ->used
	private double lifeExpectancy;
	private double gnp;
	private double gnpOld;
	private String localName;
	private String governmentForm;
	private String headOfState;
	private int capital;
	private String code2;
	// For cities
	private int cityId;
	private String cityName; // ->used
	private String countryCode;
	private String district;
	private int cityPoplulation;

	private double Density;

	public Country() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}

	/**
	 * @param continent
	 *            the continent to set
	 */
	public void setContinent(String continent) {
		this.continent = continent;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region
	 *            the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the surfaceArea
	 */
	public double getSurfaceArea() {
		return surfaceArea;
	}

	/**
	 * @param surfaceArea
	 *            the surfaceArea to set
	 */
	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	/**
	 * @return the indepYear
	 */
	public int getIndepYear() {
		return indepYear;
	}

	/**
	 * @param indepYear
	 *            the indepYear to set
	 */
	public void setIndepYear(int indepYear) {
		this.indepYear = indepYear;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population
	 *            the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	/**
	 * @return the lifeExpectancy
	 */
	public double getLifeExpectancy() {
		return lifeExpectancy;
	}

	/**
	 * @param lifeExpectancy
	 *            the lifeExpectancy to set
	 */
	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	/**
	 * @return the gnp
	 */
	public double getGnp() {
		return gnp;
	}

	/**
	 * @param gnp
	 *            the gnp to set
	 */
	public void setGnp(double gnp) {
		this.gnp = gnp;
	}

	/**
	 * @return the gnpOld
	 */
	public double getGnpOld() {
		return gnpOld;
	}

	/**
	 * @param gnpOld
	 *            the gnpOld to set
	 */
	public void setGnpOld(double gnpOld) {
		this.gnpOld = gnpOld;
	}

	/**
	 * @return the localName
	 */
	public String getLocalName() {
		return localName;
	}

	/**
	 * @param localName
	 *            the localName to set
	 */
	public void setLocalName(String localName) {
		this.localName = localName;
	}

	/**
	 * @return the governmentForm
	 */
	public String getGovernmentForm() {
		return governmentForm;
	}

	/**
	 * @param governmentForm
	 *            the governmentForm to set
	 */
	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	/**
	 * @return the headOfState
	 */
	public String getHeadOfState() {
		return headOfState;
	}

	/**
	 * @param headOfState
	 *            the headOfState to set
	 */
	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	/**
	 * @return the capital
	 */
	public int getCapital() {
		return capital;
	}

	/**
	 * @param capital
	 *            the capital to set
	 */
	public void setCapital(int capital) {
		this.capital = capital;
	}

	/**
	 * @return the code2
	 */
	public String getCode2() {
		return code2;
	}

	/**
	 * @param code2
	 *            the code2 to set
	 */
	public void setCode2(String code2) {
		this.code2 = code2;
	}

	/**
	 * @return the cityId
	 */
	public int getCityId() {
		return cityId;
	}

	/**
	 * @param cityId
	 *            the cityId to set
	 */
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName
	 *            the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode
	 *            the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the cityPoplulation
	 */
	public int getCityPoplulation() {
		return cityPoplulation;
	}

	/**
	 * @param cityPoplulation
	 *            the cityPoplulation to set
	 */
	public void setCityPoplulation(int cityPoplulation) {
		this.cityPoplulation = cityPoplulation;
	}

	/**
	 * @return the density
	 */
	public double getDensity() {
		return Density;
	}

	/**
	 * @param density
	 *            the density to set
	 */
	public void setDensity(double density) {
		Density = density;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		/**
		 * Formats the data fetched from database
		 */
		String message = String.format(
				"%-21s   %-30s		 %,13d    %,12.1f    %,10.2f", cityName, name,
				population, surfaceArea, Density);

		return message;
	}

}
