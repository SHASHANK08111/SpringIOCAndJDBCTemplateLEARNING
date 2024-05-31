package CollectionDependencyInjectionANNOTATION;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import lombok.AllArgsConstructor;
//import lombok.Data;

//@Data
//@AllArgsConstructor
@Component
public class Address {
    
	private String city;
	private String country;
	
	@Autowired
	public Address( @Value("${Address.city}") String city ,@Value("${Address.country}") String country) {
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
