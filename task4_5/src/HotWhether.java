public abstract class HotWhether implements Whether {
    private int ultravioletLight;
    boolean cloud;

    public HotWhether(int ultravioletLight, boolean cloud) {
        this.ultravioletLight = ultravioletLight;
        this.cloud = cloud;
    }

    @Override
    public String toString() {
        return "HotWhether{" +
                "ultravioletLight=" + ultravioletLight +
                ", cloud=" + cloud +
                '}';
    }

    public void setUltravioletLight(int ultravioletLight) {
        this.ultravioletLight = ultravioletLight;
    }

    public void setCloud(boolean cloud) {
        this.cloud = cloud;
    }

    public int getUltravioletLight() {
        return ultravioletLight;
    }

    public boolean isCloud() {
        return cloud;
    }
}
