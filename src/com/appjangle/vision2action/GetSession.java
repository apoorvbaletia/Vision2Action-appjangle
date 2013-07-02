package com.appjangle.vision2action;

import io.nextweb.Session;
//import java.io.Serializable;

public class GetSession {

	//LocalServer server = Nextweb.startServer(9000);
	public Session session;	
	
		
	public GetSession(Session session){
	    this.session = session;
	}
	
	public Session GiveSession(){
	    return session;
	}
	
	
}
