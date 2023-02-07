package booking;

public class MovieTicketServer {
	private int availableSeats;
	private String movieName;

	public MovieTicketServer(String movieName, int availableSeats) {
		this.availableSeats = availableSeats;
		this.movieName = movieName;
	}

	public void bookTicket(String customerName, int numberOfSeats) {
		System.out.println("Hi," + customerName + " : " + availableSeats + " : Seats available for " + movieName);

		if ((availableSeats - numberOfSeats) < 0) {
			System.out.println("Hi," + customerName + " : Seats not available for " + movieName);
			return;
		}

		availableSeats -= numberOfSeats;
		System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for" + movieName);
	}
}
