Outline | Value
--------|-------
Course | SEG-3103
Date | July 1, 2021
Professor | Andrew Forward aforward@uottawa.ca
TA | Henry Chen zchen229@uottawa.ca
Team | Vivianne Yee 300118868

# Part 1: Grades

When using stubs, random grades were outputted and didn't depend on any inputs.
Screenshots of the results:
![stub-results](https://user-images.githubusercontent.com/55165979/123692920-65e79f00-d825-11eb-8213-63f9bbbc5c6e.png)
![stub-results2](https://user-images.githubusercontent.com/55165979/123692926-6849f900-d825-11eb-93ed-dc42996e0386.png)


When using the code from assignment 2, it produced an error which can be seen below:
![ass2-results](https://user-images.githubusercontent.com/55165979/123697309-c0cfc500-d82a-11eb-9ae2-b7695d2925ec.png)


# Part 2: Twitter

After writing the missing tests and running them, the results showed that one of the tests failed.
Screenshot of test results: 
![junit-results](https://user-images.githubusercontent.com/55165979/123887649-e4c10280-d91f-11eb-8c7b-fc0487050c46.png)


I used this test failure to make changes in the code, fixing the isMentioned() method. Once I had made changes to the code, I re-ran the tests and the results are shown below (note: the actual_call() test failed since the random number generated in the loadTweet() method causes the test to sometimes fail and sometimes pass).
![junit-results2](https://user-images.githubusercontent.com/55165979/123887838-2fdb1580-d920-11eb-8612-b99c500ab3d4.png)
