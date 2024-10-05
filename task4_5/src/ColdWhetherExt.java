public class ColdWhetherExt extends ColdWhether{
    private String month;

    public ColdWhetherExt(double winter, boolean run, String month) {
        super(winter, run);
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
        return "ColdWhether{" +
                "month='" + month + '\'' +
                ", winter=" + getWinter() +
                ", run=" + run +
                '}';
    }


}
