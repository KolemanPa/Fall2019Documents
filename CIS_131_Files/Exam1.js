
let i = 0;
let j;
let totalPrice=0;
let ofCart;
let shoppingCart = {
    fName: "Howard",
    lName: "YouDoin",
    cartPrice: [19.5,1.83],
    cartItem: ["Iphone 5", "Rubber Duck", "Pixel 3 xL"],
    totalPrice(){
        for (i = 0; i < this.cartPrice.length; i++){
            totalPrice += this.cartPrice[i];
        }
        return totalPrice;
    },
    totalCartItems(){
                // cant figure this one out
                for(ofCart of this.cartItem){
                    console.log(ofCart);
                }
                return this.cartItem;
                
//         return `${this.cartItem[0]}
// ${this.cartItem[1]}
// ${this.cartItem[2]}`
    },
        describe(){
           return `Name: ${this.fName} ${this.lName}
Cart:
${this.totalCartItems()}
Price:
${this.totalPrice()} `
        }
};
console.log(shoppingCart.describe());