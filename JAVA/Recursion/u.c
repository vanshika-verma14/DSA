// original one returned true for empty string but thats wrong bcz empty string got nothing at all so i changed that to- return false

// Q1. what’s the time complexity for searching char in string of length n?
// ans - C) O(n)
// bcz in worst case have to check every character one by one till end

// Q2. strlen("Hello") gives?
// ans is B) 5
// it just counts the normal letters before \0, not the null char itself

// Q3. when checking palindrome of mixed-case n special chars string
// which step is most imp before actual check?
// D) normalize like make lowercase and remove things like !, @, space etc
// only then the reverse compare works right

// Q4. what is function in C to compare strings?
// B) strcmp()
// others are fake or wrong spelling

// Q5. what will printf("%c", str[1]) show if str is "hello"?
// ans: B) e
// index starts from 0 so str[1] is second char = e

#include <stdio.h>
#include <stdbool.h>
#include <string.h>
bool is_digits_only(const char *s) {
    // this part was bug in original one
    // empty string was giving true which felt wrong
    // like "" doesn't even have a digit so how is that digits-only?
    // so i changed it to false
    if (strlen(s) == 0) {
        return false;
    }

    // here checking every char in loop
    // if any char is not from '0' to '9' then it's not digit
    for (int i = 0; s[i] != '\0'; i++) {
        if (s[i] < '0' || s[i] > '9') {
            return false;
        }
    }

    // all checked, all digits so return true
    return true;
}


int main() {
    // checking 3 examples, first is empty string so expect false
    // second is proper digits so should be true
    // third got letter in middle so should be false

    char input1[] = "";
    char input2[] = "123";
    char input3[] = "12a3";

    printf("Input: \"%s\" --> %s\n", input1, is_digits_only(input1) ? "True" : "False");
    printf("Input: \"%s\" --> %s\n", input2, is_digits_only(input2) ? "True" : "False");
    printf("Input: \"%s\" --> %s\n", input3, is_digits_only(input3) ? "True" : "False");

    return 0;
}
