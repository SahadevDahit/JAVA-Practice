package oop;

import java.util.StringJoiner;

public class String_joiner {
public static void main(String[] args) {
	StringJoiner joiner=new StringJoiner(",","[","]");
	joiner.add("sahadev").add("dahit").add("hunk").toString();
	System.out.println(joiner);
}
}
