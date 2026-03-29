class Solution:
    def maxArea(self, heights: List[int]) -> int:
        g,d=0,len(heights)-1
        maxA=0
        while g<d:
             h = min(heights[g],heights[d]) 
             w = d-g
             maxA=max(maxA,h*w)
             if heights[g]<heights[d] :
                 g+=1
             else :
                 d-=1
        return maxA