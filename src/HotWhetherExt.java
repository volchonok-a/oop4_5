public class HotWhetherExt extends HotWhether{
    private String month;

    public HotWhetherExt(int ultravioletLight, boolean cloud, String month) {
        super(ultravioletLight, cloud);
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "HotWhetherExt{" +
                "month='" + month + '\'' +
                ", ultravioletLight=" + getUltravioletLight() +
                ", cloud=" + cloud +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Давление не в норме");
    }
}
