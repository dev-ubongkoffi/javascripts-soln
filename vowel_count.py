word = input("Enter a word: ")

vowel = 0
consonant = 0

for letter in word:

    if letter == "a" or letter == "e" or letter == "i" or letter == "o" or letter == "u":
        print("Vowel")
        vowel = vowel + 1

    else:
        print("Consonant")
        consonant = consonant + 1

print("Total vowels:", vowel)
print("Total consonants:", consonant)
