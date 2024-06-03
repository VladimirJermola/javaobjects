import java.util.Random;

public class Sphere {
    private double radius;

    public Sphere() {
        Random random = new Random();
        double radius_random = random.nextDouble() * 100;
        String radius_string = String.format("%.2f", radius_random);
        radius_string = radius_string.replace(",",".");
        radius = Double.parseDouble(radius_string);
    }

    public double calculateVolume() {
        //double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius ;
        return (4.0 / 3.0) * Math.PI * radius * radius * radius ;
    }

    public double calculateSurfaceArea() {
        //double surfaceArea = 4.0 * Math.PI * radius * radius ;
        return 4.0 * Math.PI * radius * radius ;
    }

    public  double calculateCircumference() {
        return 2.0 * Math.PI * radius ;
    }

    public double getRadius() {
        return radius;
    }
}


