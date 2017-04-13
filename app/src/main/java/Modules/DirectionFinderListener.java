package Modules;

import java.util.List;

/**
 * Created by Ussef on 3/13/2017.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}