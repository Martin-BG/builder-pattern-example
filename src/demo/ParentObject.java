package demo;

public class ParentObject {

    private MyPojo myPojo;

    public MyPojo getMyPojo() {
        return this.myPojo;
    }

    public void setMyPojo(MyPojo myPojo) {
        this.myPojo = myPojo;
    }

    @Override
    public String toString() {
        return "ParentObject{" + "myPojo=" + myPojo + '}';
    }
}
