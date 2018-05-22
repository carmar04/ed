package serpis.ed.calculadorainf;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }


    private Button buttonCalcular;
    private Button buttonDelete;
    EditText input,outputBinary,outputOctal, outputHexadecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.Input);
        outputBinary = findViewById((R.id.OutputBinary));
        outputOctal = findViewById((R.id.OutputOctal));
        outputHexadecimal = findViewById((R.id.OutputHexadecimal));

        buttonCalcular = findViewById(R.id.Output);
        buttonDelete = findViewById(R.id.Delete);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String entrada = String.valueOf(input.getText());
                String binary = (Integer.toBinaryString(Integer.parseInt(entrada)));
                String octal = Integer.toOctalString(Integer.parseInt(entrada));
                String hexadecimal = Integer.toHexString(Integer.parseInt(entrada));

                outputBinary.setText(binary);
                outputOctal.setText(octal);
                outputHexadecimal.setText(hexadecimal.toUpperCase());
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText(null);
                outputBinary.setText(null);
                outputOctal.setText(null);
                outputHexadecimal.setText(null);

            }
        });
    }
}
