package nunes.gabriel.aula88;

import java.util.ArrayList;

/**
 * Created by Alunos on 08/12/2016.
 */

public class Cliente {

    private String nome;
    private String sexo;
    private ArrayList<String>  prefs; //CheckBox

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<String> getPrefs() {
        return prefs;
    }

    public void setPrefs(ArrayList<String> prefs) {
        this.prefs = prefs;
    }

    //Testa o sexo e return String
    public String  verificarSexo(){
        if(sexo.equalsIgnoreCase("Masculino")){
            return "Então vc é homem";

        }else{
            return "Mulher";
        }//fecha else
    }//fecha verificarSexo

    //Testa o sexo e return um numero
    public int verficarSexo1(){
        if(sexo.equalsIgnoreCase("Masculino")){
            return 171;
        }else{
            return 266;
        }//fecha else
    }//fecha verificarSexo1

    @Override
    public String toString() {

        String x="";

        for(int i=0; i<prefs.size(); i++){
            x = x + "\n"+ prefs.get(i);
        }//fecha for

        return "Nome:" +nome
                +"\nSexo:" +sexo
                +"\nPrefs:" +x
                +"\nVerificar:" +verificarSexo()
                +"\nVerificar1" +verficarSexo1();
    }
}//fecha classe
