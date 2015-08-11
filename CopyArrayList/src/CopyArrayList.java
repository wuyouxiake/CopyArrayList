import java.util.ArrayList;
import java.util.Random;


public class CopyArrayList {
	public static void main(String[] args){
		Random r = new Random();
		int ran_num;
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		for(int i=0;i<10;i++){
			ran_num = 1 + r.nextInt(100);
			list1.add(ran_num);
		}
		for(int i=0;i<10;i++){
			list2.add(list1.get(i));
		}
		
		
		list1.set(9, -7);
		for(int i=0;i<list1.size();i++){
			System.out.print(list1.get(i)+"	");
		}
		System.out.println();
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+"	");
		}
	}
}
