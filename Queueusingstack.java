public class MyQueue
{
Stack<Integer> s1=new Stack<>();
Stack<Integer> s2=new Stack<>();
public void push(int x)
{
s1.push(x);
}
public int pop()
{
if(s2.isEmpty())
{           
while(!s1.isEmpty())
{
s2.push(s1.pop());
}
}
return s2.pop();
}       
public int peek()
{
if(s2.isEmpty())
{
while(!s1.isEmpty())
{
s2.push(s1.pop());
}
}
return s2.peek();
} 
public boolean empty()
{
return s1.isEmpty() && s2.isEmpty();
}
}

output:

Your input  ["MyQueue","push","push","peek","pop","empty"]
            [[],[1],[2],[],[],[]]
Output      [null,null,null,1,1,false]
Expected    [null,null,null,1,1,false]