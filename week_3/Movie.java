package week_3;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio){
        this.title = title;
        this.studio = studio;
        rating = "PG";
    }

    public Movie[] getPG(Movie[] movieArr){
        Movie[] pgArr = new Movie[movieArr.length];

        for (int i = 0; i < movieArr.length; i++) {
            if (movieArr[i].rating.equals("PG")) {
                pgArr[i] = movieArr[i];
            }
        }
        return pgArr;
    }
}