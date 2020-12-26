class Solution {
    public int countStudents(int[] students, int[] sandwiches) 
    {
      ArrayList<Integer> sand =new ArrayList<>();
        ArrayList<Integer> stud =new ArrayList<>();
         
        for(int i=0;i<students.length;i++)
        {
            sand.add(sandwiches[i]);
            stud.add(students[i]);
        }
        
        while(sand.size()!=0)
        {
            if(sand.get(0)==stud.get(0))
            {
                sand.remove(sand.get(0));
                stud.remove(stud.get(0));
            }
            else if(sand.get(0)!=stud.get(0))
            {
                stud.add(stud.get(0));
                stud.remove(stud.get(0));
            }
             int c=0;
            for(int i=0;i<stud.size();i++)
            {
               if(sand.get(0)==stud.get(i) )
                   c=1;
                
            }
           
             if(c==0)
                break;
    

           
        }
      
        return stud.size();
        
    }
}
