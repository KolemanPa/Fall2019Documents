

var ShoppingCart = {
    fName: "Howard",
    lName: "YouDoin",
    cartPrice: [15.95,1.95],
    cart: ["Rubber Duck", "Stitch Eraser"],
        describe(){
            displayArray();
            displayTotal(); 
            return `Name: ${this.fName} ${ShoppingCart.lName}
Items Purchased:
${displayArray()}
${displayTotal()}`;
        }
};



let ofCart = []
let j = 0;
let priceTotal = 0;

function displayArray(){
    for (ofCart of ShoppingCart.cart){
       return ofCart;
    }
}






function displayTotal(){
    for (j=0; j < ShoppingCart.cartPrice.length; j++){
       priceTotal  += ShoppingCart.cartPrice[j];
    }
   return priceTotal;
}


console.log(ShoppingCart.describe());
