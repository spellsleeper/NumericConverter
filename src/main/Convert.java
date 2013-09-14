package main;

public class Convert {
	
	public String convert(int input,int target,String val){
		
		if(input==0&&target==1){
			int i=Integer.parseInt(val);
			val=Integer.toBinaryString(i);
		}else if(input==0&&target==2){
			int i=Integer.parseInt(val);
			val=Integer.toHexString(i);
		}else if(input==1&&target==0){
			int i=Integer.parseInt(val,2);
			val=Integer.toString(i);
		}else if(input ==1&&target==2){
			int i=Integer.parseInt(val,2);
			val=Integer.toHexString(i);
		}else if(input==2&&target==0){
			int i=Integer.parseInt(val,16);
			val=Integer.toString(i);
		}else if(input==2&&target==1){
			int i=Integer.parseInt(val,16);
			val=Integer.toBinaryString(i);
		}
		return val;
	}

}
