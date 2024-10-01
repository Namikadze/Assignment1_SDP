interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(Movie movie);
    void setTime(String time);
}

class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void setMovie(Movie movie) {
    }

    public void showSchedule() {
        System.out.println("Movie: " + movie + " at " + time);
    }
}
