package demo;

public class Main {

    public static void main(String[] args) {

        ParentObject parentObjectWithIndicatorI = new ParentObject();

        MyPojoBuilder.withParentObject(parentObjectWithIndicatorI)
                .withIndicatorI()
                .build();

        System.out.println(parentObjectWithIndicatorI);


        ParentObject parentObjectWithIndicatorIAndK = new ParentObject();

        MyPojoBuilder.withParentObject(parentObjectWithIndicatorIAndK)
                .withIndicatorI()
                .withIndicatorK()
                .build();

        System.out.println(parentObjectWithIndicatorIAndK);


        ParentObject parentObjectWithIndicatorIAndJAndK = new ParentObject();

        MyPojoBuilder.withParentObject(parentObjectWithIndicatorIAndJAndK)
                .withIndicatorI()
                .withIndicatorJ()
                .withIndicatorK()
                .build();

        System.out.println(parentObjectWithIndicatorIAndJAndK);
    }
}
