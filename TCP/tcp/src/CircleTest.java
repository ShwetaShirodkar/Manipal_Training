public class CircleTest {
    public static void main(String[] args) {
        double centerx = 0;
        double centery = 0;
        double radius = 5;
        double pointx = 3;
        double pointy = 4;
        
        double distance = Math.sqrt(Math.pow((pointx - centerx), 2) + Math.pow((pointy - centery), 2));
        
        if (distance < radius) {
            System.out.println("Point is inside the circle.");
        } else if (distance == radius) {
            System.out.println("Point is on the circumference of the circle.");
        } else {
            System.out.println("Point is outside the circle.");
        }
    }
}
