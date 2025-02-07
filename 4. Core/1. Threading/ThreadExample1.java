public class ThreadExample1 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        // FIRST TASKS...
        for(int i=1;i<=100;i++) {
            System.out.printf("%d* ",i);
        }
        System.out.printf("\n* task is complete.\n");
        // SECOND TASKS....
        for(int i=1;i<=100;i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.printf("\n* task is complete.\n");
        // THIRD TASKS.....
        for(int i=1;i<=100;i++) {
            System.out.printf("%d# ",i);
        }
        System.out.printf("\n* task is complete.\n");
        long endTime=System.currentTimeMillis();
        System.out.printf("Total time is taken: %d",(endTime-startTime));
    }
}
