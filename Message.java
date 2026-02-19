/*
@author developer
@version 3.0
*/

class Message
{
	public static void main(String[]args)
	{
		String names[]={
			String.join(" # ","   ***     ","   ***    "," ******  ","  ******   "),
			String.join(" # ","**     **  ","**     ** "," **   ** "," **        "),  
			String.join(" # ","**     **  ","**     ** "," **   ** ","**         "),  
			String.join(" # ","**     **  ","**     ** "," **  **  "," ******    "),  
			String.join(" # ","**     **  ","**     ** "," **      ","      **   "),  
			String.join(" # ","**     **  ","**     ** "," **      ","       **  "),  
			String.join(" # ","   ***     ","   ***    "," **      ","  ******   ")  
		};
		
		for (String name:names){
			System.out.println(name);
		}
		
		
	}
}