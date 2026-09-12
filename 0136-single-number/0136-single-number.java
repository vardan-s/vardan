class Solution {
    public int singleNumber(int[] a) {
        if(a.length==1)
        return a[0];
        
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(i==j)
                continue;
                if(a[i]==a[j])
                count++;
                
            }
            if(count==0)
            return a[i];
        }
        return -1 ;
      
    }
}