package eample.activities.furs.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LastActivity extends Activity {
    private TextView tvName;
    private TextView tvSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        tvName = (TextView)findViewById(R.id.name);
        tvSurname = (TextView)findViewById(R.id.surname);


        tvName.setText(getIntent().getStringExtra("name"));
        tvSurname.setText(getIntent().getStringExtra("surname"));


    }

    public void backToMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
