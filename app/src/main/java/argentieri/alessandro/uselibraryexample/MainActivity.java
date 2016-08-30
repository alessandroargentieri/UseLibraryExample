package argentieri.alessandro.uselibraryexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import argentieri.alessandro.mylibrary.LibraryClass;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LibraryClass libraryClass = new LibraryClass("Alessandro");
        Toast.makeText(this, libraryClass.getSaluti(), Toast.LENGTH_LONG).show();
    }
}
