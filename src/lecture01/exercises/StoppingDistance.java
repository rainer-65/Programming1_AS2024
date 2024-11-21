package lecture01.exercises;

public class StoppingDistance {
    public static void main(String[] args) {
        double velocity = 100.0f;

        double transform = 3.6f;

        double mps = velocity / transform;
        System.out.println(mps);

        double reactionTime = 0.3f;
        double reactionDistance = mps * reactionTime;
        System.out.println(reactionDistance);

        double frictionFactor = 16.0f;
        double breakingDistance = mps*mps / frictionFactor;
        System.out.println(breakingDistance);

        double totalStoppingDistance = reactionDistance + breakingDistance;
        System.out.println((int) totalStoppingDistance);
    }
}
