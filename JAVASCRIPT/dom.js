let h1Element=document.getElementById('demo')
console.log('element=',h1Element)
console.log('element text=',h1Element.textContent)
h1Element.textContent='Good evening'
console.log("=============")
let buttonelement=document.createElement('button')
console.log("button element",buttonelement)
buttonelement.textContent="clickMe";
console.log('button element',buttonelement)
document.body.appendChild(buttonelement)

// to create table
let ulElement=document.createElement('ul')
let li1Element=document.createElement('li')
let li2Element=document.createElement('li')
let li3Element=document.createElement('li')


li1Element.textContent='java'
li2Element.textContent='sql'
li3Element.textContent='j2ee'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)


h1Element.style.color='red'
h1Element.style.fontSize='10px'
console.log('===================================')
function showMessage(){
    alert('hai Hello world')
}
function changecolor(){
    let pElement=document.getElementById('mover')
        pElement.style.color="green"
    }
    function removecolor(){
        let pElement=document.getElementById('mover')
        pElement.style.color="black";
    }

function printHello(){
    console.log('onkeyup Hello')
    let userName=document.getElementById('username').value
    document.getElementById('showusername').textContent=userName;
}
let name='harsha'
let age=21
let phoneno=7795797793
console.log('name is'+name + 'age is '+age +'phone no is'+phoneno)
console.log(`Name is ${name} age is ${age} phone no is ${phoneno}`)
console.log(`2+2=${2+2}`)