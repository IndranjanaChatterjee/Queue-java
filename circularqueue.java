import java.util.*;
public class circularqueue
{
    int q[];
    int f,r;
    circularqueue(int n)//paramerterised constructor
    {
        q=new int[n];
        f=-1;
        r=-1;
    }

    void insert(int num)
    {
        if((f==0 && r==(q.length-1))||(f==(r+1)))//checking for overflowing
        {
            System.out.println("queue overflows");
        }
        else
        {
            if(f==-1 && r==-1)
            {
                f=0;
                r=0;
            }
            else if(r==(q.length-1))//reset to 0 if filled up
            {
                r=0;
            }
            else
            {
                r+=1;
            }
            q[r]=num;
        }
            
    }
    void delete()
    {
        if(f==-1 && r==-1)//checking for empty queue
        {
            System.out.println("queue underflows");
        }
        else
        {
            int val;
            val=q[f];
            if(f==(q.length-1))//reset to zero if reached last limit
            {
                f=0;
            }
            else if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            {
                f+=1;
            }
            System.out.println(val);
        }
    }
    void print()//printing
    {
        
        if(f==-1 && r==-1)
        {
            System.out.println("queue underflows");
        }
        else
        {
            int i;
            for(i=0;i<q.length;i++)
            {
                System.out.println(q[i]);
            }
        }
    }
}