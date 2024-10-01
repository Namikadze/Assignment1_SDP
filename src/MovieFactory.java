// Factory Method
abstract class Movie {
    protected String title;
    public abstract String getType();

    public String getTitle() {
        return title;
    }
}

class RegularMovie extends Movie {
    public RegularMovie(String title) {
        this.title = title;
    }

    public String getType() {
        return "Regular";
    }
}

abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}

class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}

