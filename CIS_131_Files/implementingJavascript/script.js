document.write("<footer>thank you! </footer>");

function myFunction(){
    alert("I GOT CLICKED");
}

let butt2 = document.getElementById('butt2');
butt2.addEventListener("click", myFunction);

let txt = document.getElementById("myText");
myText.addEventListener("focus", newFunction);

txt.addEventListener("click", function(){
     txt = document.getElementById('myText');
    txt.style.backgroundColor = "green";
});


function newFunction() {
 txt = document.getElementById("myText");
txt.style.backgroundColor = "red";
}