import org.teachingextensions.logo.Tortoise;

 // Copyright Wintriss Technical Schools 2013
public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
	  Tortoise.setSpeed(10);
	  for(int i=0; i<360;i++)
	  {
		Tortoise.move(1);
		Tortoise.turn(1);
	  }
		 
  }
  

}



