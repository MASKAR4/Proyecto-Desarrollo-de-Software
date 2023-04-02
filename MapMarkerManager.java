import java.util.ArrayList;
import java.util.List;

public class MapMarkerManager {
    private List<MapMarker> markers;

    public MapMarkerManager() {
        markers = new ArrayList<>();
    }

    public void addMarker(MapMarker marker) {
        markers.add(marker);
    }

    public List<MapMarker> getMarkers() {
        return markers;
    }

    public void setMarkers(List<MapMarker> markers) {
        this.markers = markers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Markers:\n");
        for (MapMarker marker : markers) {
            sb.append(marker.toString() + "\n");
        }
        return sb.toString();
    }
}
