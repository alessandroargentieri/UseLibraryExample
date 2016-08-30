package argentieri.alessandro.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }

    public void GetNumber(View v){
        EditText edt = (EditText)findViewById(R.id.edit);
        String result = edt.getText().toString();

    }
}
