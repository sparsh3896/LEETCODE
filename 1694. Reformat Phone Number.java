class Solution {
    public String reformatNumber(String number) 
    {
       char [] ch= number.toCharArray();
        
        String s="";
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!=' ' && ch[i]!='-')
                s+=ch[i];
        }
        
        char ch1 []= s.toCharArray();
        int c= ch1.length;
        int i,check=0,cc=c;
        String str="";
        
        for(i=0;i<ch1.length;i++)
        {    
            if(cc%3==1)
            {
            if(c==4)
            {
                if(str!="")
                str+="-";
                break;
            }
            }
            
            if(check==3)
            {
                str+='-';
                check=0;
                i--;
               
            }
            
            else
            {
                str+=ch1[i];
                check= check+1;
                c--;
            }
         
            
        }
        
        if( cc%3==1)
        {
            
            check=0;
        for(int j=i;j<ch1.length;j++)
        {
          if(check==2)
            {
                str+="-";
                check=0;
                j--;
            }
            
            else
            {
                str+=ch1[j];
                check+=1;
                
            }  
        }
        }
        return str;
        
    }
}

// The approach is very naive i.e without using string builder or queue
