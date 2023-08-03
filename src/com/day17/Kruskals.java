package com.day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Kruskals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Edge> pq=new PriorityQueue<>(new Comparator<Edge>() {

			@Override
			public int compare(Edge o1, Edge o2) {
				// TODO Auto-generated method stub
				return o1.getCost()-o2.getCost();
			}});
		int nodes=8;

		pq.add(new Edge(0,1,3));
		pq.add(new Edge(0,3,8));
		pq.add(new Edge(1,2,3));
		pq.add(new Edge(2,6,2));
		
		pq.add(new Edge(2,7,1));
		pq.add(new Edge(7,6,7));
		pq.add(new Edge(5,6,6));
		pq.add(new Edge(4,5,7));
		
		pq.add(new Edge(3,4,3));
		pq.add(new Edge(3,5,4));
		pq.add(new Edge(3,6,5));
		pq.add(new Edge(7,5,2));
		
		
		pq.add(new Edge(1,0,3));
		pq.add(new Edge(3,0,8));
		pq.add(new Edge(2,1,3));
		pq.add(new Edge(6,2,2));
		
		pq.add(new Edge(7,2,1));
		pq.add(new Edge(6,7,7));
		pq.add(new Edge(6,5,6));
		pq.add(new Edge(5,4,7));
		
		pq.add(new Edge(4,3,3));
		pq.add(new Edge(5,3,4));
		pq.add(new Edge(6,3,5));
		pq.add(new Edge(5,7,2));
        
        int [] parent=new int[nodes];
        Arrays.fill(parent,-1);
        
        	int i=0;
    		while(i<pq.size()) {
    			Edge edge=pq.poll();
    			
    			int p = edge.getParent();
    			int c = edge.getChild();
    			
    			while(parent[c]!=-1) {
    				c=parent[c];
    			}
    			while(parent[p]!=-1) {
    				p=parent[p];
    			}
    			if(p!=c) { //parent and child of the edge are not sharing common ancestor
    			System.out.println(edge);
    			i++;
    			parent[c]=p; //update the parent and child as they are not sharing common ancestor
    			
    			}
        }

	}}


