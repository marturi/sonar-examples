package example;

public class HelloWorld implements Cloneable {

    public void coveredByUnitTest() {
        System.out.println("coveredByUnitTest1");
        System.out.println("coveredByUnitTest2");
    }

    public void coveredByIntegrationTest() {
        System.out.println("coveredByIntegrationTest1");
        System.out.println("coveredByIntegrationTest2");
        System.out.println("coveredByIntegrationTest3");
    }

    public void notCovered() {
        System.out.println("notCovered");
    }

    public void morenotCovered() {
        System.out.println("morenotCovered");
    }

    public void morenotCovered2() {
        System.out.println("morenotCovered");
    }

    public void morenotCovered3() {
        System.out.println("morenotCovered");
    }
}
