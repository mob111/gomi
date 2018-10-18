package my.edu.taruc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewMsg;//TextView = a class
        //textViewMsg = instance
        //link UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
        textViewMsg.setText("Hello, <your name here>");
    }
    public void showMessage(View view) {

    }
    }
}
