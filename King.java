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
		System.out.println("Ӣ������:"+name+" �۸�:"+price+"���"+" Ƥ��:"+skin+" �۸�:"+pfprice+"��ȯ"+" ̨����:"+line);
	}
}
	