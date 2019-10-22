package demo;

public class Main {

    public static void main(String[] args) {

        ParentObject parentObjectWithIndicatorI = new ParentObject();

        MyPojoBuilder.withParentObject(parentObjectWithIndicatorI)
                .withIndicatorI(true)
                .build();

        System.out.println(parentObjectWithIndicatorI);


        ParentObject parentObjectWithIndicatorIAndK = new ParentObject();

        MyPojoBuilder.withParentObject(parentObjectWithIndicatorIAndK)
                .withIndicatorI(true)
                .withIndicatorK(false)
                .build();

        System.out.println(parentObjectWithIndicatorIAndK);


        ParentObject parentObjectWithIndicatorIAndJAndK = new ParentObject();

        MyPojoBuilder.withParentObject(parentObjectWithIndicatorIAndJAndK)
                .withIndicatorI(false)
                .withIndicatorJ(true)
                .withIndicatorK(true)
                .build();

        System.out.println(parentObjectWithIndicatorIAndJAndK);
    }
}
