package demo;

public class MyPojo {

    private Boolean indicatorI;
    private Boolean indicatorJ;
    private Boolean indicatorK;

    public Boolean getIndicatorI() {
        return this.indicatorI;
    }

    public void setIndicatorI(Boolean indicatorI) {
        this.indicatorI = indicatorI;
    }

    public Boolean getIndicatorJ() {
        return this.indicatorJ;
    }

    public void setIndicatorJ(Boolean indicatorJ) {
        this.indicatorJ = indicatorJ;
    }

    public Boolean getIndicatorK() {
        return this.indicatorK;
    }

    public void setIndicatorK(Boolean indicatorK) {
        this.indicatorK = indicatorK;
    }

    @Override
    public String toString() {
        return "MyPojo{" +
                "indicatorI=" + indicatorI +
                ", indicatorJ=" + indicatorJ +
                ", indicatorK=" + indicatorK +
                '}';
    }
}
