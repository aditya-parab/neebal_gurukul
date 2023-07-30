package com.day12;

class PolyData implements Comparable<PolyData>{
    double coeff;
    int pow;
	@Override
	public String toString() {
		
		if(pow==1){
			return coeff+"x";
		}
		
	
		
		return  coeff + "x^" + pow ;
	}
	public PolyData(double coeff, int pow) {
		super();
		this.coeff = coeff;
		this.pow = pow;
	}
	public double getCoeff() {
		return coeff;
	}
	public void setCoeff(double coeff) {
		this.coeff = coeff;
	}
	public int getPow() {
		return pow;
	}
	public void setPow(int pow) {
		this.pow = pow;
	}
	@Override
	public int compareTo(PolyData o) {
		// TODO Auto-generated method stub
		
		
		return pow-o.pow;
	}
	
	
}
class PolyExpression
{
	Node<PolyData>  first=null;
	
	public void add(double c,int pow) {
		//PolyData p=new PolyData(c,pow);
		Node<PolyData> temp=first;
		Node<PolyData> prev=null;
		if(c==0)
			return;
		while(temp!=null) {	//append the item on
			
			if(temp.getData().pow<=pow){
				break;
			}
			
			prev=temp;
			temp=temp.getNext();

			
		}
		
		if(temp!=null&&temp.getData().getPow()==pow) {
			temp.getData().setCoeff(temp.getData().getCoeff()+c);
		}
		else {
		Node<PolyData> newnode=	new Node<PolyData>(new PolyData(c,pow),null);
		if(temp==first) {
			newnode.setNext(first);
			first=newnode;
		}else
		{   newnode.setNext(temp);
			prev.setNext(newnode);
		}
		}
	}

	@Override
	public String toString() {
		
		String msg="";
		Node<PolyData> temp=first;
		while(temp!=null) {
			if(temp.getNext()==null || temp.getNext().getData().getCoeff()<0)
				msg+=temp.getData()+" ";
			else 
			{
//				if(temp.getNext().getData().getCoeff()<0)
//					msg+= temp.getData()+" - ";	
//				else
				msg+= temp.getData()+" + ";	
			
			}
			temp=temp.getNext();
		}
		return msg;
	}
	PolyExpression add(PolyExpression t) { //
		PolyExpression res=new PolyExpression();
		Node<PolyData> p1=first;
		Node<PolyData> p2=t.first;
		
		while(p1!=null) {
			res.add(p1.getData().getCoeff(),p1.getData().getPow());
			p1=p1.getNext();
		}
		p1=p2;
		while(p1!=null) {
			res.add(p1.getData().getCoeff(),p1.getData().getPow());
			p1=p1.getNext();
		}
		return res;
	}
	
	public PolyExpression multiply(PolyExpression t) {
		PolyExpression res=new PolyExpression();
		Node<PolyData> p1=first;
		Node<PolyData> p2=t.first;
		
		Node<PolyData> temp1 = p1;
		Node<PolyData> temp2 = p2;
		Node<PolyData> storeTemp2 = temp2;
		
		//iterate over both expressions, multiplying them
		while(temp1!=null) {
			PolyExpression ans=new PolyExpression();
			
			temp2=storeTemp2; //reset temp2
			
			while(temp2!=null) {
				ans.add(temp1.getData().getCoeff()*temp2.getData().getCoeff(),temp1.getData().getPow()+temp2.getData().getPow());
				
				temp2=temp2.getNext();
			}
			res=res.add(ans);
			temp1=temp1.getNext();
		}
		
		return res;
	}
	
}
public class PolynomialAdditionAndMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyExpression p1=new PolyExpression();

		PolyExpression p2=new PolyExpression();

		p1.add(2,3);
		p1.add(4,2);
		p1.add(2,1);
//		
		p2.add(7,4);
		p2.add(0.0,3);
		p2.add(6,2);
		p2.add(3,1);
		
		System.out.println(p1);
		System.out.println(p2);
		PolyExpression p3=p1.add(p2);
		System.out.println();
		System.out.print("Addition= ");
		System.out.println(p3);
		
		PolyExpression p4 = p1.multiply(p2);
		System.out.print("Multiplication= ");
		System.out.println(p4);
		

	}
}