import java.io.*;

class asd

{


static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


int frequency(String str,char ch)

{


if(str.length()==0)
return 0;


if(str.charAt(0)==ch)

return 1+frequency(str.substring(1),ch);


return frequency(str.substring(1),ch);


}





public static void main(String args[]) throws Exception

{

System.out.println(" enter the String ");

String str=br.readLine();


System.out.println(" enter the character ");


char ch=(char)br.read();




asd dd=new asd();

int c=dd.frequency(str,ch);


System.out.println(" the frequency of searched character "+ ch +" = "+ c);










}



}
