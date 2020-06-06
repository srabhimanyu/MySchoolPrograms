class NewCircle implements NewShape
{
public void getRadius()
{
System.out.println(radius);
    }
}
class ExtendInterface extends NewCircle
{
public static void main(String args[])
{
NewShape nc = new NewCircle();
nc.getRadius();}
    }