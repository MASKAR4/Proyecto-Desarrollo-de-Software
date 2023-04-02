public class MapMarker {
    private MapPoint location;
    private String label;

    public MapMarker(MapPoint location, String label) {
        this.location = location;
        this.label = label;
    }

    public MapPoint getLocation() {
        return location;
    }

    public void setLocation(MapPoint location) {
        this.location = location;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label + ": " + location.toString();
    }
}
