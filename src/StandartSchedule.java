//Prototype
interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
}

class StandardSchedule implements MovieSchedule {
    private String movie;
    private String time;

    public void setMovie(String movie) {
        this.movie = movie;
    }

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

    public void showSchedule() {
        System.out.println("Movie: " + movie + " at " + time);
    }
}
