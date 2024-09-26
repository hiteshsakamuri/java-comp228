public class TestStaticMain {

    public static void main(String[] args) {
        System.out.println(TestStatic.sum(1, 2));
        System.out.println(TestStatic.sum(1, 2, 3));

        System.out.println(TestStatic.multiply(1, 2));
        System.out.println(TestStatic.multiply(1, 2, 3));

        System.out.println(TestStatic.average(1, 2));
        System.out.println(TestStatic.average(1, 2, 3));
    }
}
