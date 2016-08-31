package argentieri.alessandro.mylibrary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LibraryActivity extends AppCompatActivity {

    int GET_NUMBER_REQUEST = 3243; //custom REQUEST_CODE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
    }

    public void GetNumber(View v){
        EditText edt = (EditText)findViewById(R.id.edit);
        String result = edt.getText().toString();

        if(getCallingActivity() !=null) {
            Intent output = new Intent();
            output.putExtra("Result_number", result);
            setResult(RESULT_OK, output);
            finish();
        }else{
            Toast.makeText(this, "Not called for Result", Toast.LENGTH_LONG).show();
        }
    }
}
