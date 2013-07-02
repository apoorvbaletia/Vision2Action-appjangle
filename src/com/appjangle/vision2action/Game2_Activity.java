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

import com.appjangle.vision2action.game2.LoadStrategicQuandrantQuestion;
import com.appjangle.vision2action.game2.StrategicQuandrantQuestion;


public class Game2_Activity extends Activity implements OnClickListener {
	 
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
     Button button1,button2,button3,button4,button5,button6,button8;
     boolean b1i,b2i,b3i,b4i;
     boolean correct_b1i,correct_b2i,correct_b3i,correct_b4i;
     	
 	 Node cases;
  	 PopupWindow pw;
     Drawable d;
    
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.game2);
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
        View imageButton=findViewById(R.id.imageView1);
        imageButton.setOnClickListener(this);
        
        i=getIntent().getIntExtra("index",1);
        
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        
 		textView1 = (TextView) findViewById(R.id.textView1);
         
        imageView1 = (ImageView) findViewById(R.id.imageView1);

        b1i=false;b2i=false;b3i=false;b4i=false;


        i=getIntent().getIntExtra("index",1);
        String temp = Integer.toString(i); 
        
    	StrategicQuandrantQuestion case1game1 = LoadStrategicQuandrantQuestion
				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

		result = case1game1.getCorrectStrategy();
		result2 = case1game1.getCorrectCompetiveScope();
		result3 = case1game1.getCorrectCostStrategy();
		result4 = case1game1.getBrandImageLink();
		video = case1game1.getBrandVideoLink();
		
		new LongOperation2().execute(d);
        	
	 }
	    
	
    
    public void onClick(View v){
		switch (v.getId()){
		        case R.id.button1:
		        	b1i=true;b2i=false;b3i=false;b4i=false;
		        	correct_b1i=result.contains("costLeadership");
					correct_b2i=result.contains("focusedLowCost");
					correct_b3i=result.contains("focusedHighCost");
					correct_b4i=result.contains("differentiation");
		        	if (correct_b1i==b1i && correct_b2i==b2i && correct_b3i==b3i && correct_b4i==b4i )
						 popup();
					 else
						 toast("Your answer of [ costLeadership ] is incorrect!");
		        break;
				case R.id.button2:
					b1i=false;b2i=true;b3i=false;b4i=false;
		        	correct_b1i=result.contains("costLeadership");
					correct_b2i=result.contains("focusedLowCost");
					correct_b3i=result.contains("focusedHighCost");
					correct_b4i=result.contains("differentiation");
		        	if (correct_b1i==b1i && correct_b2i==b2i && correct_b3i==b3i && correct_b4i==b4i )
		        		popup();
					 else
						 toast("Your answer of [ focusedLowCost ] is incorrect!");
			    break;	
			    
				case R.id.button3:
					b1i=false;b2i=false;b3i=true;b4i=false;
		        	correct_b1i=result.contains("costLeadership");
					correct_b2i=result.contains("focusedLowCost");
					correct_b3i=result.contains("focusedHighCost");
					correct_b4i=result.contains("differentiation");
		        	if (correct_b1i==b1i && correct_b2i==b2i && correct_b3i==b3i && correct_b4i==b4i )
		        		popup();
					 else
						 toast("Your answer of [ focusedHighCost ] is incorrect!");
			    break;
			    
				case R.id.button4:
					b1i=false;b2i=false;b3i=false;b4i=true;
		        	correct_b1i=result.contains("costLeadership");
					correct_b2i=result.contains("focusedLowCost");
					correct_b3i=result.contains("focusedHighCost");
					correct_b4i=result.contains("differentiation");
		        	if (correct_b1i==b1i && correct_b2i==b2i && correct_b3i==b3i && correct_b4i==b4i )
		        		popup();
					 else
						 toast("Your answer of [ differentiation ] is incorrect!");
				break;
				
				case R.id.button5:
					if(i<13)        	     		        	 	        	
			        	  i++;
			        	else
			        	  i=1;
		        	        	
		        	String temp = Integer.toString(i); 
		        
		        	StrategicQuandrantQuestion case1game1 = LoadStrategicQuandrantQuestion
		    				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

		        	result = case1game1.getCorrectStrategy();
		    		result2 = case1game1.getCorrectCompetiveScope();
		    		result3 = case1game1.getCorrectCostStrategy();
		    		result4 = case1game1.getBrandImageLink();
		    		video = case1game1.getBrandVideoLink();
		    		
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
			 LayoutInflater inflater = (LayoutInflater) Game2_Activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			 View layout = inflater.inflate(R.layout.popup,(ViewGroup) findViewById(R.id.xx));
			
			 pw = new PopupWindow(layout, 560, 400, true);
			 pw.showAtLocation(layout, Gravity.CENTER, 0, 0);

			 
			 TextView popuptext = (TextView) layout.findViewById(R.id.textView1);
			 popuptext.setText("Cometitive Scope:\n" + result2 + "\n\nCost Strategy:\n" + result3);
			 
			 TextView headertext = (TextView) layout.findViewById(R.id.textView2);
			 headertext.setText("Well Done!!!");
			 
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
