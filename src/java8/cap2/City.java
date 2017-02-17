package java8.cap2;

public class City {

	private String name;
	private Integer population;
	private String state;
	
	public City(String name, Integer population, String state) {
		this.name = name;
		this.population = population;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
