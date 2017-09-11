package controleviagens.starterup.com.br.controledeviagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

    }

    /**
     * CALLBACK DE CLIQUE
     *
     * @param v - A TEXTVIEW CLICADA
     */
    public void selecionarOpcao(View v) {
        TextView textView = (TextView) v;
        String opcao = "Opção: " + textView.getText().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_SHORT).show();

        switch (v.getId()) {
            case R.id.novaViagem:
                super.startActivity(new Intent(this, TelaNovaViagem.class));
                break;
        }
    }

}
