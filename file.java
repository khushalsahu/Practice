import java.util.HashMap;
import java.util.Scanner;

Public class file{
Public Static void Main(Strings[] args){
HashMap<Integer,String> map=new HashMap<>();
Scanner in= new Scanner(System.in);
System.out.print("Enter the size of Hashmap: ");
int size=in.nextInt();
for(int i=0;i<size;i++){
String value= in.next();
map.put(i,value);
  }
System.out.print(map);
 }
}
