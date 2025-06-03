function checkPalindrome(myString) {
    const lowerCase = myString.toLowerCase();
    return lowerCase === lowerCase.split('').reverse().join('');
}

console.log(checkPalindrome('Kayak'));
console.log(checkPalindrome('Top spot'));
console.log(checkPalindrome('Black dots'));