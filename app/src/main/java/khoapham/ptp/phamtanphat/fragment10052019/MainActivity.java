package khoapham.ptp.phamtanphat.fragment10052019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAddFragmentAndroid,btnAddFragmentPhp;
    FragmentManager fragmentManager = getSupportFragmentManager();;
    Fragment fragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAddFragmentAndroid = findViewById(R.id.buttonAddFragmentAndroid);
        btnAddFragmentPhp = findViewById(R.id.buttonAddFragmentPhp);

        btnAddFragmentPhp.setOnClickListener(MainActivity.this);
        btnAddFragmentAndroid.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()){
            case R.id.buttonAddFragmentAndroid :
                fragment = new AndroidFragment();
                break;
            case R.id.buttonAddFragmentPhp:
                fragment = new PhpFragment();
                break;
        }
        fragmentTransaction.add(R.id.frameContain,fragment);
        fragmentTransaction.commit();
    }
}
