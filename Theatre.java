class Theatre{
public void show(int price, int total_tickets){
System.out.println("total cost of ticket for four members: " + price*total_tickets);
}
public static void main (String[] args){
 Theatre rohini_theatre = new Theatre();
rohini_theatre.show(120,4); 

 }
}
