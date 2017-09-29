package pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sziszka on 2017.09.29..
 */
public class Logic {

    public static ArrayList<Location> locs = new ArrayList();

    public List<Location> sequence(Location... locations) throws Exception {
        List<Location> locationsList = Arrays.asList(locations);

        List<Location> result = new ArrayList<Location>();
        while (locs.size() > result.size()) {
            for (Location l : locationsList) {
                if (hasLoop(l)) {
                    throw new Exception("Loop detected");
                } else if (!result.contains(l)) {
                    if (l.getBefore() == null) {
                        result.add(0, l);
                    } else {
                        for (int i = 0; i < result.size(); i++) {
                            if (l.getBefore().equals(result.get(i))) {
                                result.add(i + 1, l);
                                break;
                            }
                        }
                    }
                }
            }

        }
        return result;
        }


    public boolean hasLoop(Location location) {
        Location slow = location;
        Location fast = location;
        while(fast != null && fast.getBefore()!= null) {

                slow = slow.getBefore();
                fast = fast.getBefore().getBefore();

                if(slow.equals(fast)){
                    return true;
            }
        }
        return false;

    }

}
