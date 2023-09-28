package informatico.to.log_inapp.Principal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import informatico.to.log_inapp.Curso1;
import informatico.to.log_inapp.Curso2;
import informatico.to.log_inapp.Curso3;
import informatico.to.log_inapp.Curso4;
import informatico.to.log_inapp.DataBase.DBHelper;
import informatico.to.log_inapp.R;
import android.view.View;

public class PrincipalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_menu);
        /*Creamos una variable string del titulo*/
        String Title="Bienvenido a la Aplicación";
        this.setTitle(Title);
       }

       public void IrCurso1(View vista){
           Intent MA = new Intent(this, Curso1.class);
           startActivity(MA);
       }

        public void IrCurso2(View vista){
        Intent PA = new Intent(this, Curso2.class);
        startActivity(PA);
    }
        public void IrCurso3(View vista){
        Intent NE = new Intent(this, Curso3.class);
        startActivity(NE);
    }

        public void IrCurso4(View vista){
        Intent PE = new Intent(this, Curso4.class);
        startActivity(PE);
    }
}