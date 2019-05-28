package com.cg.vo;

public abstract class MediaItem extends Item {
private int runtime;
private String genre;
public int getRuntime() {
	return runtime;
}

public void setRuntime(int runtime) {
	this.runtime = runtime;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
@Override
public void print() {
	super.print();
	System.out.println("Run Time = "+runtime);
	System.out.println("Genre = "+genre);
}



}
