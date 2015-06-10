package app.comdev_sobo.httpsgithub.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ArrayList<String> arrayList = new ArrayList(7);
        arrayList.add("Today-Sunny-88/63");
        arrayList.add("Tomorrow-Foggy-70/46");
        arrayList.add("Weds-Cloudy-72/63");
        arrayList.add("Thurs-Rainy-64/51");
        arrayList.add("Fri-Foggy-70/46");
        arrayList.add("Sat-Sunny-76/68");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_view, arrayList);


        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
