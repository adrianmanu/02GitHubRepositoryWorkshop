public class HelloWorld {
     public static void main(String[] args) {
	    int number1,addition;
            int number2;
		int number3, number4, subtraction;
		//code to read from keyboard
		number1=26;
		number2=20;
		number3=10;
		number4=8;
		addition=addTwoNumbers(number1, number2);
		subtraction=reductTwoNumbers(number3, number4);
          System.out.println("Hello World from Adrian Ramos");
		  
		  System.out.println("The addition of " +number1+ " and "+number2 + " is --> " + addition);
		  
		  System.out.println("The subtraction of " + number3 + " and " + number4 + " is -->" + subtraction);
		  
	}
	
	public static int addTwoNumbers(int addwnd1, int addend2){
	int total=0 ;
	total = addwnd1 + addend2;
	return total;
	}
        public static int reductTwoNumbers(int reduct1, int reduct2){
		int total=0;
		total = reduct1 - reduct2;
		return total;
	}
}
	
