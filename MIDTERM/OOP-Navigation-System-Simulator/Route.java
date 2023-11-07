public class Route{
    private String placeName;
    private double distance;
    private Route leftRoute;
    private Route rightRoute;

    public Route(String placeName, double distance){
        this.placeName = placeName;
        this.distance = distance;
    }

    public String getPlaceName(){
        return placeName;
    }

    public double getDistance(){
        return distance;
    }

    public Route getLeftRoute(){
        return leftRoute;
    }
    
    public Route getRightRoute(){
        return rightRoute;
    }

    public void setLeftRoute(Route leftRoute){
        this.leftRoute = leftRoute;
    }
    public void setRightRoute(Route rightRoute){
        this.rightRoute = rightRoute;
    }

}