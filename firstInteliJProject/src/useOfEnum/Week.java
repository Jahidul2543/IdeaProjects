package useOfEnum;

public class Week {
    Day day;
    public Week(Day day){
        this.day = day;

    }
    public void taskToDO(){
        switch(day){
            case MONDAY:
                System.out.println("Continue Reading Data Structure Book");
                break;

            case TUESDAY:
                System.out.println("Work on code lab");
                break;
            case WEDNESDAY:
                System.out.println("Work on home work");
                break;
            case THURSDAY:
                System.out.println("Work on data structure");
                break;
            case FRIDAY:
                System.out.println("continue code lab");
                break;
            case SATURDAY:
                System.out.println("attend class");
                break;
            case SUNDAY:
                System.out.println("attend class 2");
                break;
        }
    }
}
