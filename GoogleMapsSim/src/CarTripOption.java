
public class CarTripOption implements TripOption {

	@Override
	public double calculateDuration(double distance) {
		double speed = 60;
        return distance / speed;
	}

}
