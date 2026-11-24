// average = sum/count

let sum = 0;
let count = 0;
let num = 0;

while (num !== -1) {
    num = Number(prompt("Enter a number (-1 to stop):"));

    if (num !== -1) {
        sum = sum + num;
        count = count + 1;

        console.log("Average is: " + sum / count);
    }
}
