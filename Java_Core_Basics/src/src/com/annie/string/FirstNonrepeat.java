package com.annie.string;

public class FirstNonrepeat {
	
			 
			  // Function which repeats
			  // first Nonrepeating character
			  public static void FirstNonRepeat(String s)
			  {
			 
			    for (int i = 0; i < s.length(); i++) {
			 
			      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
			        System.out.println("First non-repeating character is "+ s.charAt(i));
			        break;
			      }
			    }
			    return;
			  }
			  public static void main (String[] args) {
			    String s = "google";
			    FirstNonRepeat(s);
			  }
			}
