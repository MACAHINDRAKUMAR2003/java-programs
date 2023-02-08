import java.io.*;
import java.util.Scanner;
public class Split {
public static void main(String args[]) {
try{
// Reading file and getting no. of files to be generated
String inputfile = &quot;test.txt&quot;; // Source File Name.
// No. of lines to be split and saved in each output file.
double nol = 5.0;
File file = new File(inputfile);
Scanner scanner = new Scanner(file);
int count = 0;
while (scanner.hasNextLine())
{
scanner.nextLine();
count++;
}
// Displays no. of lines in the input file.
System.out.println(&quot;Lines in the file: &quo10:06 03-02-2023t; + count);
double temp = (count/nol);
int temp1=(int)temp;
int nof=0;
if(temp1==temp)
{
nof=temp1;
}
else
{
nof=temp1+1;

}
System.out.println(&quot;No. of files to be generated :&quot;+nof);
// Actual splitting of file into smaller files
BufferedReader br = new BufferedReader(new
FileReader(inputfile));
String strLine;
for (int j=1;j&lt;=nof;j++)
{
// Destination File Location
FileWriter fw= new FileWriter(&quot;File&quot;+j+&quot;.txt&quot;);
for (int i=1;i&lt;=nol;i++)
{
strLine = br.readLine();
JAVA PROGRAMMING LAB KNREDDY
SANTHIRAM ENGINEERING COLLEGE Page 28
if (strLine!= null)
{
strLine=strLine+&quot;\r\n&quot;;
fw.write(strLine);
}
}
fw.close();
}
br.close();
}
catch (Exception e) {
System.err.println(&quot;Error: &quot; + e.getMessage());
}
}
}