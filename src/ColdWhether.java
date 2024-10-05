public abstract class ColdWhether implements WhetherInt {
    private double winter;
    boolean run;

    public ColdWhether(double winter, boolean run) {
        this.winter = winter;
        this.run = run;
    }

    @Override
    public String toString() {
        return "ColdWhether{" +
                "winter=" + winter +
                ", run=" + run +
                '}';
    }

    public double getWinter() {
        return winter;
    }

    public void setWinter(double winter) {
        this.winter = winter;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    @Override
    public void info() {
        System.out.println("Давление в норме");
    }

}
