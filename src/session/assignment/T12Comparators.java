package session.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class T12Comparators {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		ArrayList<Movie> movie=new ArrayList<Movie>();
		movie.add(new Movie (3,"Nun",1999));
		movie.add(new Movie(4,"Click",1998));
		movie.add(new Movie(5,"Cotafactory",2021));
		movie.add(new Movie(4,"kolkata",2010));
		movie.add(new Movie(4,"SOAW",2012));
		
		for(Movie mv:movie) {
			System.out.println(mv);
		}
		
		System.out.println("=======================");
		
		Collections.sort(movie,new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				
				return o1.name.compareTo(o2.name);
			}
		});
		for(Movie mv:movie) {
			System.out.println(mv.name);
		}
		
		System.out.println("==============");
		
		
		
		int n=s.nextInt();
		switch (n) {
		case 1:
			
			break;

		default:
			break;
		}
	
		
	}

}

class Movie{
	int rating;
	String name;
	int year;
	public Movie(int rating, String name,  int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Rating:  "+rating+"   Name:  "+name+"  Year:  "+year;
	}


}
