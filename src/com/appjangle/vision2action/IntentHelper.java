package com.appjangle.vision2action;

import io.nextweb.Session;

import java.util.Hashtable;

public class IntentHelper {

    private static IntentHelper _instance;
    private Hashtable<String, Session> _hash;

    private IntentHelper() {
        _hash = new Hashtable<String, Session>();
    }

    private static IntentHelper getInstance() {
        if(_instance==null) {
            _instance = new IntentHelper();
        }
        return _instance;
    }

    public static void addObjectForKey(Session object, String key) {
        getInstance()._hash.put(key, object);
    }

    public static Object getObjectForKey(String key) {
        IntentHelper helper = getInstance();
        Object data = helper._hash.get(key);
        helper._hash.remove(key);
        helper = null;
        return data;
    }
}