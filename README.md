The purpose of RouteFinder is to take two major US cities that are linked by interstates, and find a series of routes between the two via the US interstate system. 

A sample input would be: 
City 1: San Diego
City 2: Los Angeles
 
And the expected output would be:
Route 1: I-5 North, 121 Miles
Route 2: I-15 North to I-215 North to I-10W, 161 Miles

The Program will work by performing a large number of distance limited depth-first searches along the graph 
of the US interstate system that was created. 

In order to ensure that no search performs indefinitely, a limit will be imposed on the distances by calculating the Haversine distance between the two cities and adding a derivative of that distance to the distance itself. This will find reasonable routes to and from the location within a reasonable distance and will simultaneously limit the algorithm to a reasonable distance.

The map has been created by taking data from google maps on approximately 180 cities that are nodes in the US interstate system.
