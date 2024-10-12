package ies.camas.superminicalculadorarepaso;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText txtNum1, txtnum2;
    TextView labelResultado;
    Button btnSumar,btnRestar,btnMultiplicar, btnDividir, btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtnum2 = findViewById(R.id.txtNum2);

        labelResultado = findViewById(R.id.labelResultado);

        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnBorrar = findViewById(R.id.btnBorrar);

        btnBorrar.setOnClickListener(view -> borrar());

        btnSumar.setOnClickListener(view -> {
           String num1str = txtNum1.getText().toString();
           String num2str = txtnum2.getText().toString();

           int num1 = Integer.parseInt(num1str);
           int num2 = Integer.parseInt(num2str);
           int resultado = sumar(num1,num2);
           labelResultado.setText(String.valueOf(resultado));
        });
        btnRestar.setOnClickListener(view -> {
            String num1str = txtNum1.getText().toString();
            String num2str = txtnum2.getText().toString();

            int num1 = Integer.parseInt(num1str);
            int num2 = Integer.parseInt(num2str);
            int resultado = restar(num1,num2);
            labelResultado.setText(String.valueOf(resultado));
        });
        btnMultiplicar.setOnClickListener(view -> {
            String num1str = txtNum1.getText().toString();
            String num2str = txtnum2.getText().toString();

            int num1 = Integer.parseInt(num1str);
            int num2 = Integer.parseInt(num2str);
            int resultado = multiplicar(num1,num2);
            labelResultado.setText(String.valueOf(resultado));
        });



        btnDividir.setOnClickListener(view -> {
            String num1str = txtNum1.getText().toString();
            String num2str = txtnum2.getText().toString();

            int num1 = Integer.parseInt(num1str);
            int num2 = Integer.parseInt(num2str);
            int resultado = dividir(num1,num2);
            labelResultado.setText(String.valueOf(resultado));
        });



    }
    public void borrar(){
        labelResultado.setText("");
        txtNum1.setText("");
        txtnum2.setText("");
    }
    public int sumar(int n1, int n2){
        return n1 + n2;
    }

    public int restar(int n1, int n2){
        return n1 - n2;
    }
    public int multiplicar(int n1, int n2){
        return n1 * n2;
    }
    public int dividir(int n1, int n2){
        return n1/n2;
    }
}