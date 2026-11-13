package com.example.implicitni_nameni;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URI;

public class MainActivity extends AppCompatActivity {


    //EditText zemljevid=findViewById(R.id.editTextText2);
    //EditText besedilo=findViewById(R.id.editTextText3);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void openWebsite(View view){
        EditText spletna=findViewById(R.id.editTextText);
        String url = spletna.getText().toString().trim();
        if(url.isEmpty()){
            Toast.makeText(this, "Vnesi naslov spletne strani", Toast.LENGTH_LONG).show();
        }

        Uri link = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, link);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Vnesi pravilni spletni naslov",Toast.LENGTH_SHORT).show();
        }
    }
    public void openLocation(View view){
        EditText lokac=findViewById(R.id.editTextText2);
        String url = lokac.getText().toString().trim();
        if(url.isEmpty()){
            Toast.makeText(this, "Vnesi Lokacijo", Toast.LENGTH_LONG).show();
        }
        Uri link = Uri.parse("geo:0,0?q="+Uri.encode(url));
        Intent intent = new Intent(Intent.ACTION_VIEW, link);
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Vnesi pravilni naslov",Toast.LENGTH_SHORT).show();
        }
    }
    public void shareText(View view){
        EditText besedilo=findViewById(R.id.editTextText3);
        String url = besedilo.getText().toString().trim();
        if(url.isEmpty()){
            Toast.makeText(this, "Vnesi Lokacijo", Toast.LENGTH_LONG).show();
        }
        else{
            ShareCompat.IntentBuilder.from(this).setType("text/plain").setText(url).setChooserTitle("Deli besedilo").startChooser();
        }

    }
}