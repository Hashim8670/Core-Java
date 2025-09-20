package CoreJava;
 
class  Printer
{
	void printdoc(String doc)
{
		System.out.println( "Print Doc "+"\n"+doc);
	}
}
class OfficeWork
{ 
	
	  void dowork() 
	  {
		  Printer p = new Printer();
		  p.printdoc("java Book");
		  System.out.println("Work Success Fully");
	  }
}
public class UsesARelation {
  public static void main(String[] args) {
	  OfficeWork ow = new OfficeWork();
	  ow.dowork();
}
}
