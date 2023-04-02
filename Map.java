import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<MapPoint> points;

    public Map() {
        points = new ArrayList<>();
    }

    public void addPoint(MapPoint point) {
        points.add(point);
    }

    public List<MapPoint> getPoints() {
        return points;
    }

    public void setPoints(List<MapPoint> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Map:\n");
        for (MapPoint point : points) {
            sb.append(point.toString() + "\n");
        }
        return sb.toString();
    }
}
