package argentieri.alessandro.uselibraryexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

import argentieri.alessandro.mylibrary.FileChooser;
import argentieri.alessandro.mylibrary.LibraryClass;


public class MainActivity extends AppCompatActivity {
    String CUSTOM_ACTION = "argentieri.alessandro.uselibraryexample.GET_NUMBER";
    int GET_NUMBER_REQUEST = 3243; //custom REQUEST_CODE

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

    }

    public void startActivity4Result(View v){
        Intent intent = new Intent();
        intent.setAction(CUSTOM_ACTION);  //implicit intent because we don't define which Activity will open but only the intent action
        startActivityForResult(intent, GET_NUMBER_REQUEST);
        //controllo i risultati in onActivityResult
    }

    public void CallFileChooser(View v){
       /* new FileChooser(this.getParent()).setFileListener(new FileChooser.FileSelectedListener() {
            @Override public void fileSelected(final File file) {
                // do something with the file

            }).showDialog(); */

        FileChooser fC = new FileChooser(this);
        fC.setFileListener(new FileChooser.FileSelectedListener(){
            @Override
            public void fileSelected(final File file){
                String path = file.getAbsolutePath();
                TextView tx = (TextView) findViewById(R.id.textResult);
                tx.setText(path);
            }
        }
        ).showDialog();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == GET_NUMBER_REQUEST && resultCode == RESULT_OK) {
            String number_back = (String) data.getExtras().get("Result_number");
            TextView tx = (TextView) findViewById(R.id.textResult);
            tx.setText(number_back);
        }
    }


}
