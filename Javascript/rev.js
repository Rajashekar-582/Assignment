function Words(input) {
   
    const i = input.split(' ');
    const Words = i.map(word => {
        return word.split('').reverse().join('');
    }
);

    
    const output = Words.join(' ');
    return output;
}

const input = prompt("Enter string");
const output = Words(input);


console.log("Input: " + input);
console.log("Output: " + output);