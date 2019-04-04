import java.util.*;
import java.lang.*;
public class DotLength{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("请输入该点的横坐标:");
		int x1=scanner.nextInt();
		System.out.print("请输入该点的纵坐标:");
		int y1=scanner.nextInt();
	    System.out.println("第一个点的坐标为:"+"("+x1+","+y1+")");
		System.out.print("请输入另一个点的横坐标:");
		int x2=scanner.nextInt();
		System.out.print("请输入该点的纵坐标:");
		int y2=scanner.nextInt();
	    System.out.println("第二个点的坐标为:"+"("+x2+","+y2+")");
		double length=getLength(x1,y1,x2,y2);
		System.out.println("两点之间的距离为:"+length);

	}
	public static double getLength(int x1,int y1,int x2,int y2){
		double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return length;
	}
}