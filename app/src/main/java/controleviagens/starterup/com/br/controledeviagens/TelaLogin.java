package controleviagens.starterup.com.br.controledeviagens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class TelaLogin extends AppCompatActivity {

    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_login);
        this.usuario = (EditText) super.findViewById(R.id.usuario);
        this.senha = (EditText) super.findViewById(R.id.senha);
    }

    /**
     * CALLBACK DO BOTÃO DE ACESSO
     *
     * @param v - O PRÓPRIO BOTÃO
     */
    public void entrarOnClick(View v) {
        String usuario = this.usuario.getText().toString();
        String senha = this.senha.getText().toString();
        String usuarioAcesso = "teste";
        String senhaAcesso = "teste";
        if (usuario.equals(usuarioAcesso) && senha.equals(senhaAcesso))
            super.startActivity(new Intent(this, TelaPrincipal.class));
        else {
            String msgErro = super.getString(R.string.infoErroAutenticacao);
            Toast.makeText(this, msgErro, Toast.LENGTH_SHORT).show();
        }
    }

}
