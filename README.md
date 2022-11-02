# COP3330_Stacks
# Using Java's Stack class  to take a message and encode it.   Let me explain how this will work.

## 1.Messages will be between 5 and 1,000,000 units long.
## 2.Messages will have groups to show which parts need to be encoded first.
## 3.The character '1' will show a start of a group, and the character '2' will the end
## 4.Each grouping will 3 characters.  Take the middle value will always be a vowel and the two end values will be consonants.   
## 5.Instead of consonants, another grouping can replace one or both of them.   A grouping cannot replace a vowel.   
## 6.You must evaluate the nested/replaced groupings.  Since 1 and 2 give you the end you can read it left to right. 
## 7.The output should only have the letters inside.

# Limitations

## - Class Name:  WordScramble
## - Public Static Methods:
## - String encode(String)
## - Must use the Stack Class
## - Strings will be no less than 5
## - Strings will have the same amount of 1s and 2s.
## - A 1 must come before a matching 2.