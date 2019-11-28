let hlElement = document.getElementById('demo');
console.log('Element = ',hlElement);
console.log('Element Text',hlElement.textContent);
hlElement.textContent = 'Good_Evng';
let bottonElement = document.createElement('button');    //FOR CREATING ELEMENT;
bottonElement.textContent = 'Click Me.!!!'
console.log('BottonElement :',bottonElement);
document.body.appendChild(bottonElement);

let uliElement = document.createElement('ul');
let li1Element = document.createElement('li');
let li2Element = document.createElement('li');
let li3Element = document.createElement('li');

li1Element.textContent = 'JAVA';
li2Element.textContent = 'J2EE';
li3Element.textContent = 'JS';


uliElement.appendChild(li1Element);
uliElement.appendChild(li2Element);
uliElement.appendChild(li3Element);


document.body.appendChild(uliElement);


hlElement.style.color = "blue";
uliElement.style.color = "red";
hlElement.style.fontSize = '100px';
// hlElement.style.fontFamily = ;