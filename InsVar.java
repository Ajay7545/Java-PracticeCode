public class InsVar
{
int num;
void get(int num)
{this.num=num;}

void print()
{System.out.println(num);
}

}

class Main
{
public static void main(String ar[])
{InsVar i=new InsVar();
i.get(10);
i.print();
}
}