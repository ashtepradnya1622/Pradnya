public class nestedloops {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("outerloopstarted");

            for (int j = 1; j < 4-i; j++) {
                System.out.println("innerloop");
            }
            System.out.println("outre loop finshed");
        }
    }
}

