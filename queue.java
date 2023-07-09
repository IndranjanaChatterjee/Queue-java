import java.util.*;
public class queue
{
    int q[];
    int f,r;
    queue(int n)//parameterised constructor
    {
        q=new int[n];
        f=-1;//default initialization
        r=-1;
    }
    void insert(int num)//insertion of elements
    {
        if(r==(q.length-1))//checking for overflows
        {
            System.out.println("Overflows");
        }
        else
        {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
            }
            else
            {
                r=r+1;
            }
            q[r]=num;//inserting elements
        }
    }
    void delete()
    {
        if(f==-1 && r==-1)//checking for underflows
        {
            System.out.println("Underflows");
            
        }
        else
        {
            int val;
            val=q[f];
            //System.out.println(val);
            if(f==r)//if front end becomes equal to rear end then it is the last element to be deleted
            {
                f=-1;
                r=-1;
            }
            else
            {
                f=f+1;
            }
        }
    }
    void print()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Queue underflows");
        }
        else
        {
            int i;
            for(i=f;i<=r;i++)//printing
            {
                System.out.println(q[i]);
            }
        }
    }
}