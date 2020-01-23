package miaplicacionputito.com.myapplicationtestcjb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView campo_texto;
    EditText Textbo;
    Button Boton, Boton2;
    RadioButton RbtEntero,RbtBinario,RbtHexa,RbtOctal,RbtEntero1,RbtBinario1,RbtHexa1,RbtOctal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo_texto = (TextView) findViewById(R.id.lblsalida);
        Textbo = (EditText) findViewById(R.id.Txtnombre);
        Boton = (Button) findViewById(R.id.Btnenviar);
        Boton2 = (Button) findViewById(R.id.BtnPasar);

        RbtEntero = (RadioButton) findViewById(R.id.radioButtonEntero);
        RbtBinario = (RadioButton) findViewById(R.id.radioButtonBinario);
        RbtHexa = (RadioButton) findViewById(R.id.radioButtonHexa);
        RbtOctal = (RadioButton) findViewById(R.id.radioButtonOcta);

        RbtEntero1 = (RadioButton) findViewById(R.id.radioButtonEntero1);
        RbtBinario1 = (RadioButton) findViewById(R.id.radioButtonBinario1);
        RbtHexa1 = (RadioButton) findViewById(R.id.radioButtonHexa1);
        RbtOctal1 = (RadioButton) findViewById(R.id.radioButtonOcta1);



        Boton.setOnClickListener(this);
        Boton2.setOnClickListener(this);

        RbtEntero.setOnClickListener(this);
        RbtBinario.setOnClickListener(this);
        RbtHexa.setOnClickListener(this);
        RbtOctal.setOnClickListener(this);

        RbtEntero1.setOnClickListener(this);
        RbtBinario1.setOnClickListener(this);
        RbtHexa1.setOnClickListener(this);
        RbtOctal1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.radioButtonEntero:

                Textbo.setInputType(InputType.TYPE_CLASS_NUMBER);

                break;

            case R.id.radioButtonBinario:

                Textbo.setInputType(InputType.TYPE_CLASS_NUMBER);

                break;

            case R.id.radioButtonHexa:

                Textbo.setInputType(InputType.TYPE_CLASS_TEXT);

                break;

            case R.id.radioButtonOcta:

                Textbo.setInputType(InputType.TYPE_CLASS_NUMBER);

                break;

            case R.id.Btnenviar:

                if (Textbo.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(), "Jajaja ay pero que idiota. Debe ingresar un número", Toast.LENGTH_LONG).show();

                }else{

                    //  ENTERO a binario, hexa, octal

                    if(RbtEntero.isChecked() && RbtEntero1.isChecked()){

                        campo_texto.setText("El entero es: " + Textbo.getText());

                    }else if(RbtEntero.isChecked() && RbtBinario1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString());
                        String result = Integer.toBinaryString(numero);

                        campo_texto.setText("El binario es: " + result);

                    }else if(RbtEntero.isChecked() && RbtHexa1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString());
                        String result = Integer.toHexString(numero);

                        campo_texto.setText("El hexadecimal es: " + result);

                    }else if(RbtEntero.isChecked() && RbtOctal1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString());
                        String result = Integer.toOctalString(numero);

                        campo_texto.setText("El octal es: " + result);

                    }


                    //  BINARIO a entero, hexa, octal

                    if(RbtBinario.isChecked() && RbtEntero1.isChecked()){

                        int result = Integer.parseInt(Textbo.getText().toString(),2);

                        campo_texto.setText("El entero es: "+result);

                    }else if(RbtBinario.isChecked() && RbtBinario1.isChecked()){

                        campo_texto.setText("El binario es: "+Textbo.getText());

                    }else if(RbtBinario.isChecked() && RbtHexa1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString(),2);
                        String result = Integer.toHexString(numero);

                        campo_texto.setText("El hexadecimal es: "+result);

                    }else if(RbtBinario.isChecked() && RbtOctal1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString(),2);
                        String result = Integer.toOctalString(numero);

                        campo_texto.setText("El octal es: "+result);

                    }


                    //  HEXA a entero, binario, octal

                    if(RbtHexa.isChecked() && RbtEntero1.isChecked()){

                        int result = Integer.parseInt(Textbo.getText().toString(),16);

                        campo_texto.setText("El entero es: "+result);

                    }else if(RbtHexa.isChecked() && RbtBinario1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString(),16);
                        String result = Integer.toBinaryString(numero);

                        campo_texto.setText("El binario es: "+result);

                    }else if(RbtHexa.isChecked() && RbtHexa1.isChecked()){

                        campo_texto.setText("El hexadecimal es: "+Textbo.getText());

                    }else if(RbtHexa.isChecked() && RbtOctal1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString(),16);
                        String result = Integer.toOctalString(numero);

                        campo_texto.setText("El octal es: "+result);

                    }


                    //  OCTAL a entero, binario, hexadecimal

                    if(RbtOctal.isChecked() && RbtEntero1.isChecked()){

                        int result = Integer.parseInt(Textbo.getText().toString(),8);

                        campo_texto.setText("El entero es: "+result);

                    }else if(RbtOctal.isChecked() && RbtBinario1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString(),8);
                        String result = Integer.toBinaryString(numero);

                        campo_texto.setText("El binario es: "+result);

                    }else if(RbtOctal.isChecked() && RbtHexa1.isChecked()){

                        int numero = Integer.parseInt(Textbo.getText().toString(),8);
                        String result = Integer.toOctalString(numero);

                        campo_texto.setText("El octal es: "+result);

                    }else if(RbtOctal.isChecked() && RbtOctal1.isChecked()){

                        campo_texto.setText("El hexadecimal es: "+Textbo.getText());

                    }
                }

                break;

            case R.id.BtnPasar:

                Intent CrearActivi = new Intent(MainActivity.this,ActivityDos.class);
                startActivity(CrearActivi);

                break;

        }
    }
}
