package demo;

/**
 * Builds a {@link MyPojo} instance and attach it to the provided {@link ParentObject} instance.
 * This matches the requirements on the question at StackOverflow, but builder could be easily extended
 * to create the {@link ParentObject} instance by itself and return it instead.
 *
 * @see <a href="https://stackoverflow.com/q/58509357/7598851">Original StackOverflow question</a>
 */
public class MyPojoBuilder {

    private boolean indicatorI;
    private boolean indicatorJ;
    private boolean indicatorK;
    private ParentObject parentObject;

    private MyPojoBuilder(ParentObject parentObject) {
        this.parentObject = parentObject;
    }

    public static MyPojoBuilder withParentObject(ParentObject parentObject) {
        return new MyPojoBuilder(parentObject);
    }

    public MyPojoBuilder withIndicatorI() {
        indicatorI = true;
        return this;
    }

    public MyPojoBuilder withIndicatorJ() {
        indicatorJ = true;
        return this;
    }

    public MyPojoBuilder withIndicatorK() {
        indicatorK = true;
        return this;
    }

    public void build() {
        if (!indicatorI && !indicatorJ && !indicatorK) {
            // Throw some exception instead???
            return;
        }

        if (parentObject == null) {
            throw new IllegalStateException("ParentObject cannot be null");
        }

        MyPojo myPojo = new MyPojo();

        if (indicatorI) {
            myPojo.setIndicatorI(true);
        }

        if (indicatorJ) {
            myPojo.setIndicatorJ(true);
        }

        if (indicatorK) {
            myPojo.setIndicatorK(true);
        }

        parentObject.setMyPojo(myPojo);
    }
}
