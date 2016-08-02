package com.example;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Greeting implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2224394152420781764L;
	private  long id;
    private  String name;
    private  String content;
    
    public Greeting() {
	}
    
	public Greeting(long id, String name, String content) {
		this.id = id;
		this.name = name;
		this.content = content;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


    
}
