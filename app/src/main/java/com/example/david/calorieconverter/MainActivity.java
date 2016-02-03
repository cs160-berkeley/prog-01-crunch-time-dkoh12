package com.example.david.calorieconverter;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    Spinner spinner2;
    ArrayAdapter<CharSequence> adapter2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        spinner = (Spinner) findViewById(R.id.InputWorkout);
        adapter = ArrayAdapter.createFromResource(this, R.array.workout, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Toast.makeText(getBaseContext(),"not selected",Toast.LENGTH_SHORT).show();
            }
        });

        spinner2 = (Spinner) findViewById(R.id.OutputWorkout);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.workout, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //Toast.makeText(getBaseContext(),"not selected",Toast.LENGTH_SHORT).show();
            }
        });

        final EditText editInput = (EditText) findViewById(R.id.input);
        final EditText Output = (EditText) findViewById(R.id.output);
        final EditText Calories = (EditText) findViewById(R.id.ConvertedCalories);
        Button convert = (Button) findViewById(R.id.convert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //unfortunately calorie converter has stopped
                if(TextUtils.isEmpty(editInput.getText().toString())){
                    editInput.setError("Please Enter a Number");
                }

//                if(editInput.getText().length() == 0){
//                    Toast.makeText(this, "Please Enter a Number", Toast.LENGTH_SHORT).show();
//                }

                String FromWorkout = spinner.getSelectedItem().toString();
                String ToWorkout = spinner2.getSelectedItem().toString();

                double input = Double.valueOf(editInput.getText().toString());
                double output = 0.0;
                double calorie = 0.0;

                switch(FromWorkout){
                    //.getSelectedItemPosition()
                    //case 0:
                    case "Pushups":
                        calorie = input / 350 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input;
                                break;
                            case "Situps":
                                output = input / 350 * 200;
                                break;
                            case "Squats":
                                output = input / 350 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 350 * 25;
                                break;
                            case "Plank":
                                output = input / 350 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 350 * 10;
                                break;
                            case "Pullups":
                                output = input / 350 * 100;
                                break;
                            case "Cycling":
                                output = input / 350 * 12;
                                break;
                            case "Walking":
                                output = input / 350 * 20;
                                break;
                            case "Jogging":
                                output = input / 350 * 12;
                                break;
                            case "Swimming":
                                output = input / 350 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 350 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Situps":
                        calorie = input / 200 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 200 * 350;
                                break;
                            case "Situps":
                                output = input;
                                break;
                            case "Squats":
                                output = input / 200 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 200 * 25;
                                break;
                            case "Plank":
                                output = input / 200 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 200 * 10;
                                break;
                            case "Pullups":
                                output = input / 200 * 100;
                                break;
                            case "Cycling":
                                output = input / 200 * 12;
                                break;
                            case "Walking":
                                output = input / 200 * 20;
                                break;
                            case "Jogging":
                                output = input / 200 * 12;
                                break;
                            case "Swimming":
                                output = input / 200 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 200 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Squats":
                        calorie = input / 225 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 225 * 350;
                                break;
                            case "Situps":
                                output = input / 225 * 200;
                                break;
                            case "Squats":
                                output = input;
                                break;
                            case "Leg-lifts":
                                output = input / 225 * 25;
                                break;
                            case "Plank":
                                output = input / 225 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 225 * 10;
                                break;
                            case "Pullups":
                                output = input / 225 * 100;
                                break;
                            case "Cycling":
                                output = input / 225 * 12;
                                break;
                            case "Walking":
                                output = input / 225 * 20;
                                break;
                            case "Jogging":
                                output = input / 225 * 12;
                                break;
                            case "Swimming":
                                output = input / 225 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 225 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Leg-lifts":
                        calorie = input / 25 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 25 * 350;
                                break;
                            case "Situps":
                                output = input / 25 * 200;
                                break;
                            case "Squats":
                                output = input / 25 * 225;
                                break;
                            case "Leg-lifts":
                                output = input;
                                break;
                            case "Plank":
                                output = input;
                                break;
                            case "Jumping Jacks":
                                output = input / 25 * 10;
                                break;
                            case "Pullups":
                                output = input / 25 * 100;
                                break;
                            case "Cycling":
                                output = input / 25 * 12;
                                break;
                            case "Walking":
                                output = input / 25 * 20;
                                break;
                            case "Jogging":
                                output = input / 25 * 12;
                                break;
                            case "Swimming":
                                output = input / 25 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 25 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Plank":
                        calorie = input / 25 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 25 * 350;
                                break;
                            case "Situps":
                                output = input / 25 * 200;
                                break;
                            case "Squats":
                                output = input / 25 * 225;
                                break;
                            case "Leg-lifts":
                                output = input;
                                break;
                            case "Plank":
                                output = input;
                                break;
                            case "Jumping Jacks":
                                output = input / 25 * 10;
                                break;
                            case "Pullups":
                                output = input / 25 * 100;
                                break;
                            case "Cycling":
                                output = input / 25 * 12;
                                break;
                            case "Walking":
                                output = input / 25 * 20;
                                break;
                            case "Jogging":
                                output = input / 25 * 12;
                                break;
                            case "Swimming":
                                output = input / 25 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 25 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Jumping Jacks":
                        calorie = input * 10;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 10 * 350;
                                break;
                            case "Situps":
                                output = input / 10 * 200;
                                break;
                            case "Squats":
                                output = input / 10 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 10 * 25;
                                break;
                            case "Plank":
                                output = input / 10 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input;
                                break;
                            case "Pullups":
                                output = input / 10 * 100;
                                break;
                            case "Cycling":
                                output = input / 10 * 12;
                                break;
                            case "Walking":
                                output = input / 10 * 20;
                                break;
                            case "Jogging":
                                output = input / 10 * 12;
                                break;
                            case "Swimming":
                                output = input / 10 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 10 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Pullups":
                        calorie = input;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 100 * 350;
                                break;
                            case "Situps":
                                output = input / 100 * 200;
                                break;
                            case "Squats":
                                output = input / 100 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 100 * 25;
                                break;
                            case "Plank":
                                output = input / 100 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 100 * 10;
                                break;
                            case "Pullups":
                                output = input;
                                break;
                            case "Cycling":
                                output = input / 100 * 12;
                                break;
                            case "Walking":
                                output = input / 100 * 20;
                                break;
                            case "Jogging":
                                output = input / 100 * 12;
                                break;
                            case "Swimming":
                                output = input / 100 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 100 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Cycling":
                        calorie = input / 12 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 12 * 350;
                                break;
                            case "Situps":
                                output = input / 12 * 200;
                                break;
                            case "Squats":
                                output = input / 12 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 12 * 25;
                                break;
                            case "Plank":
                                output = input / 12 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 12 * 10;
                                break;
                            case "Pullups":
                                output = input / 12 * 100;
                                break;
                            case "Cycling":
                                output = input;
                                break;
                            case "Walking":
                                output = input / 12 * 20;
                                break;
                            case "Jogging":
                                output = input;
                                break;
                            case "Swimming":
                                output = input / 12 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 12 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Walking":
                        calorie = input / 20 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 20 * 350;
                                break;
                            case "Situps":
                                output = input / 20 * 200;
                                break;
                            case "Squats":
                                output = input / 20 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 20 * 25;
                                break;
                            case "Plank":
                                output = input / 20 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 20 * 10;
                                break;
                            case "Pullups":
                                output = input / 20 * 100;
                                break;
                            case "Cycling":
                                output = input / 20 * 12;
                                break;
                            case "Walking":
                                output = input;
                                break;
                            case "Jogging":
                                output = input / 20 * 12;
                                break;
                            case "Swimming":
                                output = input / 20 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 20 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Jogging":
                        calorie = input / 12 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 12 * 350;
                                break;
                            case "Situps":
                                output = input / 12 * 200;
                                break;
                            case "Squats":
                                output = input / 12 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 12 * 25;
                                break;
                            case "Plank":
                                output = input / 12 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 12 * 10;
                                break;
                            case "Pullups":
                                output = input / 12 * 100;
                                break;
                            case "Cycling":
                                output = input;
                                break;
                            case "Walking":
                                output = input / 12 * 20;
                                break;
                            case "Jogging":
                                output = input;
                                break;
                            case "Swimming":
                                output = input / 12 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input / 12 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Swimming":
                        calorie = input / 13 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 13 * 350;
                                break;
                            case "Situps":
                                output = input / 13 * 200;
                                break;
                            case "Squats":
                                output = input / 13 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 13 * 25;
                                break;
                            case "Plank":
                                output = input / 13 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 13 * 10;
                                break;
                            case "Pullups":
                                output = input / 13 * 100;
                                break;
                            case "Cycling":
                                output = input / 13 * 12;
                                break;
                            case "Walking":
                                output = input / 13 * 20;
                                break;
                            case "Jogging":
                                output = input / 13 * 12;
                                break;
                            case "Swimming":
                                output = input;
                                break;
                            case "Stair-Climbing":
                                output = input / 13 * 15;
                                break;
                            default:
                                break;
                        }
                        break;
                    case "Stair-Climbing":
                        calorie = input / 15 * 100;
                        switch(ToWorkout){
                            case "Pushups":
                                output = input / 15 * 350;
                                break;
                            case "Situps":
                                output = input / 15 * 200;
                                break;
                            case "Squats":
                                output = input / 15 * 225;
                                break;
                            case "Leg-lifts":
                                output = input / 15 * 25;
                                break;
                            case "Plank":
                                output = input / 15 * 25;
                                break;
                            case "Jumping Jacks":
                                output = input / 15 * 10;
                                break;
                            case "Pullups":
                                output = input / 15 * 100;
                                break;
                            case "Cycling":
                                output = input / 15 * 12;
                                break;
                            case "Walking":
                                output = input / 15 * 20;
                                break;
                            case "Jogging":
                                output = input / 15 * 12;
                                break;
                            case "Swimming":
                                output = input / 15 * 13;
                                break;
                            case "Stair-Climbing":
                                output = input;
                                break;
                            default:
                                break;
                        }
                        break;
                    default:
                        break;
                }

                //if (FromWorkout.equals("Pushups") && ToWorkout.equals("Pushups")) {
                //}

                Calories.setText(String.format("%.2f", calorie));
                Output.setText(String.format("%.2f", output));

                //Calories.setText(String.valueOf(calorie));
                //Output.setText(String.valueOf(output));


            }
        });

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.david.calorieconverter/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.david.calorieconverter/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
