package CodeLab;

/*
Write the definition of a class WeatherForecast that provides the following behavior (methods):

        A method called setSkies that has one parameter, a String.
        A method called setHigh that has one parameter, an int.
        A method called setLow that has one parameter, an int.

        A method called getSkies that has no parameters and that returns the value that was
        last used as an argument in setSkies.
        A method called getHigh that has no parameters and that returns the value that was last
        used as an argument in setHigh.
        A method called getLow that has no parameters and that returns the value that was last
        used as an argument in setLow.

        No constructor need be defined. Be sure to define instance variables as needed by
        your "get"/"set" methods-- initialize all numeric variables to 0 and any String variables to the empty string.
*/

public class WeatherForcast {
    String str1 = "";
    int intHigh = 0;
    int intLow = 0;

    public void setSkies(String str1) {
        this.str1 = str1;
    }

    public void setHigh(int intHigh) {
        this.intHigh = intHigh;
    }

    public void setLow(int intLow) {
        this.intLow = intLow;
    }

    public String getSkies() {
        return str1;
    }

    public int getHigh() {
        return intHigh;
    }

    public int getLow() {
        return intLow;
    }


   /* Write the definition of a class Player containing:

    An instance variable name of type String, initialized to the empty String.
    An instance variable score of type int, initialized to zero.
    A method called setName that has one parameter, whose value it assigns to the instance variable name.
    A method called setScore that has one parameter, whose value it assigns to the instance variable score.
    A method called getName that has no parameters and that returns the value of the instance variable name.
    A method called getScore that has no parameters and that returns the value of the instance variable score.
    No constructor need be defined.*/

    public class Player {
        String name = "";
        int score = 0;

        public void setName(String name) {
            this.name = name;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }
    /*Write the definition of a class ContestResult containing:

    An instance variable winner of type String, initialized to the empty String.
    An instance variable secondPlace of type String, initialized to the empty String.
    An instance variable thirdPlace of type String, initialized to the empty String.

    A method called setWinner that has one parameter, whose value it assigns to the instance variable winner.
    A method called setSecondPlace that has one parameter, whose value it assigns to the instance variable secondPlace.
    A method called setThirdPlace that has one parameter, whose value it assigns to the instance variable thirdPlace.

    A method called getWinner that has no parameters and that returns the value of the instance variable winner.
    A method called getSecondPlace that has no parameters and that returns the value of the instance variable secondPlace.
    A method called getThirdPlace that has no parameters and that returns the value of the instance variable thirdPlace.
    No constructor need be defined.*/

    public class ContestResult {
        String winner = "";
        String secondPlace = "";
        String thirdPlace = "";

        public void setWinner(String winner) {
            this.winner = winner;
        }

        public void setSecondPlace(String secondPlace) {
            this.secondPlace = secondPlace;
        }

        public void setThirdPlace(String thirdPlace) {
            this.thirdPlace = thirdPlace;
        }

        public String getWinner() {
            return winner;
        }

        public String getSecondPlace() {
            return secondPlace;
        }

        public String getThirdPlace() {
            return thirdPlace;
        }
    }
/*    Write the definition of a class PlayListEntry containing:

    An instance variable title of type String, initialized to the empty String.
    An instance variable artist of type String, initialized to the empty String.
    An instance variable playCount of type int, initialized to 0.
    In addition, your PlayList class definition should provide an appropriately
                            named "get" method and "set" method for each of these.
    No constructor need be defined.*/

    public class PlayListEntry {
        private String title = "";
        private String artist = "";
        private int playCount = 0;

        public void setTitle(String title) {
            this.title = title;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getPlayCount() {
            return playCount;
        }
    }
   /* Write the definition of a class Counter containing:

    An instance variable counter of type int, initialized to 0.
    A method called increment that adds one to the instance variable counter. It does not accept parameters or return a value.
    A method called getValue that doesn't accept any parameters. It returns the value of the instance variable counter.*/

    public class Counter {

        int counter = 0;

        public void increment() {
            counter++;
        }

        public int getValue() {
            return counter;
        }
    }
/*    Write a class named Accumulator containing:

    An instance variable named sum of type int, initialized to 0.
    A method named getSum that returns the value of sum.
    A method named add that accepts an int parameter. The value of sum is increased by the value of the parameter.*/

    public class Accumulator {
        private int sum;


        public int getSum() {
            return sum;
        }

        public void add(int parameter) {
            sum += parameter;
        }
    }

    /*
        Write a class named Averager containing:

        An instance variable named sum of type int, initialized to 0.
        An instance variable named count of type int, initialized to 0.

        A method named getSum that returns the value of sum.

        A method named add that accepts an int parameter. The value of sum is increased by the value
         of the parameter and the value of count is incremented by one.
        A method named getCount that accepts no parameters. getCount returns
         the value of the count instance variable, that is, the number of values added to sum.
        A method named getAverage that accepts no parameters. getAverage returns the average
         of the values added to sum. The value returned should be a value of type double
          (and therefore you must cast the instance variables to double prior to performing the division).
    */
    /*Write a class named Averager containing:

    An instance variable named sum of type int, initialized to 0.
    An instance variable named count of type int, initialized to 0.
    A method named getSum that returns the value of sum.
    A method named add that accepts an int parameter. The value of sum is
     increased by the value of the parameter and the value of count is incremented by one.
    A method named getCount that accepts no parameters. getCount returns the value of the
    count instance variable, that is, the number of values added to sum.
    A method named getAverage that accepts no parameters. getAverage returns the average
     of the values added to sum. The value returned should be a value of type double
     (and therefore you must cast the instance variables to double prior to performing the division).
    */
    public class Averager{
        private  int sum = 0;
        private  int count = 0;



    }





}





