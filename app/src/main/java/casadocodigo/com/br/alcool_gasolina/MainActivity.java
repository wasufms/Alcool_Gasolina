package casadocodigo.com.br.alcool_gasolina;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private TextView txtResposta;
    private EditText txtAlcool,txtGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        txtResposta=(TextView)findViewById(R.id.textViewResposta);
        txtGasolina=(EditText)findViewById(R.id.editTextGasolina);
        txtAlcool=(EditText)findViewById(R.id.editTextAlcool);
    }



    public void Calcular(View v){
        String uso="";
       double alcool=Double.parseDouble(txtAlcool.getText().toString());
        DecimalFormat df=new DecimalFormat("#.00");
        double gasolina=Double.parseDouble(txtGasolina.getText().toString());
        double resposta=(alcool/gasolina)*100;
       // resposta=Math.round(resposta);
        txtResposta.setText("Porcentagem: "+df.format(resposta)+"%");
        if(resposta>70){
            uso="GASOLINA";
        }else{
            uso="ALCOOL";
        }
        txtResposta.setText("Porcentagem: "+df.format(resposta)+"%"+" \n É MELHOR USAR " +uso);
    }
}
