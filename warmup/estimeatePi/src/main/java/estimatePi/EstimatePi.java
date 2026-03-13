package estimatePi;

public class EstimatePi {
    private static long inside(long trials){
        long c = 0;
        for (long i = 0; i < trials; i++) {
            double x = Math.random();
            double y = Math.random();
            // If we are inside the circle
            if(x * x + y * y < 1){
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        for(int i = 3; i <= 24; i++) {
            long trials = 1 << i;
            long c = inside(trials);
            double estimate = 4.0 * c / trials;
            System.out.println("[Trials] " + trials + " [Error] " + 100.0 * (estimate - Math.PI) / Math.PI + " [Estimate] " + estimate);
        }
    }
}
