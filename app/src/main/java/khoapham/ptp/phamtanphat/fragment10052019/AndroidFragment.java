package khoapham.ptp.phamtanphat.fragment10052019;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AndroidFragment extends Fragment {

    TextView txtAndroid;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_android, container, false);
        txtAndroid = view.findViewById(R.id.textviewAndroid);

        Bundle bundle = getArguments();
        String value = bundle.getString("text");
        txtAndroid.setText(value);
        return view;
    }

}
