class Solution:
    def findAndReplacePattern(self, words: List[str], pattern: str) -> List[str]:
        arr=[]
        for word in words:
            hm={}
            s=set()
            count=0
            for i in range(len(word)):
                if pattern[i] in hm:

                    if(hm[pattern[i]]==word[i]):
                        count+=1
                    else:
                        break
                else:
                    if word[i] not in hm.values(): 
                        hm[pattern[i]]=word[i]
                        count+=1
                    else:
                        break
            if count==len(pattern):
                arr.append(word)
        return arr
        
            