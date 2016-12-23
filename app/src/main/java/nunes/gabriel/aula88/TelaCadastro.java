package nunes.gabriel.aula88;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class TelaCadastro extends AppCompatActivity {

    //Widgets
    private EditText etNome;
    private RadioButton etMasculino;
    private RadioButton etFeminino;
    private RadioGroup grupoSexo;
    private Button  btnCadastrar;
    private CheckBox chvisa;
    private CheckBox chmaster;

    //Objeto
    private Cliente cli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

    //referencias
        etNome = (EditText) findViewById(R.id.tc_et_nome);
        etMasculino =(RadioButton) findViewById(R.id.Tc_Rd_masculino);
        etFeminino =(RadioButton) findViewById(R.id.Tc_Rd_feminino);
        grupoSexo = (RadioGroup) findViewById(R.id.Tc_grupo_sexo) ;
        btnCadastrar = (Button) findViewById(R.id.Tc_btn_Cadastrar);

        //Referencias check box
        chvisa = (CheckBox) findViewById(R.id.tc_ch_visa);
        chmaster= (CheckBox) findViewById(R.id.tc_ch_master);


        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cli = new Cliente();
                cli.setNome(etNome.getText().toString());
                if(grupoSexo.getCheckedRadioButtonId() ==  etMasculino.getId()){
                    cli.setSexo(etMasculino.getText().toString() );
                }else{
                    cli.setSexo(etFeminino.getText().toString());
                }//fecha else

                //ArrayList checkbox
                ArrayList<String> prefs = new ArrayList<String>();
                if(chvisa.isChecked()){
                    prefs.add(chvisa.getText().toString());
                }
                if(chmaster.isChecked()){
                    prefs.add(chmaster.getText().toString());
                }
                //Nao esquecer
                cli.setPrefs(prefs);//Enviando ArrayList para o objeto



                Toast.makeText(getBaseContext(),cli.toString(), Toast.LENGTH_LONG).show();


            }//fecha onClick
        });//fecha onClickListener
    }//fecha onCreate
}//fecha classe
