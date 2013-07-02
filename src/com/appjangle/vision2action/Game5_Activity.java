package com.appjangle.vision2action;

import java.io.InputStream;
import java.net.URL;
import java.util.Random;

import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.TextView;
import android.view.WindowManager;

import io.nextweb.Node;

import com.appjangle.vision2action.game5.LoadSystemsQuestion;
import com.appjangle.vision2action.game5.SystemsQuestion;


public class Game5_Activity extends Activity implements View.OnTouchListener,OnClickListener {

TextView _view,_view2,_view3,_view4,_view5,_view6;
ViewGroup _root;
private int _xDelta;
private int _yDelta;

int i = 0;
String result = "";
String result2 = "";
String result3 = "";
String result1 = "";
String video = "";
String value1,value2,value3,t1,t2,t3;
Node cases;
TextView textView1 ;
int correct_v1,correct_v2,correct_v3;
int v1,v2,v3;
ImageView imageView1;
Drawable d;
PopupWindow pw;

@Override
public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.game5); 
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       
    View firstButton=findViewById(R.id.button1);
    firstButton.setOnClickListener(this);
    View secButton=findViewById(R.id.button2);
    secButton.setOnClickListener(this);
    View trdButton=findViewById(R.id.button3);
    trdButton.setOnClickListener(this);
    View imageButton=findViewById(R.id.imageView1);
    imageButton.setOnClickListener(this);
    
    textView1 = (TextView) findViewById(R.id.textView1);
    imageView1 = (ImageView) findViewById(R.id.imageView1);
    
    Button bb = (Button) findViewById(R.id.button1); 
    bb.setText("Main Menu");
    
    
    _root = (ViewGroup)findViewById(R.id.root);

    _view = new TextView(this);
    _view.setBackgroundResource(R.drawable.systemsgamebutton);
    
    _view2 = new TextView(this);
    _view2.setBackgroundResource(R.drawable.systemsgamebutton);
    
    _view3 = new TextView(this);
    _view3.setBackgroundResource(R.drawable.systemsgamebutton);
    
    _view4 = new TextView(this);
    _view4.setBackgroundResource(R.drawable.placeholder);
    
    _view5 = new TextView(this);
    _view5.setBackgroundResource(R.drawable.placeholder);
    
    _view6 = new TextView(this);
    _view6.setBackgroundResource(R.drawable.placeholder);
    
          
    _view.setPadding(20, 15, 20, 15);
    _view2.setPadding(20, 15, 20, 15);
    _view3.setPadding(20, 15, 20, 15);   
    _view4.setPadding(20, 15, 20, 15);
    _view5.setPadding(20, 15, 20, 15);
    _view6.setPadding(20, 15, 20, 15);

    
    value1=getIntent().getStringExtra("value1");
    value2=getIntent().getStringExtra("value2");
    value3=getIntent().getStringExtra("value3");
    
    
    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(250, 150);
    layoutParams.leftMargin = 10;
    layoutParams.topMargin = 300;
    layoutParams.bottomMargin = -250;
    layoutParams.rightMargin = -250;
    _view.setLayoutParams(layoutParams);
    
    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(250, 150);
    layoutParams2.leftMargin = 310;
    layoutParams2.topMargin = 300;
    layoutParams2.bottomMargin = -250;
    layoutParams2.rightMargin = -250;
    _view2.setLayoutParams(layoutParams2);
    
    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(250, 150);
    layoutParams3.leftMargin = 610;
    layoutParams3.topMargin = 300;
    layoutParams3.bottomMargin = -250;
    layoutParams3.rightMargin = -250;
    _view3.setLayoutParams(layoutParams3);
    
    
    
    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(250, 150);
    layoutParams4.leftMargin = 10;
    layoutParams4.topMargin = 110;
    layoutParams4.bottomMargin = -250;
    layoutParams4.rightMargin = -250;
    _view4.setLayoutParams(layoutParams4);
    
    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(250, 150);
    layoutParams5.leftMargin = 310;
    layoutParams5.topMargin = 110;
    layoutParams5.bottomMargin = -250;
    layoutParams5.rightMargin = -250;
    _view5.setLayoutParams(layoutParams5);
    
    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(250, 150);
    layoutParams6.leftMargin = 610;
    layoutParams6.topMargin = 110;
    layoutParams6.bottomMargin = -250;
    layoutParams6.rightMargin = -250;
    _view6.setLayoutParams(layoutParams6);
    

    _view.setOnTouchListener(this);
    _view2.setOnTouchListener(this);
    _view3.setOnTouchListener(this);

    _root.addView(_view4);
    _root.addView(_view5);
    _root.addView(_view6);
    _root.addView(_view);
    _root.addView(_view2);
    _root.addView(_view3); 
    
    
    i=getIntent().getIntExtra("index",1);
    String temp = Integer.toString(i); 
	
    
    SystemsQuestion case1game1 = LoadSystemsQuestion
			.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

	
	result = case1game1.getSystems() ;
	result2 = case1game1.getOrgUnits() ;	
	result3 = " ";
	result1 = case1game1.getBrandImageLink();
	video = case1game1.getBrandVideoLink();
	new LongOperation2().execute(d);
	
	t1 =  result.substring(0,result.indexOf(":"));
	t2 =  result.substring(result.indexOf(":")+1,result.lastIndexOf(":"));
	t3 =  result.substring(result.lastIndexOf(":")+1);
	
	textView1 = (TextView) findViewById(R.id.textView1);
	_view.setText( t1 + t2 + t3);
	
	_view4.setText(value1);
	_view5.setText(value2); 
	_view6.setText(value3);
	
	Random randGen = new Random();
	int myInt =  1 + randGen.nextInt(3);
	
	if (myInt == 1)
		{ _view.setText(t1); t1="0"; correct_v1=1; }
	else if (myInt == 2)
		{ _view.setText(t2); t2="0"; correct_v1=2; }
	else if (myInt == 3)
		{ _view.setText(t3); t3="0"; correct_v1=3; }
	
	myInt =  2 + randGen.nextInt(2);
	
	if (t1 == "0")
	{ if (myInt == 2)
		{_view2.setText(t2); _view3.setText(t3); correct_v2=2; correct_v3=3; }
   	  else
   	 	{_view2.setText(t3); _view3.setText(t2); correct_v2=3; correct_v3=2; }
	}
	else if (t2 == "0")
	{ if (myInt == 2)
		{_view2.setText(t1); _view3.setText(t3); correct_v2=1; correct_v3=3; }
	 else
   	 	{_view2.setText(t3); _view3.setText(t1); correct_v2=3; correct_v3=1; }
	}
	else if (t3 == "0")
	{ if (myInt == 2)
		{_view2.setText(t1); _view3.setText(t2); correct_v2=1; correct_v3=2; }
	else
 		{_view2.setText(t2); _view3.setText(t1); correct_v2=2; correct_v3=1; }
	}
	
}

public boolean onTouch(View view, MotionEvent event) {
    final int X = (int) event.getRawX();
    final int Y = (int) event.getRawY();
    switch (event.getAction() & MotionEvent.ACTION_MASK) {
        case MotionEvent.ACTION_DOWN:
            RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            _xDelta = X - lParams.leftMargin;
            _yDelta = Y - lParams.topMargin;
            break;
        case MotionEvent.ACTION_UP:        	 
        	//RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        	//layoutParams3.leftMargin=200; layoutParams3.topMargin=200;
            break;
        
        case MotionEvent.ACTION_POINTER_DOWN:
            break;
        case MotionEvent.ACTION_POINTER_UP:
            break;
        case MotionEvent.ACTION_MOVE:
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = X - _xDelta;
            layoutParams.topMargin = Y - _yDelta;
            layoutParams.rightMargin = -250;
            layoutParams.bottomMargin = -250; 
            view.setLayoutParams(layoutParams);
            
            if(layoutParams.leftMargin>0 && layoutParams.leftMargin<200 && layoutParams.topMargin>40 && layoutParams.topMargin<200)
            	{layoutParams.leftMargin=10; layoutParams.topMargin=110;} 
            
            if(layoutParams.leftMargin>240 && layoutParams.leftMargin<500 && layoutParams.topMargin>40 && layoutParams.topMargin<200)
        		{layoutParams.leftMargin=310; layoutParams.topMargin=110;} 
            
            if(layoutParams.leftMargin>540 && layoutParams.leftMargin<700 && layoutParams.topMargin>40 && layoutParams.topMargin<200)
        		{layoutParams.leftMargin=610; layoutParams.topMargin=110;}
            
            break;
    }
   
    
    _root.invalidate();    
    return true;   
}


public void onClick(View v){
	switch (v.getId()){
	
			case R.id.button1:
				
				Intent j=new Intent(this,Main_Activity.class);
	    		j.putExtra("uri", getIntent().getStringExtra("uri"));
	    		j.putExtra("index", i);
	    	    startActivity(j);
	    	    finish();	
			
				
			break;
			
			case R.id.button2:
				v1=0;v2=0;v3=0;
			
				RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(250, 150);
			    layoutParams4.leftMargin = 10;
			    layoutParams4.topMargin = 300;
			    layoutParams4.bottomMargin = -250;
			    layoutParams4.rightMargin = -250;
			    _view.setLayoutParams(layoutParams4);
			    
			    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(250, 150);
			    layoutParams5.leftMargin = 310;
			    layoutParams5.topMargin = 300;
			    layoutParams5.bottomMargin = -250;
			    layoutParams5.rightMargin = -250;
			    _view2.setLayoutParams(layoutParams5);
			    
			    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(250, 150);
			    layoutParams6.leftMargin = 610;
			    layoutParams6.topMargin = 300;
			    layoutParams6.bottomMargin = -250;
			    layoutParams6.rightMargin = -250;
			    _view3.setLayoutParams(layoutParams6);
			break;
			
			case R.id.button3:
				v1=0;v2=0;v3=0;
				
				ViewGroup.MarginLayoutParams layout= (ViewGroup.MarginLayoutParams) _view.getLayoutParams();
				if (layout.leftMargin==10 && layout.topMargin==110)
					v1=1;
				else if (layout.leftMargin==310 && layout.topMargin==110)
					v1=2;
				else if (layout.leftMargin==610 && layout.topMargin==110)
					v1=3;
				
				layout= (ViewGroup.MarginLayoutParams) _view2.getLayoutParams();
				if (layout.leftMargin==10 && layout.topMargin==110)
					v2=1;
				else if (layout.leftMargin==310 && layout.topMargin==110)
					v2=2;
				else if (layout.leftMargin==610 && layout.topMargin==110)
					v2=3;
				
				layout= (ViewGroup.MarginLayoutParams) _view3.getLayoutParams();
				if (layout.leftMargin==10 && layout.topMargin==110)
					v3=1;
				else if (layout.leftMargin==310 && layout.topMargin==110)
					v3=2;
				else if (layout.leftMargin==610 && layout.topMargin==110)
					v3=3;
				
				
				if(v1==correct_v1 && v2==correct_v2 && v3==correct_v3 )
					popup();
				else
					toast("Incorrect!!!");
				
			break;	
			
			case R.id.imageView1:
	  			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(video)));			  
	  		break;
	
	}
	
	
	


}

private class LongOperation2 extends AsyncTask<Drawable, Void, Drawable> {

    @Override
    protected Drawable doInBackground(Drawable... params) {
    	Drawable drawable = LoadImageFromWebOperations(result1);
          return drawable;
    }      

    @Override
    protected void onPostExecute(Drawable result) {
			imageView1.setImageDrawable(result);
    }

}

private Drawable LoadImageFromWebOperations(String url) {

    try {
        InputStream is = (InputStream) new URL(url).getContent();
        Drawable d = Drawable.createFromStream(is, "src name");
        return d;
    } catch (Exception e) {
        System.out.println("Exc=" + e);
        return null;
    }

}


public void toast (String msg)
{
    Toast.makeText (getApplicationContext(), msg, Toast.LENGTH_SHORT).show ();
}  


public void popup()
{ 
		 LayoutInflater inflater = (LayoutInflater) Game5_Activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		 View layout = inflater.inflate(R.layout.popup,(ViewGroup) findViewById(R.id.xx));
		 
		 pw = new PopupWindow(layout, 560, 400, true);
		 pw.showAtLocation(layout, Gravity.CENTER, 0, 0);

		 
		 TextView popuptext = (TextView) layout.findViewById(R.id.textView1);
		 popuptext.setText( "You have Done it!!!! :)" );
		 
		 TextView headertext = (TextView) layout.findViewById(R.id.textView2);
		 headertext.setText("Mission Accomplished!!");
		 
		 Button btnClosePopup = (Button) layout.findViewById(R.id.widget41);
		 btnClosePopup.setOnClickListener(new View.OnClickListener(){public void onClick(View v){pw.dismiss();}});

		 
}

}