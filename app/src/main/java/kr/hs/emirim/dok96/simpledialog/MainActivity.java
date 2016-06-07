package kr.hs.emirim.dok96.simpledialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

{
    String[] items=new String[]{"젤리빈","킷켓","롤리팝"};
    Button buy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buy=(Button)findViewById(R.id.but_dialog);
        buy.setOnClickListener(this);
    }


    public void onClick(View v){

        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("첫 대화 상자");
        dialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                buy.setText(items[which]);
            }
        });
        dialog.setIcon(R.drawable.firsticon);
        dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"대화 상자의 확인 버튼을 클릭했음!", Toast.LENGTH_LONG).show();
            }
        });
        dialog.show();
    }
}
