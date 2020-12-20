class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) 
    {
       int one=0;
        int n= distance.length;
        int d=0,sum=0;
        if(start>destination)
        {
            start=start^destination;
            destination=start^destination;
            start=start^destination;
            
        }
        for(int i=0;i<n;i++)
        {
            if(i>=start && i<destination)
            {
                one+= distance[i];
            }
            
            sum=sum+distance[i];       
        }
        
       int two= sum-one;
        return Math.min(one, two);
        
    }
}

//The approach is very simple we add distance in clockwise direction and then we subtract that distance from total distance therefore we have now both clockwise and anticlockwise distance 
//we return the min of the both.
//if  value of start is bigger than destination but we are add just clockwise therefore we swap the values of start and destination.
