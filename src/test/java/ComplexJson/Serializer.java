package ComplexJson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
		
		SuperheroMoviesandSeries moviesseries = new SuperheroMoviesandSeries();
		
		moviesseries.setCategory("Super hero movies and series");
		
		List<String> franchise = new ArrayList<String>();
		franchise.add("DC");
		franchise.add("Marvel");	
		moviesseries.setAcceptedFranchises(franchise);
		
		List<String> genres = new ArrayList<String>();
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Heroic");
		genres.add("Dark");
		genres.add("Funny");
		moviesseries.setGenres(genres);
		
		Movies batman = new Movies();
		batman.setTitle("Batman");
		batman.setYear(2008);
		List<String> cast = new ArrayList<String>();
		cast.add("Christian Bale");
		cast.add("Heath Ledger");
		batman.setCast(cast);
		
		Movies jl = new Movies();
		jl.setTitle("Justice League");
		jl.setYear(2010);
		List<String> cast1 = new ArrayList<String>();
		cast1.add("Heny Cavill");
		cast1.add("Gal Cadot");
		jl.setCast(cast1);
		
		Movies av = new Movies();
		av.setTitle("The Avengers");
		av.setYear(2011);
		List<String> cast2 = new ArrayList<String>();
		cast2.add("Chris Evans");
		cast2.add("Chris Hemsworth");
		av.setCast(cast2);
		
		
		List<Movies> movieobj = new ArrayList<Movies>();
		movieobj.add(batman);
		movieobj.add(jl);
		movieobj.add(av);
		
		
		moviesseries.setMovies(movieobj);
		
		TvSeries flash = new TvSeries();
		flash.setTitle("Flash");
		flash.setYear(2008);
		
		TvSeries gotham = new TvSeries();
		gotham.setTitle("Gotham");
		gotham.setYear(2010);
		
		TvSeries supergirl = new TvSeries();
		supergirl.setTitle("Super Girl");
		supergirl.setYear(2012);
		
		List<TvSeries> seriesobj = new ArrayList<TvSeries>();
		seriesobj.add(flash);
		seriesobj.add(gotham);
		seriesobj.add(supergirl);
		
		moviesseries.setTvSeries(seriesobj);
		
		Otherdetails other = new Otherdetails();
		other.setCountry("USA");
		other.setLanguage("English");
		moviesseries.setOtherDetails(other);
		
		ObjectMapper mapper = new ObjectMapper();
		
		File superseries = new File("complex1.json");
		
		mapper.writerWithDefaultPrettyPrinter().writeValue(superseries, moviesseries);
		
		
		
		

	}

}
