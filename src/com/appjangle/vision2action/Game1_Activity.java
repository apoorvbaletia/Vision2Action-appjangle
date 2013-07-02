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
import android.graphics.Color;
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

import com.appjangle.vision2action.game1.LoadIndustryStructureQuestion;
import com.appjangle.vision2action.game1.IndustryStructureQuestion;



public class Game1_Activity extends Activity implements OnClickListener {
	 
	 int i = 0;
	 String result = "";
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
	 
	 int b1i,b2i,b3i,b4i,b5i;
	 int correct_b1i,correct_b2i,correct_b3i,correct_b4i,correct_b5i;
	 	
	 Node cases;
	 PopupWindow pw;
	 Drawable d;
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.game1);
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
        View sixthtButton=findViewById(R.id.button8);
        sixthtButton.setOnClickListener(this);
        View imageButton=findViewById(R.id.imageView1);
        imageButton.setOnClickListener(this);
                
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button8 = (Button) findViewById(R.id.button8);
       
		textView1 = (TextView) findViewById(R.id.textView1);
		textView2 = (TextView) findViewById(R.id.textView2);
		textView3 = (TextView) findViewById(R.id.textView3);

        imageView1 = (ImageView) findViewById(R.id.imageView1);
        
        
        b1i=0;b2i=0;b3i=0;b4i=0;b5i=0;
        
        textView1.setTextColor(Color.parseColor("#808080"));
        textView2.setTextColor(Color.parseColor("#FF0000"));
        textView3.setTextColor(Color.parseColor("#008000"));
        
        i=getIntent().getIntExtra("index",1);
        String temp = Integer.toString(i); 
		
    	IndustryStructureQuestion case1game1 = LoadIndustryStructureQuestion
				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

    	result = case1game1.getCorrectIndustryStructure();
		result2 = case1game1.getThreatOfSubsitutes(); 
		result3 = case1game1.getSupplierPower()  + case1game1.getRivarly() + case1game1.getBuyerPower() + case1game1.getNewEntrants();
		result4 = case1game1.getBrandImageLink();
		video = case1game1.getBrandVideoLink();

		 new LongOperation2().execute(d);
	 }
	    
	
    
    public void onClick(View v){
		switch (v.getId()){
		  		
		        case R.id.button1:
		        	if (b1i==0)
		        	{ button1.setBackgroundResource(R.drawable.thsred);   b1i++; }
					else if (b1i==1)
	        		{ button1.setBackgroundResource(R.drawable.thsgreen);   b1i++; }
					else if (b1i==2)
	        		{ button1.setBackgroundResource(R.drawable.raecgrey);   b1i=0; }
		        break;
		        
				case R.id.button2:
					if (b2i==0)
		        	{ button2.setBackgroundResource(R.drawable.spred);   b2i++; }
					else if (b2i==1)
	        		{ button2.setBackgroundResource(R.drawable.spgreen);   b2i++; }
					else if (b2i==2)
	        		{ button2.setBackgroundResource(R.drawable.spgrey);   b2i=0; }
									
			    break;	
			    
				case R.id.button3:
					if (b3i==0)
		        	{ button3.setBackgroundResource(R.drawable.thnered);   b3i++; }
					else if (b3i==1)
	        		{ button3.setBackgroundResource(R.drawable.thnegreen);   b3i++; }
					else if (b3i==2)
	        		{ button3.setBackgroundResource(R.drawable.thnegrey);   b3i=0; }
		        	 
			    break;
			    
				case R.id.button4:
					if (b4i==0)
		        	{ button4.setBackgroundResource(R.drawable.bpred);   b4i++; }
					else if (b4i==1)
	        		{ button4.setBackgroundResource(R.drawable.bpgreen);   b4i++; }
					else if (b4i==2)
	        		{ button4.setBackgroundResource(R.drawable.bpgrey);   b4i=0; }
				break;
				
				case R.id.button5:
					if (b5i==0)
		        	{ button5.setBackgroundResource(R.drawable.raecred);   b5i++; }
					else if (b5i==1)
	        		{ button5.setBackgroundResource(R.drawable.raecgreen);   b5i++; }
					else if (b5i==2)
	        		{ button5.setBackgroundResource(R.drawable.raecgrey);   b5i=0; }			
						
				break;
				
				case R.id.button6:	
					
					button1.setBackgroundResource(R.drawable.thsgrey);   b1i=0;					
		        	button2.setBackgroundResource(R.drawable.spgrey);   b2i=0;
					button3.setBackgroundResource(R.drawable.thnegrey);   b3i=0;					
		        	button4.setBackgroundResource(R.drawable.bpgrey);   b4i=0;						
					button5.setBackgroundResource(R.drawable.raecgrey);   b5i=0;
					
					if(i<13)        	     		        	 	        	
			        	  i++;
			        	else
			        	  i=1;
					   	        	
		        	String temp = Integer.toString(i); 
		        	
		        	IndustryStructureQuestion case1game1 = LoadIndustryStructureQuestion
		    				.getQuestionFromNode(Vision2Action.session, Vision2Action.session.node(getIntent().getStringExtra("uri") + "/c" + temp));

		    		
		    		result = case1game1.getCorrectIndustryStructure();
		    		result2 = case1game1.getThreatOfSubsitutes(); 
		    		result3 = case1game1.getSupplierPower()  + case1game1.getRivarly() + case1game1.getBuyerPower() + case1game1.getNewEntrants();

		    		result4 = case1game1.getBrandImageLink();
		    		video = case1game1.getBrandVideoLink();
		    		
		    		new LongOperation2().execute(d);
		    	break;	
		    	
				case R.id.button8:
					String tempchar;
					
					 result = result.replaceAll("high","1");
					 result = result.replaceAll("low","2");
					 //textView1.setText(result);
					 
					 tempchar = String.valueOf(result.charAt(0));
					 correct_b1i = Integer.parseInt(tempchar);
					 tempchar = String.valueOf(result.charAt(2));
					 correct_b2i = Integer.parseInt(tempchar);
					 tempchar = String.valueOf(result.charAt(4));
					 correct_b3i = Integer.parseInt(tempchar);
					 tempchar = String.valueOf(result.charAt(6));
					 correct_b4i = Integer.parseInt(tempchar);
					 tempchar = String.valueOf(result.charAt(8));
					 correct_b5i = Integer.parseInt(tempchar);
					 
					 int count=0;
					 
					 if (correct_b1i==b1i)
						 count++;
					 if (correct_b2i==b2i)
							 count++;
					 if (correct_b3i==b3i)
								 count++;
					 if (correct_b4i==b4i)
								 	count++;
					 if (correct_b5i==b5i)
								 		count++; 
						  
					 String temp2 = Integer.toString(count); 
					 if (count<5)  
						 toast("The answer is incorrect! You got " + temp2 + " right!!");
					 else
						 popup();
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
    
    
    
    
    
    public void toast (String msg) {
        Toast.makeText (getApplicationContext(), msg, Toast.LENGTH_SHORT).show ();
    }  
    
    
    public void popup() { 
			 LayoutInflater inflater = (LayoutInflater) Game1_Activity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

			 View layout = inflater.inflate(R.layout.popup,(ViewGroup) findViewById(R.id.xx));
			
			 pw = new PopupWindow(layout, 560, 400, true);
			 pw.showAtLocation(layout, Gravity.CENTER, 0, 0);

			 
			 TextView popuptext = (TextView) layout.findViewById(R.id.textView1);
			 popuptext.setText(result2+result3);
			 
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
