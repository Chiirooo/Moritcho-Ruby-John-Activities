import java.util.Scanner;
public class RouteMap {
    private Route start;
    private Map map;
    private Scanner scan;
    private StringBuilder traveledPath;
    private double distanceTraveled;

    public RouteMap(){
        this.map = new Map();
        this.start = map.getStartingPosition();
        this.scan = new Scanner(System.in);
        this.traveledPath = new StringBuilder();
        this.distanceTraveled = 0.0;
    }

    public void startTravel(double speed){
        if(start == null) return;
        findRoutes(start);
        traveledPath.append(String.format("\n\n- Distance: (%.1f km)", distanceTraveled) );
        traveledPath.append(String.format("\n- Speed: %.1f km/h", speed));
        traveledPath.append("\n- ETA: " + calculateTime(distanceTraveled, speed));
        System.out.println("\n\n------TRAVEL SUMMARY------\n" + traveledPath.toString());
    }

    public void findRoutes(Route route){
        String currentPath = "      " + route.getPlaceName();
        traveledPath.append("\n" + currentPath);
        distanceTraveled += route.getDistance();
        System.out.print(currentPath.trim());
        if(noRoutesAhead(route)) return;
        if(crossRoadsAhead(route)){
            System.out.println("\n\n2 routes found at " + route.getPlaceName());
            int chosenPath = getInput("Choose preferred route\n[1]" + route.getLeftRoute().getPlaceName().trim() + "\n[2]" + route.getRightRoute().getPlaceName().trim() );
            if(chosenPath == 1){
                findRoutes(route.getLeftRoute() );
                return;
            }
            else{
                findRoutes(route.getRightRoute() );
                return;
            }
        }
        System.out.print(" ---> ");
        if( leftRouteIsAvailable(route) ){
            findRoutes(route.getLeftRoute() );
            return;
        }
        if( rightRouteIsAvailable(route) ){
            findRoutes(route.getRightRoute() );
            return;
        }
        return;
    }

    private String calculateTime(double distance, double speed){
        double timeInHours = distance / speed;
        int minutes = (int)(timeInHours * 60);
        int hour = minutes / 60;
        minutes = minutes % 60;
        if(minutes >= 60){
            hour++;
            minutes -= 60;
        }
        return hour + " hr " + minutes + "min";
    }

    //helper methods
    private int getInput(String instructions){
        int choice;
        do{
            System.out.println(instructions);
            choice = scan.nextInt();
        }
        while(choice < 1 || choice > 2);
        return choice;
    }

    private boolean crossRoadsAhead(Route route){
        return (route.getLeftRoute() != null && route.getRightRoute() != null);
    }

    private boolean noRoutesAhead(Route route){
        return (route.getLeftRoute() == null && route.getRightRoute() == null);
    }

    private boolean leftRouteIsAvailable(Route route){
        return route.getLeftRoute() != null;
    }

    private boolean rightRouteIsAvailable(Route route){
        return route.getRightRoute() != null;
    }
    //code by yander
}
