package CollectionDependencyInjection;

//import lombok.AllArgsConstructor;
//import lombok.Data;

//@Data
//@AllArgsConstructor

public class Address {
    
	private String city;
	private String country;
	
	
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
	public Address() {
	}

	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	
}
