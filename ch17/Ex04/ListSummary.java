package ch17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {
		//arraylist
		List<String>al=new ArrayList<>();
		al.add("��");
		al.add("��");
		al.add("��");
		al.add("��");
		System.out.println(al);
		
		//vector
		List<String>vl=new Vector<>();
		vl.add("��");
		vl.add("��");
		vl.add("��");
		vl.add("��");
		System.out.println(vl);
		
		//linkedlist
		List<String>ll=new LinkedList<>();
		ll.add("��");
		ll.add("��");
		ll.add("��");
		ll.add("��");
		System.out.println(ll);
	}
}
