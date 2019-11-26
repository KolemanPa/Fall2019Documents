// // Object Oriented Programming

// let pen = {
//     type: "ballpoint",
//     color: "Blue",
//     brand: "bic"
// };

// console.log(pen.type);
// console.log(pen.color);
// console.log(pen.brand);

// pen.color = "Violet";
// console.log(pen.color);

// pen.price = "2.5";
// console.log("My pen is ", pen.color , " and it costs "+ pen.price);

// // Create a RPG game character Aurora

// let aurora = {
//     name: "Aurora",
//     health: 150,
//     strength: 25
// };

// console.log(`${aurora.name} has ${aurora.health} health and ${aurora.strength} strength`);

// //Aurora has been harmed by an arrow, reduce her health by 20
// aurora.health -= 20;
// //Aurora finds a strength necklace and increases her strength by 10
// aurora.strength +=10;

// // console.log(`${aurora.name} has ${aurora.health} health and ${aurora.strength} strength`);

// describe(aurora);

// function describe(character) {
//     console.log(`${aurora.name} has ${aurora.health} health and ${aurora.strength} strength`);
// }

// let doug = {
//     name: "Doug",
//     health: 100,
//     strength: 225
//     // describe() {
//     //    return `${this.name} has ${this.health} health and ${this.strength}`;
//     // }
// };


// console.log(doug.describe());


// Creating a dog!

let mozzie = {
    name: "Mozzie",
    breed: "Golden Doodle",
    size: "80 pounds",
    bark(){
       return  "Ruff Ruff";
    } ,
     dialog() {
            return `${this.name} is a ${this.breed} dog measuring ${this.size}
Look, a cat! ${this.name} barks: ${this.bark}`;
        }
};


console.log(mozzie.dialog());



// Creating an alex account


let account = {
    name: "Alex",
    balance: 0,
    credit(creditAdd){
        this.balance += creditAdd;
    },
    info(){
        return `${this.name} has a balance of ${this.balance} in his account`;
    }
};

console.log(account.info());

account.credit(250);
account.credit(-80)

console.log(account.info());
