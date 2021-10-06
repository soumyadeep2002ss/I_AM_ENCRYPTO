package com.sp_gamer_hand.i_am_encrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String message;
    int Ekey;
    String message1;
    int Dkey;
    EditText GetMessage;
    EditText EncrypKey;
    Button Encrypt_mess;
    EditText GetMessage1;
    EditText DecrypKey;
    Button Decrypt_mess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetMessage = (EditText) findViewById(R.id.GetMessage);
        EncrypKey = (EditText)findViewById(R.id.EncrypKey);
        Encrypt_mess= (Button) findViewById(R.id.buttonForEncrypt);
        Encrypt_mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = GetMessage.getText().toString();
                Ekey = Integer.valueOf(EncrypKey.getText().toString());
                char[] message = GetMessage.getText().toString().toCharArray();
                for(int i=0;i<message.length;i++)
                {
                    message[i]=(char)((int)message[i]+Ekey);
                }
                String str = String.valueOf(message);
                showToast(str);
            }

        });

        GetMessage1 = (EditText) findViewById(R.id.GetMessage1);
        DecrypKey = (EditText)findViewById(R.id.DecrypKey);
        Decrypt_mess= (Button) findViewById(R.id.buttonForDecrypt);
        Decrypt_mess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message1 = GetMessage1.getText().toString();
                Dkey = Integer.valueOf(DecrypKey.getText().toString());
                char[] message1 = GetMessage1.getText().toString().toCharArray();
                for(int i=0;i<message1.length;i++)
                {
                    message1[i]=(char)((int)message1[i]-Dkey);
                }
                String str1 = String.valueOf(message1);
                showToast(str1);
            }

        });


}
private void showToast(String text){
    Toast.makeText(MainActivity.this,text,Toast.LENGTH_LONG).show();
}
}


