package labs.sdm.game.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import labs.sdm.game.R;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    // Adds the menu with the info. icon to the action bar.
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);

        return true;
    }

    // Starts the About activity when the info. icon is clicked.
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_bar_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);

                break;
        }

        return true;
    }

    // This method is executed when any button in the Dashboard is clicked.
    public void dashboardButtonClicked(View v) {

        // Intent object to launch the related activity.
        Intent intent = null;

        // Determine the activity to launch according to the Id of the Button clicked.
        switch (v.getId()) {

            // Activity for getting a new quotation and adding it to favourites.
            case R.id.bPlay:
                intent = new Intent(this, PlayActivity.class);
                break;

            // Activity for displaying and managing the favourite quotations.
            case R.id.bScores:
                intent = new Intent(this, ScoresActivity.class);
                break;

            // Activity for configuring the application.
            case R.id.bSettings:
                intent = new Intent(this, SettingsActivity.class);
                break;

            // Activity to display the application credits.
            case R.id.bAbout:
                intent = new Intent(this, AboutActivity.class);
                break;
        }

        // Launch the required activity.
        if (intent != null) {
            startActivity(intent);
        }
    }

}
