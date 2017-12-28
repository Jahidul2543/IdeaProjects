package useOfEnum;

public class Year {
     Month month;
     public Year(Month month){
         this.month = month;
     }

    public  void monthName(){


        switch (month) {
            case JANUARY:
                System.out.println("This is January");
                break;
            case FEBRUARY:
                System.out.println("This is February");
                break;
            case MARCH:
                System.out.println("This is March");
                break;
            case APRIL:
                System.out.println("This is April");
                break;
            case MAY:
                System.out.println("This is May");
                break;
            case JUNE:
                System.out.println("This is June");

                 break;
            case JULY:
                System.out.println("This is July");
                break;
            case AUGUST:
                System.out.println("This is August");
                break;
            case OCTOBER:
                System.out.println("This is october");
                break;
            case NOVEMBER:
                System.out.println("This is November");
                break;
            case DECEMBER:
                System.out.println("This is December");
                break;

        }

    }
}
