
package demo;
import java.io.*;

public class Demo {
//FREDERIK ALEXIS SALCIDO ROMERO

    public static void main(String[] args) {
   try
{
FileReader fx=new FileReader("SIIAU20A.TXT");
BufferedReader f=new BufferedReader(fx);
String cad=f.readLine();
cad=f.readLine();

FileWriter fx1=new FileWriter("ONLIES.TXT");
BufferedWriter f1=new BufferedWriter(fx1);


String aux="";
while(cad!=null)
{
// EXTRAER 1 NRC
int pos=cad.indexOf(",");
String nrc=cad.substring(0,pos);


cad=cad.substring(pos+1);

pos=cad.indexOf(",");
cad=cad.substring(pos+1);

pos=cad.indexOf(",");
cad=cad.substring(pos+1);

pos=cad.indexOf(",");
cad=cad.substring(pos+1);

pos=cad.indexOf(",");
cad=cad.substring(pos+1);

// EXTRAER NOMBRE DE LA 2 MATERIA
pos=0;
char c=cad.charAt(pos);
while((c!='0')&&(c!='1')&&(c!='2')&&(c!='3')&&(c!='4')&&
(c!='5')&&(c!='6')&&(c!='7')&&(c!='8')&&(c!='9'))
{
pos++;
c=cad.charAt(pos);
}

String mate=cad.substring(0,pos-1);

cad=cad.substring(pos+1);

pos=cad.indexOf(",");
cad=cad.substring(pos+1);

pos=cad.indexOf(",");
cad=cad.substring(pos+1);

pos=cad.indexOf(",");
cad=cad.substring(pos+1);


// EXTRAER 3 CREDITOS
pos=cad.indexOf(",");
String cred=cad.substring(0,pos);

//extraccion de cup
cad=cad.substring(pos+1);
pos=cad.indexOf(",");
String cup=cad.substring(0,pos);
//fin del cup

//Extraer inscritos 


cad=cad.substring(pos+1);
pos=cad.indexOf(",");
String ocup=cad.substring(0,pos);
cad=cad.substring(pos+1);
//Campo calculado

int cad1=Integer.parseInt(cup);
int cad2=Integer.parseInt(ocup);

int r=cad1-cad2;
String disp=r+"";

//obtener el nombre del maestro
for(int i=0; i<11; i++){
    pos=cad.indexOf(",");
    cad=cad.substring(pos+1);
}
    pos=cad.indexOf(",");
    String ape=cad.substring(0,pos);
    
//Obtener el nombre    
cad=cad.substring(pos+1);
pos=cad.indexOf(",");
String nom=cad.substring(0,pos);

if(aux==""){
f1.write(nrc+","+mate+","+cred+","+cup+","+ocup+","+disp+","+ape+","+nom+"\n");
aux=nrc;}
if (aux.compareTo(nrc)!=0)
{

f1.write(nrc+","+mate+","+cred+","+cup+","+ocup+","+disp+","+ape+","+nom+"\n");
f1.flush();
aux=nrc;

}cad=f.readLine();
}
}
catch(IOException e){System.out.println("ERROR");}
            
    }
    
}
