
public class Client {

	public static void main(String[] args) {
		 double distance = 150;

	        TripOption carTrip = new CarTripOption();
	        TripOption bikeTrip = new BikeTripOption();
	        TripOption footTrip = new FootTripOption();

	        System.out.println("Car Trip: " + simulateTrip(carTrip, distance));
	        System.out.println("Bike Trip: " + simulateTrip(bikeTrip, distance));
	        System.out.println("Foot Trip: " + simulateTrip(footTrip, distance));
	    }

	    private static String simulateTrip(TripOption tripOption, double distance) {
	        double duration = tripOption.calculateDuration(distance);
	        return String.format("Estimated duration of the trip: %.2f hours", duration);
	    }

	}
