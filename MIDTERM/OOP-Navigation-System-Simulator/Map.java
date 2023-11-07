public class Map{
    private Route startingPosition;
    public Map(){
        Route start = new Route("(Start) Cebu City", 0);
        Route route1 = new Route("Route 1: Mingla", 14.2);
        Route route2 = new Route("Route 2: San Fernando", 12.5);
        Route route3 = new Route("Route 3: Carcar", 10.3);

        Route route41 = new Route("Route 4.1: Barili", 17.5);
        Route route411 = new Route("    Route 4.1.1: Dumanjug", 17.5);
        Route route412 = new Route("    Route 4.1.2: Alcantara", 10.8);
        Route routeEnd1 = new Route("(End) Moalboal", 2.1);
        
        Route route42 = new Route("Route 4.2: Sibonga", 14.2);

        Route route421 = new Route("    Route 4.2.1: Dumanjug", 32.1);
        Route route422 = new Route("    Route 4.2.2: Alcantara", 10.8);
        Route routeEnd2 = new Route("(End) Moalboal", 2.1);

        Route route5 = new Route("Route 5: Argao", 27.4);
        Route route51= new Route("Route 5.1:  Ronda", 21.4);
        Route route52 = new Route("Route 5.2: Alcantara", 13);
        Route routeEnd3 = new Route("(End) Moalboal", 13.7);

        //setting up paths
        start.setLeftRoute(route1);
        route1.setLeftRoute(route2);
        route2.setLeftRoute(route3);

        route3.setLeftRoute(route41);
        route3.setRightRoute(route42);

        route41.setLeftRoute(route411);
        route411.setLeftRoute(route412);
        route412.setLeftRoute(routeEnd1);

        route42.setLeftRoute(route421);
        route42.setRightRoute(route5);

        route421.setLeftRoute(route422);
        route422.setLeftRoute(routeEnd2);

        route5.setRightRoute(route51);
        route51.setRightRoute(route52);
        route52.setRightRoute(routeEnd3);

        this.startingPosition = start;
    }

    public Route getStartingPosition(){
        return startingPosition;
    }

    // public void showRoutes(Route start){
    //     Route n = start;
    //     System.out.print(n.getPlaceName() + " -- ");

    //     if(n.getLeftRoute() == null && n.getRightRoute() == null){
    //         return;
    //     }

    //     if(n.getLeftRoute() != null){
    //         showRoutes(n.getLeftRoute());
    //     }

    //     if(n.getRightRoute() != null){
    //         showRoutes(n.getRightRoute());
    //     }

    // }
}