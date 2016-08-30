package argentieri.alessandro.uselibraryexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import argentieri.alessandro.mylibrary.LibraryClass;


public class MainActivity extends AppCompatActivity {
    String CUSTOM_ACTION = "argentieri.alessandro.uselibraryexample.GET_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LibraryClass libraryClass = new LibraryClass("Alessandro");
        Toast.makeText(this, libraryClass.getSaluti(), Toast.LENGTH_LONG).show();

    }

    public void Try_To_Get_Number(View v){
        Intent i = new Intent();
        i.setAction(CUSTOM_ACTION);
        startActivity(i);
        //controllo i risultati in onActivityResult
    }


}
