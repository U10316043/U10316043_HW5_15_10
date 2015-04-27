import java.util.*;

public class testmystack{
	/**Main method*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);// Scanner
		stack object = new stack();//new an object

		
		for(int i = 1;i<=5;i++){
			System.out.print("Please input a string: ");
			String a = input.next();//create a
			object.push(a);//invoke method push
		}
		
		stack deepclone = new stack();
		deepclone = (stack)object.clone();
		
		while(!object.isEmpty()){
			System.out.print(object.pop()+" ");//print and invoke method

			}
		if(object == deepclone){
			System.out.print("no change");
		}	
		else{
			System.out.print("change");//my address of memory is change
		}	
	}
}

class stack implements Cloneable{
	ArrayList<Object> list = new ArrayList<Object>(); //ne arraylist

	
	//method
  public boolean isEmpty() {
    return list.isEmpty();
  }


  public int getSize() {
    return list.size();
  }


  public Object peek() {
    return list.get(getSize() - 1);
  }


  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }


  public Object push(Object o) {
    return list.add(o);	
  }
  
  @Override /** Override the toString in the Object class */
	public Object clone(){
		try{
			stack aa = (stack)super.clone();
			aa.list = (ArrayList<Object>)list.clone();//arraylist copy to aa
			return aa;
		}
		catch(CloneNotSupportedException ex){
		return null;//except situation is null
		}
	}
}
