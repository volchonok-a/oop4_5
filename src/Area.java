
public class Area {
    private double width;
    private double longitude;
    private AreaEnum area;
    private WhetherInt whether;
    public Area(double width, double longitude, AreaEnum area, WhetherInt whether) {
        this.width = width;
        this.longitude = longitude;
        this.area = area;
        this.whether = whether;
    }

    public double getWidth () {
        return width;
    }
    public double getLongitude() {
        return longitude;
    }

    public AreaEnum getArea() {
        return area;
    }

    public WhetherInt getWhether() {
        return whether;
    }

    public double setWidth(double width) {
        this.width = width;
        return width;

    }

    public double setLongitude(double longitude) {
        this.longitude = longitude;
        return longitude;

    }
    public void setArea(AreaEnum area) {
        this.area = area;
    }

    public void setWhether(WhetherInt whether) {
        this.whether = whether;
    }

    public String toWrite() {
        String result = String.valueOf(getArea());
        return result;
    }

}

