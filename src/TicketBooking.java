// Builder
public class TicketBooking {
    private String movieTitle, seatNumber, snackCombo;

    public void setMovieTitle(String title) {
        this.movieTitle = title;
    }

    public void setSeatNumber(String seat) {
        this.seatNumber = seat;
    }

    public void setSnackCombo(String combo) {
        this.snackCombo = combo;
    }

    public void showDetails() {
        System.out.println("Booking for: " + movieTitle);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Snacks: " + snackCombo);
    }
}

class TicketBookingBuilder {
    private final TicketBooking booking;

    public TicketBookingBuilder() {
        booking = new TicketBooking();
    }

    public TicketBookingBuilder setMovieTitle(String title) {
        booking.setMovieTitle(title);
        return this;
    }

    public TicketBookingBuilder setSeatNumber(String seat) {
        booking.setSeatNumber(seat);
        return this;
    }

    public TicketBookingBuilder setSnackCombo(String combo) {
        booking.setSnackCombo(combo);
        return this;
    }

    public TicketBooking build() {
        return booking;
    }
}


