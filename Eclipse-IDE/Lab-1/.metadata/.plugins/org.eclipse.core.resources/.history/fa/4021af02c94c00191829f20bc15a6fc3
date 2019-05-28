package com.cg.vo;

import java.util.Scanner;

public class Video extends MediaItem {
private String director;

private int releaseYear;
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}

public int getReleaseYear() {
	return releaseYear;
}
public void setReleaseYear(int releaseYear) {
	this.releaseYear = releaseYear;
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
System.out.println("Enter the director name:");
setDirector(scan.next());
System.out.println("Enter the genre:");
setGenre(scan.next());
System.out.println("Enter the release Year:");
setReleaseYear(scan.nextInt());

return 1;
}
@Override
public void print() {
	super.print();
	System.out.println("Director = "+director);
	System.out.println("Released Year = "+releaseYear);
}



}
