package kensyu_20230330;

public class SmartWatch extends Watch {
	SmartWatch(){
		
	}
	SmartWatch(String str){
       super(str);
	}
	//2分充電
	@Override
	protected int getTime() {
		return 2;
	}

}
