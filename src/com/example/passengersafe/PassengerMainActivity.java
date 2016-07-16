package com.example.passengersafe;

import android.os.Bundle;

import com.example.chengkejiemian.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PassengerMainActivity extends Activity {

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_main);
        EditText text = (EditText) findViewById(R.id.text1);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        //text.setOnClickListener((OnClickListener) this);
        //button4.setOnClickListener((OnClickListener) this);
        
    
	    text.setOnClickListener(new OnClickListener(){
	    	public void onClick(View v) {
	    		AlertDialog.Builder dialog=new AlertDialog.Builder(PassengerMainActivity.this);
	    		dialog.setTitle("��ʾ");
	    		dialog.setMessage("�Ƿ���GPS��λ����");
	    		dialog.setCancelable(false);
	    		dialog.setPositiveButton("����", new DialogInterface.OnClickListener(){
	    				public void onClick( DiaglogInterface dialog,int which){}
	
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							
						} 
	    				});
	    		dialog.setNegativeButton("������",new DialogInterface.OnClickListener(){
	    			@Override
	    		    public void onClick(DialogInterface dialog,int which){}
	    		});
	    		dialog.show();
	        }
	    });
    	button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Intent intent1=new Intent(PassengerMainActivity.this,CkliMainActivity.class);
				startActivity(intent1);
			}
		});
    	button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Intent intent2=new Intent(PassengerMainActivity.this,WzgxMainActivity.class);
				startActivity(intent2);
			}
		});
    	button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				Intent intent3=new Intent(PassengerMainActivity.this,PjMainActivity.class);
				startActivity(intent3);
			}
		});
    	button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				AlertDialog.Builder dialog=new AlertDialog.Builder(PassengerMainActivity.this);
	    		dialog.setTitle("��ʾ");
	    		dialog.setMessage("ȷ���������粻��ȡ����5����Զ�����");
	    		dialog.setCancelable(false);
	    		dialog.setPositiveButton("ȷ��", new DialogInterface.OnClickListener(){
	    				public void onClick( DiaglogInterface dialog,int which){}
	
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// TODO Auto-generated method stub
							Toast.makeText(PassengerMainActivity.this, "�ѱ�����", 2000).show();
						} 
	    				});
	    		dialog.setNegativeButton("ȡ��",new DialogInterface.OnClickListener(){
	    			@Override
	    		    public void onClick(DialogInterface dialog,int which){
	    				Toast.makeText(PassengerMainActivity.this, "��ȡ����", 2000).show();
	    			}
	    		});
	    		dialog.show();
			}
		});
    }  
}
