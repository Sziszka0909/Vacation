package pack;

/**
 * Created by sziszka on 2017.09.29..
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Location newYork = new Location("NewYork");
        Location paris = new Location("Paris");
        Location london = new Location("London");
        Location miskolc = new Location("Miskolc");
        Location prague = new Location("Prague");
        Location madrid = new Location("Madrid");
        newYork.setBefore(london);
        london.setBefore(paris);
        paris.setBefore(miskolc);
        madrid.setBefore(prague);
        Logic logic = new Logic();
        System.out.println(logic.sequence(london, paris, newYork, miskolc, prague, madrid));
    }


}
