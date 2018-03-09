package serpis.ed.asuma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private EditText editText1;
    private EditText editText2;
    private TextView textViewResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void buttonAddOnClick(View view){
        Log.i(TAG,"buttonAddOnClick()");

        BigDecimal number1 = new BigDecimal(editText1.getText().toString());
        BigDecimal number2 = new BigDecimal(editText2.getText().toString());

        BigDecimal result = number1.add(number2);
        textViewResult.setText(result.toString());

    }
    public void buttonSubOnClick(View view) {
        Log.i(TAG, "buttonAddOnClick()");

        BigDecimal number1 = new BigDecimal(editText1.getText().toString());
        BigDecimal number2 = new BigDecimal(editText2.getText().toString());

        BigDecimal result = number1.subtract(number2);
        textViewResult.setText(result.toString());
    }
    private BigDecimal getNumber1(){
        return new BigDecimal(editText1.getText().toString());
    }
    private BigDecimal getNumber2() {
        return new BigDecimal(editText2.getText().toString());
    }
}
