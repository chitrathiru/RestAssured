package ComplexJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//we can also use @Data instead of @Getter and @Setter
public class Otherdetails {
	
	private String country;
	private String language;

	/*public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
*/
}
