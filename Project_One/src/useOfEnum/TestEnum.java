package useOfEnum;

public class TestEnum {

    public static void main(String[] args) {
        Week w = new Week(Day.FRIDAY);
        w.taskToDO();

        Year month = new Year(Month.JANUARY);
        month.monthName();

    }
}
