/*
@author developer
@version 4.0
*/

class Message
{
	public static void main(String[]args)
	{
		//Creating a array to store the oops patterns
		String names[]=getpattern();
			
		
		for (String name:names){
			System.out.println(name);
		}
	}
		
		public static String[] getpattern(){
			return new String[] {
				"  ***  ",
				"**   **",
				"**   **",
				"**   **",
				"**   **",
				"  ***  "
			};
		}
		
		
		
		
	
}