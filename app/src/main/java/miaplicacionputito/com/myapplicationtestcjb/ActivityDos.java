package miaplicacionputito.com.myapplicationtestcjb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityDos extends AppCompatActivity implements View.OnClickListener{

    TextView respuesta;
    EditText N1,N2;
    RadioButton RbtSuma,RbtResta;
    Button Boton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_dos2);

        RbtSuma = (RadioButton) findViewById(R.id.radioButton);
        RbtResta = (RadioButton) findViewById(R.id.radioButton2);
        N1 = (EditText) findViewById(R.id.TxtNumero1);
        N2 = (EditText) findViewById(R.id.TxtNumero2);
        Boton = (Button) findViewById(R.id.BtnOperar);
        respuesta = (TextView) findViewById(R.id.ResultadoS);


        RbtSuma.setOnClickListener(this);
        RbtResta.setOnClickListener(this);
        Boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.BtnOperar:

                if(  (N1.getText().toString().equals("")) || (N2.getText().toString().equals("")) ){

                    Toast.makeText(getApplicationContext(), "Ningun campo puede estar vacio, mucho pedro", Toast.LENGTH_LONG).show();

                }else {
                    if (RbtSuma.isChecked()) {

                        int numero1 = Integer.parseInt(N1.getText().toString());
                        int numero2 = Integer.parseInt(N2.getText().toString());

                        int operacion = (numero1 + numero2);

                        respuesta.setText("La suma de los numeros es " + operacion);

                    } else if (RbtResta.isChecked()) {

                        int numero1 = Integer.parseInt(N1.getText().toString());
                        int numero2 = Integer.parseInt(N2.getText().toString());

                        int operacion = (numero1 - numero2);

                        respuesta.setText("La resta de los numeros es " + operacion);

                    } else {

                        Toast.makeText(getApplicationContext(), "Debe seleccionar un radiobutton Pendejo", Toast.LENGTH_LONG).show();
                    }
                }

            break;
        }
    }
}
