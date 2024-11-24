# Unique Domain Extractor

Problem





Develop a program that reads a single line of input containing multiple URLs in CSV (Comma Separated Values) format, extracts the domain names from these URLs, and prints each domain name once, removing duplicates.





Input Format



A single line containing multiple URLs separated by commas. There are no spaces between the URLs and the commas.





Output Format



Print the unique domain names extracted from the URLs, each on a new line.





Sample Inputs & Outputs



Sample Input 1

https://www.google.com,https://www.google.com,http://www.example.com,https://www.google.com



Sample Output 1

www.google.com

www.example.com







Sample Input 2

http://www.facebook.com,https://www.twitter.com,http://www.instagram.com,http://www.facebook.com



Sample Output 2

www.facebook.com

www.twitter.com

www.instagram.com







Constraints



The total length of the input line will not exceed 10,000 characters. URLs will follow the standard format (e.g., https://www.example.com).




