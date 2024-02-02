
public class BikeTripOption implements TripOption {

	@Override
	public double calculateDuration(double distance) {
		double speed = 30;
        double breakInterval = 100; 
        double breakDuration = 10 / 60.0; 

        double totalDuration = 0;
        double remainingDistance = distance;

        while (remainingDistance > 0) {
            totalDuration += Math.min(breakDuration, remainingDistance / speed);
            remainingDistance -= breakInterval;
        }

        return totalDuration;
	}

}
