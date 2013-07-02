package com.appjangle.vision2action;


import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.WindowManager;
import io.nextweb.Node;
import io.nextweb.jre.Nextweb;
import com.appjangle.vision2action.GameData;
import com.appjangle.vision2action.Vision2Action;


public class Splash_Activity extends Activity  { 
    
	 int i=1;
     Node cases;
     
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.logosplash);
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    	             	
        new LongOperation().execute("");
        
      
	 }    
	
    
  
    
    
    private class LongOperation extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
        	
        	Vision2Action.server = Nextweb.startServer(23211); 
        	Vision2Action.session = Nextweb.createSession();		        	
            cases = Vision2Action.session.seed("local").get();	
        	GameData.writeFewCasesData(Vision2Action.session, cases);
        	GameData.writeCompleteCasesData(Vision2Action.session, cases);
            return "Complete";
        }       

        @Override
        protected void onPostExecute(String result) {
        	StartMain();
        }
     
    }
   
    
    public void StartMain(){
    	
    	Intent j=new Intent(this,Main_Activity.class);
		j.putExtra("uri", cases.uri());
		j.putExtra("index", i);
	    startActivity(j);
	    finish();
    	
    }
    
    
} 
  