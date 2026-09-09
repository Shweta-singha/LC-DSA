class Solution:
    def lengthOfLastWord(self, s: str) -> int:

        words=s.split() #words = ["Hello", "World"]

        length=len(words) #2 

        last_word=len(words[-1]) #World

        return last_word


        