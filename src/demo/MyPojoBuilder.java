package demo;

/**
 * Builds a {@link MyPojo} instance and attach it to the provided {@link ParentObject} instance.
 * This matches the requirements on the question at StackOverflow, but builder could be easily extended
 * to create the {@link ParentObject} instance by itself and return it instead.
 *
 * @see <a href="https://stackoverflow.com/q/58509357/7598851">Original StackOverflow question</a>
 */
public class MyPojoBuilder {

    private Boolean indicatorI;
    private Boolean indicatorJ;
    private Boolean indicatorK;
    private ParentObject parentObject;

    private MyPojoBuilder(ParentObject parentObject) {
        this.parentObject = parentObject;
    }

    public static MyPojoBuilder withParentObject(ParentObject parentObject) {
        return new MyPojoBuilder(parentObject);
    }

    public MyPojoBuilder withIndicatorI(Boolean value) {
        indicatorI = value;
        return this;
    }

    public MyPojoBuilder withIndicatorJ(Boolean value) {
        indicatorJ = value;
        return this;
    }

    public MyPojoBuilder withIndicatorK(Boolean value) {
        indicatorK = value;
        return this;
    }

    public void build() {
        if (indicatorI == null && indicatorJ == null && indicatorK == null) {
            // Throw some exception instead???
            return;
        }

        if (parentObject == null) {
            throw new IllegalStateException("ParentObject cannot be null");
        }

        MyPojo myPojo = new MyPojo();
        myPojo.setIndicatorI(indicatorI);
        myPojo.setIndicatorJ(indicatorJ);
        myPojo.setIndicatorK(indicatorK);

        parentObject.setMyPojo(myPojo);
    }
}
