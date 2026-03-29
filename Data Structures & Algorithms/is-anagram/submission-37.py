class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d1=Counter(s)
        d2=Counter(t)
        if len(d1)!=len(d2) :
            return False
        else :
            for char in d1:
                if char not in d2 or d1.get(char)!=d2.get(char):
                    return False
        return True