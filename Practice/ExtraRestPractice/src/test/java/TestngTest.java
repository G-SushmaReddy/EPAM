import org.testng.annotations.Test;

public class TestngTest {

    @Test(groups = {"sanity"})
    public void testing1() {
        System.out.println("sanity 1");
    }

    @Test(groups = {"sanity"})
    public void testing2() {
        System.out.println("sanity 2");
    }

    @Test(dependsOnGroups = {"sanity"})
    public void testing3() {
        System.out.println("depends on groups");
    }

    @Test(dependsOnMethods = {"testing3"})
    public void testing4() {
        System.out.println("sanity 4");
    }
}

