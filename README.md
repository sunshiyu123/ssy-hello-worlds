# ssy-hello-worlds
This is a library
import java.util.*;
public class CaiPiao {
	public static void main(String[] args){
		int[] a = new int[7];
		int[] b = new int[7];
		System.out.println("请输入兑奖号码至少五位数字相等才能获奖数字不能重复");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<7;i++){
			a[i] = sc.nextInt();
		}
		for(int j = 0;j<7;j++){
			b[j] = (int)(Math.random()*35+1);
			if(j>0){
				while(true){
					for(int n = 0;n<j;n++){
						if(b[j]==b[n]){
							b[j] = (int)(Math.random()*36+1);
						}
					}
					break;
				}
			}
		}
		System.out.println("中奖号码为"+"\n");
		for(int q = 0;q<7;q++){
			System.out.println(b[q]+"\t");
		}
		int sum = 0;
		for(int k = 0;k<7;k++){
			for(int p = 0;p<7-k;k++){
				if(a[k]==b[p]){
					sum++;
					continue;
				}
			}
		}
		if(sum==7){
			System.out.println("恭喜你中了一等奖2000万！");
		}else if(sum==6){
			System.out.println("恭喜你中了二等奖1000万！");
		}else if(sum==5){
			System.out.println("恭喜你中了三等奖500万！");
		}else{
			System.out.println("距离重大奖以经很近了再接再厉哦！");
		}
	}
}
