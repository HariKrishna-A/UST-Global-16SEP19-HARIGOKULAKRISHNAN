function showMessage() {
    alert("Hi,Hello..,Welcome..!!");
}
function changeColor() {
    let pElement = document.getElementById('mov');
    pElement.style.color = 'green';
}
function removeColor(){
   let rElement = document.getElementById('mov');
   rElement.style.color = 'black';
}
function printHello(){
   console.log("H");
   let userName=document.getElementById('username').value
       document.getElementById('showusername').textContent = userName;
}
let name = 'dddd';
let id = 12;
console.log(`Name is${name} id is ${id}`);
// document.getElementById('b1').disabled = false;