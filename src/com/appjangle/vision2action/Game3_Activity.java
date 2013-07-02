package com.appjangle.vision2action;

import java.io.InputStream;
import java.net.URL;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import android.view.WindowManager;
import android.widget.ImageView;

import io.nextweb.Node;
import io.nextweb.Session;

import com.appjangle.vision2action.game3.LoadValueChainQuestion;
import com.appjangle.vision2action.game3.ValueChainQuestion;



public class Game3_Activity extends Activity implements OnClickListener {
	 
	 int i = 0;
	 String result = "a";
	 String result2 = "";
	 String result3 = "";
	 String result4 = "";
	 String video = "";
	 
	 TextView textView1 ;
	 TextView textView2 ;
	 TextView textView3 ;
     TextView textView9 ;
     TextView textView10 ;
     TextView textView11 ;
     ImageView imageView1;
     Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11;
     boolean b1i,b2i,b3i,b4i,b5i,b6i,b7i,b8i,b9i;
     boolean correct_b1i,correct_b2i,correct_b3i,correct_b4i,correct_b5i,correct_b6i,correct_b7i,correct_b8i,correct_b9i;
     	
     Session session;
 	 Node cases;
     PopupWindow pw;
     Drawable d;
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.game3);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    
	    View firstButton=findViewById(R.id.button1);
        firstButton.setOnClickListener(this);
        View secButton=findViewById(R.id.button2);
        secButton.setOnClickListener(this);
        View trdButton=findViewById(R.id.button3);
        trdButton.setOnClickListener(this);
        View frthButton=findViewById(R.id.button4);
        frthButton.setOnClickListener(this);
        View fifthButton=findViewById(R.id.button5);
        fifthButton.setOnClickListener(this);
        View sixthButton=findViewById(R.id.button6);
        sixthButton.setOnClickListener(this);
        View sixthtsButton=findViewById(R.id.button7);
        sixthtsButton.setOnClickListener(this);
        View sixthtButton=findViewById(R.id.button8);
        sixthtButton.setOnClickListener(this);
        View sixthtxButton=findViewById(R.id.button9);
        sixthtxButton.setOnClickListener(this);
        View sixthtxcButton=findViewById(R.id.button10);
        sixthtxcButton.setOnClickListener(this);
        View sixthtxbButton=findViewById(R.id.button11);
        sixthtxbButton.setOnClickListener(this);
        View imageButton=findViewById(R.id.imageView1);
        imageButton.setOnClickListener(this);
        
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        
        textView1 = (TextView) findViewById(R.id.textView1);
		
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        
        b1i=false;b2i=false;b3i=false;b4i=false;b5i=false;b6i=false;b7i=false;b8i=false;b9i=false;
       
		i=getIntent().getIntExtra("index",1);
        String temp = Integer.toString(i); 
		
    	ValueChainQuestion case1game1 = LoadValueChainQuestion
				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

		result = case1game1.getCorrectValueChainActivites();
		result2 = "";
		result3 = case1game1.getValueChainJustification();
		result4 = case1game1.getBrandImageLink();
		video = case1game1.getBrandVideoLink();
		
		new LongOperation2().execute(d);
        
	 }
	    
	
    
    public void onClick(View v){
		switch (v.getId()){
		        case R.id.button1:
		        	if (b1i==true)
		        	{ button1.setBackgroundResource(R.drawable.rasm);   b1i=false; }
					else if (b1i==false)
	        		{ button1.setBackgroundResource(R.drawable.rasmgreen);   b1i=true; }
		        	 
		        break;
				case R.id.button2:
					if (b2i==true)
		        	{ button2.setBackgroundResource(R.drawable.mpos);   b2i=false; }
					else if (b2i==false)
	        		{ button2.setBackgroundResource(R.drawable.mposgreen);   b2i=true; }
									
			    break;	
			    
				case R.id.button3:
					if (b3i==true)
		        	{ button3.setBackgroundResource(R.drawable.dpos);   b3i=false; }
					else if (b3i==false)
	        		{ button3.setBackgroundResource(R.drawable.dposgreen);   b3i=true; }
					break;
			    
				case R.id.button4:
					if (b4i==true)
		        	{ button4.setBackgroundResource(R.drawable.maspos);   b4i=false; }
					else if (b4i==false)
	        		{ button4.setBackgroundResource(R.drawable.masposgreen);   b4i=true; }
				break;
				
				case R.id.button5:
					if (b5i==true)
		        	{ button5.setBackgroundResource(R.drawable.sas);   b5i=false; }
					else if (b5i==false)
	        		{ button5.setBackgroundResource(R.drawable.sasgreen);   b5i=true; }
				break;
				
				case R.id.button6:		
					if (b6i==true)
		        	{ button6.setBackgroundResource(R.drawable.fi);   b6i=false; }
					else if (b6i==false)
	        		{ button6.setBackgroundResource(R.drawable.figreen);   b6i=true; }
				break;
				
				case R.id.button7:
					if (b7i==true)
		        	{ button7.setBackgroundResource(R.drawable.hrm);   b7i=false; }
					else if (b7i==false)
	        		{ button7.setBackgroundResource(R.drawable.hrmgreen);   b7i=true; }
				break;
		    	
				case R.id.button8:
					if (b8i==true)
		        	{ button8.setBackgroundResource(R.drawable.rd);   b8i=false; }
					else if (b8i==false)
	        		{ button8.setBackgroundResource(R.drawable.rdgreen);   b8i=true; }
				break;
				
				case R.id.button9:
					if (b9i==true)
		        	{ button9.setBackgroundResource(R.drawable.pcur);   b9i=false; }
					else if (b9i==false)
	        		{ button9.setBackgroundResource(R.drawable.pcurgreen);   b9i=true; }
				break;
				
				case R.id.button10:
					button1.setBackgroundResource(R.drawable.rasm);   b1i=false;
					button2.setBackgroundResource(R.drawable.mpos);   b2i=false;
					button3.setBackgroundResource(R.drawable.dpos);   b3i=false; 
					button4.setBackgroundResource(R.drawable.maspos);   b4i=false;
					button5.setBackgroundResource(R.drawable.sas);   b5i=false;
					button6.setBackgroundResource(R.drawable.fi);   b6i=false;
					button7.setBackgroundResource(R.drawable.hrm);   b7i=false; 
					button8.setBackgroundResource(R.drawable.rd);   b8i=false;
					button9.setBackgroundResource(R.drawable.pcur);   b9i=false;
					
					if(i<13)        	     		        	 	        	
			        	  i++;
			        	else
			        	  i=1;
		        	        	
		        	String temp = Integer.toString(i); 
		    		
		        
		        	ValueChainQuestion case1game1 = LoadValueChainQuestion
		    				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));
	
		    		
		        	result = case1game1.getCorrectValueChainActivites();
		    		result2 = "";
		    		result3 = case1game1.getValueChainJustification();
		    		result4 = case1game1.getBrandImageLink();
		    		video = case1game1.getBrandVideoLink();
		    		
		    		
		    		new LongOperation2().execute(d);
					
				break;
				
				case R.id.button11:
					correct_b1i=result.contains("reveiveAndStore");
					correct_b2i=result.contains("makeProjectOrService");
					correct_b3i=result.contains("delivery");
					correct_b4i=result.contains("marketing");
					correct_b5i=result.contains("afterSales");
					correct_b6i=result.contains("firmInfrastructure");
					correct_b7i=result.contains("humanResourseManagement");
					correct_b8i=result.contains("technologyDevelopment");
					correct_b9i=result.contains("procurement");
					
					if (correct_b1i==b1i && correct_b2i==b2i && correct_b3i==b3i && correct_b4i==b4i && correct_b5i==b5i && correct_b6i==b6i && correct_b7i==b7i && correct_b8i==b8i && correct_b9i==b9i)
						 popup();
					 else
						 toast("Incorrect!!!");
						
				break;
				
				case R.id.imageView1:
		  			startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(video)));			  
		  		break;
								
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
    
    
    private class LongOperation2 extends AsyncTask<Drawable, Void, Drawable> {

        @Override
        protected Drawable doInBackground(Drawable... params) {
        	Drawable drawable = LoadImageFromWebOperations(result4);
              return drawable;
        }      

        @Override
        protected void onPostExecute(Drawable result) {
				imageView1.setImageDrawable(result);
        }

    }
     
    
    public void toast (String msg)
    {
        Toast.makeText (getApplicationContext(), msg, Toast.LENGTH_SHORT).show ();
    }  
    
    public void popup()
    { 
			 LayoutInflater inflater = (LayoutInflater) Game3_Activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			 View layout = inflater.inflate(R.layout.popup,(ViewGroup) findViewById(R.id.xx));
			 
			 pw = new PopupWindow(layout, 560, 400, true);
			 pw.showAtLocation(layout, Gravity.CENTER, 0, 0);

			 
			 TextView popuptext = (TextView) layout.findViewById(R.id.textView1);
			 popuptext.setText( result2 + result3);
			 
			 TextView headertext = (TextView) layout.findViewById(R.id.textView2);
			 headertext.setText("You are a legend!!!");
			 
			 Button btnClosePopup = (Button) layout.findViewById(R.id.widget41);
			 btnClosePopup.setOnClickListener(new View.OnClickListener(){public void onClick(View v){pw.dismiss();}});

			 
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

        	Intent j=new Intent(this,Main_Activity.class);
    		j.putExtra("uri", getIntent().getStringExtra("uri"));
    		j.putExtra("index", i);
    	    startActivity(j);
    	    finish();	
        	
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    
    
    
}
