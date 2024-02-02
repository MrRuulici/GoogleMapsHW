
public class FootTripOption implements TripOption {

	@Override
	public double calculateDuration(double distance) {
		 double speed = 6;
	        double breakInterval = 30;
	        double breakDuration = 30 / 60.0;

	        double totalDuration = 0;
	        double remainingDistance = distance;

	        while (remainingDistance > 0) {
	            totalDuration += Math.min(breakDuration, remainingDistance / speed);
	            remainingDistance -= breakInterval;
	        }

	        return totalDuration;
	}

}
