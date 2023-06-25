package kensyu_20230413;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Gathering gathering;
		
		gathering = new MorningGathering();
		gathering.execute();
		
		gathering = new NoonGathering();
		gathering.execute();
		
		gathering = new EveningGathering();
		gathering.execute();

        
	}

}
