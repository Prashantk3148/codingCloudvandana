// This code uses a simple loop to process the input sentence character by character, reversing each word in place. 
// This approach minimizes additional data structures and has a very low time complexity..

function reverseWordsInSentence(sentence) {
  let reversedSentence = "";
  let word = "";
  let isWord = false;

  for (let i = 0; i < sentence.length; i++) {
    const char = sentence[i];

    if (char === ' ') {
      // Found a space, reverse the word and add it to the result
      if (word !== '') {
        reversedSentence += reverseWord(word) + ' ';
        word = '';
      } else {
        reversedSentence += ' ';
      }
    } else {
      word += char;
    }

    // Handle the last word if the sentence doesn't end with a space
    if (i === sentence.length - 1) {
      reversedSentence += reverseWord(word);
    }
  }

  return reversedSentence;
}

function reverseWord(word) {
  return word.split('').reverse().join('');
}

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question("Enter a sentence: ", (input) => {
  const reversedSentence = reverseWordsInSentence(input);
  console.log("Reversed sentence: " + reversedSentence);
  readline.close();
});
