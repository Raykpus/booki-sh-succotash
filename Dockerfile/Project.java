public class Project {
    public  Project() {
    }
    public static void main(String[] arge) {
        System.out.println("Hello ;)");


        int day = 4;
        switch (day) {
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
            case 7->System.out.println("Sunday");
            default->System.out.println("It's Weekend!");
        }
        int i = 0;
        do {
            System.out.println(i);
            ++i;
        }while(i < 10);

    }

}
