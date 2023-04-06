package kensyu_20230316;

public enum foodName {
	chicken(0),
	beef(1),
	pork(2),
	potato(9);
	
    private int namaid;

    private foodName(int namaid) {
        this.namaid = namaid;
      }
    private foodName() {
    }
    

}
