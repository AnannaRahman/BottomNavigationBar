package transparent.toolbar.example.transparenttoolbarecample;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import transparent.toolbar.example.transparenttoolbarecample.helper.BottomNavigationViewHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//initialize bottomNavigationBar
        BottombarInit();
    }

    public void BottombarInit() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Intent i;
                        switch (item.getItemId()) {
                            case R.id.action_home:

                                Toast.makeText(MainActivity.this, "Home Clicked ", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.action_recomandation:
                                Toast.makeText(MainActivity.this, "Recomandation Clicked ", Toast.LENGTH_SHORT).show();

                                break;

                            case R.id.action_reservation:

                                Toast.makeText(MainActivity.this, "Reservation Clicked ", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.action_payment:

                                Toast.makeText(MainActivity.this, "Payment Clicked ", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.action_profile:

                                Toast.makeText(MainActivity.this, "Profile Clicked ", Toast.LENGTH_SHORT).show();
                                break;

                        }
                        return true;
                    }
                });

    }
}
