public class staticall
{
int no;
double t=12.2;
float balance;
static float interest;


void profile()
{no=125;
balance =5.20f;}


void print()
{System.out.println("NO is="+no);
System.out.println("Balance="+balance);
System.out.println("thanks for visit");}
//System.out.println(interet);
}

class now
{
public static void main(String[] args)
 { staticall.interest=5.0f;
     staticall n1=new staticall();   

n1.profile();
n1.print();
System.out.println(n1.t);


 }

}