## Dev Process

Need a way to measure the efficacy of the matching algorithm. For every placement someone _couldnt_ get, add a point; 
high points = worse performance?

The pattern to making the data can be found in the following pattern:
```
1|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15
2|1|3|4|5|6|7|8|9|10|11|12|13|14|15|16
3|1|4|5|6|7|8|9|10|11|12|13|14|15|16|17
...
38|1|39|40|41|42|43|44|45|46|47|48|49|50|51|52
39|1|40|41|42|43|44|45|46|47|48|49|50|51|52|53
40|1|41|42|43|44|45|46|47|48|49|50|51|52|53|54
41|2|42|43|44|45|46|47|48|49|50|51|52|53|54|55
41|2|43|44|45|46|47|48|49|50|51|52|53|54|55|56
41|2|44|45|46|47|48|49|50|51|52|53|54|55|56|57
...
```
Essentially, I made sure that the 1st floor had the highest number of placements per unit, which I asked, and turned out it was 40. Then, I made the first 40 students have the 1st unit as their first selection
Then, I started on 


## Refactoring Notes (To review after development is complete)

Could it be possible to write another program that synthesizes the data naturally? I.e. to look natural?

When `studentSelections` in `FileParser.java` is a
```java
HashMap<String, List<String>>
```
there were no compiler errors. But, when it was a 
```java
HashMap<String, ArrayList<String>>
```
I had compiler errors. I wasn't sure why, so I left it as is and moved forward so I can review later. 

