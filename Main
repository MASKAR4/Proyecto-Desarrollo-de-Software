public class Main {
    public static void main(String[] args) {
        Map map = new Map();

        MapPoint point1 = new MapPoint(42.36, -71.06);
        MapPoint point2 = new MapPoint(37.77, -122.41);

        map.addPoint(point1);
        map.addPoint(point2);

        System.out.println(map);

        MapMarkerManager markerManager = new MapMarkerManager();

        MapMarker marker1 = new MapMarker(point1, "Marker 1");
        MapMarker marker2 = new MapMarker(point2, "Marker 2");

        markerManager.addMarker(marker1);
        markerManager.addMarker(marker2);

        System.out.println(markerManager);
    }
}
