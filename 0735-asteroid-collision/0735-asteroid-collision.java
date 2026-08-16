class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {

        Stack<Integer>stack = new Stack <>();

        for(int i=0; i<asteroids.length;i++)

        {
            int asteroid = asteroids[i];

            boolean alive = true;

            while(alive && asteroid < 0 && !stack.isEmpty() && stack.peek()>0) {
                if(stack.peek() < -asteroid)
                {
                    stack.pop();
                }
                else if(stack.peek() == -asteroid) {
                    stack.pop();
                    alive = false;
                }
                else{
                    alive = false;
                }
            }

            if(alive) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for(int i=0; i<stack.size(); i++)
        {
            result[i] = stack.get(i);
        }

        return result;
        
    }
}