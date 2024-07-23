class Solution {
    public int countAsterisks(String s) 
    {
        int n= s.length(),count = 0,i=0;
        while(i<n)
        {
            if(s.charAt(i)=='*')
            {
                count++;
            }  
            else if(s.charAt(i)=='|')
            {
                i++;
                while(s.charAt(i)!='|')
                {
                    i++;
                }
            }
            i++;
        }
        return count;
    }
}
