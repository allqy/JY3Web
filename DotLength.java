import java.util.*;
import java.lang.*;
public class DotLength{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("������õ�ĺ�����:");
		int x1=scanner.nextInt();
		System.out.print("������õ��������:");
		int y1=scanner.nextInt();
	    System.out.println("��һ���������Ϊ:"+"("+x1+","+y1+")");
		System.out.print("��������һ����ĺ�����:");
		int x2=scanner.nextInt();
		System.out.print("������õ��������:");
		int y2=scanner.nextInt();
	    System.out.println("�ڶ����������Ϊ:"+"("+x2+","+y2+")");
		double length=getLength(x1,y1,x2,y2);
		System.out.println("����֮��ľ���Ϊ:"+length);

	}
	public static double getLength(int x1,int y1,int x2,int y2){
		double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return length;
	}
}