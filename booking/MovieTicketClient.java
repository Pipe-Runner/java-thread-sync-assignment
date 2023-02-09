package booking;

public class MovieTicketClient extends Thread {
	private MovieTicketServer movieTicketServer;
	private String customerName;
	private int noOfSeatsToBook;

	public MovieTicketClient(MovieTicketServer movieTicketServer,String customerName, int noOfSeatsToBook) {
		this.movieTicketServer = movieTicketServer;
		this.customerName = customerName;
		this.noOfSeatsToBook = noOfSeatsToBook;
	}
	
	public void run() {
		movieTicketServer.bookTicket(customerName, noOfSeatsToBook);
	}
}