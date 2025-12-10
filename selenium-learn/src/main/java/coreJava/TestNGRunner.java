package coreJava;

public class TestNGRunner {
    public static void main(String[] args) {
        // Programmatically run TestNG tests so you can run this class as a Java application.
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[] { Childclass.class, ParentClass.class });
        testng.run();
    }
}
