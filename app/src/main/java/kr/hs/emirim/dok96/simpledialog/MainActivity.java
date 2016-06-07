package kr.hs.emirim.dok96.simpledialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buy=(Button)findViewById(R.id.but_dialog);
        buy.setOnClickListener(this);
    }


    public void onClick(View v){
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫 대화 상자");
        dialog.setMessage("This is message part.");
        dialog.setIcon(R.drawable.firsticon);
        dialog.setPositiveButton("확인",null);
        dialog.show();
    }
}
