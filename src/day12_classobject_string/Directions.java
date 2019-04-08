package day12_classobject_string;

public class Directions {
	// BREAK TILL 12:23 PM EST
	public static void main(String[] args) {
		char start, end;
		start = 'D';
		end = 'C';
		
		//check if all valid
		if(!(start >= 'A' && start <='D' && end >= 'A' && end <= 'D')) {
			System.out.println("Invalid start or end");
		}else if(start == end) {
			System.out.println("Already there");
		}else if(start == 'A') {
			if(end == 'B') {
				System.out.println("Go right");
			}else if(end == 'C') {
				System.out.println("Go right -> go down");
			}else if(end == 'D') {
				System.out.println("Go right -> go down -> go left");
			}
		}else if (start == 'B') {
			if(end == 'A') {
				System.out.println("Go down -> go left -> go up");
			}else if(end == 'C') {
				System.out.println("Go down");
			}else if(end == 'D') {
				System.out.println("Go down -> go left");
			}	
		}else if(start == 'C') {
			if(end == 'A') {
				System.out.println("Go left -> go up");
			}else if(end == 'B') {
				System.out.println("Go left -> go up -> go right");
			}else if(end == 'D') {
				System.out.println("Go left");
			}		
		}else if (start == 'D') {
			if(end == 'A') {
				System.out.println("Go up");
			}else if(end == 'B') {
				System.out.println("Go up -> go right");
			}else if(end == 'C') {
				System.out.println("Go up -> go right -> go down");
			}	
		}
		
	}
}
//
//package day12_classobject_string;
//public class Directions {
//public static void main(String[] args) {
//    char start, end;
//    start='C';
//    end='c';
////    Scanner input= new Scanner(System.in);
////    System.out.println("Enter starting point");
////    start=.i
//    if((start == 'A' || start == 'a') && (end =='B' || end == 'b'))
//    {
//        System.out.println("Go right");
//    }
//    else if((start == 'A' || start == 'a') && (end=='C' || end == 'c'))
//    {
//        System.out.println("Go right");
//        System.out.println("and go down");
//    }
//    else if((start == 'A' || start == 'a') &&( end=='D' || end == 'd'))
//    {
//        System.out.println("Go right,down and left");
//        
//    }
//    else if ((start == 'B' || start == 'b') && (end=='A' || end == 'a'))
//    {
//        System.out.println("Go down, left and up");        
//    }
//    else if((start == 'B' || start == 'b') && ( end=='C' || end == 'c'))
//    {
//        System.out.println("Go down");        
//    }
//    else if ((start == 'B' || start == 'b') &&( end=='D' || end == 'd'))
//    {
//        System.out.println("Go down and left");        
//    }
//    else if((start == 'C'|| start == 'c')  &&  (end=='A' || end == 'a'))
//    {
//        System.out.println("Go left and up");        
//    }
//    else if((start == 'C' || start == 'c') && (end=='B' || end == 'b'))
//    {
//        System.out.println("Go left, up and right");        
//    }
//    else if ((start == 'C' || start == 'c') && (end=='D' || end == 'd'))
//    {
//        System.out.println("Go left");        
//    }
//    else if((start == 'D' || start == 'd') && (end=='A' || end == 'a'))
//    {
//        System.out.println("Go up");        
//    }
//    else if((start == 'D' || start == 'd') && ( end=='B' || end == 'b'))
//    {
//        System.out.println("Go up and right");        
//    }
//    else if((start == 'D' || start == 'd') && ( end=='C' || end == 'c'))
//    {
//        System.out.println("Go up, right and down");        
//    }
//    else if(start==end)
//    {
//        System.out.println("already here");
//    }
//    else
//    {
//        System.out.println("False input");
//    }
//}
//}
////public static void main(String[] args) {
////	char start, end;
////	start='b';
////	end='c';
//////	Scanner input= new Scanner(System.in);
//////	System.out.println("Enter starting point");
//////	start=.i
////	if(start == 'A' || start == 'a' && end =='B' || end == 'b')
////	{
////		System.out.println("Go right");
////	}
////	else if(start == 'A' || start == 'a' && end=='C' || end == 'c')
////	{
////		System.out.println("Go right and down");
////	}
////	else if(start == 'A' || start == 'a' && end=='D' || end == 'd')
////	{
////		System.out.println("Go right,down and left");
////		
////	}
////	else if(start == 'B' || start == 'b' && end=='A' || end == 'a')
////	{
////		System.out.println("Go down, left and up");		
////	}
////	else if(start == 'B' || start == 'b' && end=='C' || end == 'c')
////	{
////		System.out.println("Go down");		
////	}
////	else if(start == 'B' || start == 'b' && end=='D' || end == 'd')
////	{
////		System.out.println("Go down and left");		
////	}
////	else if(start == 'C' || start == 'c' && end=='A' || end == 'a')
////	{
////		System.out.println("Go left and up");		
////	}
////	else if(start == 'C' || start == 'c' && end=='B' || end == 'b')
////	{
////		System.out.println("Go left, up and right");		
////	}
////	else if(start == 'C' || start == 'c' && end=='D' || end == 'd')
////	{
////		System.out.println("Go left");		
////	}
////	else if(start == 'D' || start == 'd' && end=='A' || end == 'a')
////	{
////		System.out.println("Go up");		
////	}
////	else if(start == 'D' || start == 'd' && end=='B' || end == 'b')
////	{
////		System.out.println("Go up and right");		
////	}
////	else if(start == 'D' || start == 'd' && end=='C' || end == 'c')
////	{
////		System.out.println("Go up, right and down");		
////	}
////	else if(start==end)
////	{
////		System.out.println("already here");
////	}
////	else 
////	{
////		System.out.println("False input");
////	}
////}
////}
//
//
