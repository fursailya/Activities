package eample.activities.furs.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText etName, etSurname;
  //  private Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = (EditText)findViewById(R.id.etName);
        etSurname = (EditText)findViewById(R.id.etSurname);
      //  btnSend = (Button)findViewById(R.id.btnSend);

    }



    public void sendData(View veiew) {
        Intent intent = new Intent(getApplicationContext(), LastActivity.class);
        intent.putExtra("name", etName.getText().toString());
        intent.putExtra("surname", etSurname.getText().toString());
        startActivity(intent);
    }
}
