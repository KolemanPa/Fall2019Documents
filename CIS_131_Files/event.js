var h1Tag = document.getElementById("heading");

h1Tag.addEventListener("click", () =>{
    h1Tag.style.color = "red";
    h1Tag.innerHTML = "MY WORLD IS RED AAAAAAAAAAAAAAAAAGGGGHHH";
});

var items = ["Wakeup", "Brush Teeth", "Ask Questions", "Look for Poke stops"];

// document.getElementById('but1').addEventListener('click',addItems );
window.addEventListener("load", addItems);

function addItems(){
    list = document.getElementById('list');
    for(var i=0; i< items.length; i++){
        list.innerHTML += "<li>" + items[i] + "</li>";
    }
}


var myTimer;
document.getElementById('startTimer').addEventListener("click",()=>{
    // alert("clicked");
    myTimer = setInterval(genRanNum, 2000);

});
function genRanNum(){
    var randomNumber = Math.ceil(Math.random()*10);
    document.getElementById('randNum').innerHTML += `${randomNumber}</br>`;
    // alert("clicked");
}

var clearTimer;

document.getElementById('stopTimer').addEventListener("click", () =>{
    clearInterval(genRanNum.myTimer);
    document.getElementById('randNum').innerHTML = "STOPPED";
})