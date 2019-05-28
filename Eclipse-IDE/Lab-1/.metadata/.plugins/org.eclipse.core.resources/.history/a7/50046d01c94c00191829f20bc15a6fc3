package com.cg.vo;

import java.util.Scanner;

public class CD extends MediaItem{
	private  String artist;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override

	public int addproduct() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ID:");
		setId(scan.nextInt());
		System.out.println("Enter the title:");
		setTitle(scan.next());
		System.out.println("Enter the no. of Copies:");
		setCopies(scan.nextInt());
		System.out.println("Enter the runtime:");
		setRuntime(scan.nextInt());
		System.out.println("Enter the artist name:");
		setArtist(scan.next());
		System.out.println("Enter the genre:");
		setGenre(scan.next());		
		return 1;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Artist = "+artist);
	}
	
	
	}
	


