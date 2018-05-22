package serpis.ed.mycaluclator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double firstNumber;
    private double secondNumber;

    private boolean sumarChecker;
    private boolean restarChecker;
    private boolean multiplicarChecker;
    private boolean dividirChecker;
    private boolean decimalChecker;

    private Button sumar;
    private Button multiplicar;
    private Button dividir;
    private Button decimal;
    private Button restar;
    private Button borrar;
    private Button eliminar;
    private Button equal;
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumar = findViewById(R.id.sumar);
        restar = findViewById(R.id.restar);
        dividir = findViewById(R.id.dividir);
        multiplicar = findViewById(R.id.multiplicar);
        decimal = findViewById(R.id.decimal);
        borrar = findViewById(R.id.borrar);
        eliminar = findViewById(R.id.Eliminar);
        equal = findViewById(R.id.Resultado);
        num0 = findViewById(R.id.number0);
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        num3 = findViewById(R.id.number3);
        num4 = findViewById(R.id.number4);
        num5 = findViewById(R.id.number5);
        num6 = findViewById(R.id.number6);
        num7 = findViewById(R.id.number7);
        num8 = findViewById(R.id.number8);
        num9 = findViewById(R.id.number9);
        resultado = findViewById(R.id.cajaResultado);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num0.getText()));
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num1.getText()));
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num2.getText()));
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num3.getText()));
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num4.getText()));
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num5.getText()));
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num6.getText()));
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num7.getText()));
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num8.getText()));
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText()+String.valueOf(num9.getText()));
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<resultado.getText().length();i++){
                    if(resultado.getText().charAt(i) == '.'){
                        decimalChecker = true;
                    }
                }
                if(decimalChecker != true) {
                    resultado.setText(resultado.getText() + String.valueOf(decimal.getText()));
                    decimalChecker = true;
                }
            }
        });
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(String.valueOf(resultado.getText()));
                resultado.setText("");
                sumarChecker = true;
                decimalChecker = false;
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(String.valueOf(resultado.getText()));
                resultado.setText("");
                sumarChecker = true;
                decimalChecker = false;
            }
        });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(String.valueOf(resultado.getText()));
                resultado.setText("");
                multiplicarChecker = true;
                decimalChecker = false;
            }
        });
        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(String.valueOf(resultado.getText()));
                resultado.setText("");
                dividirChecker = true;
                decimalChecker = false;
            }
        });
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText(resultado.getText().subSequence(0,resultado.getText().length()-1));
                decimalChecker = false;
            }
        });
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumber = Double.parseDouble(String.valueOf(resultado.getText()));
                if(sumarChecker == true){
                    resultado.setText(String.valueOf(firstNumber + secondNumber));
                    sumarChecker = false;
                    decimalChecker = false;
                }
                if(restarChecker == true){
                    resultado.setText(String.valueOf(firstNumber - secondNumber));
                    restarChecker = false;
                    decimalChecker = false;
                }
                if(multiplicarChecker == true){
                    resultado.setText(String.valueOf(firstNumber * secondNumber));
                    sumarChecker = false;
                    decimalChecker = false;
                }
                if(dividirChecker == true){
                    resultado.setText(String.valueOf(firstNumber / secondNumber));
                    restarChecker = false;
                    decimalChecker = false;
                }
            }
        });
    }
}
