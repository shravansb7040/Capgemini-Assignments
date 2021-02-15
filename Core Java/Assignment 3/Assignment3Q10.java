package JavaFiles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Assignment3Q10 {
	static Assignment3Q10 answer=new Assignment3Q10();
    
    public static ArrayList<MovieDetails> details= new ArrayList<> ();
    
    static Scanner scan= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Enter the number of movies to be added : ");
        int number=scan.nextInt();

        for (int j=0;j<number;j++){

            System.out.print("Enter the name of movie     : ");
            String movieName=scan.next();
            
            System.out.print("Enter the name of actor     : ");
            String actorName=scan.next();

            System.out.print("Enter the name of actress   : ");
            String actressName=scan.next();

            System.out.print("Enter the genre of movie    : ");
            String genre=scan.next();

            details.add(new MovieDetails(movieName,actorName,actressName,genre));
        }
        
        printSortedMovieList(details);
       
        System.out.print("\nIf you wish to add a movie then type 'add' \tor\nIf you wish to remove a movie then type 'remove' \tor\nIf you want to find a movie then type 'search' : ");
        String response=scan.next();
        
        while(!response.equals("no"))
        {
        	if (response.equals("add")) {
            	System.out.print("Enter the name of movie     : ");
                String movieName=scan.next();
                
                System.out.print("Enter the name of actor     : ");
                String actorName=scan.next();

                System.out.print("Enter the name of actress   : ");
                String actressName=scan.next();

                System.out.print("Enter the genre of movie    : ");
                String genre=scan.next();

                details.add(new MovieDetails(movieName,actorName,actressName,genre));
                break;
                }
             
            if (response.equals("remove")) {
                System.out.print("enter the movieName : ");
                String man=scan.next();
                answer.removeMovies(man);
                break;
                }
            
            if (response.equals("search")) {
                System.out.print("enter the movieName : ");
                String man=scan.next();
                answer.find_movie_By_mov_Name(man);
                break;
                }
        }
        printSortedMovieList(details);
                
    }

    public static void sort(ArrayList<MovieDetails> movieDetails,Comparator<MovieDetails> movieDetailsComparator){
        movieDetails.stream().sorted(movieDetailsComparator).forEach(e -> System.out.println(e));
        
    }

    public static void printSortedMovieList(ArrayList<MovieDetails> movieDetails){

        Comparator<MovieDetails> com = new Comparator<MovieDetails>() {
            public int compare(MovieDetails a, MovieDetails b) { return a.getMovieName().compareTo(b.getMovieName());}
        };
        
        sort(movieDetails,com);
    }
      
    public void addMovie(MovieDetails movie) 
    {
    	details.add(movie);
    }
    
    public void removeMovies(String movieName) 
    {
        details.removeIf(t -> t.getMovieName().equals(movieName));
    }

    public void removeAllMovies(List<MovieDetails> movies) {
        for(MovieDetails s :movies) 
        {
        	removeMovies(s.getMovieName());
        }
    }

    public MovieDetails find_movie_By_mov_Name(String movieName) {
        MovieDetails s= details.stream().filter(c -> c.getMovieName().equals(movieName)).findAny().get();
        return s;
    }

    public List<MovieDetails> find_movie_By_Genre(String genre) {
        List<MovieDetails> l = new ArrayList<>(); 
        details.stream().filter(c -> c.getGenre().equals(genre)).forEach(e -> l.add(e));
        return l;
    }

    public static Comparator<MovieDetails> sortAccordingly(String sortBy) {
        Comparator<MovieDetails> comp = new Comparator<MovieDetails>() {
           public int compare(MovieDetails a, MovieDetails b) 
           { 
        	  return a.getMovieName().compareTo(sortBy);
           }
        };  
            return comp;
    }
}


class MovieDetails {
    private String movieName;
    private String actor;
    private String actress;
    private String genre;
    
    
    public MovieDetails(String movieName, String actor, String actress, String genre) {
        super();
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
        this.genre = genre;
    }
    
    
    public String getMovieName() 
    {
    	return movieName;
    }
    
    public String getActor() 
    {
    	return actor;
    }
    
    public String getActress() 
    {
    	return actress;
    }
    
    public String getGenre() 
    {
    	return genre;
    }
    
    public void setMovieName(String movieName) 
    {
    	this.movieName = movieName;
    }
    
    public void setActor(String actor) 
    {
    	this.actor = actor;
    }
    
    public void setActress(String actress) 
    {
    	this.actress = actress;
    }
    
    public void setGenre(String genre) 
    {
    	this.genre = genre;
    }
    
    public String toString()
    { 
    	return "MovieName: "+this.movieName+"  Actor: "+this.actor+"  actress: "+this.actress+"  genre: "+this.genre+"  ";
    }

}