// Singleton
public class CinemaConfig {
    private String cinemaName;
    private static CinemaConfig instance;
    private CinemaConfig() {
        System.out.println("Singleton is Instantiated");
    }

    public static CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String name) {
        this.cinemaName = name;
    }
}
