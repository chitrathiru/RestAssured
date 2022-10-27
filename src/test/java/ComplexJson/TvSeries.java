package ComplexJson;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//we can also use @Data instead of @Getter and @Setter
public class TvSeries {
	
	private String title;
	private int year;
	
/*	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	*/

}
