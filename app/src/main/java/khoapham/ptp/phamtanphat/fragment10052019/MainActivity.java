package khoapham.ptp.phamtanphat.fragment10052019;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAddFragmentAndroid,btnAddFragmentPhp;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();


        btnAddFragmentAndroid = findViewById(R.id.buttonAddFragmentAndroid);
        btnAddFragmentPhp = findViewById(R.id.buttonAddFragmentPhp);

        btnAddFragmentAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AndroidFragment androidFragment = new AndroidFragment();
                fragmentTransaction.add(R.id.frameContain, androidFragment);
                fragmentTransaction.commit();
            }
        });
        btnAddFragmentPhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                PhpFragment phpFragment = new PhpFragment();
                fragmentTransaction.add(R.id.frameContain, phpFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
