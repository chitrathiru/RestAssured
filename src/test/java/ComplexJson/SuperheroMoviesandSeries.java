package ComplexJson;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//we can also use @Data instead of @Getter and @Setter
public class SuperheroMoviesandSeries {
	
	private String category;
	private List<String> acceptedFranchises;
	private List<String> genres;
	private List<Movies> movies;
	private List<TvSeries> tvSeries;
	private Otherdetails otherDetails;
	
/*	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getAcceptedFranchises() {
		return acceptedFranchises;
	}
	public void setAcceptedFranchises(List<String> acceptedFranchises) {
		this.acceptedFranchises = acceptedFranchises;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public List<TvSeries> getTvSeries() {
		return tvSeries;
	}
	public void setTvSeries(List<TvSeries> tvSeries) {
		this.tvSeries = tvSeries;
	}
	public Otherdetails getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(Otherdetails otherDetails) {
		this.otherDetails = otherDetails;
	}
	
	*/

}
