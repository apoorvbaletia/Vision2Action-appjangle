package com.appjangle.vision2action;

import java.io.InputStream;
import java.net.URL;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import android.view.WindowManager;
import android.widget.ImageView;

import io.nextweb.Node;

import com.appjangle.vision2action.game2.LoadStrategicQuandrantQuestion;
import com.appjangle.vision2action.game2.StrategicQuandrantQuestion;
import com.appjangle.vision2action.Vision2Action;




public class Main_Activity extends Activity implements OnClickListener {
	 
	 int i = 1;
	 String result = "";
	 String result2 = "";
	 String result3 = "";
	 String result4 = "";
	 String video = "";
	 
	 TextView textView1 ;
	 TextView textView7 ;
	 TextView textView8 ;
     TextView textView9 ;
     TextView textView10 ;
     TextView textView11 ;
     ImageView imageView1;     
     
     Node cases;
     Drawable d;	
	     
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
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
        View imageButton=findViewById(R.id.imageView1);
        imageButton.setOnClickListener(this);
        
        textView7 = (TextView) findViewById(R.id.textView7);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView10 = (TextView) findViewById(R.id.textView10);
        
        imageView1 = (ImageView) findViewById(R.id.imageView1);
      
        textView1.setTextColor(Color.parseColor("#808080"));
        textView8.setTextColor(Color.parseColor("#808080"));
        textView10.setTextColor(Color.parseColor("#808080"));
              
        i=getIntent().getIntExtra("index",1);	 
        String temp = Integer.toString(i); 
        
    	StrategicQuandrantQuestion case1game1 = LoadStrategicQuandrantQuestion
				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

		
		result = case1game1.getBrandName();
		result2 = case1game1.getBrandIndustry();
		result3 = case1game1.getBrandVision();
		result4 = case1game1.getBrandImageLink();
		video = case1game1.getBrandVideoLink();
        
		new LongOperation2().execute(d);
		
        textView7.setText(result);
        textView9.setText(result2);
        textView11.setText(result3);
    	
	 }
	    
	
    
    public void onClick(View v){
		switch (v.getId()){
		       
		        case R.id.button1:
					Intent jj=new Intent(this,Game1_Activity.class);
					jj.putExtra("uri", getIntent().getStringExtra("uri"));
					jj.putExtra("index", i);
			        startActivity(jj);
			        finish();
				break;
				case R.id.button2:
					Intent ii=new Intent(this,Game2_Activity.class);
					ii.putExtra("uri", getIntent().getStringExtra("uri"));
					ii.putExtra("index", i);
			        startActivity(ii);	
			        finish();		        							
			    break;	
				case R.id.button3:
					Intent j=new Intent(this,Game3_Activity.class);
					j.putExtra("uri", getIntent().getStringExtra("uri"));
					j.putExtra("index", i);
			        startActivity(j);
			        finish();
			    break;						
				case R.id.button4:
					Intent jjj=new Intent(this,Game4_Activity.class);
					jjj.putExtra("uri", getIntent().getStringExtra("uri"));
					jjj.putExtra("index", i);
			        startActivity(jjj);
			        finish();
			    break;			    
				case R.id.button5:
					toast("Nice Try!! But no shortcuts.. !!!");
			    break;
				case R.id.button6:
		        	if(i<13)        	     		        	 	        	
		        	  i++;
		        	else
		        	  i=1;
		        	        	
		        	String temp = Integer.toString(i); 
		        	
		        	
		    		StrategicQuandrantQuestion case1game1 = LoadStrategicQuandrantQuestion
		    				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

		    		
		    		result = case1game1.getBrandName();
		    		result2 = case1game1.getBrandIndustry();
		    		result3 = case1game1.getBrandVision();
		    		result4 = case1game1.getBrandImageLink();
		    		video = case1game1.getBrandVideoLink();
		            
		            
		            textView7.setText(result);
		            textView9.setText(result2);
		            textView11.setText(result3);		            
		           
		            new LongOperation2().execute(d);
			            
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
		    } 
	    catch (Exception e) {
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
    
    
    public void toast (String msg) {
        Toast.makeText (getApplicationContext(), msg, Toast.LENGTH_SHORT).show ();
    }  
       
    
    
}
