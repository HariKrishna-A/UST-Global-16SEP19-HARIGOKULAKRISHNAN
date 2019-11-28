console.log("Window object",window);
console.log("This Keyword",this);
console.log(window === this)
// alert('Welcome');
// let conFrim = confirm('Are u 18+');                           //RETURN BOOLEAN
// confirm(conFrim);
// let username = prompt('What is your name : ','RDJ.');
// console.log('USERNAME : ',username);


console.log('--------------------- DIFF B/W "THIS & WINDOW"');

const person = {
    FirstName : 'ABC',
    Age       :  26,
    LastName  :  'DEF',
    getName : function(){
        return this.FirstName +'_'+this.LastName
    }
}
console.log('Person = ',person.getName());