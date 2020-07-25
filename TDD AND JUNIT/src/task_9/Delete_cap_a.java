//package task_9;

public class Delete_cap_a {
    public static String delete_cap_a(String a,int posi,char ch)
    {
        String s="";
        for(int i=0;i<=posi;i++)
        {
            int x1=checkat(i,ch,a);
            if(x1==0)
                s=s+a.charAt(i);
        }

        for(int i=posi+1;i<a.length();i++)
            s=s+a.charAt(i);
        return s;
    }
    public static int checkat(int pos,char ch,String s)
    {
        if(s.charAt(pos)==ch)
            return 1;
        return 0;
    }
}