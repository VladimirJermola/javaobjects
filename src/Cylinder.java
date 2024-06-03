import java.util.Random;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder() {
        Random random = new Random();
        double radius_random = random.nextDouble() * 100;
        double height_random = random.nextDouble() * 100;
        String radius_string = String.format("%.2f", radius_random);
        String height_string = String.format("%.2f", height_random);
        radius_string = radius_string.replace(",",".");
        height_string = height_string.replace(",",".");
        radius = Double.parseDouble(radius_string);
        height = Double.parseDouble(height_string);
    }

    public double calculateTotalSurface() {
        //double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius ;
        return (2.0 * Math.PI * radius * radius + 2.0 * Math.PI * radius * height) ;
    }

    public double calculateLateralSurface() {
        //double surfaceArea = 4.0 * Math.PI * radius * radius ;
        return 2.0 * Math.PI * radius * height;
    }

    public  double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}
