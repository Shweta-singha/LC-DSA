class Solution {
    public int compress(char[] chars) 
    {
        int write = 0; 

        for(int read = 0; read<chars.length;)
        {
            char current = chars[read]; 
            int count = 0;

            while(read<chars.length && chars[read] == current){
                count ++; 
                read ++;
            }
            chars[write] = current;
            write ++; 

            if(count>1)
            {
                String countString = String.valueOf(count);

                for(int j=0;j<countString.length(); j++)
                {
                    chars[write] = countString.charAt(j);
                    write++;
                }
            }
        }

        return write; 

        
    }
}