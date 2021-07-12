package www.smktelkommlg.sch.kanofood;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.registration);
        TextView login = (TextView)findViewById(R.id.lnkLogin);
        login.setMovementMethod(LinkMovementMethod.getInstance());
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
