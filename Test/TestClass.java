import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pack.Location;
import pack.Logic;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Created by sziszka on 2017.09.29..
 */
public class TestClass {

    Logic logic = new Logic();

    @Test
    public void test1() throws Exception {
        Location x = new Location("x");
        Location y = new Location("y");
        Location z = new Location("z");

        List<Location> locations = Arrays.asList(z, y, x);

        assertEquals(logic.sequence(x, y, z), locations);
    }

    @Test
    public void test2() throws Exception {
        Location x = new Location("x");
        Location y = new Location("y");
        Location z = new Location("z");

        y.setBefore(z);

        List<Location> locations = Arrays.asList(z, y, x);

        assertEquals(logic.sequence(x, y, z), locations);
    }

    @Test
    public void test3() throws Exception {
        Location x = new Location("x");
        Location y = new Location("y");
        Location z = new Location("z");

        y.setBefore(z);
        z.setBefore(x);

        List<Location> locations = Arrays.asList(x, z, y);

        assertEquals(locations, logic.sequence(x, y, z));
    }
    @BeforeEach
    public void initialization(){
        logic.locs.clear();
    }


}
