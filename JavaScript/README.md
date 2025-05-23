## JavaScript - Task 1 (2 pts)

Write a function named `checkPalindrome(myString)` that checks if the string passed as a parameter is a palindrome.

If it is, return the logical value **true**, otherwise return **false**.

Ensure that when checking if the text is a palindrome:
- character case is not taken into account,
- spaces are not taken into account.

Example:
```   
checkPalindrome("Kayak") // => true
checkPalindrome("Top spot") // => true
checkPalindrome("Black dots") // => false
```

## JavaScript - task 2 (4.5 pts)

**Do not use the DOMContentLoaded event. The script is loaded into the html file before the end of the body.**
For each subsection, create a corresponding function with the name given in the task instruction.
Each function should return an array filled with appropriate elements. (Remember that returning is different from displaying!)

Run the following commands:

1) Searching for tag names:

   - find all elements with class **sample_class_2** and save them into the variable **sampleClassElems**,
   - create a function named **getTagsOfElements(elements)** an pass the found elements to it as an argument,
   - create an array in the function and fill it with the retrieved tag names (get them from the elements passed as an argument),
   - return the array.

2) Adding a class:

   - find an element with id **sample_id_2** and save it into the variable **sampleIdElem**,
   - create a function named **getClassesOfElement(element)** and pass the found element to it as an argument,
   - create an array in the function and fill it with class names (get the classes from the element passed as an argument),
   - return the array.

3) Text search:

   - find all list elements whose class is **funny_text** and save them into the variable **funnyTextElems**,
   - create a function named **getInnerTextsOfElements(elements)** and pass the found elements to it as an argument,
   - create an array in the function and fill it with the texts taken from the elements passed as an argument,
   - return the array.

4) Searching for link addresses:

   - find all **links** that contain **href** attribute and save them into the **linkElems** variable,
   - create a function named **getAddressesOfElements(elements)** and pass the found elements to it as an argument,
   - create an array in the function and fill it with the addresses taken from the elements passed as an argument,
   - if the href attribute of the element is empty, do not add this value to the new array,
   - return the array.

5) Searching for child tags:

   - find all **children of the element** with the id **super_form** and save them in the variable **superFormElems**,
   - pass the found children as an argument to the function that searches for element tags.

## JavaScript - Task 3 (3.5 pts)

Using JavaScript, write an appropriate event listener for the form.

The listener should respond to **submitting the form**.

When the submit button is pressed, the listener function should:

- prevent the page from reloading,
- check if the value of the **House number** field is a number; if the condition is not met - insert a paragraph with the **Invalid House Number** message into the div with the **error_message** class,
- check if the value of the **Postal code** field consists of exactly 6 characters; if the condition is not met - insert a paragraph with the **Wrong postal code** message into the div with the **error_message** class,
- check if the checkbox **I accept the terms & conditions** is checked; if the condition is not met - insert a paragraph with the message **Accept the terms & conditions** into the div with class **error_message**.

If all conditions are met:
- insert values into the appropriate paragraphs in the section with class **success**,
- set block display for the section with class **success**, taking away only class **hide** from it - other classes should prevail
- hide the form by adding class **hide** to it


Remember:
---
If none of the conditions are met, the div with class **error_message** should have three paragraphs with appropriate messages.