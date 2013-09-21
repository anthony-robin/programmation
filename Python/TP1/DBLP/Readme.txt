---------------------------------
Explanation of the dataset
---------------------------------

This dataset is a subset of the DBLP dataset (http://dblp.uni-trier.de/). Vertices of the graph are authors and an edge exists between them if the corresponding authors have written a paper together in a given period of time. Only authors who had at least 10 publications (in a selected set of 43 conferences/journals) from 1990 to 2010 are considered. There are in total 2,723 authors. Each graph depicts co-authorship relations over 5 years ([1990-1994][1992-1996][1994-1998][1996-2000][1998-2002][2000-2004][2002-2006][2004-2008][2006-2010]). Notice that we consider overlapping time periods to maintain a coherence in the authorship relations. Each vertex at each time is associated to a set of 43 attributes corresponding to the number of publications in each conference/journal during the related period. To summarize, this dataset consists in 2,723 vertices, 9 timestamps and 43 attributes.


If you use this dataset, please cite the following work:

Elise Desmier, Marc Plantevit, Céline Robardet and Jean-François Boulicaut. Cohesive Co-Evolution Patterns in Dynamic Attributed Graphs. In Proceedings of Discovery Science (DS'12), 2012.

---------------------------------
Mapping files
---------------------------------

The file attributes_mapping contains the mapping attribute number / conference or journal name. The conferences/journals are listed in the same order as in the DBLPattr2723.txt file.

The file vertices_mapping contains the mapping vertex id (in our dataset) / dblp author id (in the original dblp dataset) / author name.

---------------------------------
Dataset files
---------------------------------

The file DBLPattr2723.txt contains the attributes values for all vertices and all timestamps.
The file DBLPgraph2723.txt contains the structure of the graph at all timestamps.

DBLPattr2723.txt
----------------

This file consists of 24516 lines, 2724 for each timestamp. 
The timestamps are described one after the other and each one consists of 
-> one line describing the timestamp number : T0, T1, ... or T8
-> 2723 lines describing each one of the 2723 vertices. Each vertex line begins with the vertex id followed by all attributes values for the current timestamp separated by a blank.


DBLPgraph2723.txt
-----------------

The graph is described here as an adjacency list. It consists of 24516 lines, 2724 for each timestamp. 
The timestamps are described one after the other and each one consists of 
-> one line describing the timestamp number : T0, T1, ... or T8
-> 2723 lines describing each one of the 2723 vertices. Each vertex line begins with the vertex id followed by all its neighbors id. If a and b are neighbors, a appears in b neighors and b appears in a neighbors.
