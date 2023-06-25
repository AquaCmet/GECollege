package kensyu_20230413;

//号令
abstract class Gathering {
	
	protected void standup() {
		System.out.println("起立");
	}
	abstract void greeting(); //挨拶
	
	public void execute() {
		greeting();
	}
}


/*
 * 仕事(abstract)
 * 通勤(徒歩、自転車、車、電車)
 * 仕事内容(SE,PG)
 */
