# Shorten-URL
Algorithm for Shortening URL
I have taken 62 characters into consideration with [a-z][A-Z][0-9].
Let's say a URL is stored in a database with auto incremented numerical keys.
We can use those keys to generate shortened URL by converting the key to a number of base 62.
And then we can use the digits of base 62 number to map corresponding character and store in a string.
While decoding we can get the characters one by one and find the corresponding number to those characters and we can get the number in decimal base.
After Decimal number is obtained, we can use that key to find the corresponding URL where we want to redirect.
The code is written in Java and it encodes and decodes the URL.
