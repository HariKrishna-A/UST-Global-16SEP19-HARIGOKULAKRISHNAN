const person = {
    name : 'Abc',
    id : 101,
    address : {
               city : 'Bijapur',
               state : 'Karnataka',
               pincode : 123456
                },
    hobbies : ['coding','playing']
}
console.log("JavaScript person object",person);
const jsonObject = JSON.stringify(person);
console.log('JSON person object',jsonObject);
console.log('Back to JavaScript person object',JSON.parse(jsonObject));

localStorage.setItem('email','billgates@gmail.com');
// localStorage.clear();
console.log('Email Id : ',localStorage.getItem('email'));
localStorage.clear();