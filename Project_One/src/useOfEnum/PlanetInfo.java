package useOfEnum;



public class PlanetInfo {
    Planet planet;

    public PlanetInfo(Planet planet){
        this.planet=planet;
            }

     public void planetInfo(){
        switch(planet){
             case MERCURY:
                 System.out.println("I am Mercury");
                 break;
            case VENUS:
                System.out.println("I am Venus");
                break;
            case EARTH:
                System.out.println("I am Beautiful Earth");
                break;
            case MARS:
                System.out.println("I am Mars, Come and Explore");
                break;
            case JUPITER:
                System.out.println("I am Jupiter");
                break;
            case URANUS:
                System.out.println("I am Uranus");
                break;
            case SATURN:
                System.out.println("I am Saturn");
                break;
            case NEPTUNE:
                System.out.println("I am Neptune");
                break;
         }
    }
     //  MERCURY, VENUS, EARTH, MARS, JUPITER,
     // SATURN, URANUS, NEPTUNE
    public static void main(String[] args) {
        PlanetInfo planet1 = new PlanetInfo(Planet.MERCURY);
        planet1.planetInfo();
        PlanetInfo planet2 = new PlanetInfo(Planet.VENUS);
        planet2.planetInfo();
    }


}


