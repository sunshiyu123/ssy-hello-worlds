public class King{
	static int numbers=51;
	String name;
	int price;
	String skin;
	int pfprice;
	String line;
	public King(String name,int price,String skin,int pfprice,String line){
		this.name = name;
		this.price = price;
		this.skin = skin;
		this.pfprice = pfprice;
		this.line = line;
	}
	public void say(){
		System.out.println("英雄名称:"+name+" 价格:"+price+"金币"+" 皮肤:"+skin+" 价格:"+pfprice+"点券"+" 台词是:"+line);
	}
}
	
