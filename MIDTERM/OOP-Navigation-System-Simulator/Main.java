import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        RouteMap routeMap = new RouteMap();

        System.out.print("Input speed(km/h): ");
        double speed = scan.nextDouble();

        routeMap.startTravel(speed);
    }
}
