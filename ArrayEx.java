public class ArrayEx
{
public static void main(String ar[])
{
 int sum=0;
int c[]={3,10,21,11,4};

/*for(int i=0;i<c.length;i++)
{System.out.println(c[i]);
sum+=c[i];
}*/
for(int g:c)//it will only increment and only by +1
{System.out.println(g);
sum+=g;
}
System.out.println("Total="+sum);
}

}